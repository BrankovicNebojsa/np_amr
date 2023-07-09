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
public class ModelTest {

    public Model m;

    public ModelTest() {
        m = new Model();
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        m = new Model();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSetModelIdManjiOd0() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> m.setModelId(-3));
        assertEquals("Id ne moze biti manji od 0", e.getMessage());
    }

    @Test
    public void testSetMarkaIdOk() {
        m.setModelId(1);
        assertEquals(1, m.getModelId());
    }

    @Test
    public void testSetNazivModelaNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> m.setNazivModela(null));
        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetNazivModelaPrazan() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> m.setNazivModela(""));
        assertEquals("Prazan string", e.getMessage());
    }

    @Test
    public void testSetNazivModelaOk() {
        m.setNazivModela("Punto");
        assertTrue("Punto".equals(m.getNazivModela()));
    }

    @Test
    public void testSetMarkaNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> m.setMarka(null));
        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetMarkaOk() {
        Marka m2 = new Marka();
        m.setMarka(m2);
        assertTrue(m2.equals(m.getMarka()));
    }

    @ParameterizedTest
    @CsvSource({
        "A4, A4, true",
        "A4, A3, false",
        "A2, A4, false"
    })
    void testEquals(String nazivModela1, String nazivModela2, boolean isti) {
        m.setNazivModela(nazivModela1);
        Marka marka = new Marka();
        m.setMarka(marka);

        Model m2 = new Model();
        m2.setNazivModela(nazivModela2);
        m2.setMarka(marka);

        assertEquals(isti, m.equals(m2));
    }

    @Test
    void testEqualsNull() {
        assertFalse(m.equals(null));
    }
}
