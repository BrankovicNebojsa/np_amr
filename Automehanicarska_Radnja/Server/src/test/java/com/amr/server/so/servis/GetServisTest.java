/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.amr.server.so.servis;

import com.amr.common.domain.Automobil;
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
public class GetServisTest {

    GetServis so;

    public GetServisTest() {
        so = new GetServis();
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        so = new GetServis();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testPreconditionsPogresnaKlasa() {
        Automobil auto = new Automobil();
        Exception e = assertThrows(Exception.class,
                () -> so.preconditions(auto));
        assertEquals("Objekat nije instanca klase Servis!", e.getMessage());
    }

}
