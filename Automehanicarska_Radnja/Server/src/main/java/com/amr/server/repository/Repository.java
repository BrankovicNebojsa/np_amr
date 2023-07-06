package com.amr.server.repository;

import java.util.List;

/**
 * Interfejs za upravljanje nad bazom podataka
 *
 * @author Nebojsa Brankovic
 * @param <T> opsti domenski objekat
 */
public interface Repository<T> {

    /**
     * Metoda koja vraca listu objekata odgovarajuce klase iz baze
     *
     * @param param objekat neke konkretne domenske klase
     * @param filter filter koji se koristi u bazi
     * @return lista objekata te klase
     * @throws Exception baca izuzetak ako dodje do greske u bazi
     */
    List<T> getAllFilter(T param, String filter) throws Exception;

    /**
     * Metoda koja vraca listu objekata odgovarajuce klase iz baze
     *
     * @param param objekat neke konkretne domenske klase
     * @return lista objekata te klase
     * @throws Exception baca izuzetak ako dodje do greske u bazi
     */
    List<T> getAll(T param) throws Exception;

    /**
     * Metoda koja cuva objekat u bazi
     *
     * @param param objekat neke konkretne domenske klase
     * @throws Exception baca izuzetak ako dodje do greske pri cuvanju objekta u
     * bazi
     */
    void save(T param) throws Exception;

    /**
     * Metoda koja menja podatke za objekat u bazi
     *
     * @param param objekat konkretne domenske klase
     * @throws Exception baca izuzetak ako dodje do greske pri izmeni podataka u
     * bazi
     */
    void update(T param) throws Exception;

    /**
     * Metoda koja brise red u bazi
     *
     * @param param objekat koji se brise
     * @throws Exception baca izuzetak ako dodje do greske pri brisanju
     */
    void delete(T param) throws Exception;

}
