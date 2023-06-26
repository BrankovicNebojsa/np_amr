package com.amr.common.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class Model implements GenericObject {

    private int modelId;
    private Marka marka;
    private String nazivModela;

    public Model() {
    }

    public Model(Marka marka, String nazivModela) {
        this.marka = marka;
        this.nazivModela = nazivModela;
    }

    public Model(int modelId, Marka marka, String nazivModela) {
        this.modelId = modelId;
        this.marka = marka;
        this.nazivModela = nazivModela;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public Marka getMarka() {
        return marka;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
    }

    public String getNazivModela() {
        return nazivModela;
    }

    public void setNazivModela(String nazivModela) {
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
