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
 *
 * @author Nebojsa Brankovic
 */
public class JsonPersistence {

    private Controller c;
    private List<Automobil> automobili;
    private List<Marka> marke;
    private List<Model> modeli;
    private List<Motor> motori;
    private List<Musterija> musterije;
    private List<Radnik> radnici;
    private List<Rezervacija> rezervacije;
    private List<Servis> servisi;
    private Gson gson;

    public JsonPersistence() {
        c = new Controller();
        initializeLists();
    }

    public static void main(String[] args) {
        JsonPersistence json = new JsonPersistence();
        json.persist();
    }

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

    private void persistAutomobili() throws IOException {
        gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fw = new FileWriter("json/automobili.json");
        BufferedWriter out = new BufferedWriter(fw);
        String json = gson.toJson(automobili);
        System.out.println(json);
        out.write(json);
        out.close();
    }

    private void persistMarke() throws IOException {
        gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fw = new FileWriter("json/marke.json");
        BufferedWriter out = new BufferedWriter(fw);
        String json = gson.toJson(marke);
        System.out.println(json);
        out.write(json);
        out.close();
    }

    private void persistModeli() throws IOException {
        gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fw = new FileWriter("json/modeli.json");
        BufferedWriter out = new BufferedWriter(fw);
        String json = gson.toJson(modeli);
        System.out.println(json);
        out.write(json);
        out.close();
    }

    private void persistMotori() throws IOException {
        gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fw = new FileWriter("json/motori.json");
        BufferedWriter out = new BufferedWriter(fw);
        String json = gson.toJson(motori);
        System.out.println(json);
        out.write(json);
        out.close();
    }

    private void persistMusterije() throws IOException {
        gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fw = new FileWriter("json/musterije.json");
        BufferedWriter out = new BufferedWriter(fw);
        String json = gson.toJson(musterije);
        System.out.println(json);
        out.write(json);
        out.close();
    }

    private void persistRadnici() throws IOException {
        gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fw = new FileWriter("json/radnici.json");
        BufferedWriter out = new BufferedWriter(fw);
        String json = gson.toJson(radnici);
        System.out.println(json);
        out.write(json);
        out.close();
    }

    private void persistRezervacije() throws IOException {
        gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fw = new FileWriter("json/rezervacije.json");
        BufferedWriter out = new BufferedWriter(fw);
        String json = gson.toJson(rezervacije);
        System.out.println(json);
        out.write(json);
        out.close();
    }

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
