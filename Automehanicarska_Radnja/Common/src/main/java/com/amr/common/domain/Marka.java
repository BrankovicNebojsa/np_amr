package com.amr.common.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class Marka implements GenericObject { //dodati listu modela

    private int markaId;
    private String nazivMarke;
    private List<Model> modeli;

    public Marka() {
        nazivMarke = "";
    }

    public Marka(String nazivMarke) {
        this.nazivMarke = nazivMarke;
    }

    public Marka(int markaId, String nazivMarke) {
        this.markaId = markaId;
        this.nazivMarke = nazivMarke;
    }

    public Marka(int markaId, String nazivMarke, List<Model> modeli) {
        this.markaId = markaId;
        this.nazivMarke = nazivMarke;
        this.modeli = modeli;
    }

    public int getMarkaId() {
        return markaId;
    }

    public void setMarkaId(int markaId) {
        this.markaId = markaId;
    }

    public String getNazivMarke() {
        return nazivMarke;
    }

    public void setNazivMarke(String nazivMarke) {
        this.nazivMarke = nazivMarke;
    }

    public List<Model> getModeli() {
        return modeli;
    }

    public void setModeli(List<Model> modeli) {
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
