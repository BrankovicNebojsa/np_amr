package com.amr.common.domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.List;
import java.sql.SQLException;

/**
 * Interfejs koji predstavlja Opsti domenski objekat
 * 
 * @author Nebojsa Brankovic
 */
public interface GenericObject extends Serializable {

    /**
     * Funkcija koja vraca naziv tabele iz baze podataka
     * 
     * @return Naziv tabele kao String 
     */
    public String getTableName();

    /**
     * Funkcija koja vraca alias tabele iz baze podataka
     * 
     * @return Alias tabele kao String
     */
    public String getAlias();

    /**
     * Funkcija koja vraca sve JOIN-ove potrebne za inicijalizaciju objekta klase
     * 
     * @return JOIN-ovi potrebni za inicijalizaciju objekta klase kao String
     */
    public String getJoinValues();

    /**
     * Funkcija koja vraca primarni kljuc odgovarajuce tabele u bazi podataka
     * 
     * @return Primarni kljuc odgovarajuce tabele u bazi podataka kao String
     */
    public String getPrimaryKey();

    /**
     * Funkcija koja vraca kolone odgovarajuce tabele u bazi podataka koje su potrebne za inicijalizaciju objekta
     * 
     * @return Kolone odgovarajuce tabele u bazi podataka koje su potrebne za inicijalizaciju objekta kao String
     */
    public String getSelectColumns();

    /**
     * Funkcija koja vraca kolonu po kojoj ce se sortirati vrednosti u tabeli
     * 
     * @return Kolona po kojoj ce se sortirati vrednosti u tabeli kao String
     */
    public String getSelectOrderBy();

    /**
     * Funkcija koja vraca uslov za SELECT sql naredbu
     * 
     * @return Kolona koja se koristi kao uslov za SELECT sql naredbu u vidu Stringa
     */
    public String getSelectWhereCondition();

    /**
     * Funkcija koja vraca kolone odgovarajuce tabele u bazi podataka koje su potrebne za cuvanje objekta
     * 
     * @return Kolone odgovarajuce tabele u bazi podataka koje su potrebne za cuvanje objekta kao String
     */
    public String getInsertColumns();

     /**
     * Funkcija koja vraca vrednosti atributa objekta koji cuvamo u bazi podataka
     * 
     * @return Vrednosti atributa objekta koji cuvamo u bazi podataka kao String
     */
    public String getInsertValues();

    /**
     * Funkcija koja vraca vrednosti potrebne za SET unutar UPDATE SQL naredbe
     * 
     * @return Vrednosti potrebne za SET unutar UPDATE SQL naredbe kao String
     */
    public String getUpdateSet();

    /**
     * Funkcija koja vraca uslov za UPDATE sql naredbu
     * 
     * @return Kolona koja se koristi kao uslov za UPDATE sql naredbu u vidu Stringa
     */
    public String getUpdateWhereCondition();

    /**
     * Funkcija koja vraca uslov za DELETE sql naredbu
     * 
     * @return Kolona koja se koristi kao uslov za DELTE sql naredbu u vidu Stringa
     */
    public String getDeleteWhereCondition();

    /**
     * Funkcija koja vraca listu objekata date klase koji su izvuceni iz tabele unutar baze podataka
     * 
     * @param rs Parametar koji je tipa ResultSet i predstavlja izvucene redove iz baze podataka
     * @return Lista objekata date klase koji su izvuceni iz tabele unutar baze podataka
     * 
     * @throws SQLException Baca izuzetak ukoliko dodje do greske pri uzimanju podataka iz baze podataka
     */
    public List<GenericObject> getListOfSelectedRows(ResultSet rs) throws SQLException;
}
