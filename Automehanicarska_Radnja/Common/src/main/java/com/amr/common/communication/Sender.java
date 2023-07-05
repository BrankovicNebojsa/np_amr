package com.amr.common.communication;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;

/**
 * Klasa koja predstavlja posiljaoca zahteva
 * 
 * @author Nebojsa Brankovic
 */
public class Sender implements Serializable{

    /**
     * Soket preko kojeg komuniciraju klijent i server
     */
    private Socket socket;

    /**
     * Konstuktor za inicijalizaciju soketa
     * @param socket serverski soket
     */
    public Sender(Socket socket) {
        this.socket = socket;
    }

    /**
     * Metoda za slanje zahteva
     * @param object argument koji se salje kao zahtev
     * @throws Exception Izuzetak koji se desava ukoliko dodje do greske pri slanju zahteva
     */
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
