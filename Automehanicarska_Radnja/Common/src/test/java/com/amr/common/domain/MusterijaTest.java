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
public class MusterijaTest {

    Musterija m;

    public MusterijaTest() {
        m = new Musterija();
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        m = new Musterija();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSetMusterijaIdManjiOd0() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> m.setMusterijaId(-1));
        assertEquals("Unet id manji od 0", e.getMessage());
    }

    @Test
    public void testSetMusterijaIdOk() {
        m.setMusterijaId(165);
        assertEquals(165, m.getMusterijaId());
    }

    @Test
    public void testSetImeMusterijeNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> m.setImeMusterije(null));
        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetImeMusterijePrazanString() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> m.setImeMusterije(""));

        assertEquals("Prazan string", e.getMessage());
    }

    @Test
    public void testSetImeMusterijeSveOk() {
        m.setImeMusterije("Nikola");
        assertEquals("Nikola", m.getImeMusterije());
    }

    @Test
    public void testSetPrezimeMusterijeNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> m.setPrezimeMusterije(null));
        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetPrezimeMusterijePrazanString() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> m.setPrezimeMusterije(""));

        assertEquals("Prazan string", e.getMessage());
    }

    @Test
    public void testSetPrezimeMusterijeSveOk() {
        m.setPrezimeMusterije("Nikolic");
        assertTrue("Nikolic".equals(m.getPrezimeMusterije()));
    }

    @Test
    public void testSetMailMusterijeNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> m.setMailMusterije(null));
        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetMailMusterijePrazanString() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> m.setMailMusterije(""));

        assertEquals("Prazan string", e.getMessage());
    }

    @Test
    public void testSetMailMusterijeSveOk() {
        m.setMailMusterije("nikolic@gmail.com");
        assertTrue("nikolic@gmail.com".equals(m.getMailMusterije()));
    }

    @Test
    public void testSetTelefonMusterijeNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> m.setTelefonMusterije(null));
        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetTelefonMusterijePrazanString() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> m.setTelefonMusterije(""));

        assertEquals("Prazan string", e.getMessage());
    }

    @Test
    public void testSetTelefonMusterijeSveOk() {
        m.setTelefonMusterije("0653216812");
        assertTrue("0653216812".equals(m.getTelefonMusterije()));
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
    void testEquals(String imeMusterije1, String prezimeMusterije1, String mailMusterije1, String telefonMusterije1,
            String imeMusterije2, String prezimeMusterije2, String mailMusterije2, String telefonMusterije2, boolean isti) {
        m.setImeMusterije(imeMusterije1);
        m.setPrezimeMusterije(prezimeMusterije1);
        m.setMailMusterije(mailMusterije1);
        m.setTelefonMusterije(telefonMusterije1);

        Musterija m2 = new Musterija();
        m2.setImeMusterije(imeMusterije2);
        m2.setPrezimeMusterije(prezimeMusterije2);
        m2.setMailMusterije(mailMusterije2);
        m2.setTelefonMusterije(telefonMusterije2);

        assertEquals(isti, m.equals(m2));
    }

    @Test
    void testEqualsNull() {
        assertFalse(m.equals(null));
    }
}
