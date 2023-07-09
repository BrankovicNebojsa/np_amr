package com.amr.server.json;

import com.amr.common.domain.*;
import com.amr.server.controller.Controller;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

/**
 * Klasa za perzistenciju svih podataka iz baze mysql baze u lokalne json
 * fajlove
 *
 * @author Nebojsa Brankovic
 */
public class JsonPersistence {

    /**
     * Serverski kontroler
     */
    private Controller c;
    /**
     * Lista automobila
     */
    private List<Automobil> automobili;
    /**
     * Lista marki
     */
    private List<Marka> marke;

    /**
     * Lista modela
     */
    private List<Model> modeli;
    /**
     * Lista motora
     */
    private List<Motor> motori;
    /**
     * Lista musterija
     */
    private List<Musterija> musterije;
    /**
     * Lista radnika
     */
    private List<Radnik> radnici;
    /**
     * Lista rezervacija
     */
    private List<Rezervacija> rezervacije;
    /**
     * Lista servisa
     */
    private List<Servis> servisi;
    /**
     * gson objekat
     */
    private Gson gson;

    /**
     * Neparametrizovani konstuktor
     */
    public JsonPersistence() {
        c = new Controller();
        initializeLists();
    }

    /**
     * Glavna metoda
     *
     * @param args argument glaven metode
     */
    public static void main(String[] args) {
        JsonPersistence json = new JsonPersistence();
        json.persist();
    }

    /**
     * Metoda koja inicijalizuje sve liste iz baze podataka
     */
    private void initializeLists() {
        try {
            this.automobili = c.getAutomobili();
            this.marke = c.getMarke();
            this.modeli = c.getModeli();
            this.motori = c.getMotori();
            this.musterije = c.getMusterije();
            this.radnici = c.getRadnici();
            this.rezervacije = c.getRezervacije();
            this.servisi = c.getServisi();
        } catch (Exception e) {
            System.out.println("Greska: " + e.getMessage());
        }
    }

    /**
     * Glavna metoda za perzistenciju
     */
    private void persist() {
        try {
            persistAutomobili();
            persistMarke();
            persistModeli();
            persistMotori();
            persistMusterije();
            persistRadnici();
            persistRezervacije();
            persistServisi();
        } catch (IOException e) {
            System.out.println("Greska pri pravljenju json fajlova: " + e.getMessage());
        }
    }

    /**
     * Metoda za perzistenciju automobila
     *
     * @throws IOException baca izuzetak ako dodje do greske pri ispisivanju
     * json-a u fajl
     */
    private void persistAutomobili() throws IOException {
        gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fw = new FileWriter("json/automobili.json");
        BufferedWriter out = new BufferedWriter(fw);
        String json = gson.toJson(automobili);
        System.out.println(json);
        out.write(json);
        out.close();
    }

    /**
     * Metoda za perzistenciju marki
     *
     * @throws IOException baca izuzetak ako dodje do greske pri ispisivanju
     * json-a u fajl
     */
    private void persistMarke() throws IOException {
        gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fw = new FileWriter("json/marke.json");
        BufferedWriter out = new BufferedWriter(fw);
        String json = gson.toJson(marke);
        System.out.println(json);
        out.write(json);
        out.close();
    }

    /**
     * Metoda za perzistenciju modela
     *
     * @throws IOException baca izuzetak ako dodje do greske pri ispisivanju
     * json-a u fajl
     */
    private void persistModeli() throws IOException {
        gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fw = new FileWriter("json/modeli.json");
        BufferedWriter out = new BufferedWriter(fw);
        String json = gson.toJson(modeli);
        System.out.println(json);
        out.write(json);
        out.close();
    }

    /**
     * Metoda za perzistenciju motora
     *
     * @throws IOException baca izuzetak ako dodje do greske pri ispisivanju
     * json-a u fajl
     */
    private void persistMotori() throws IOException {
        gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fw = new FileWriter("json/motori.json");
        BufferedWriter out = new BufferedWriter(fw);
        String json = gson.toJson(motori);
        System.out.println(json);
        out.write(json);
        out.close();
    }

    /**
     * Metoda za perzistenciju musterija
     *
     * @throws IOException baca izuzetak ako dodje do greske pri ispisivanju
     * json-a u fajl
     */
    private void persistMusterije() throws IOException {
        gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fw = new FileWriter("json/musterije.json");
        BufferedWriter out = new BufferedWriter(fw);
        String json = gson.toJson(musterije);
        System.out.println(json);
        out.write(json);
        out.close();
    }

    /**
     * Metoda za perzistenciju radnika
     *
     * @throws IOException baca izuzetak ako dodje do greske pri ispisivanju
     * json-a u fajl
     */
    private void persistRadnici() throws IOException {
        gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fw = new FileWriter("json/radnici.json");
        BufferedWriter out = new BufferedWriter(fw);
        String json = gson.toJson(radnici);
        System.out.println(json);
        out.write(json);
        out.close();
    }

    /**
     * Metoda za perzistenciju rezervacija
     *
     * @throws IOException baca izuzetak ako dodje do greske pri ispisivanju
     * json-a u fajl
     */
    private void persistRezervacije() throws IOException {
        gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fw = new FileWriter("json/rezervacije.json");
        BufferedWriter out = new BufferedWriter(fw);
        String json = gson.toJson(rezervacije);
        System.out.println(json);
        out.write(json);
        out.close();
    }

    /**
     * Metoda za perzistenciju servisa
     *
     * @throws IOException baca izuzetak ako dodje do greske pri ispisivanju
     * json-a u fajl
     */
    private void persistServisi() throws IOException {
        gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fw = new FileWriter("json/servisi.json");
        BufferedWriter out = new BufferedWriter(fw);
        String json = gson.toJson(servisi);
        System.out.println(json);
        out.write(json);
        out.close();
    }

}
