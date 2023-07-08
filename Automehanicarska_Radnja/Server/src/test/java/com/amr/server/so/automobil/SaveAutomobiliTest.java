/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.amr.server.so.automobil;

import com.amr.common.domain.Automobil;
import com.amr.common.domain.Boja;
import com.amr.common.domain.Model;
import com.amr.common.domain.Motor;
import com.amr.common.domain.TipMenjaca;
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
public class SaveAutomobiliTest {

    SaveAutomobili so;

    public SaveAutomobiliTest() {
        so = new SaveAutomobili();
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        so = new SaveAutomobili();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testPreconditionsPogresnaKlasa() {
        Exception e = assertThrows(Exception.class,
                () -> so.preconditions(null));
        assertEquals("Null vrednost.", e.getMessage());
    }

}
