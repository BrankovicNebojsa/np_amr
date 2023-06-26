package com.amr.common.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class Radnik implements GenericObject {

    private int radnikId;
    private String imeRadnika;
    private String prezimeRadnika;
    private StrucnaSprema strucnaSprema;
    private String korisnickoIme;
    private String sifra;

    public Radnik() {
    }

    public Radnik(int radnikId) {
        this.radnikId = radnikId;
    }

    public Radnik(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public Radnik(String korisnickoIme, String sifra) {
        this.korisnickoIme = korisnickoIme;
        this.sifra = sifra;
    }

    public Radnik(String imeRadnika, String prezimeRadnika, StrucnaSprema strucnaSprema, String korisnickoIme, String sifra) {
        this.imeRadnika = imeRadnika;
        this.prezimeRadnika = prezimeRadnika;
        this.strucnaSprema = strucnaSprema;
        this.korisnickoIme = korisnickoIme;
        this.sifra = sifra;
    }

    public int getRadnikId() {
        return radnikId;
    }

    public void setRadnikId(int radnikId) {
        this.radnikId = radnikId;
    }

    public String getImeRadnika() {
        return imeRadnika;
    }

    public void setImeRadnika(String imeRadnika) {
        this.imeRadnika = imeRadnika;
    }

    public String getPrezimeRadnika() {
        return prezimeRadnika;
    }

    public void setPrezimeRadnika(String prezimeRadnika) {
        this.prezimeRadnika = prezimeRadnika;
    }

    public StrucnaSprema getStrucnaSprema() {
        return strucnaSprema;
    }

    public void setStrucnaSprema(StrucnaSprema strucnaSprema) {
        this.strucnaSprema = strucnaSprema;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    @Override
    public boolean equals(Object obj) {
        if (this.getImeRadnika().equals(((Radnik) obj).getImeRadnika())
                && this.getPrezimeRadnika().equals(((Radnik) obj).getImeRadnika())
                && this.getKorisnickoIme().equals(((Radnik) obj).getKorisnickoIme())
                && this.getSifra().equals(((Radnik) obj).getSifra())
                && this.getRadnikId() == ((Radnik) obj).getRadnikId()) {
            return true;
        }
        return false;
    }

}
