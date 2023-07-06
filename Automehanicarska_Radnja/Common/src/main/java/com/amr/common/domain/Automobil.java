package com.amr.common.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Klasa koja predstavlja Entitet Automobil i nasledjuje interfejs GenericObject
 *
 * @author Nebojsa Brankovic
 */
public class Automobil implements GenericObject {

    /**
     * Atribut koji predstavlja registracioni broj
     */
    private String registracioniBroj;
    /**
     * Atribut koji predstavlja godinu proizvodnje automobila
     */
    private int godiste;
    /**
     * Atribut koji predstavlja broj motora automobila
     */
    private String brojMotora;
    /**
     * Atribut koji predstavlja broj sasije automobila
     */
    private String brojSasije;
    /**
     * Atribut koji predstavlja boju automobila
     */
    private Boja boja;
    /**
     * Atribut koji predstavlja vrstu menjaca automobila (rucni ili automatski)
     */
    private TipMenjaca menjac;
    /**
     * Atribut koji predstavlja objekat klase Motor i sadrzi osobine motora
     */
    private Motor motor;
    /**
     * Atribut koji predstavlja objekat klase Model u kojem se nalazi naziv
     * marke i modela automobila
     */
    private Model model;
    /**
     * Atribut koji predstavlja objekat klase Musterija koji predstavlja
     * vlasnika automobila i sadrzi njegove atribute
     */
    private Musterija musterija;

    /**
     * Konstruktor bez parametara
     */
    public Automobil() {
    }

    /**
     * Konstruktor sa ulaznim parametarom registracioni broj
     *
     * @param registracioniBroj broj registracije
     */
    public Automobil(String registracioniBroj) {
        this.registracioniBroj = registracioniBroj;
    }

    /**
     * Konstruktor sa svim ulaznim parametrima
     *
     * @param registracioniBroj broj registracije
     * @param godiste godiste automobila
     * @param brojMotora broj motora automobila
     * @param brojSasije broj sasije motora
     * @param boja boja kojom je obojen automobil
     * @param menjac tip menjaca u automobilu
     * @param motor motor koji se nalazi u automobilu
     * @param model naziv marke i modela automobila
     * @param musterija vlasnik automobila
     *
     */
    public Automobil(String registracioniBroj, int godiste, String brojMotora, String brojSasije, Boja boja, TipMenjaca menjac,
            Motor motor, Model model, Musterija musterija) {
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

    /**
     * Metoda koja vraca registracioni broj objekta klase Automobil
     *
     * @return Registracioni broj kao String
     */
    public String getRegistracioniBroj() {
        return registracioniBroj;
    }

    /**
     * Metoda koja postavlja registracioni broj za instancu objekta klase
     * Automobil
     *
     * @param registracioniBroj Registracioni broj koji se postavlja Automobilu
     */
    public void setRegistracioniBroj(String registracioniBroj) {
        this.registracioniBroj = registracioniBroj;
    }

    /**
     * Metoda koja vraca atribut klase Automobil - godiste.
     *
     * @return Godina proizvodnje automobila
     */
    public int getGodiste() {
        return godiste;
    }

    /**
     * Metoda koja postavlja godinu proizvodnje za instancu objekta klase
     * Automobil
     *
     * @param godiste Godina proizvodnje koja se postavlja Automobilu
     */
    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    /**
     * Metoda koja vraca broj motora objekta klase Automobil
     *
     * @return Broj motora kao String
     */
    public String getBrojMotora() {
        return brojMotora;
    }

    /**
     * Metoda koja postavlja broj motora za instancu objekta klase Automobil
     *
     * @param brojMotora Broj motora koji se postavlja Automobilu
     */
    public void setBrojMotora(String brojMotora) {
        this.brojMotora = brojMotora;
    }

    /**
     * Metoda koja vraca broj sasije objekta klase Automobil
     *
     * @return Broj sasije kao String
     */
    public String getBrojSasije() {
        return brojSasije;
    }

    /**
     * Metoda koja postavlja broj sasije za instancu objekta klase Automobil
     *
     * @param brojSasije Broj sasije koji se postavlja Automobilu
     */
    public void setBrojSasije(String brojSasije) {
        this.brojSasije = brojSasije;
    }

    /**
     * Metoda koja vraca boju objekta klase Automobil
     *
     * @return Boja automobila
     */
    public Boja getBoja() {
        return boja;
    }

    /**
     * Metoda koja postavlja boju za instancu objekta klase Automobil
     *
     * @param boja Boja koja se postavlja Automobilu
     */
    public void setBoja(Boja boja) {
        this.boja = boja;
    }

    /**
     * Metoda koja vraca vrstu menjaca objekta klase Automobil
     *
     * @return Tip menjaca automobila
     */
    public TipMenjaca getMenjac() {
        return menjac;
    }

    /**
     * Metoda koja postavlja vrstu menjaca za instancu objekta klase Automobil
     *
     * @param menjac Vrsta menjaca koja se postavlja Automobilu
     */
    public void setMenjac(TipMenjaca menjac) {
        this.menjac = menjac;
    }

    /**
     * Metoda koja vraca motor objekta klase Automobil
     *
     * @return Motor automobila kao objekat klase Motor
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * Metoda koja postavlja motor za instancu objekta klase Automobil
     *
     * @param motor Instanca klase Motor koja se postavlja Automobilu
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    /**
     * Metoda koja vraca model objekta klase Automobil
     *
     * @return Model automobila kao objekat klase Model
     */
    public Model getModel() {
        return model;
    }

    /**
     * Metoda koja postavlja Model za instancu objekta klase Automobil
     *
     * @param model Instanca klase Model koji se postavlja Automobilu
     */
    public void setModel(Model model) {
        this.model = model;
    }

    /**
     * Metoda koja vraca model objekta klase Musterija
     *
     * @return Vlasnik automobila kao objekat klase Musterija
     */
    public Musterija getMusterija() {
        return musterija;
    }

    /**
     * Metoda koja postavlja Musteriju za instancu objekta klase Automobil
     *
     * @param musterija Instanca klase Musterija koja predstavlja vlasnika
     * automobila.
     */
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
