/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.amr.server.controller;

import com.amr.common.domain.Automobil;
import com.amr.common.domain.Boja;
import com.amr.common.domain.Marka;
import com.amr.common.domain.Model;
import com.amr.common.domain.Motor;
import com.amr.common.domain.Musterija;
import com.amr.common.domain.Radnik;
import com.amr.common.domain.Rezervacija;
import com.amr.common.domain.Servis;
import com.amr.common.domain.StrucnaSprema;
import com.amr.common.domain.TipMenjaca;
import com.amr.server.so.automobil.AutomobilExists;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
public class ControllerTest {

    Controller c;

    public ControllerTest() {
        c = new Controller();
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        c = new Controller();
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getRadnikFromRadnikId method, of class Controller.
     */
    @Test
    public void testGetRadnikFromRadnikIdOK() throws Exception {
        Radnik radnik = new Radnik();
        radnik.setImeRadnika("Zoran");
        radnik.setPrezimeRadnika("Milanovic");
        radnik.setStrucnaSprema(StrucnaSprema.SREDNJA_SKOLA);
        radnik.setKorisnickoIme("zoran");
        radnik.setSifra("zoran123");
        c.saveRadnik(radnik);
        List<Radnik> radnici = c.getRadnici();
        for (Radnik r : radnici) {
            if (r.getImeRadnika().equals(radnik.getImeRadnika()) && r.getPrezimeRadnika().equals(radnik.getPrezimeRadnika())
                    && r.getStrucnaSprema().equals(radnik.getStrucnaSprema()) && r.getKorisnickoIme().equals(radnik.getKorisnickoIme())
                    && r.getSifra().equals(radnik.getSifra())) {
                radnik.setRadnikId(r.getRadnikId());
            }
        }
        Radnik radnikIzBaze = c.getRadnikFromRadnikId(radnik.getRadnikId());
        assertTrue(radnik.equals(radnikIzBaze));
    }

    /**
     * Test of getRadnikFromRadnikId method, of class Controller.
     */
    @Test
    public void testGetRadnikFromRadnikIdNePostojiUBazi() throws Exception {
        Radnik radnikIzBaze = c.getRadnikFromRadnikId(2000000);
        assertTrue(radnikIzBaze == null);
    }

    /**
     * Test of getMusterija method, of class Controller.
     */
    @Test
    public void testGetMusterijaOK() throws Exception {
        Musterija musterija = new Musterija();
        musterija.setImeMusterije("Zoran");
        musterija.setPrezimeMusterije("Milanovic");
        musterija.setMailMusterije("zoran@gmail.com");
        musterija.setTelefonMusterije("0636128312");
        try {
            c.saveMusterija(musterija);
        } catch (Exception e) {
            System.out.println("Vec postoji");
        }
        List<Musterija> musterije = c.getMusterije();
        for (Musterija m : musterije) {
            if (m.getImeMusterije().equals(musterija.getImeMusterije()) && m.getPrezimeMusterije().equals(musterija.getPrezimeMusterije())
                    && m.getMailMusterije().equals(musterija.getMailMusterije()) && m.getTelefonMusterije().equals(musterija.getTelefonMusterije())) {
                musterija.setMusterijaId(m.getMusterijaId());
            }
        }
        Musterija musterijaIzBaze = c.getMusterija(musterija.getMusterijaId());
        assertTrue(musterija.equals(musterijaIzBaze));
    }

    /**
     * Test of getMusterija method, of class Controller.
     */
    @Test
    public void testGetMusterijaNePostoji() throws Exception {
        Musterija musterijaIzBaze = c.getMusterija(200);
        assertTrue(musterijaIzBaze == null);
    }

    /**
     * Test of getAutomobil method, of class Controller.
     */
    @Test
    public void testGetAutomobilOK() throws Exception {
        Automobil automobil = new Automobil();
        automobil.setRegistracioniBroj("NI3215NX");
        automobil.setBrojMotora("dfc9i8f2phf1p");
        automobil.setBrojSasije("fnui1ohf13");
        automobil.setBoja(Boja.CRVENA);
        automobil.setGodiste(2012);
        automobil.setModel(c.getModel("Punto"));
        Motor m = new Motor(3, 1422, 69);
        for (Motor motor : c.getMotori()) {
            if (motor.equals(m)) {
                m.setMotorId(motor.getMotorId());
            }
        }
        automobil.setMotor(c.getMotor(m));
        automobil.setMusterija(c.getMusterija(18));
        automobil.setMenjac(TipMenjaca.RUCNI);
        try {
            c.saveAutomobil(automobil);
        } catch (Exception e) {
            System.out.println("Vec postoji");
        }
        List<Automobil> automobili = c.getAutomobili();

        Automobil automobilIzBaze = c.getAutomobil(automobil.getRegistracioniBroj());
        assertTrue(automobil.equals(automobilIzBaze));
    }

    /**
     * Test of getAutomobil method, of class Controller.
     */
    @Test
    public void testGetAutomobilNePostoji() throws Exception {
        Automobil automobilIzBaze = c.getAutomobil("QWWQW");
        assertTrue(automobilIzBaze == null);
    }

    /**
     * Test of login method, of class Controller.
     */
    @Test
    public void testLogInOK() throws Exception {
        assertTrue(c.login("admin", "admin"));
    }

    /**
     * Test of login method, of class Controller.
     */
    @Test
    public void testLogInPogresanUnos() throws Exception {
        assertFalse(c.login("dj891hof3q", "d138f9h189f"));
    }

    /**
     * Test of usernameExists method, of class Controller.
     */
    @Test
    public void testUsernameExistsOK() throws Exception {
        if (c.usernameExists("jid28f910j1d30-")) {
            List<Radnik> radnici = c.getRadnici();
            for (Radnik r : radnici) {
                if (r.getKorisnickoIme().equals("jid28f910j1d30-")) {
                    c.deleteRadnik(r);
                }
            }
        }
        Radnik radnik = new Radnik();
        radnik.setImeRadnika("Danilo");
        radnik.setPrezimeRadnika("Danilovic");
        radnik.setStrucnaSprema(StrucnaSprema.MAGISTAR_NAUKA);
        radnik.setKorisnickoIme("jid28f910j1d30-");
        radnik.setSifra("jifo8193fhd321");

        assertFalse(c.usernameExists(radnik.getKorisnickoIme()));
    }

    /**
     * Test of usernameExists method, of class Controller.
     */
    @Test
    public void testUsernameExistsPostoji() throws Exception {
        Radnik radnik = new Radnik();
        radnik.setImeRadnika("Danilo");
        radnik.setPrezimeRadnika("Danilovic");
        radnik.setStrucnaSprema(StrucnaSprema.MAGISTAR_NAUKA);
        radnik.setKorisnickoIme("jid28f910j1d30-");
        radnik.setSifra("jifo8193fhd321");
        try {
            c.saveRadnik(radnik);
        } catch (Exception e) {
            System.out.println("Greska: " + e.getMessage());
        }
        assertTrue(c.usernameExists(radnik.getKorisnickoIme()));
    }

    /**
     * Test of automobilExists method, of class Controller.
     */
    @Test
    public void testAutomobilExistsOK() throws Exception {
        if (c.automobilExists("NI3215NX")) {
            c.deleteAutomobil(new Automobil("NI3215NX"));
        }
        Automobil automobil = new Automobil();
        automobil.setRegistracioniBroj("NI3215NX");

        assertFalse(c.automobilExists(automobil.getRegistracioniBroj()));
    }

    /**
     * Test of automobilExists method, of class Controller.
     */
    @Test
    public void testAutomobilExistsPostoji() throws Exception {
        Automobil automobil = new Automobil();
        automobil.setRegistracioniBroj("NI3215NX");
        automobil.setBrojMotora("dfc9i8f2phf1p");
        automobil.setBrojSasije("fnui1ohf13");
        automobil.setBoja(Boja.CRVENA);
        automobil.setGodiste(2012);
        automobil.setModel(c.getModel("Punto"));
        automobil.setMotor(c.getMotor(new Motor(1, 3, 1422, 69)));
        automobil.setMusterija(c.getMusterija(18));
        automobil.setMenjac(TipMenjaca.RUCNI);
        try {
            c.saveAutomobil(automobil);
        } catch (Exception e) {
            System.out.println("Greska: " + e.getMessage());
        }
        assertTrue(c.automobilExists(automobil.getRegistracioniBroj()));
    }

    /**
     * Test of saveRadnik method, of class Controller.
     */
    @Test
    public void testSaveRadnikOK() throws Exception {
        Radnik radnik = new Radnik();
        radnik.setImeRadnika("Danilo");
        radnik.setPrezimeRadnika("Danilovic");
        radnik.setStrucnaSprema(StrucnaSprema.MAGISTAR_NAUKA);
        radnik.setKorisnickoIme("jid28f910j1d30-");
        radnik.setSifra("jifo8193fhd321");
        try {
            c.saveRadnik(radnik);
        } catch (Exception e) {
            System.out.println("Greska: " + e.getMessage());
        }
        List<Radnik> radnici = c.getRadnici();
        boolean isInDatabase = false;
        for (Radnik r : radnici) {
            if (r.equals(radnik)) {
                isInDatabase = true;
                break;
            }
        }
        assertTrue(isInDatabase);
    }

    /**
     * Test of saveMusterija method, of class Controller.
     */
    @Test
    public void testSaveMusterija() throws Exception {
        Musterija musterija = new Musterija();
        musterija.setImeMusterije("Danilo");
        musterija.setPrezimeMusterije("Danilovic");
        musterija.setMailMusterije("danilo@gmail.com");
        musterija.setTelefonMusterije("0643215212");
        try {
            c.saveMusterija(musterija);
        } catch (Exception e) {
            System.out.println("Greska: " + e.getMessage());
        }
        List<Musterija> musterije = c.getMusterije();
        boolean isInDatabase = false;
        for (Musterija m : musterije) {
            if (m.equals(musterija)) {
                isInDatabase = true;
                break;
            }
        }
        assertTrue(isInDatabase);
    }

    /**
     * Test of saveMusterije method, of class Controller.
     */
    @Test
    public void testSaveMusterije() throws Exception {
        List<Musterija> musterije = new ArrayList<>();
        Musterija musterija = new Musterija();
        musterija.setImeMusterije("Danilo");
        musterija.setPrezimeMusterije("Danilovic");
        musterija.setMailMusterije("danilo@gmail.com");
        musterija.setTelefonMusterije("0643215212");
        musterije.add(musterija);
        Musterija musterija2 = new Musterija();
        musterija2.setImeMusterije("Danilo2");
        musterija2.setPrezimeMusterije("Danilovic2");
        musterija2.setMailMusterije("danilo2@gmail.com");
        musterija2.setTelefonMusterije("0653215212");
        musterije.add(musterija2);
        try {
            c.saveMusterije(musterije);
        } catch (Exception e) {
            System.out.println("Greska: " + e.getMessage());
        }
        List<Musterija> musterijeIzBaze = c.getMusterije();
        int counter = 0;
        for (Musterija m : musterije) {
            if (m.equals(musterija) || m.equals(musterija2)) {
                counter++;
            }
        }
        assertEquals(counter, musterije.size());
    }

    /**
     * Test of saveAutomobil method, of class Controller.
     */
    @Test
    public void testSaveAutomobil() throws Exception {
        Automobil automobil = new Automobil();
        automobil.setRegistracioniBroj("NI3215NX");
        automobil.setBrojMotora("dfc9i8f2phf1p");
        automobil.setBrojSasije("fnui1ohf13");
        automobil.setBoja(Boja.CRVENA);
        automobil.setGodiste(2012);
        automobil.setModel(c.getModel("Punto"));
        automobil.setMotor(c.getMotor(new Motor(1, 3, 1422, 69)));
        automobil.setMusterija(c.getMusterija(18));
        automobil.setMenjac(TipMenjaca.RUCNI);
        if (c.automobilExists(automobil.getRegistracioniBroj())) {
            c.deleteAutomobil(automobil);
        }
        try {
            c.saveAutomobil(automobil);
        } catch (Exception e) {
            System.out.println("Greska: " + e.getMessage());
        }
        List<Automobil> automobili = c.getAutomobili();
        boolean isInDatabase = false;
        for (Automobil a : automobili) {
            if (a.equals(automobil)) {
                isInDatabase = true;
                break;
            }
        }
        assertTrue(isInDatabase);
    }

    /**
     * Test of saveAutomobili method, of class Controller.
     */
    @Test
    public void testSaveAutomobili() throws Exception {
        List<Automobil> automobili = new ArrayList<>();
        Automobil automobil = new Automobil();
        automobil.setRegistracioniBroj("NI3215NX");
        automobil.setBrojMotora("dfc9i8f2phf1p");
        automobil.setBrojSasije("fnui1ohf13");
        automobil.setBoja(Boja.CRVENA);
        automobil.setGodiste(2012);
        automobil.setModel(c.getModel("Punto"));
        automobil.setMotor(c.getMotor(new Motor(1, 3, 1422, 69)));
        automobil.setMusterija(c.getMusterija(18));
        automobil.setMenjac(TipMenjaca.RUCNI);
        if (c.automobilExists(automobil.getRegistracioniBroj())) {
            c.deleteAutomobil(automobil);
        }
        automobili.add(automobil);
        Automobil automobil2 = new Automobil();
        automobil2.setRegistracioniBroj("VS3115NX");
        automobil2.setBrojMotora("dfc9i8f2phf1p");
        automobil2.setBrojSasije("fnui1ohf13");
        automobil2.setBoja(Boja.CRVENA);
        automobil2.setGodiste(2012);
        automobil2.setModel(c.getModel("Punto"));
        automobil2.setMotor(c.getMotor(new Motor(1, 3, 1422, 69)));
        automobil2.setMusterija(c.getMusterija(18));
        automobil2.setMenjac(TipMenjaca.RUCNI);
        if (c.automobilExists(automobil2.getRegistracioniBroj())) {
            c.deleteAutomobil(automobil2);
        }
        automobili.add(automobil2);
        try {
            c.saveAutomobili(automobili);
        } catch (Exception e) {
            System.out.println("Greska: " + e.getMessage());
        }
        List<Automobil> automobiliIzBaze = c.getAutomobili();
        int counter = 0;
        for (Automobil a : automobili) {
            if (a.equals(automobil) || a.equals(automobil2)) {
                counter++;
            }
        }
        assertEquals(counter, automobili.size());
    }

    /**
     * Test of getRadnik method, of class Controller.
     */
    @Test
    public void testGetRadnik() throws Exception {
        List<Radnik> radnici = c.getRadnici();
        Radnik r = radnici.get(0);
        Radnik getR = c.getRadnik(r.getKorisnickoIme());
        assertEquals(r, getR);
    }

    /**
     * Test of getModel method, of class Controller.
     */
    @Test
    public void testGetModel() throws Exception {
        List<Model> modeli = c.getModeli();
        Model m = modeli.get(0);
        Model getM = c.getModel(m.getNazivModela());
        assertEquals(m, getM);
    }

    /**
     * Test of getMarka method, of class Controller.
     */
    @Test
    public void testGetMarka() throws Exception {
        List<Marka> marke = c.getMarke();
        Marka m = marke.get(0);
        Marka getM = c.getMarka(m.getNazivMarke());
        assertEquals(m, getM);
    }

    /**
     * Test of getNazivModela method, of class Controller.
     */
    @Test
    public void testGetNazivModela() throws Exception {
        List<Model> modeli = c.getModeli();
        Model m = modeli.get(0);
        String nazivModela = m.getNazivModela();
        String nazivModelaIzBaze = c.getNazivModela(m);
        assertEquals(nazivModela, nazivModelaIzBaze);
    }

    /**
     * Test of getNazivMarke method, of class Controller.
     */
    @Test
    public void testGetNazivMarke() throws Exception {
        List<Marka> marke = c.getMarke();
        Marka m = marke.get(0);
        String nazivMarke = m.getNazivMarke();
        String nazivMarkeIzBaze = c.getNazivMarke(m);
        assertEquals(nazivMarke, nazivMarkeIzBaze);
    }

    /**
     * Test of deleteMusterija method, of class Controller.
     */
    @Test
    public void testDeleteMusterija() throws Exception {
        Musterija musterija = new Musterija();
        musterija.setImeMusterije("Zoran32");
        musterija.setPrezimeMusterije("Milanovic32");
        musterija.setMailMusterije("zoran32@gmail.com");
        musterija.setTelefonMusterije("0636128312");
        try {
            c.saveMusterija(musterija);
        } catch (Exception e) {
            System.out.println("Greska:" + e.getMessage());
        }
        List<Musterija> musterijePre = c.getMusterije();
        for (Musterija mp : musterijePre) {
            if (mp.equals(musterija)) {
                musterija.setMusterijaId(mp.getMusterijaId());
            }
        }
        c.deleteMusterija(musterija);
        List<Musterija> musterijePosle = c.getMusterije();

        assertFalse(musterijePre.size() == musterijePosle.size());
    }

    /**
     * Test of deleteAutomobil method, of class Controller.
     */
    @Test
    public void testDeleteAutomobil() throws Exception {
        Automobil automobil = new Automobil();
        automobil.setRegistracioniBroj("BD123SX");
        automobil.setBrojMotora("dfc9i8f2ph2f1p");
        automobil.setBrojSasije("fnui1oh4f13");
        automobil.setBoja(Boja.PLAVA);
        automobil.setGodiste(2015);
        automobil.setModel(c.getModel("Punto"));
        automobil.setMotor(c.getMotor(new Motor(1, 3, 1422, 69)));
        automobil.setMusterija(c.getMusterija(18));
        automobil.setMenjac(TipMenjaca.RUCNI);
        try {
            c.saveAutomobil(automobil);
        } catch (Exception e) {
            System.out.println("Greska:" + e.getMessage());
        }
        List<Automobil> automobiliPre = c.getAutomobili();
        c.deleteAutomobil(automobil);
        List<Musterija> musterijePosle = c.getMusterije();

        assertFalse(automobiliPre.size() == musterijePosle.size());
    }

    /**
     * Test of updateMusterija method, of class Controller.
     */
    @Test
    public void testUpdateMusterija() throws Exception {
        List<Musterija> musterije = c.getMusterije();
        Musterija pre = musterije.get(0);
        String mailMusterije = pre.getMailMusterije();
        pre.setMailMusterije("promenjeni@gmail.com");
        c.updateMusterija(pre);
        String mailPosle = null;
        for (Musterija m : c.getMusterije()) {
            if (m.getMusterijaId() == pre.getMusterijaId()) {
                mailPosle = m.getMailMusterije();
            }
        }
        assertEquals("promenjeni@gmail.com", mailPosle);
        pre.setMailMusterije(mailMusterije);
        c.updateMusterija(pre);
    }

    /**
     * Test of updateAutomobil method, of class Controller.
     */
    @Test
    public void testUpdateAutomobil() throws Exception {
        List<Automobil> automobili = c.getAutomobili();
        Automobil pre = automobili.get(0);
        String brojMotora = pre.getBrojMotora();
        pre.setBrojMotora("promenjeni");
        c.updateAutomobil(pre);
        String brojMotoraPosle = null;
        for (Automobil a : c.getAutomobili()) {
            if (a.getRegistracioniBroj().equals(pre.getRegistracioniBroj())) {
                brojMotoraPosle = a.getBrojMotora();
            }
        }
        assertEquals("promenjeni", brojMotoraPosle);
        pre.setBrojMotora(brojMotora);
        c.updateAutomobil(pre);
    }

    /**
     * Test of updateRezervacija method, of class Controller.
     */
    @Test
    public void testUpdateRezervacija() throws Exception {
        List<Rezervacija> rezervacije = c.getRezervacije();
        Rezervacija pre = rezervacije.get(0);
        Date pocetakServisa = pre.getPocetakServisa();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date datum = new Date();
        String strDate = sdf.format(datum);
        Date noviDatum = sdf.parse(strDate);
        pre.setPocetakServisa(noviDatum);
        c.updateRezervacija(pre);
        Date pocetakServisaPosle = null;
        for (Rezervacija r : c.getRezervacije()) {
            if (r.getRezervacijaId() == pre.getRezervacijaId()) {
                pocetakServisaPosle = r.getPocetakServisa();
            }
        }
        assertEquals(noviDatum, pocetakServisaPosle);
        pre.setPocetakServisa(pocetakServisa);
        c.updateRezervacija(pre);
    }

    /**
     * Test of saveMotor method, of class Controller.
     */
    @Test
    public void testSaveMotor() throws Exception {
        Motor m = new Motor();
        m.setBrojCilindara(6);
        m.setKubikaza(3000.00);
        m.setKonjskaSnaga(256);
        try {
            c.saveMotor(m);
        } catch (Exception e) {
            System.out.println("Greska: " + e.getMessage());
        }
        boolean isInDatabase = false;
        for (Motor motor : c.getMotori()) {
            if (motor.equals(m)) {
                isInDatabase = true;
                m.setMotorId(motor.getMotorId());
            }
        }
        c.deleteMotor(m);
        assertTrue(isInDatabase);
    }

    /**
     * Test of saveServis method, of class Controller.
     */
    @Test
    public void testSaveServis() throws Exception {
        Servis s = new Servis();
        List<Automobil> automobili = c.getAutomobili();
        Automobil a = automobili.get(0);
        s.setAutomobil(a);
        List<Radnik> radnici = c.getRadnici();
        Radnik r = radnici.get(0);
        s.setRadnik(r);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date datum = new Date();
        String strDate = sdf.format(datum);
        Date noviDatum = sdf.parse(strDate);
        s.setDatumServisa(noviDatum);
        s.setKilometraza(30000);
        s.setOpis("Uradjen mali servis");
        try {
            c.saveServis(s);
        } catch (Exception e) {
            System.out.println("Greska: " + e.getMessage());
        }
        boolean isInDatabase = false;
        for (Servis servis : c.getServisi()) {
            if (servis.equals(s)) {
                isInDatabase = true;
                break;
            }
        }
        c.deleteServis(s);
        assertTrue(isInDatabase);
    }

}
