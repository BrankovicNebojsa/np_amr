package com.amr.common.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Klasa koja predstavlja zaposlenog mehanicara u nasoj automehanicarskoj radnji
 *
 * @author Nebojsa Brankovic
 */
public class Radnik implements GenericObject {

    /**
     * primarni kljuc za objekat klase Radnik
     */
    private int radnikId;
    /**
     * ime zaposlenog mehanicara
     */
    private String imeRadnika;
    /**
     * prezime zaposlenog mehanicara
     */
    private String prezimeRadnika;
    /**
     * strucna sprema zaposlenog koja predstavlja Enum StrucnaSprema
     */
    private StrucnaSprema strucnaSprema;
    /**
     * korisnicko ime uz pomoc kojeg se zaposleni registruje na aplikaciju
     */
    private String korisnickoIme;
    /**
     * sifra uz pomoc koje se zaposleni registruje na aplikaciju
     */
    private String sifra;

    /**
     * Neparametrizovani konstruktor
     */
    public Radnik() {
    }

    /**
     * Konstruktor sa jednim parametrom za primarni kljuc
     *
     * @param radnikId primarni kljuc radnika
     */
    public Radnik(int radnikId) {
        this.radnikId = radnikId;
    }

    /**
     * Konstuktor sa jednim parametrom za korisnicko ime
     *
     * @param korisnickoIme korisnicko ime koje se dodeljuje radniku
     */
    public Radnik(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    /**
     * Konsturktor sa dva parametra: korisnicko ime i sifra
     *
     * @param korisnickoIme korisnicko ime koje se dodeljuje radniku
     * @param sifra sifra koja se dodeljuje radniku
     */
    public Radnik(String korisnickoIme, String sifra) {
        this.korisnickoIme = korisnickoIme;
        this.sifra = sifra;
    }

    /**
     * Parametrizovani konstruktor sa svim parametrima osim primarnog kljuca
     *
     * @param imeRadnika ime radnika
     * @param prezimeRadnika prezime radnika
     * @param strucnaSprema strucna sprema koja se dodeljuje radniku
     * @param korisnickoIme korisnicko ime koje se dodeljuje radniku
     * @param sifra sifra koja se dodeljuje radniku
     */
    public Radnik(String imeRadnika, String prezimeRadnika, StrucnaSprema strucnaSprema, String korisnickoIme, String sifra) {
        this.imeRadnika = imeRadnika;
        this.prezimeRadnika = prezimeRadnika;
        this.strucnaSprema = strucnaSprema;
        this.korisnickoIme = korisnickoIme;
        this.sifra = sifra;
    }

    /**
     * Metoda za vracanje primarnog kljuca objekta klase Radnik
     *
     * @return id radnika
     */
    public int getRadnikId() {
        return radnikId;
    }

    /**
     * Metoda koja postavlja primarni kljuc objekta klase Radnik
     *
     * @param radnikId id radnika
     * @throws IllegalArgumentException ukoliko je unet id manji od 0
     */
    public void setRadnikId(int radnikId) throws IllegalArgumentException {
        if (radnikId < 0) {
            throw new IllegalArgumentException("Unet id manji od 0");
        }
        this.radnikId = radnikId;
    }

    /**
     * Metoda za vracanje imena radnika
     *
     * @return ime radnika
     */
    public String getImeRadnika() {
        return imeRadnika;
    }

    /**
     * Metoda koja postavlja ime radnika
     *
     * @param imeRadnika ime radnika
     * @throws NullPointerException u slucaju da je unos null
     * @throws IllegalArgumentException u slucaju da je unos prazan
     */
    public void setImeRadnika(String imeRadnika) throws IllegalArgumentException, NullPointerException {
        if (imeRadnika == null) {
            throw new NullPointerException("Null vrednost");
        }
        if (imeRadnika.equals("")) {
            throw new IllegalArgumentException("Prazan string");
        }
        this.imeRadnika = imeRadnika;
    }

    /**
     * Metoda za vracanje prezimena radnika
     *
     * @return prezime radnika
     */
    public String getPrezimeRadnika() {
        return prezimeRadnika;
    }

    /**
     * Metoda koja postavlja prezime radnika
     *
     * @param prezimeRadnika prezime radnika
     * @throws NullPointerException u slucaju da je unos null
     * @throws IllegalArgumentException u slucaju da je unos prazan
     */
    public void setPrezimeRadnika(String prezimeRadnika) throws IllegalArgumentException, NullPointerException {
        if (prezimeRadnika == null) {
            throw new NullPointerException("Null vrednost");
        }
        if (prezimeRadnika.equals("")) {
            throw new IllegalArgumentException("Prazan string");
        }
        this.prezimeRadnika = prezimeRadnika;
    }

    /**
     * Metoda za vracanje strucne spreme radnika
     *
     * @return strucna sprema radnika
     */
    public StrucnaSprema getStrucnaSprema() {
        return strucnaSprema;
    }

    /**
     * Metoda koja postavlja strucnu spremu radnika
     *
     * @param strucnaSprema strucna sprema radnika
     * @throws NullPointerException u slucaju da je unos null
     */
    public void setStrucnaSprema(StrucnaSprema strucnaSprema) throws NullPointerException {
        if (strucnaSprema == null) {
            throw new NullPointerException("Null vrednost");
        }
        this.strucnaSprema = strucnaSprema;
    }

    /**
     * Metoda za vracanje korisnickog imena radnika
     *
     * @return korisnicko ime radnika
     */
    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    /**
     * Metoda koja postavlja korisnicko ime radnika
     *
     * @param korisnickoIme korisnicko ime radniak
     * @throws NullPointerException u slucaju da je unos null
     * @throws IllegalArgumentException u slucaju da je unos prazan
     */
    public void setKorisnickoIme(String korisnickoIme) throws IllegalArgumentException, NullPointerException {
        if (korisnickoIme == null) {
            throw new NullPointerException("Null vrednost");
        }
        if (korisnickoIme.equals("")) {
            throw new IllegalArgumentException("Prazan string");
        }
        this.korisnickoIme = korisnickoIme;
    }

    /**
     * Metoda za vracanje sifre radnika
     *
     * @return sifra radnika
     */
    public String getSifra() {
        return sifra;
    }

    /**
     * Metoda koja postavlja sifru radnik
     *
     * @param sifra sifra radnika
     * @throws NullPointerException u slucaju da je unos null
     * @throws IllegalArgumentException u slucaju da je unos prazan
     */
    public void setSifra(String sifra) throws IllegalArgumentException, NullPointerException {
        if (sifra == null) {
            throw new NullPointerException("Null vrednost");
        }
        if (sifra.equals("")) {
            throw new IllegalArgumentException("Prazan string");
        }
        this.sifra = sifra;
    }

    @Override
    public String getTableName() {
        return "radnik";
    }

    @Override
    public String getAlias() {
        return " ra ";
    }

    @Override
    public String getJoinValues() {
        return "";
    }

    @Override
    public String getPrimaryKey() {
        return "radnikId";
    }

    @Override
    public String getSelectColumns() {
        return "radnikId, imeRadnika, prezimeRadnika, strucnaSprema, korisnickoIme, sifra";
    }

    @Override
    public String getSelectOrderBy() {
        return "imeRadnika";
    }

    @Override
    public String getSelectWhereCondition() {
        return "radnikId";
    }

    @Override
    public String getInsertColumns() {
        return "(imeRadnika, prezimeRadnika, strucnaSprema, korisnickoIme, sifra)";
    }

    @Override
    public String getInsertValues() {
        return "('" + this.getImeRadnika() + "', '" + this.getPrezimeRadnika()
                + "', '" + this.getStrucnaSprema().toString() + "', '" + this.getKorisnickoIme() + "', '"
                + this.getSifra() + "')";
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
        return "radnikId=" + this.getRadnikId();
    }

    @Override
    public List<GenericObject> getListOfSelectedRows(ResultSet rs) throws SQLException {
        List<GenericObject> objects = new ArrayList<>();
        while (rs.next()) {
            Radnik radnik = new Radnik();
            radnik.setRadnikId(rs.getInt("radnikId"));
            radnik.setImeRadnika(rs.getString("imeRadnika"));
            radnik.setPrezimeRadnika(rs.getString("prezimeRadnika"));
            radnik.setStrucnaSprema(StrucnaSprema.valueOf(rs.getString("strucnaSprema")));
            radnik.setKorisnickoIme(rs.getString("korisnickoIme"));
            radnik.setSifra(rs.getString("sifra"));
            objects.add(radnik);
        }
        return objects;
    }

    /**
     * Metoda equals poredi 2 objekta i vraca true ako su oba klase Radnik i
     * imaju sve iste atribute
     *
     * @param obj objekat s kojim se poredi instanca ove klase
     * @return da li imaju iste atribute
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Radnik other = (Radnik) obj;
        if (!Objects.equals(this.imeRadnika, other.imeRadnika)) {
            return false;
        }
        if (!Objects.equals(this.prezimeRadnika, other.prezimeRadnika)) {
            return false;
        }
        if (!Objects.equals(this.korisnickoIme, other.korisnickoIme)) {
            return false;
        }
        if (!Objects.equals(this.sifra, other.sifra)) {
            return false;
        }
        return this.strucnaSprema == other.strucnaSprema;
    }

}
