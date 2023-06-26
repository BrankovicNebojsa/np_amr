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
// poslednji servis
public class Servis implements GenericObject {

    private Date datumServisa;
    private int kilometraza;
    private String opis;

    private Automobil automobil;
    private Radnik radnik;

    public Servis() {
    }

    public Servis(Date datumServisa, int kilometraza, String opis, Automobil automobil, Radnik radnik) {
        this.datumServisa = datumServisa;
        this.kilometraza = kilometraza;
        this.opis = opis;
        this.automobil = automobil;
        this.radnik = radnik;
    }

    public Date getDatumServisa() {
        return datumServisa;
    }

    public void setDatumServisa(Date datumServisa) {
        this.datumServisa = datumServisa;
    }

    public int getKilometraza() {
        return kilometraza;
    }

    public void setKilometraza(int kilometraza) {
        this.kilometraza = kilometraza;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Automobil getAutomobil() {
        return automobil;
    }

    public void setAutomobil(Automobil automobil) {
        this.automobil = automobil;
    }

    public Radnik getRadnik() {
        return radnik;
    }

    public void setRadnik(Radnik radnik) {
        this.radnik = radnik;
    }

    @Override
    public String getTableName() {
        return "servis";
    }

    @Override
    public String getAlias() {
        return " s ";
    }

    @Override
    public String getJoinValues() {
        return "JOIN automobil a ON (a.registracioniBroj=s.registracioniBroj)"
                + " JOIN musterija mu ON (a.musterijaId=mu.musterijaId)"
                + " JOIN model mo ON (a.modelId=mo.modelId AND a.markaId=mo.markaId)"
                + " JOIN marka ma ON (mo.markaId=ma.markaId)"
                + " JOIN motor mot ON (mot.motorId=a.motorId)"
                + " JOIN radnik ra ON (s.radnikId=ra.radnikId)";
    }

    @Override
    public String getPrimaryKey() {
        return "registracioniBroj";
    }

    @Override
    public String getSelectColumns() {
        return "registracioniBroj, radnikId, datumServisa, kilometraza, opis";
    }

    @Override
    public String getSelectOrderBy() {
        return "s.registracioniBroj";
    }

    @Override
    public String getSelectWhereCondition() {
        return "registracioniBroj";
    }

    @Override
    public String getInsertColumns() {
        return "(registracioniBroj, radnikId, datumServisa, kilometraza, opis)";
    }

    @Override
    public String getInsertValues() {
        java.sql.Date datumServisaSQL = new java.sql.Date(this.getDatumServisa().getTime());
        return "('" + this.getAutomobil().getRegistracioniBroj() + "', '" + this.getRadnik().getRadnikId()
                + "', '" + datumServisaSQL + "', '" + this.getKilometraza() + "', '" + this.getOpis() + "')";
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
        return "registracioniBroj=" + this.getAutomobil().getRegistracioniBroj();
    }

    @Override
    public List<GenericObject> getListOfSelectedRows(ResultSet rs) throws SQLException {
        List<GenericObject> objects = new ArrayList<>();
        while (rs.next()) {
            Servis servis = new Servis();

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
            servis.setAutomobil(automobil);

            Radnik radnik = new Radnik();
            radnik.setRadnikId(rs.getInt("radnikId"));
            radnik.setImeRadnika(rs.getString("imeRadnika"));
            radnik.setPrezimeRadnika(rs.getString("prezimeRadnika"));
            radnik.setStrucnaSprema(StrucnaSprema.valueOf(rs.getString("strucnaSprema")));
            radnik.setKorisnickoIme(rs.getString("korisnickoIme"));
            radnik.setSifra(rs.getString("sifra"));
            servis.setRadnik(radnik);

            servis.setDatumServisa(rs.getDate("datumServisa"));
            servis.setKilometraza(rs.getInt("kilometraza"));
            servis.setOpis(rs.getString("opis"));
            objects.add(servis);
        }
        return objects;
    }

}
