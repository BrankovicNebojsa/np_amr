/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.amr.common.domain;

import java.sql.ResultSet;
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
public class MotorTest {

    public Motor m;

    public MotorTest() {
        m = new Motor();
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        m = new Motor();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSetMotorIdManjiOd0() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> m.setMotorId(-1));
        assertEquals("Unet id manji od 0", e.getMessage());
    }

    @Test
    public void testSetMotorIdOk() {
        m.setMotorId(1);
        assertEquals(1, m.getMotorId());
    }

    @Test
    public void testSetBrojCilindaraManjiOd0() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> m.setBrojCilindara(-1));
        assertEquals("Unet broj cilindara manji od 0", e.getMessage());
    }

    @Test
    public void testSetBrojCilindaraOk() {
        m.setBrojCilindara(1);
        assertEquals(1, m.getBrojCilindara());
    }

    @Test
    public void testSetKubikazaManjaOd0() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> m.setKubikaza(-1.0));
        assertEquals("Uneta kubikaza manja od 0", e.getMessage());
    }

    @Test
    public void testSetKubikazaOk() {
        m.setKubikaza(1652.32);
        assertEquals(1652.32, m.getKubikaza());
    }

    @Test
    public void testSetKonjskaSnagaManjaOd0() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> m.setKonjskaSnaga(-1));
        assertEquals("Uneta konjska snaga manja od 0", e.getMessage());
    }

    @Test
    public void testSetKonjskaSnagaOk() {
        m.setKonjskaSnaga(165);
        assertEquals(165, m.getKonjskaSnaga());
    }

}
