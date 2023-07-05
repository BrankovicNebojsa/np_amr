package com.amr.client.controller;

import java.io.IOException;
import java.net.Socket;

/**
 * Klasa koja predstavlja singleton patern za kreiranje socketa
 * 
 * @author Nebojsa Brankovic
 */
public class SocketFactory {

    /**
     * Instanca objekat klase SocketFactory
     */
    private static SocketFactory instance;
    /**
     * Socket
     */
    private Socket socket;

    /**
     * Privatni konstuktor koji inicijalizuje soket
     */
    private SocketFactory() {
        try {
            socket = new Socket("localhost", 9000);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Metoda koja vraca instancu ove klase
     * @return instanca klase
     */
    public static SocketFactory getInstance() {
        if (instance == null) {
            instance = new SocketFactory();
        }
        return instance;
    }

    /**
     * Metoda koja vraca soket
     * @return soket
     */
    public Socket getSocket() {
        return socket;
    }
}
