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
public class ServisTest {

    Servis s;

    public ServisTest() {
        s = new Servis();
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        s = new Servis();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSetDatumServisaNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> s.setDatumServisa(null));
        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetDatumServisaOk() {
        Date d = new Date();
        s.setDatumServisa(d);
        assertEquals(d, s.getDatumServisa());
    }

    @Test
    public void testSetKilometrazaManjaOd0() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> s.setKilometraza(-1));
        assertEquals("Kilometraza ne moze biti manja od 0", e.getMessage());
    }

    @Test
    public void testSetKilometrazaOk() {
        s.setKilometraza(31000);
        assertEquals(31000, s.getKilometraza());
    }

    @Test
    public void testSetOpisNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> s.setOpis(null));
        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetIOpisPrazanString() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> s.setOpis(""));

        assertEquals("Prazan string", e.getMessage());
    }

    @Test
    public void testSetOpisSveOk() {
        s.setOpis("Promenjeno ulje, filter za vazduh i vodu.");
        assertEquals("Promenjeno ulje, filter za vazduh i vodu.", s.getOpis());
    }

    @Test
    public void testSetAutomobilNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> s.setAutomobil(null));
        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetAutomobilSveOk() {
        Automobil a = new Automobil("BG1321OS", 2007, "dn3198pfhqnd", "deu91qfhg827", Boja.BELA, TipMenjaca.RUCNI, new Motor(), new Model(), new Musterija());
        s.setAutomobil(a);
        assertTrue(a.getRegistracioniBroj().equals(s.getAutomobil().getRegistracioniBroj()));
        assertTrue(a.getGodiste() == s.getAutomobil().getGodiste());
        assertTrue(a.getBrojMotora().equals(s.getAutomobil().getBrojMotora()));
        assertTrue(a.getBrojSasije().equals(s.getAutomobil().getBrojSasije()));
        assertTrue(a.getBoja().equals(s.getAutomobil().getBoja()));
        assertTrue(a.getMenjac().equals(s.getAutomobil().getMenjac()));
    }

    @Test
    public void testSetRadnikNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> s.setRadnik(null));
        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetRadnikSveOk() {
        Radnik r = new Radnik("Milos", "Milic", StrucnaSprema.SREDNJA_SKOLA, "mile", "mile");
        s.setRadnik(r);
        assertTrue(r.getImeRadnika().equals(s.getRadnik().getImeRadnika()));
        assertTrue(r.getPrezimeRadnika().equals(s.getRadnik().getPrezimeRadnika()));
        assertTrue(r.getKorisnickoIme().equals(s.getRadnik().getKorisnickoIme()));
        assertTrue(r.getSifra().equals(s.getRadnik().getSifra()));
    }

    @ParameterizedTest
    @CsvSource({
        "130000, mali servis, 130000, mali servis, true",
        "115000, mali servis, 130000, mali servis, false",
        "130000, mali servis, 115003, mali servis, false",
        "130000, mali servis, 130000, veliki servis, false"
    })
    public void testEquals(int kilometraza1, String opis1, int kilometraza2, String opis2, boolean isti) {

        Automobil a = new Automobil("BE3215KS");
        Radnik radnik = new Radnik("Milan", "Milanic", StrucnaSprema.SREDNJA_SKOLA, "milance", "milance123");
        s.setKilometraza(kilometraza1);
        s.setOpis(opis1);
        s.setAutomobil(a);
        s.setRadnik(radnik);
        Date d = new Date();
        s.setDatumServisa(d);

        Servis s2 = new Servis();
        s2.setKilometraza(kilometraza2);
        s2.setOpis(opis2);
        s2.setAutomobil(a);
        s2.setRadnik(radnik);
        s2.setDatumServisa(d);

        assertEquals(isti, s.equals(s2));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(s.equals(null));
    }
}
