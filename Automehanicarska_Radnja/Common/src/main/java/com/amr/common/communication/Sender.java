package com.amr.common.communication;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;

/**
 *
 * @author Nebojsa Brankovic
 */
public class Sender implements Serializable{

    private Socket socket;

    public Sender(Socket socket) {
        this.socket = socket;
    }

    public void send(Object object) throws Exception {
        try {
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(object);
            out.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Error sending object!\n" + ex.getMessage());
        }
    }
}
