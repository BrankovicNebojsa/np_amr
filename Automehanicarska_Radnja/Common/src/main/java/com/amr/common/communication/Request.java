package com.amr.common.communication;

import java.io.Serializable;

/**
 * Klasa koja predstavlja zahtev koji se koristi u komunikaciji servera i
 * klijenta
 *
 * @author Nebojsa Brankovic
 */
public class Request implements Serializable {

    /**
     * Tip operacije u zahtevu
     */
    private Operation operation;
    /**
     * Argument koji se salje sa klijentske strane
     */
    private Object argument;

    /**
     * Neparametrizovani konstuktor
     */
    public Request() {
    }

    /**
     * Parametrizovani konstruktor
     *
     * @param operation Tip operacije u zahtevu
     * @param argument Argument koji se salje sa klijentske strane
     */
    public Request(Operation operation, Object argument) {
        this.operation = operation;
        this.argument = argument;
    }

    /**
     * Metoda koja vraca tip operacije
     * @return tip operacije
     */
    public Operation getOperation() {
        return operation;
    }

    /**
     * Metoda koja postavlja tip operacije
     * @param operation tip operacije
     */
    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    /**
     * Metoda koja vraca argument prosledjen u zahtevu
     * @return argument prosledjen u zahtevu
     */
    public Object getArgument() {
        return argument;
    }

    /**
     * Postavlja argument u zahtev
     * @param argument Argument zahteva
     */
    public void setArgument(Object argument) {
        this.argument = argument;
    }

}
