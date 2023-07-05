package com.amr.common.communication;

import java.io.Serializable;

/**
 * Ova klasa predstavlja Odgovor na zahtev
 * 
 * @author Nebojsa Brankovic
 */
public class Response implements Serializable { //mozda treba poslati koji je exception

    /**
     * Rezultat zahteva koji se salje klijentskoj strani
     */
    private Object result;
    /**
     * Status odgovora (uspesan ili neuspesan)
     */
    private ResponseType status;

    /**
     * Neparametrizovani konstuktor
     */
    public Response() {
        status = ResponseType.SUCCESS;
    }

    /**
     * Parametrizovani konstuktor
     * @param result rezultat servera
     * @param status status odgovora
     */
    public Response(Object result, ResponseType status) {
        this.result = result;
        this.status = status;
    }

    /**
     * Metoda koja vraca rezultat serverske strane
     * @return rezultat serverske strane
     */
    public Object getResult() {
        return result;
    }

    /**
     * Metoda koja postavlja rezultat serverske strane
     * @param result rezultat serverske strane
     */
    public void setResult(Object result) {
        this.result = result;
    }

    /**
     * Metoda koja vraca status odgovora
     * @return status odgovora
     */
    public ResponseType getStatus() {
        return status;
    }

    /**
     * Metoda koja postavlja status odgovora
     * @param status status odgovora
     */
    public void setStatus(ResponseType status) {
        this.status = status;
    }

}
