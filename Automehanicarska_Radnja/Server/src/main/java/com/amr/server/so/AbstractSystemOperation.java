/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amr.server.so;

import com.amr.server.dbrepository.DBRepository;
import com.amr.server.dbrepository.concrete.GenericObjectDBRepository;

/**
 * Apstraktna klasa koja predstavlja opstu sistemku operaciju i sve njene metode
 *
 * @author Nebojsa Brankovic
 */
public abstract class AbstractSystemOperation {

    /**
     * Objekat odgovarajuce repository klase
     */
    protected final DBRepository repository;

    /**
     * Konstuktor za instanciranje repository-a
     */
    public AbstractSystemOperation() {
        this.repository = new GenericObjectDBRepository();
    }

    /**
     * Metoda kroz koju je potrebno da prodje svaka sistemska operacija da bi izvrsila svoje zahteve
     * @param ado opsti domenski objekat
     * @throws Exception baca izuzetak u slucaju da dodje do greske pri izvrsenju sistemske operacije
     */
    public final void execute(Object ado) throws Exception {
        try {
            preconditions(ado);
            startTransaction();
            executeOperation(ado);
            commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            rollback();
            throw ex;
        } finally {
            disconnect();
        }
    }

    /**
     * Metoda koja proverava da li su ispunjeni zahtevi da se izvrsi sistemska operacija
     * @param ado opsti domenski objekat
     * @throws Exception baca izuzetak ako se desi greska u ovoj metodi
     */
    protected abstract void preconditions(Object ado) throws Exception;

    /**
     * Metoda koja izvrsava sistemsku operaciju
     * @param ado opsti domenski objekat
     * @throws Exception baca izuzetak ako se desi greska u ovoj metodi
     */
    protected abstract void executeOperation(Object ado) throws Exception;

    /**
     * Metoda koja zapocinje transakciju
     * @throws Exception baca izuzetak ako se desi greska pri pokretanju transakcije
     */
    private void startTransaction() throws Exception {
        repository.connect();
    }

    /**
     * Metoda koja postavlja promene u bazu podataka
     * @throws Exception baca izuzetak ako se desi greska pri postavljanju promena
     */
    private void commit() throws Exception {
        repository.commit();
    }

    /**
     * Metoda koja vraca bazu podataka u stanje pre promena
     * @throws Exception baca izuzetak ako se desi greska pri vracanju podataka
     */
    private void rollback() throws Exception {
        repository.rollback();
    }

    /**
     * Metoda koja prekida transakciju
     * @throws Exception baca izuzetak ako se desi greska pri prekidanju transakcije
     */
    private void disconnect() throws Exception {
        repository.disconnect();
    }

}
