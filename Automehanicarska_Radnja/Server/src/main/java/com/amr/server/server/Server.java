package com.amr.server.server;

import com.amr.server.view.MainForm;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Klasa koja predstavlja glavno mesto za dodavanje klijenta
 *
 * @author Nebojsa Brankovic
 */
public class Server extends Thread {

    /**
     * pomocni atribut za prekidanje rada servera
     */
    private boolean status = true;
    /**
     * svi klijenti na serveru
     */
    List<ProcessClientsRequests> threads;

    /**
     * Serverski soket
     */
    ServerSocket serverSocket;
    /**
     * Glavna forma serverske aplikacije
     */
    MainForm mf;

    /**
     * Konstuktor u kojem se inicijalizuje lista niti i glavna forma
     *
     * @param mf glavna forma
     */
    public Server(MainForm mf) {
        threads = new ArrayList<>();
        this.mf = mf;
    }

    @Override
    public void run() {
        startServer();
    }

    /**
     * Metoda za podizanje servera
     */
    public void startServer() {
        try {
            serverSocket = new ServerSocket(9000);
            while (status) {
                System.out.println("Cekanje konekcije...");
                Socket socket = serverSocket.accept();
                System.out.println("Klijent je povezan!");
                handleClient(socket);
            }
        } catch (Exception ex) {
            System.out.println("Ugasen server.");
        }

    }

    /**
     * Metoda za opsluzivanje jednog klijenta
     *
     * @param socket Serverski soket
     * @throws Exception baca izuzetak ukoliko dodje do greske kod opsluzivanja
     * klijenta
     */
    private void handleClient(Socket socket) throws Exception {
        ProcessClientsRequests processClientsRequests = new ProcessClientsRequests(socket, mf);
        threads.add(processClientsRequests);
        processClientsRequests.start();
    }

    /**
     * Metoda za zaustavljanje servera
     */
    public void stopServer() {
        this.status = false;
        for (ProcessClientsRequests thread : threads) {
            if (!thread.getState().equals(Thread.State.TERMINATED)) {
                thread.stopThread();
            }
        }
        try {
            serverSocket.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
