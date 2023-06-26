package com.amr.server.server;

import com.amr.server.view.MainForm;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class Server extends Thread {
    
    private boolean status = true;
    List<ProcessClientsRequests> threads;
    ServerSocket serverSocket;
    MainForm mf;
    
    public Server(MainForm mf) {
        threads = new ArrayList<>();
        this.mf = mf;
    }
    
    @Override
    public void run() {
        startServer();
    }
    
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
    
    private void handleClient(Socket socket) throws Exception {
        ProcessClientsRequests processClientsRequests = new ProcessClientsRequests(socket, mf);
        threads.add(processClientsRequests);
        processClientsRequests.start();
    }
    
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
