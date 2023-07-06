package com.amr.common.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Klasa koja predstavlja Marku automobila
 *
 * @author Nebojsa Brankovic
 */
public class Marka implements GenericObject { //dodati listu modela

    /**
     * Primarni kljuc ove klase
     */
    private int markaId;
    /**
     * Naziv marke automobila
     */
    private String nazivMarke;
    /**
     * Lista modela koji postoje za datu marku automobila
     */
    private List<Model> modeli;

    /**
     * Konsturktor bez parametara
     */
    public Marka() {
        nazivMarke = "";
    }

    /**
     * Konstruktor sa parametrom naziv marke
     *
     * @param nazivMarke Naziv marke automobila
     */
    public Marka(String nazivMarke) {
        this.nazivMarke = nazivMarke;
    }

    /**
     * Konstruktor sa parametrom id marke i naziv marke
     *
     * @param nazivMarke Naziv marke automobila
     * @param markaId Primarni kljuc marke automobila
     */
    public Marka(int markaId, String nazivMarke) {
        this.markaId = markaId;
        this.nazivMarke = nazivMarke;
    }

    /**
     * Konstruktor sa parametrom id marke, naziv marke i modeli marke automobila
     *
     * @param nazivMarke Naziv marke automobila
     * @param markaId Primarni kljuc marke automobila
     * @param modeli Modeli marke automobila
     */
    public Marka(int markaId, String nazivMarke, List<Model> modeli) {
        this.markaId = markaId;
        this.nazivMarke = nazivMarke;
        this.modeli = modeli;
    }

    /**
     * Metoda koja vraca primarni kljuc marke
     *
     * @return Primarni kljuc marke
     */
    public int getMarkaId() {
        return markaId;
    }

    /**
     * Metoda koja postavlja primarni kljuc marke automobila
     *
     * @param markaId primarni kljuc automobila
     * @throws IllegalArgumentException za unet id manji od 0
     */
    public void setMarkaId(int markaId) throws IllegalArgumentException {
        if (markaId < 0) {
            throw new IllegalArgumentException("Id ne moze biti manji od 0");
        }
        this.markaId = markaId;
    }

    /**
     * Metoda koja vraca naziv marke automobila
     *
     * @return Naziv marke automobila
     */
    public String getNazivMarke() {
        return nazivMarke;
    }

    /**
     * Metoda koja postavlja naziv marke automobila
     *
     * @param nazivMarke Naziv marke automobila
     * @throws NullPointerException u slucaju da je unos null
     * @throws IllegalArgumentException u slucaju da je unos prazan
     * 
     */
    public void setNazivMarke(String nazivMarke) throws NullPointerException, IllegalArgumentException {
        if (nazivMarke == null) {
            throw new NullPointerException("Null vrednost");
        }
        if (nazivMarke.equals("")) {
            throw new IllegalArgumentException("Prazan string");
        }
        this.nazivMarke = nazivMarke;
    }

    /**
     * Metoda koja vraca listu modela marke
     *
     * @return Lista modela marke
     */
    public List<Model> getModeli() {
        return modeli;
    }

    /**
     * Metoda koja postavlja listu modela date marke automobila
     *
     * @param modeli Lista modela marke automobila
     * @throws NullPointerException u slucaju da je unos null
     */
    public void setModeli(List<Model> modeli) throws NullPointerException {
        if (modeli == null) {
            throw new NullPointerException("Null vrednost");
        }
        this.modeli = modeli;
    }

    @Override
    public String getTableName() {
        return "marka";
    }

    @Override
    public String getAlias() {
        return " ma ";
    }

    @Override
    public String getJoinValues() {
        return "";
    }

    @Override
    public String getPrimaryKey() {
        return "markaId";
    }

    @Override
    public String getSelectColumns() {
        return "markaId, nazivMarke";
    }

    @Override
    public String getSelectOrderBy() {
        return "nazivMarke";
    }

    @Override
    public String getSelectWhereCondition() {
        return "markaId";
    }

    @Override
    public String getInsertColumns() {
        return "(nazivMarke)";
    }

    @Override
    public String getInsertValues() {
        return "('" + this.getNazivMarke() + "')";
    }

    @Override
    public String getUpdateSet() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getUpdateWhereCondition() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getDeleteWhereCondition() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<GenericObject> getListOfSelectedRows(ResultSet rs) throws SQLException {
        List<GenericObject> objects = new ArrayList<>();
        while (rs.next()) {
            Marka marka = new Marka();
            marka.setMarkaId(rs.getInt("markaId"));
            marka.setNazivMarke(rs.getString("nazivMarke"));
            objects.add(marka);
        }
        return objects;
    }

}
