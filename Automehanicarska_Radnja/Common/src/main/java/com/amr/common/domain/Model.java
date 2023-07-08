package com.amr.common.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Klasa koja predstavlja Model automobila
 *
 * @author Nebojsa Brankovic
 */
public class Model implements GenericObject {

    /**
     * Primarni kljuc modela automobila
     */
    private int modelId;

    /**
     * Proizvodjac modela automobila
     */
    private Marka marka;
    /**
     * Naziv modela automobila
     */
    private String nazivModela;

    /**
     * Konstruktor bez parametara
     */
    public Model() {
    }

    /**
     * Konstruktor sa ulaznim parametrima marka i naziv modela
     *
     * @param marka Marka modela automobila
     * @param nazivModela Naziv modela
     */
    public Model(Marka marka, String nazivModela) {
        this.marka = marka;
        this.nazivModela = nazivModela;
    }

    /**
     * Konstruktor sa svim ulaznim parametrima
     *
     * @param modelId Primarni kljuc modela automobila
     * @param marka Marka modela automobila
     * @param nazivModela Naziv modela automobila
     */
    public Model(int modelId, Marka marka, String nazivModela) {
        this.modelId = modelId;
        this.marka = marka;
        this.nazivModela = nazivModela;
    }

    /**
     * Metoda koja vraca primarni kljuc automobila
     *
     * @return Primarni kljuc automobila
     */
    public int getModelId() {
        return modelId;
    }

    /**
     * Metoda koja postavlja primarni kljuc modela
     *
     * @param modelId Primarni kljuc modela
     * @throws IllegalArgumentException unet primarni kljuc koji je manji od 0
     */
    public void setModelId(int modelId) throws IllegalArgumentException {
        if (modelId < 0) {
            throw new IllegalArgumentException("Id ne moze biti manji od 0");
        }
        this.modelId = modelId;
    }

    /**
     * Metoda koja vraca marku automobila
     *
     * @return Marka automobila
     */
    public Marka getMarka() {
        return marka;
    }

    /**
     * Metoda koja postavlja Marku modela
     *
     * @param marka Marka modela
     * @throws NullPointerException u slucaju da je unos null
     */
    public void setMarka(Marka marka) throws NullPointerException {
        if (marka == null) {
            throw new NullPointerException("Null vrednost");
        }
        this.marka = marka;
    }

    /**
     * Metoda koja vraca naziv modela automobila
     *
     * @return Naziv modela automobila
     */
    public String getNazivModela() {
        return nazivModela;
    }

    /**
     * Metoda koja postavlja naziv modela
     *
     * @param nazivModela Naziv modela
     * @throws NullPointerException u slucaju da je unos null
     * @throws IllegalArgumentException u slucaju da je unos prazan
     */
    public void setNazivModela(String nazivModela) throws IllegalArgumentException, NullPointerException {
        if (nazivModela == null) {
            throw new NullPointerException("Null vrednost");
        }
        if (nazivModela.equals("")) {
            throw new IllegalArgumentException("Prazan string");
        }
        this.nazivModela = nazivModela;
    }

    @Override
    public String getTableName() {
        return "model";
    }

    @Override
    public String getAlias() {
        return " mo ";
    }

    @Override
    public String getJoinValues() {
        return "JOIN marka ma ON (mo.markaId=ma.markaId)";
    }

    @Override
    public String getPrimaryKey() {
        return "modelId";
    }

    @Override
    public String getSelectColumns() {
        return "modelId, markaId, nazivModela";
    }

    @Override
    public String getSelectOrderBy() {
        return "mo.markaId";
    }

    @Override
    public String getSelectWhereCondition() {
        return "ma.nazivMarke";
    }

    @Override
    public String getInsertColumns() {
        return "(markaId, nazivModela)";
    }

    @Override
    public String getInsertValues() {
        return "(" + this.getMarka().getMarkaId() + ", '" + this.getNazivModela() + "')";
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
            Model model = new Model();
            model.setModelId(rs.getInt("modelId"));
            model.setNazivModela(rs.getString("nazivModela"));
            Marka marka = new Marka(rs.getInt("markaId"), rs.getString("nazivMarke"));
            model.setMarka(marka);
            objects.add(model);
        }
        return objects;
    }

}
