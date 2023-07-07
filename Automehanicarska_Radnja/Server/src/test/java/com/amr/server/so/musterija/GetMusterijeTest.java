/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.amr.server.so.musterija;

import com.amr.common.domain.Servis;
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
public class GetMusterijeTest {

    GetMusterije so;

    public GetMusterijeTest() {
        so = new GetMusterije();
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        so = new GetMusterije();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testPreconditionsPogresnaKlasa() {
        Servis servis = new Servis();
        Exception e = assertThrows(Exception.class,
                () -> so.preconditions(servis));
        assertEquals("Objekat nije instanca klase Musterija!", e.getMessage());
    }

}
