/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.amr.common.domain;

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
public class RadnikTest {

    Radnik r;

    public RadnikTest() {
        r = new Radnik();
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        r = new Radnik();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSetRadnikIdManjiOd0() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> r.setRadnikId(-1));
        assertEquals("Unet id manji od 0", e.getMessage());
    }

    @Test
    public void testSetRadnikIdOk() {
        r.setRadnikId(165);
        assertEquals(165, r.getRadnikId());
    }

    @Test
    public void testSetImeRadnikaNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> r.setImeRadnika(null));
        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetImeRadnikaPrazanString() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> r.setImeRadnika(""));

        assertEquals("Prazan string", e.getMessage());
    }

    @Test
    public void testSetImeRadnikaSveOk() {
        r.setImeRadnika("Nikola");
        assertEquals("Nikola", r.getImeRadnika());
    }

    @Test
    public void testSetPrezimeRadnikaNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> r.setPrezimeRadnika(null));
        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetPrezimeRadnikaPrazanString() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> r.setPrezimeRadnika(""));

        assertEquals("Prazan string", e.getMessage());
    }

    @Test
    public void testSetPrezimeRadnikaSveOk() {
        r.setPrezimeRadnika("Nikolic");
        assertEquals("Nikolic", r.getPrezimeRadnika());
    }

    @Test
    public void testSetStrucnaSpremaRadnikaNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> r.setStrucnaSprema(null));
        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetStrucnaSpremaRadnikaSveOk() {
        r.setStrucnaSprema(StrucnaSprema.DOKTOR_NAUKA);
        assertTrue(StrucnaSprema.DOKTOR_NAUKA.equals(r.getStrucnaSprema()));
    }

    @Test
    public void testSetKorisnickoImeRadnikaNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> r.setKorisnickoIme(null));
        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetKorisnickoImeRadnikaPrazanString() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> r.setKorisnickoIme(""));

        assertEquals("Prazan string", e.getMessage());
    }

    @Test
    public void testSetKorisnickoImeRadnikaSveOk() {
        r.setKorisnickoIme("nikolaa");
        assertEquals("nikolaa", r.getKorisnickoIme());
    }

    @Test
    public void testSetSifraRadnikaNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> r.setSifra(null));
        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetSifraRadnikaPrazanString() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> r.setSifra(""));

        assertEquals("Prazan string", e.getMessage());
    }

    @Test
    public void testSetSifraRadnikaSveOk() {
        r.setSifra("nikola123");
        assertEquals("nikola123", r.getSifra());
    }

    @ParameterizedTest
    @CsvSource({
        "Milan, Milanovic, milan@gmail.com, 0645321234, Milan, Milanovic, milan@gmail.com, 0645321234, true",
        "Milos, Milanovic, milan@gmail.com, 0645321234, Milan, Milanovic, milan@gmail.com, 0645321234, false",
        "Milan, Milanic, milan@gmail.com, 0645321234, Milan, Milanovic, milan@gmail.com, 0645321234, false",
        "Milan, Milanovic, milan123@gmail.com, 0645321234, Milan, Milanovic, milan@gmail.com, 0645321234, false",
        "Milan, Milanovic, milan@gmail.com, 065121234, Milan, Milanovic, milan@gmail.com, 0645321234, false",
        "Milan, Milanovic, milan@gmail.com, 0645321234, Milan2, Milanovic, milan@gmail.com, 0645321234, false",
        "Milan, Milanovic, milan@gmail.com, 0645321234, Milan, Milanovi6c, milan@gmail.com, 0645321234, false",
        "Milan, Milanovic, milan@gmail.com, 0645321234, Milan, Milanovi6c, milan3@gmail.com, 0645921234, false"
    })
    void testEquals(String imeMusterije1, String prezimeMusterije1, String korisnickoIme1, String sifra1,
            String imeMusterije2, String prezimeMusterije2, String korisnickoIme2, String sifra2, boolean isti) {
        r.setImeRadnika(imeMusterije1);
        r.setPrezimeRadnika(prezimeMusterije1);
        r.setKorisnickoIme(korisnickoIme1);
        r.setSifra(sifra1);
        r.setStrucnaSprema(StrucnaSprema.SREDNJA_SKOLA);

        Radnik r2 = new Radnik();
        r2.setImeRadnika(imeMusterije2);
        r2.setPrezimeRadnika(prezimeMusterije2);
        r2.setKorisnickoIme(korisnickoIme2);
        r2.setSifra(sifra2);
        r2.setStrucnaSprema(StrucnaSprema.SREDNJA_SKOLA);

        assertEquals(isti, r.equals(r2));
    }

    @Test
    void testEqualsNull() {
        assertFalse(r.equals(null));
    }
}
