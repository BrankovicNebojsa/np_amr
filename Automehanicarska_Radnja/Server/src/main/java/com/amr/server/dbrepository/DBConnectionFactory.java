package com.amr.server.dbrepository;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * Klasa koja predstavlja singleton patern za konekciju sa bazom
 *
 * @author Nebojsa Brankovic
 */
public class DBConnectionFactory {

    /**
     * Konekcija sa bazom
     */
    private Connection connection;
    /**
     * Objekat klase DBConnectionFactory
     */
    private static DBConnectionFactory instance;

    /**
     * Prazan konstuktor
     */
    private DBConnectionFactory() {
    }

    /**
     * Metoda koja vraca instancu ove klase
     *
     * @return instanca klase DBConnectionFactory
     */
    public static DBConnectionFactory getInstance() {
        if (instance == null) {
            instance = new DBConnectionFactory();
        }
        return instance;
    }

    /**
     * Metoda koja vraca konekciju na bazu
     *
     * @return konekcija na bazu
     * @throws Exception baca izuetak ako dodje do greske pri vracanju konekcije
     */
    public Connection getConnection() throws Exception {
        if (connection == null || connection.isClosed()) {
            Properties properties = new Properties();
            properties.load(new FileInputStream("config/dbconfig.properties"));
            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            connection = DriverManager.getConnection(url, username, password);
            connection.setAutoCommit(false);
        }
        return connection;
    }
}
