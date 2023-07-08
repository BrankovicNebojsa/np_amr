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

/**
 *
 * @author Nebojsa Brankovic
 */
public class KorisnikTest {

    public Korisnik k;

    public KorisnikTest() {
        k = new Korisnik();
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        k = new Korisnik();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSetRadnikNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> k.setRadnik(null));

        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetRadnikOk() {
        Radnik r = new Radnik("Milan", "Milanovic", StrucnaSprema.SREDNJA_SKOLA, "nesto", "nesto");
        k.setRadnik(r);
        assertTrue(r.getImeRadnika().equals(k.getRadnik().getImeRadnika()));
    }

    @Test
    public void testSetDatumPovezivanjaNull() {

        Exception e = assertThrows(NullPointerException.class,
                () -> k.setDatumPovezivanja(null));

        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetBrojMotoraOk() {
        Date datum = new Date();
        k.setDatumPovezivanja(datum);
        assertEquals(datum, k.getDatumPovezivanja());
    }

}
