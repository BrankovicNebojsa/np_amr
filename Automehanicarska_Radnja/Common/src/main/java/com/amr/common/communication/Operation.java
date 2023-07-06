package com.amr.common.communication;

/**
 * Enum klasa za sve sistemske operacije potrebne na klijentskoj strani
 *
 * @author Nebojsa Brankovic
 */
public enum Operation {
    /**
     * Sistemska operacija za konekciju
     */
    CONNECT,
    /**
     * Sistemska operacija za prijavu
     */
    LOGIN,
    /**
     * Sistemska operacija za proveru postojanja korisnickog imena
     */
    USERNAME_EXISTS,
    /**
     * Sistemska operacija za proveru postojanja tablice u sistmeu
     */
    AUTOMOBIL_EXISTS,
    /**
     * Sistemska operacija za cuvanje radnika
     */
    SAVE_RADNIK,
    /**
     * Sistemska operacija za cuvanje musterije
     */
    SAVE_MUSTERIJA,
    /**
     * Sistemska operacija za cuvanje vise musterija
     */
    SAVE_MUSTERIJE,
    /**
     * Sistemska operacija za cuvanje marke
     */
    SAVE_MARKA,
    /**
     * Sistemska operacija za cuvanje automobila
     */
    SAVE_AUTOMOBIL,
    /**
     * Sistemska operacija za cuvanje vise automobila
     */
    SAVE_AUTOMOBILI,
    /**
     * Sistemska operacija za cuvanje rezervacije
     */
    SAVE_REZERVACIJA,
    /**
     * Sistemska operacija za cuvanje vise rezervacija
     */
    SAVE_REZERVACIJE,
    /**
     * Sistemska operacija za vracanje radnika
     */
    GET_RADNIK,
    /**
     * Sistemska operacija za vracanje id-a modela
     */
    GET_MODELID,
    /**
     * Sistemska operacija za vracanje marke
     */
    GET_MARKA,
    /**
     * Sistemska operacija za vracanje naziva modela
     */
    GET_NAZIVMODELA,
    /**
     * Sistemska operacija za vracanje naziva marke
     */
    GET_NAZIVMARKE,
    /**
     * Sistemska operacija za vracanje svih marki
     */
    GET_MARKE,
    /**
     * Sistemska operacija za vracanje svih modela
     */
    GET_MODELI,
    /**
     * Sistemska operacija za vracanje modela
     */
    GET_MODELIFNM,
    /**
     * Sistemska operacija za vracanje modela 2
     */
    GET_MODELI2,
    /**
     * Sistemska operacija za vracanje musterija uz filter
     */
    GET_MUSTERIJEFILTER,
    /**
     * Sistemska operacija za vracanje svih musterija
     */
    GET_MUSTERIJE,
    /**
     * Sistemska operacija za vracanje radnika uz filter
     */
    GET_RADNICIFILTER,
    /**
     * Sistemska operacija za vracanje svih radnika
     */
    GET_RADNICI,
    /**
     * Sistemska operacija za vracanje svih automobila uz filter
     */
    GET_AUTOMOBILIFILTER,
    /**
     * Sistemska operacija za vracanje automobila
     */
    GET_AUTOMOBILI,
    /**
     * Sistemska operacija za vracanje rezervacija uz filter
     */
    GET_REZERVACIJEFILTER,
    /**
     * Sistemska operacija za vracanje svih rezervacija
     */
    GET_REZERVACIJE,
    /**
     * Sistemska operacija za brisanje musterije
     */
    DELETE_MUSTERIJA,
    /**
     * Sistemska operacija za brisanje automobila
     */
    DELETE_AUTOMOBIL,
    /**
     * Sistemska operacija za brisanje rezervacije
     */
    DELETE_REZERVACIJA,
    /**
     * Sistemska operacija za izmenu musterije
     */
    UPDATE_MUSTERIJA,
    /**
     * Sistemska operacija za izmenu poslednjeg servisa automobila
     */
    UPDATE_AUTOMOBIL_POSLEDNJISERVIS,
    /**
     * Sistemska operacija za izmenu rezervacije
     */
    UPDATE_REZERVACIJA,
    /**
     * Sistemska operacija za gasenje klijentske aplikacije
     */
    QUIT,
    /**
     * Sistemska operacija za cuvanje motora
     */
    SAVE_MOTOR,
    /**
     * Sistemska operacija za vracanje motora
     */
    GET_MOTOR,
    /**
     * Sistemska operacija za cuvanje servisa
     */
    SAVE_SERVIS,
    /**
     * Sistemska operacija za vracanje servisa
     */
    GET_SERVIS
}
