package com.amr.client.controller;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Nebojsa Brankovic
 */
public class SocketFactory {

    private static SocketFactory instance;
    private Socket socket;

    private SocketFactory() {
        try {
            socket = new Socket("localhost", 9000);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static SocketFactory getInstance() {
        if (instance == null) {
            instance = new SocketFactory();
        }
        return instance;
    }

    public Socket getSocket() {
        return socket;
    }
}
