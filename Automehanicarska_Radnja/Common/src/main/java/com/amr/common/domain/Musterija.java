package com.amr.common.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Klasa koja predstavlja Vlasnika automobila i Musteriju automehanicarske
 * radnje
 *
 * @author Nebojsa Brankovic
 */
public class Musterija implements GenericObject {

    /**
     * Primarni kljuc musteriju
     */
    private int musterijaId;
    /**
     * Ime musterije
     */
    private String imeMusterije;
    /**
     * Prezime musterije
     */
    private String prezimeMusterije;
    /**
     * Elektronska posta musterije
     */
    private String mailMusterije;
    /**
     * Telefon musterije(+381)
     */
    private String telefonMusterije;

    /**
     * Konstruktor bez parametara
     */
    public Musterija() {
    }

    /**
     * Konstruktor sa jednim parametrom
     *
     * @param musterijaId Primarni kljuc musterije
     */
    public Musterija(int musterijaId) {
        this.musterijaId = musterijaId;
    }

    /**
     * Konstruktor sa vise parametara
     *
     * @param imeMusterije Ime musterije
     * @param prezimeMusterije Prezime musterije
     * @param mailMusterije Mail musterije
     * @param telefonMusterije Telefon musterije
     */
    public Musterija(String imeMusterije, String prezimeMusterije, String mailMusterije, String telefonMusterije) {
        this.imeMusterije = imeMusterije;
        this.prezimeMusterije = prezimeMusterije;
        this.mailMusterije = mailMusterije;
        this.telefonMusterije = telefonMusterije;
    }

    /**
     * Konstruktor sa svim parametrima
     *
     * @param musterijaId Primarni kljuc musterije
     * @param imeMusterije Ime musterije
     * @param prezimeMusterije Prezime musterije
     * @param mailMusterije Mail musterije
     * @param telefonMusterije Telefon musterije
     */
    public Musterija(int musterijaId, String imeMusterije, String prezimeMusterije, String mailMusterije, String telefonMusterije) {
        this.musterijaId = musterijaId;
        this.imeMusterije = imeMusterije;
        this.prezimeMusterije = prezimeMusterije;
        this.mailMusterije = mailMusterije;
        this.telefonMusterije = telefonMusterije;
    }

    /**
     * Metoda koja vraca primarni kljuc musterije
     *
     * @return primarni kljuc musterije
     */
    public int getMusterijaId() {
        return musterijaId;
    }

    /**
     * Metoda koja postavlja primarni kljuc musterije
     *
     * @param musterijaId Primarni kljuc musterije
     * @throws IllegalArgumentException ukoliko je unet id manji od 0
     */
    public void setMusterijaId(int musterijaId) throws IllegalArgumentException {
        if (musterijaId < 0) {
            throw new IllegalArgumentException("Unet id manji od 0");
        }
        this.musterijaId = musterijaId;
    }

    /**
     * Metoda koja vraca ime musterije
     *
     * @return Ime musterije
     */
    public String getImeMusterije() {
        return imeMusterije;
    }

    /**
     * Metoda koja postavlja ime musterije
     *
     * @param imeMusterije Ime musterije
     * @throws NullPointerException u slucaju da je unos null
     * @throws IllegalArgumentException u slucaju da je unos prazan
     */
    public void setImeMusterije(String imeMusterije) throws IllegalArgumentException, NullPointerException {
        if (imeMusterije == null) {
            throw new NullPointerException("Null vrednost");
        }
        if (imeMusterije.equals("")) {
            throw new IllegalArgumentException("Prazan string");
        }
        this.imeMusterije = imeMusterije;
    }

    /**
     * Metoda koja vraca prezime musterije
     *
     * @return Prezime musterije
     */
    public String getPrezimeMusterije() {
        return prezimeMusterije;
    }

    /**
     * Metoda koja postavlja prezime musterije
     *
     * @param prezimeMusterije Prezime musterije
     * @throws NullPointerException u slucaju da je unos null
     * @throws IllegalArgumentException u slucaju da je unos prazan
     */
    public void setPrezimeMusterije(String prezimeMusterije) throws IllegalArgumentException, NullPointerException {
        if (prezimeMusterije == null) {
            throw new NullPointerException("Null vrednost");
        }
        if (prezimeMusterije.equals("")) {
            throw new IllegalArgumentException("Prazan string");
        }
        this.prezimeMusterije = prezimeMusterije;
    }

    /**
     * Metoda koja vraca mail musterije
     *
     * @return Mail musterije
     */
    public String getMailMusterije() {
        return mailMusterije;
    }

    /**
     * Metoda koja postavlja mail musterije
     *
     * @param mailMusterije Mail musterije
     * @throws NullPointerException u slucaju da je unos null
     * @throws IllegalArgumentException u slucaju da je unos prazan
     */
    public void setMailMusterije(String mailMusterije) throws IllegalArgumentException, NullPointerException {
        if (mailMusterije == null) {
            throw new NullPointerException("Null vrednost");
        }
        if (mailMusterije.equals("")) {
            throw new IllegalArgumentException("Prazan string");
        }
        this.mailMusterije = mailMusterije;
    }

    /**
     * Metoda koja vraca telefon musterije
     *
     * @return Telefon musterije
     */
    public String getTelefonMusterije() {
        return telefonMusterije;
    }

    /**
     * Metoda koja postavlja telefon musterije
     *
     * @param telefonMusterije Telefon musterije
     * @throws NullPointerException u slucaju da je unos null
     * @throws IllegalArgumentException u slucaju da je unos prazan
     */
    public void setTelefonMusterije(String telefonMusterije) throws IllegalArgumentException, NullPointerException {
        if (telefonMusterije == null) {
            throw new NullPointerException("Null vrednost");
        }
        if (telefonMusterije.equals("")) {
            throw new IllegalArgumentException("Prazan string");
        }
        this.telefonMusterije = telefonMusterije;
    }

    @Override
    public String getTableName() {
        return "musterija";
    }

    @Override
    public String getAlias() {
        return " mu ";
    }

    @Override
    public String getJoinValues() {
        return "";
    }

    @Override
    public String getPrimaryKey() {
        return "musterijaId";
    }

    @Override
    public String getSelectColumns() {
        return "musterijaId, imeMusterije, prezimeMusterije, mailMusterije, telefonMusterije";
    }

    @Override
    public String getSelectOrderBy() {
        return "imeMusterije";
    }

    @Override
    public String getSelectWhereCondition() {
        return "imeMusterije";
    }

    @Override
    public String getInsertColumns() {
        return "(imeMusterije, prezimeMusterije, mailMusterije, telefonMusterije)";
    }

    @Override
    public String getInsertValues() {
        return "('" + this.getImeMusterije() + "', '" + this.getPrezimeMusterije()
                + "', '" + this.getMailMusterije() + "', '" + this.getTelefonMusterije() + "')";
    }

    @Override
    public String getUpdateSet() {
        return "imeMusterije='" + this.getImeMusterije()
                + "', prezimeMusterije='" + this.getPrezimeMusterije()
                + "', mailMusterije='" + this.getMailMusterije().toString()
                + "', telefonMusterije='" + this.getTelefonMusterije() + "'";
    }

    @Override
    public String getUpdateWhereCondition() {
        return "musterijaId=" + this.getMusterijaId();
    }

    @Override
    public String getDeleteWhereCondition() {
        return "musterijaId=" + this.getMusterijaId();
    }

    @Override
    public List<GenericObject> getListOfSelectedRows(ResultSet rs) throws SQLException {
        List<GenericObject> objects = new ArrayList<>();
        while (rs.next()) {
            Musterija musterija = new Musterija();
            musterija.setMusterijaId(rs.getInt("musterijaId"));
            musterija.setImeMusterije(rs.getString("imeMusterije"));
            musterija.setPrezimeMusterije(rs.getString("prezimeMusterije"));
            musterija.setMailMusterije(rs.getString("mailMusterije"));
            musterija.setTelefonMusterije(rs.getString("telefonMusterije"));
            objects.add(musterija);
        }
        return objects;
    }

    /**
     * Metoda equals poredi 2 objekta i vraca true ako su oba klase Musterija i
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
        final Musterija other = (Musterija) obj;
        if (!Objects.equals(this.imeMusterije, other.imeMusterije)) {
            return false;
        }
        if (!Objects.equals(this.prezimeMusterije, other.prezimeMusterije)) {
            return false;
        }
        if (!Objects.equals(this.mailMusterije, other.mailMusterije)) {
            return false;
        }
        return Objects.equals(this.telefonMusterije, other.telefonMusterije);
    }

}
