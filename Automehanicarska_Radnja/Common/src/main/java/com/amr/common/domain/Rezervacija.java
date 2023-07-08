package com.amr.common.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Klasa koja predstavlja Rezervaciju jednog servisa u radnji
 *
 * @author Nebojsa Brankovic
 */
public class Rezervacija implements GenericObject {

    /**
     * primarni kljuc klase Rezervacija
     */
    private int rezervacijaId;
    /**
     * datum kada je predvidjen servis
     */
    private Date pocetakServisa;
    /**
     * trajanje servisa u minutima
     */
    private int trajanjeServisa;
    /**
     * automobil koji se servisira
     */
    private Automobil automobil;
    /**
     * mehanicar koji ce izvrsiti servis
     */
    private Radnik radnik;

    /**
     * Neparametrizovani konstruktor
     */
    public Rezervacija() {
    }

    /**
     * Parametrizovani konstruktor sa 4 parametra
     *
     * @param pocetakServisa datum rezervacije
     * @param trajanjeServisa trajanje servisa u minutima
     * @param automobil automobil koji treba da se servisira
     * @param radnik mehanicar koji ce servisirati auto
     */
    public Rezervacija(Date pocetakServisa, int trajanjeServisa, Automobil automobil, Radnik radnik) {
        this.pocetakServisa = pocetakServisa;
        this.trajanjeServisa = trajanjeServisa;
        this.automobil = automobil;
        this.radnik = radnik;
    }

    /**
     * Parametrizovani konstruktor sa 5 parametra
     *
     * @param rezervacijaId primarni kljuc rezervacije
     * @param pocetakServisa datum rezervacije
     * @param trajanjeServisa trajanje servisa u minutima
     * @param automobil automobil koji treba da se servisira
     * @param radnik mehanicar koji ce servisirati auto
     */
    public Rezervacija(int rezervacijaId, Date pocetakServisa, int trajanjeServisa, Automobil automobil, Radnik radnik) {
        this.rezervacijaId = rezervacijaId;
        this.pocetakServisa = pocetakServisa;
        this.trajanjeServisa = trajanjeServisa;
        this.automobil = automobil;
        this.radnik = radnik;
    }

    /**
     * Metoda koja vraca primarni kljuc rezervacije
     *
     * @return primarni kljuc rezervacije kao integer
     */
    public int getRezervacijaId() {
        return rezervacijaId;
    }

    /**
     * Postavlja primarni kljuc za rezervaciju
     *
     * @param rezervacijaId primarni kljuc rezervacije
     * @throws IllegalArgumentException ukoliko je unet id manji od 0
     */
    public void setRezervacijaId(int rezervacijaId) throws IllegalArgumentException {
        if (rezervacijaId < 0) {
            throw new IllegalArgumentException("Unet id manji od 0");
        }
        this.rezervacijaId = rezervacijaId;
    }

    /**
     * Metoda koja vraca datum rezervacije
     *
     * @return datum rezervacije kao Date
     */
    public Date getPocetakServisa() {
        return pocetakServisa;
    }

    /**
     * Postavlja datum rezervacije
     *
     * @param pocetakServisa datum rezervacije
     * @throws NullPointerException u slucaju da je unos null
     */
    public void setPocetakServisa(Date pocetakServisa) throws NullPointerException {
        if (pocetakServisa == null) {
            throw new NullPointerException("Null vrednost");
        }
        this.pocetakServisa = pocetakServisa;
    }

    /**
     * Metoda koja vraca trajanje servisa u minutama
     *
     * @return trajanje servisa kao int
     */
    public int getTrajanjeServisa() {
        return trajanjeServisa;
    }

    /**
     * Postavlja trajanje servisa u minutama
     *
     * @param trajanjeServisa trajanje servisa u minutama
     * @throws IllegalArgumentException u slucaju da je uneto trajanje manje od
     * 0
     */
    public void setTrajanjeServisa(int trajanjeServisa) throws IllegalArgumentException {
        if (trajanjeServisa < 0) {
            throw new IllegalArgumentException("Trajanje servisa ne moze biti manje od 0");
        }
        this.trajanjeServisa = trajanjeServisa;
    }

    /**
     * Metoda koja vraca automobil za koji je napravljena rezervacija
     *
     * @return automobil za koji je napravljena rezervacija
     */
    public Automobil getAutomobil() {
        return automobil;
    }

    /**
     * Postavlja automobil koji treba da se servisira
     *
     * @param automobil automobil koji treba da se servisira
     * @throws NullPointerException u slucaju da je unos null
     */
    public void setAutomobil(Automobil automobil) throws NullPointerException {
        if (automobil == null) {
            throw new NullPointerException("Null vrednost");
        }
        this.automobil = automobil;
    }

    /**
     * Metoda koja vraca mehanicara koji ce servisirati auto
     *
     * @return mehanicar koji ce servisirati auto kao objekat klase Radnik
     */
    public Radnik getRadnik() {
        return radnik;
    }

    /**
     * Postavlja radnika koji treba da servisira auto
     *
     * @param radnik radnik koji treba da servisira
     * @throws NullPointerException u slucaju da je unos null
     */
    public void setRadnik(Radnik radnik) throws NullPointerException {
        if (radnik == null) {
            throw new NullPointerException("Null vrednost");
        }
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
