/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.amr.common.domain;

import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author Nebojsa Brankovic
 */
public class RezervacijaTest {

    Rezervacija r;

    public RezervacijaTest() {
        r = new Rezervacija();
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        r = new Rezervacija();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSetRezervacijaIdManjiOd0() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> r.setRezervacijaId(-1));
        assertEquals("Unet id manji od 0", e.getMessage());
    }

    @Test
    public void testSetRezervacijaIdOk() {
        r.setRezervacijaId(165);
        assertEquals(165, r.getRezervacijaId());
    }

    @Test
    public void testSetPocetakServisaNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> r.setPocetakServisa(null));
        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetPocetakServisaSveOk() {
        Date d = new Date();
        r.setPocetakServisa(d);
        assertEquals(d, r.getPocetakServisa());
    }

    @Test
    public void testSetTrajanjeServisaManjeOd0() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> r.setTrajanjeServisa(-1));
        assertEquals("Trajanje servisa ne moze biti manje od 0", e.getMessage());
    }

    @Test
    public void testSetTrajanjeServisaSveOk() {
        r.setTrajanjeServisa(32);
        assertEquals(32, r.getTrajanjeServisa());
    }

    @Test
    public void testSetAutomobilNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> r.setAutomobil(null));
        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetAutomobilSveOk() {
        Automobil a = new Automobil();
        r.setAutomobil(a);
        assertEquals(a, r.getAutomobil());
    }

    @Test
    public void testSetRadnikNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> r.setRadnik(null));
        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetRadnikSveOk() {
        Radnik r2 = new Radnik("Milos", "Milic", StrucnaSprema.SREDNJA_SKOLA, "mile", "mile");
        r.setRadnik(r2);
        assertTrue(r2.getImeRadnika().equals(r.getRadnik().getImeRadnika()));
        assertTrue(r2.getPrezimeRadnika().equals(r.getRadnik().getPrezimeRadnika()));
        assertTrue(r2.getKorisnickoIme().equals(r.getRadnik().getKorisnickoIme()));
        assertTrue(r2.getSifra().equals(r.getRadnik().getSifra()));
        assertTrue(r2.getStrucnaSprema().equals(r.getRadnik().getStrucnaSprema()));
    }

    @ParameterizedTest
    @CsvSource({
        "60, 60, true",
        "60, 32, false",
        "30, 60, false",})
    public void testEquals(int trajanjeServisa1, int trajanjeServisa2, boolean isti) {

        Automobil a = new Automobil("BE3215KS");
        Radnik radnik = new Radnik("Milan", "Milanic", StrucnaSprema.SREDNJA_SKOLA, "milance", "milance123");
        r.setTrajanjeServisa(trajanjeServisa1);
        r.setAutomobil(a);
        r.setRadnik(radnik);

        Rezervacija r2 = new Rezervacija();
        r2.setTrajanjeServisa(trajanjeServisa2);
        r2.setAutomobil(a);
        r2.setRadnik(radnik);
        assertEquals(isti, r.equals(r2));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(r.equals(null));
    }
}
