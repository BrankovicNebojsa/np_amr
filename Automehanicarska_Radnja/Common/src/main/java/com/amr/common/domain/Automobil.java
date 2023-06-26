package com.amr.common.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class Automobil implements GenericObject {

    private String registracioniBroj;
    private int godiste;
    private String brojMotora;
    private String brojSasije;
    private Boja boja;
    private TipMenjaca menjac;

    private Motor motor;
    private Model model;
    private Musterija musterija;

    public Automobil() {
    }

    public Automobil(String registracioniBroj) {
        this.registracioniBroj = registracioniBroj;
    }

    public Automobil(String registracioniBroj, int godiste, String brojMotora, String brojSasije, Boja boja, TipMenjaca menjac, Motor motor, Model model, Musterija musterija) {
        this.registracioniBroj = registracioniBroj;
        this.godiste = godiste;
        this.brojMotora = brojMotora;
        this.brojSasije = brojSasije;
        this.boja = boja;
        this.menjac = menjac;
        this.motor = motor;
        this.model = model;
        this.musterija = musterija;
    }

    public String getRegistracioniBroj() {
        return registracioniBroj;
    }

    public void setRegistracioniBroj(String registracioniBroj) {
        this.registracioniBroj = registracioniBroj;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    public String getBrojMotora() {
        return brojMotora;
    }

    public void setBrojMotora(String brojMotora) {
        this.brojMotora = brojMotora;
    }

    public String getBrojSasije() {
        return brojSasije;
    }

    public void setBrojSasije(String brojSasije) {
        this.brojSasije = brojSasije;
    }

    public Boja getBoja() {
        return boja;
    }

    public void setBoja(Boja boja) {
        this.boja = boja;
    }

    public TipMenjaca getMenjac() {
        return menjac;
    }

    public void setMenjac(TipMenjaca menjac) {
        this.menjac = menjac;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Musterija getMusterija() {
        return musterija;
    }

    public void setMusterija(Musterija musterija) {
        this.musterija = musterija;
    }

    @Override
    public String getTableName() {
        return "automobil";
    }

    @Override
    public String getAlias() {
        return " a ";
    }

    @Override
    public String getJoinValues() {
        return "JOIN musterija mu ON (a.musterijaId=mu.musterijaId)"
                + " JOIN model mo ON (a.modelId=mo.modelId AND a.markaId=mo.markaId)"
                + " JOIN marka ma ON (mo.markaId=ma.markaId)"
                + " JOIN motor mot ON (mot.motorId=a.motorId)";
    }

    @Override
    public String getPrimaryKey() {
        return "registracioniBroj";
    }

    @Override
    public String getSelectColumns() {
        return "registracioniBroj, godiste, brojMotora, brojSasije, boja, menjac,"
                + " motorId, markaId, modelId, musterijaId";
    }

    @Override
    public String getSelectOrderBy() {
        return "registracioniBroj";
    }

    @Override
    public String getSelectWhereCondition() {
        return "registracioniBroj";
    }

    @Override
    public String getInsertColumns() {
        return "(registracioniBroj, godiste, brojMotora, brojSasije, boja, menjac,"
                + " motorId, markaId, modelId, musterijaId)";
    }

    @Override
    public String getInsertValues() {
        return "('" + this.getRegistracioniBroj() + "', '" + this.getGodiste()
                + "', '" + this.getBrojMotora().toString() + "', '" + this.getBrojSasije() + "', '"
                + this.getBoja().toString() + "', '" + this.getMenjac().toString() + "', '"
                + this.getMotor().getMotorId() + "', '" + this.getModel().getMarka().getMarkaId()
                + "', '" + this.getModel().getModelId() + "', '" + this.getMusterija().getMusterijaId() + "')";
    }

    @Override
    public String getUpdateSet() {
//        java.sql.Date poslednjiServis1 = new java.sql.Date(this.getPoslednjiServis().getTime());
//        return "poslednjiServis='" + poslednjiServis1 + "'";
        return null;
    }

    @Override
    public String getUpdateWhereCondition() {
//        return "registracioniBroj='" + this.getRegistracioniBroj() + "'";
        return null;
    }

    @Override
    public String getDeleteWhereCondition() {
        return "registracioniBroj='" + getRegistracioniBroj() + "'";
    }

    @Override
    public List<GenericObject> getListOfSelectedRows(ResultSet rs) throws SQLException {
        List<GenericObject> objects = new ArrayList<>();
        while (rs.next()) {
            Automobil automobil = new Automobil();
            automobil.setRegistracioniBroj(rs.getString("registracioniBroj"));
            automobil.setGodiste(rs.getInt("godiste"));
            automobil.setBrojMotora(rs.getString("brojMotora"));
            automobil.setBrojSasije(rs.getString("brojSasije"));
            automobil.setBoja(Boja.valueOf(rs.getString("boja")));
            automobil.setMenjac(TipMenjaca.valueOf(rs.getString("menjac")));
            Motor motor = new Motor(rs.getInt("motorId"), rs.getInt("brojCilindara"), rs.getDouble("kubikaza"), rs.getInt("konjskaSnaga"));
            automobil.setMotor(motor);
            Model model = new Model(rs.getInt("modelId"), new Marka(rs.getInt("markaId"), rs.getString("nazivMarke")), rs.getString("nazivModela"));
            automobil.setModel(model);
            Musterija musterija = new Musterija(rs.getInt("musterijaId"), rs.getString("imeMusterije"),
                    rs.getString("prezimeMusterije"), rs.getString("mailMusterije"), rs.getString("telefonMusterije"));
            automobil.setMusterija(musterija);
            objects.add(automobil);
        }
        return objects;
    }

}
