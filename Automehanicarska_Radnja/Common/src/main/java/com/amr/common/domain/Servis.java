package com.amr.common.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Klasa koja je zaduzena za beleske poslednjeg servisa automobila
 *
 * @author Nebojsa Brankovic
 */
public class Servis implements GenericObject {

    /**
     * datum poslednjeg servisa
     */
    private Date datumServisa;
    /**
     * kilometraza koju je imao auto na servisu u km
     */
    private int kilometraza;
    /**
     * posao koji je uradjen na servisu
     */
    private String opis;

    /**
     * automobil koji se servisira
     */
    private Automobil automobil;
    /**
     * mehanicar koji servisira auto
     */
    private Radnik radnik;

    /**
     * Prazan konstuktor
     */
    public Servis() {
    }

    /**
     * Parametrizovani konstuktor
     *
     * @param datumServisa datum poslednjeg servisa
     * @param kilometraza kilometraza koju je imao auto na servisu u km
     * @param opis posao koji je uradjen na servisu
     * @param automobil automobil koji se servisira
     * @param radnik mehanicar koji servisira auto
     */
    public Servis(Date datumServisa, int kilometraza, String opis, Automobil automobil, Radnik radnik) {
        this.datumServisa = datumServisa;
        this.kilometraza = kilometraza;
        this.opis = opis;
        this.automobil = automobil;
        this.radnik = radnik;
    }

    /**
     * Metoda koja vraca datum poslednjeg servisa
     *
     * @return Datum poslednjeg servisa
     */
    public Date getDatumServisa() {
        return datumServisa;
    }

    /**
     * Metoda koja postavlja datum poslednjeg servisa
     *
     * @param datumServisa datum poslednjeg servisa
     * @throws NullPointerException u slucaju da je unos null
     */
    public void setDatumServisa(Date datumServisa) throws NullPointerException {
        if (datumServisa == null) {
            throw new NullPointerException("Null vrednost");
        }
        this.datumServisa = datumServisa;
    }

    /**
     * Metoda koja vraca kilometrazu koju je auto imao na servisu
     *
     * @return kilometraza automobila na servisu
     */
    public int getKilometraza() {
        return kilometraza;
    }

    /**
     * Metoda koja postavlja kilometrazu koju je auto imao na poslednjem servisu
     *
     * @param kilometraza kilometraza koju je auto imao na poslednjem servisu
     * @throws IllegalArgumentException u slucaju da je uneta kilometraza manja
     * od 0
     */
    public void setKilometraza(int kilometraza) throws IllegalArgumentException {
        if (kilometraza < 0) {
            throw new IllegalArgumentException("Kilometraza ne moze biti manja od 0");
        }
        this.kilometraza = kilometraza;
    }

    /**
     * Metoda koja vraca opis uradjenog posla na servisu
     *
     * @return opis posla na servisu
     */
    public String getOpis() {
        return opis;
    }

    /**
     * Metoda koja postavlja opis posla uradjenog na servisu
     *
     * @param opis kratak opis posla uradjenog na servisu
     * @throws NullPointerException u slucaju da je unos null
     * @throws IllegalArgumentException u slucaju da je unos prazan
     */
    public void setOpis(String opis) throws NullPointerException, IllegalArgumentException {
        if (opis == null) {
            throw new NullPointerException("Null vrednost");
        }
        if (opis.equals("")) {
            throw new IllegalArgumentException("Prazan string");
        }
        this.opis = opis;
    }

    /**
     * Metoda koja vraca automobil koji je servisiran
     *
     * @return automobil koji je servisiran
     */
    public Automobil getAutomobil() {
        return automobil;
    }

    /**
     * Metoda koja postavlja automobil koji je servisiran
     *
     * @param automobil automobil koji je servisiran
     * @throws NullPointerException u slucaju da je unos null
     */
    public void setAutomobil(Automobil automobil) throws NullPointerException {
        if (automobil == null) {
            throw new NullPointerException("Null vrednost");
        }
        this.automobil = automobil;
    }

    /**
     * Metoda koja vraca radnika koji je servisirao automobil
     *
     * @return mehanicar koji je servisirao automobil
     */
    public Radnik getRadnik() {
        return radnik;
    }

    /**
     * Metoda koja postavlja radnika koji je izvrsio servis
     *
     * @param radnik radnik koji je uradio poslednji servis
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
        return "registracioniBroj='" + this.getAutomobil().getRegistracioniBroj() + "' AND radnikId=" + this.getRadnik().getRadnikId();
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

    /**
     * Metoda equals poredi 2 objekta i vraca true ako su oba klase Rezervacija
     * i imaju sve iste atribute
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
        final Servis other = (Servis) obj;
        if (this.kilometraza != other.kilometraza) {
            return false;
        }
        if (!Objects.equals(this.opis, other.opis)) {
            return false;
        }
        if (!Objects.equals(this.datumServisa, other.datumServisa)) {
            return false;
        }
        if (!Objects.equals(this.automobil, other.automobil)) {
            return false;
        }
        return Objects.equals(this.radnik, other.radnik);
    }

}
