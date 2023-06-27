package com.amr.common.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Klasa koja se koristi na Serverskoj strani aplikacije za pracenje klijenata
 *
 * @author Nebojsa Brankovic
 */
public class Korisnik implements Serializable {

    /**
     * Objekat klase Radnik koji predstavlja klijenta
     */
    private Radnik radnik;
    /**
     * Atribut koji predstavlja trenutak kada se klijent ulogovao na sistem
     */
    private Date datumPovezivanja;

    /**
     * Metoda koja vraca klijenta
     * 
     * @return Klijent koji koristi aplikaciju
     */
    public Radnik getRadnik() {
        return radnik;
    }
    /**
     * Metoda koja postavlja klijenta koji koristi aplikaciju
     * 
     * @param radnik Radnik koji predstavlja korisnika aplikacije
     */
    public void setRadnik(Radnik radnik) {
        this.radnik = radnik;
    }

    /**
     * Metoda koja vraca atribut datumPovezivanja
     * 
     * @return Datum povezivanja klijenta
     */
    public Date getDatumPovezivanja() {
        return datumPovezivanja;
    }

    /**
     * Metoda koja postavlja datum povezivanja klijenta.
     * 
     * @param datumPovezivanja Datum povezivanja klijenta kao Date
     */
    public void setDatumPovezivanja(Date datumPovezivanja) {
        this.datumPovezivanja = datumPovezivanja;
    }

}
