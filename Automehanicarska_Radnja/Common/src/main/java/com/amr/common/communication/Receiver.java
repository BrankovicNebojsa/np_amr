package com.amr.common.communication;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.net.Socket;

/**
 * Klasa koja predstavlja Primaoca zahteva
 * 
 * @author Nebojsa Brankovic
 */
public class Receiver implements Serializable {

    /**
     * Soket na kojem je pokrenut server
     */
    private Socket socket;

    /**
     * Konstuktor koji postavlja soket
     * @param socket Serverski soket
     */
    public Receiver(Socket socket) {
        this.socket = socket;
    }

    /**
     * Metoda koja je zaduzena za primanje zahteva
     * @return objekat koji se vraca kroz funkciju
     * @throws Exception ovaj izuzetak se desava ako dodje do greske u telu funkcije
     */
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
