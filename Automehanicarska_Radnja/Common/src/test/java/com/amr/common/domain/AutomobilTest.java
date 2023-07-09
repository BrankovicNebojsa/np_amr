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
public class AutomobilTest {

    public Automobil a = new Automobil();

    public AutomobilTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        a = new Automobil();
    }

    @AfterEach
    public void tearDown() {
        a = null;
    }

    @Test
    public void testSetRegistracioniBrojNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> a.setRegistracioniBroj(null));
        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetRegistracioniBrojPrazanString() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> a.setRegistracioniBroj(""));

        assertEquals("Prazan string.", e.getMessage());
    }

    @Test
    public void testSetPrezimeSveOk() {
        a.setRegistracioniBroj("BG1251UX");
        assertEquals("BG1251UX", a.getRegistracioniBroj());
    }

    @Test
    public void testSetGodisteManjiUnos() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> a.setGodiste(1754));
        assertTrue("Godiste auto ne moze biti manje od 1900 ili vece od 2023.".equals(e.getMessage()));
    }

    @Test
    public void testSetGodisteVeciUnos() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> a.setGodiste(2024));
        assertTrue("Godiste auto ne moze biti manje od 1900 ili vece od 2023.".equals(e.getMessage()));
    }

    @Test
    public void testSetGodisteOk() {
        a.setGodiste(2007);
        assertEquals(2007, a.getGodiste());
    }

    @Test
    public void testSetBrojMotoraNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> a.setBrojMotora(null));

        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetBrojMotoraPrazanString() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> a.setBrojMotora(""));

        assertEquals("Prazan string", e.getMessage());
    }

    @Test
    public void testSetBrojMotoraOk() {
        a.setBrojMotora("1uf13jfhu31gqf1i");
        assertEquals("1uf13jfhu31gqf1i", a.getBrojMotora());
    }

    @Test
    public void testSetBrojSasijeNull() {

        Exception e = assertThrows(NullPointerException.class,
                () -> a.setBrojSasije(null));

        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetBrojSasijePrazanString() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> a.setBrojSasije(""));

        assertEquals("Prazan string", e.getMessage());
    }

    @Test
    public void testSetBrojSasijeOk() {
        a.setBrojSasije("1uf13jfhu31gqf1i");
        assertEquals("1uf13jfhu31gqf1i", a.getBrojSasije());
    }

    @Test
    public void testSetBojaNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> a.setBoja(null));

        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetBojaOk() {
        a.setBoja(Boja.BELA);
        assertEquals(Boja.BELA, a.getBoja());
    }

    @Test
    public void testSetMenjacNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> a.setMenjac(null));

        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetMenjacOk() {
        a.setMenjac(TipMenjaca.AUTOMATSKI);
        assertEquals(TipMenjaca.AUTOMATSKI, a.getMenjac());
    }

    @Test
    public void testSetMotorNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> a.setMotor(null));

        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetMotorOk() {
        Motor m = new Motor();
        a.setMotor(m);
        assertEquals(m, a.getMotor());
    }

    @Test
    public void testSetModelNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> a.setModel(null));

        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetModelOk() {
        Model m = new Model();
        a.setModel(m);
        assertEquals(m, a.getModel());
    }

    @Test
    public void testSetMusterijaNull() {
        Exception e = assertThrows(NullPointerException.class,
                () -> a.setMusterija(null));

        assertEquals("Null vrednost", e.getMessage());
    }

    @Test
    public void testSetMusterijaOk() {
        Musterija m = new Musterija();
        a.setMusterija(m);
        assertEquals(m, a.getMusterija());
    }

    @ParameterizedTest
    @CsvSource({
        "BG1468OI, dj3109d, jf48910f, 2010, BG1468OI, dj3109d, jf48910f, 2010, true",
        "BG1468OI, j981gf, jf48910f, 2010, BG1468OI, dj3109d, jf48910f, 2010, false",
        "BG148OI, dj3109d, jf48910f, 2010, BG1468OI, dj3109d, jf48910f, 2010, false",
        "BG1468OI, dj3109d, jd92, 2010, BG1468OI, dj3109d, jf48910f, 2010, false",
        "BG1468OI, dj3109d, jd92, 2016, BG1468OI, dj3109d, jf48910f, 2010, false",})
    void testEquals(String registracioniBroj1, String brojMotora1, String brojSasije1, int godiste1,
            String registracioniBroj2, String brojMotora2, String brojSasije2, int godiste2, boolean isti) {
        a.setRegistracioniBroj(registracioniBroj1);
        a.setBrojMotora(brojMotora1);
        a.setBrojSasije(brojSasije1);
        a.setGodiste(godiste1);
        a.setBoja(Boja.BELA);
        a.setMenjac(TipMenjaca.RUCNI);
        Musterija m = new Musterija("Milos", "Milic", "milos@gmail.com", "0642125612");
        a.setMusterija(m);
        Motor motor = new Motor(8, 4000.00, 652);
        a.setMotor(motor);
        Model model = new Model(new Marka("jd3198"), "dijo2");
        a.setModel(model);

        Automobil a2 = new Automobil();
        a2.setRegistracioniBroj(registracioniBroj2);
        a2.setBrojMotora(brojMotora2);
        a2.setBrojSasije(brojSasije2);
        a2.setGodiste(godiste2);
        a2.setBoja(Boja.BELA);
        a2.setMenjac(TipMenjaca.RUCNI);
        a2.setMusterija(m);
        a2.setMotor(motor);
        a2.setModel(model);

        assertEquals(isti, a.equals(a2));
    }

    @Test
    void testEqualsNull() {
        assertFalse(a.equals(null));
    }
}
