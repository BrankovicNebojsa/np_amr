package com.amr.common.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class Automobil2 implements GenericObject {

    private String registracioniBroj;
    private int godiste;
    private String brojMotora;
    private String brojSasije;
    private Boja boja;
    private double kubikaza;
    private int konjskaSnaga;
    private TipMenjaca menjac;
    private Model model;
    private Musterija musterija;
    private Date poslednjiServis;

    public Automobil2() {
    }

    public Automobil2(String registracioniBroj) {
        this.registracioniBroj = registracioniBroj;
    }

    public Automobil2(String registracioniBroj, int godiste, String brojMotora, String brojSasije, Boja boja,
            double kubikaza, int konjskaSnaga, TipMenjaca menjac, Model model, Musterija musterija, Date poslednjiServis) {
        this.registracioniBroj = registracioniBroj;
        this.godiste = godiste;
        this.brojMotora = brojMotora;
        this.brojSasije = brojSasije;
        this.boja = boja;
        this.kubikaza = kubikaza;
        this.konjskaSnaga = konjskaSnaga;
        this.menjac = menjac;
        this.model = model;
        this.musterija = musterija;
        this.poslednjiServis = poslednjiServis;
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

    public double getKubikaza() {
        return kubikaza;
    }

    public void setKubikaza(double kubikaza) {
        this.kubikaza = kubikaza;
    }

    public int getKonjskaSnaga() {
        return konjskaSnaga;
    }

    public void setKonjskaSnaga(int konjskaSnaga) {
        this.konjskaSnaga = konjskaSnaga;
    }

    public TipMenjaca getMenjac() {
        return menjac;
    }

    public void setMenjac(TipMenjaca menjac) {
        this.menjac = menjac;
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

    public Date getPoslednjiServis() {
        return poslednjiServis;
    }

    public void setPoslednjiServis(Date poslednjiServis) {
        this.poslednjiServis = poslednjiServis;
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
                + " JOIN marka ma ON (mo.markaId=ma.markaId)";
    }

    @Override
    public String getPrimaryKey() {
        return "registracioniBroj";
    }

    @Override
    public String getSelectColumns() {
        return "registracioniBroj, godiste, brojMotora, brojSasije, boja, kubikaza, konjskaSnaga,"
                + " menjac, poslednjiServis, markaId, modelId, musterijaId";
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
        return "(registracioniBroj, godiste, brojMotora, brojSasije,boja, kubikaza, konjskaSnaga,"
                + " menjac, markaId, modelId, musterijaId)";
    }

    @Override
    public String getInsertValues() {
        return "('" + this.getRegistracioniBroj() + "', '" + this.getGodiste()
                + "', '" + this.getBrojMotora().toString() + "', '" + this.getBrojSasije() + "', '"
                + this.getBoja().toString() + "', " + this.getKubikaza() + ", " + this.getKonjskaSnaga()
                + ", '" + this.getMenjac().toString() + "', " + this.getModel().getMarka().getMarkaId()
                + ", " + this.getModel().getModelId() + ", " + this.getMusterija().getMusterijaId() + ")";
    }

    @Override
    public String getUpdateSet() {
        java.sql.Date poslednjiServis1 = new java.sql.Date(this.getPoslednjiServis().getTime());
        return "poslednjiServis='" + poslednjiServis1 + "'";
    }

    @Override
    public String getUpdateWhereCondition() {
        return "registracioniBroj='" + this.getRegistracioniBroj() + "'";
    }

    @Override
    public String getDeleteWhereCondition() {
        return "registracioniBroj='" + getRegistracioniBroj() + "'";
    }

    @Override
    public List<GenericObject> getListOfSelectedRows(ResultSet rs) throws SQLException {
        List<GenericObject> objects = new ArrayList<>();
        while (rs.next()) {
            Automobil2 automobil = new Automobil2();
            automobil.setRegistracioniBroj(rs.getString("registracioniBroj"));
            automobil.setGodiste(rs.getInt("godiste"));
            automobil.setBrojMotora(rs.getString("brojMotora"));
            automobil.setBrojSasije(rs.getString("brojSasije"));
            automobil.setBoja(Boja.valueOf(rs.getString("boja")));
            automobil.setKubikaza(rs.getDouble("kubikaza"));
            automobil.setKonjskaSnaga(rs.getInt("konjskaSnaga"));
            automobil.setMenjac(TipMenjaca.valueOf(rs.getString("menjac")));
            automobil.setPoslednjiServis(rs.getDate("poslednjiServis"));
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
