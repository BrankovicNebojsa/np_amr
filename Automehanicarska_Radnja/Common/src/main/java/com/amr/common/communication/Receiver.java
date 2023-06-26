package com.amr.common.communication;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.net.Socket;

/**
 *
 * @author Nebojsa Brankovic
 */
public class Receiver implements Serializable {

    private Socket socket;

    public Receiver(Socket socket) {
        this.socket = socket;
    }

    public Object receive() throws Exception {
        try {
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            return in.readObject();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
