/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.amr.common.domain;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
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
public class MarkaTest {

    Marka m;

    public MarkaTest() {
        m = new Marka();
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        m = new Marka();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSetMarkaIdManjeOd0() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> m.setMarkaId(-3));
        assertEquals("Id ne moze biti manji od 0", e.getMessage());
    }

    @Test
    public void testSetMarkaIdOk() {
        m.setMarkaId(2);
        assertEquals(2, m.getMarkaId());
    }

    @Test
    public void testSetNazivMarkeNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> m.setNazivMarke(null));
        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetNazivMarkePrazan() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> m.setNazivMarke(""));
        assertEquals("Prazan string", e.getMessage());
    }

    @Test
    public void testSetNazivMarkeOk() {
        m.setNazivMarke("Fiat");
        assertTrue("Fiat".equals(m.getNazivMarke()));
    }

    @Test
    public void testSetModeliNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> m.setModeli(null));
        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetModeliOk() {
        List<Model> modeli = new ArrayList<>();
        m.setModeli(modeli);
        assertTrue(modeli.equals(m.getModeli()));
    }
}
