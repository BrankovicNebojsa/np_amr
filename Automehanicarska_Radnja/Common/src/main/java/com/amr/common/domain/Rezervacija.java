package com.amr.common.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class Rezervacija implements GenericObject {

    private int rezervacijaId;
    private Date pocetakServisa;
    private int trajanjeServisa;
    private Automobil automobil;
    private Radnik radnik;

    public Rezervacija() {
    }

    public Rezervacija(Date pocetakServisa, int trajanjeServisa, Musterija musterija, Automobil automobil, Radnik radnik) {
        this.pocetakServisa = pocetakServisa;
        this.trajanjeServisa = trajanjeServisa;
        this.automobil = automobil;
        this.radnik = radnik;
    }

    public Rezervacija(int rezervacijaId, Date pocetakServisa, int trajanjeServisa, Musterija musterija, Automobil automobil, Radnik radnik) {
        this.rezervacijaId = rezervacijaId;
        this.pocetakServisa = pocetakServisa;
        this.trajanjeServisa = trajanjeServisa;
        this.automobil = automobil;
        this.radnik = radnik;
    }

    public int getRezervacijaId() {
        return rezervacijaId;
    }

    public void setRezervacijaId(int rezervacijaId) {
        this.rezervacijaId = rezervacijaId;
    }

    public Date getPocetakServisa() {
        return pocetakServisa;
    }

    public void setPocetakServisa(Date pocetakServisa) {
        this.pocetakServisa = pocetakServisa;
    }

    public int getTrajanjeServisa() {
        return trajanjeServisa;
    }

    public void setTrajanjeServisa(int trajanjeServisa) {
        this.trajanjeServisa = trajanjeServisa;
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
        return "rezervacija";
    }

    @Override
    public String getAlias() {
        return " re ";
    }

    @Override
    public String getJoinValues() {
        return "JOIN automobil a ON (re.registracioniBroj=a.registracioniBroj)"
                + " JOIN musterija mu ON (a.musterijaId=mu.musterijaId)"
                + " JOIN model mo ON (a.modelId=mo.modelId AND a.markaId=mo.markaId)"
                + " JOIN marka ma ON (mo.markaId=ma.markaId)"
                + " JOIN radnik ra ON (re.radnikId=ra.radnikId)";
    }

    @Override
    public String getPrimaryKey() {
        return "rezervacijaId";
    }

    @Override
    public String getSelectColumns() {
        return "rezervacijaId, pocetakServisa, trajanjeServisa, musterijaId, registracioniBroj, radnikId";
    }

    @Override
    public String getSelectOrderBy() {
        return "pocetakServisa";
    }

    @Override
    public String getSelectWhereCondition() {
        return "re.registracioniBroj";
    }

    @Override
    public String getInsertColumns() {
        return "(pocetakServisa, trajanjeServisa, musterijaId, registracioniBroj, radnikId)";
    }

    @Override
    public String getInsertValues() {
        Timestamp pocetakServisa = new Timestamp(this.getPocetakServisa().getTime());
        return "('" + pocetakServisa + "', " + this.getTrajanjeServisa()
                + ", " + this.getAutomobil().getMusterija().getMusterijaId() + ", '"
                + this.getAutomobil().getRegistracioniBroj() + "', " + this.getRadnik().getRadnikId() + ")";
    }

    @Override
    public String getUpdateSet() {
        Timestamp pocetakServisa = new Timestamp(this.getPocetakServisa().getTime());
        return "pocetakServisa='" + pocetakServisa + "', trajanjeServisa=" + this.getTrajanjeServisa();
    }

    @Override
    public String getUpdateWhereCondition() {
        return "rezervacijaId=" + this.getRezervacijaId();
    }

    @Override
    public String getDeleteWhereCondition() {
        return "rezervacijaId=" + this.getRezervacijaId();
    }

    @Override
    public List<GenericObject> getListOfSelectedRows(ResultSet rs) throws SQLException {
        // proveriti da li treba mozda ma.markaId, a ne markaId 

        List<GenericObject> objects = new ArrayList<>();
        while (rs.next()) {
            Rezervacija rezervacija = new Rezervacija();
            rezervacija.setRezervacijaId(rs.getInt("rezervacijaId"));
            rezervacija.setPocetakServisa(new java.sql.Date(rs.getTimestamp("pocetakServisa").getTime()));
            rezervacija.setTrajanjeServisa(rs.getInt("trajanjeServisa"));

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
            rezervacija.setAutomobil(automobil);

            Radnik radnik = new Radnik();
            radnik.setRadnikId(rs.getInt("radnikId"));
            radnik.setImeRadnika(rs.getString("imeRadnika"));
            radnik.setPrezimeRadnika(rs.getString("prezimeRadnika"));
            radnik.setStrucnaSprema(StrucnaSprema.valueOf(rs.getString("strucnaSprema")));
            radnik.setKorisnickoIme(rs.getString("korisnickoIme"));
            radnik.setSifra(rs.getString("sifra"));
            rezervacija.setRadnik(radnik);

            objects.add(rezervacija);
        }
        return objects;
    }

}
