package com.amr.server.controller;

import com.amr.common.domain.Automobil;
import com.amr.common.domain.Marka;
import com.amr.common.domain.Model;
import com.amr.common.domain.Motor;
import com.amr.common.domain.Musterija;
import com.amr.common.domain.Radnik;
import com.amr.common.domain.Rezervacija;
import com.amr.common.domain.Servis;
import com.amr.server.so.servis.*;
import com.amr.server.so.rezervacija.*;
import com.amr.server.so.radnik.*;
import com.amr.server.so.musterija.*;
import com.amr.server.so.motor.*;
import com.amr.server.so.marka.*;
import com.amr.server.so.automobil.*;
import com.amr.server.so.AbstractSystemOperation;
import com.amr.server.so.model.*;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class Controller {

    public Radnik getRadnikFromRadnikId(int radnikId) throws Exception {
        AbstractSystemOperation getRadnikFromRadnikId = new GetRadnikFromRadnikId();
        getRadnikFromRadnikId.execute(new Radnik(radnikId)); //baca exception
        return ((GetRadnikFromRadnikId) getRadnikFromRadnikId).getRadnik();
    }

    // odavde pa na dalje ici
    public Musterija getMusterija(int musterijaId) throws Exception {
        AbstractSystemOperation getMusterija = new GetMusterija();
        getMusterija.execute(new Musterija(musterijaId)); //baca exception
        return ((GetMusterija) getMusterija).getMusterija();
    }

    public Automobil getAutomobil(String registracioniBroj) throws Exception {
        AbstractSystemOperation getAutomobil = new GetAutomobil();
        getAutomobil.execute(new Automobil(registracioniBroj)); //baca exception
        return ((GetAutomobil) getAutomobil).getAutomobil();
    }

    public boolean login(String korisnickoIme, String sifra) throws Exception {
        AbstractSystemOperation login = new LogIn();
        login.execute(new Radnik(korisnickoIme, sifra)); //baca exception
        return ((LogIn) login).getStatus();
    }

    public boolean usernameExists(String korisnickoIme) throws Exception {
        AbstractSystemOperation usernameExists = new UsernameExists();
        usernameExists.execute(new Radnik(korisnickoIme)); //baca exception
        return ((UsernameExists) usernameExists).getStatus();
    }

    public boolean automobilExists(String registracioniBroj) throws Exception {
        AbstractSystemOperation automobilExists = new AutomobilExists();
        automobilExists.execute(new Automobil(registracioniBroj)); //baca exception
        return ((AutomobilExists) automobilExists).getStatus();
    }

    public void saveRadnik(Radnik radnik) throws Exception {
        AbstractSystemOperation saveRadnik = new SaveRadnik();
        saveRadnik.execute(radnik); //baca exception
    }

    public void saveMusterija(Musterija musterija) throws Exception {
        AbstractSystemOperation saveMusterija = new SaveMusterija();
        saveMusterija.execute(musterija); //baca exception
    }

    public void saveMusterije(List<Musterija> musterije) throws Exception {
        AbstractSystemOperation saveMusterije = new SaveMusterije();
        saveMusterije.execute(musterije); //baca exception
    }

    public void saveMarka(Marka marka) throws Exception {
        AbstractSystemOperation saveMarka = new SaveMarka();
        saveMarka.execute(marka); //baca exception
    }

    public void saveAutomobil(Automobil automobil) throws Exception {
        AbstractSystemOperation saveAutomobil = new SaveAutomobil();
        saveAutomobil.execute(automobil); //baca exception
    }

    public void saveAutomobili(List<Automobil> automobili) throws Exception {
        AbstractSystemOperation saveAutomobili = new SaveAutomobili();
        saveAutomobili.execute(automobili); //baca exception
    }

    public void saveRezervacija(Rezervacija rezervacija) throws Exception {
        AbstractSystemOperation saveRezervacija = new SaveRezervacija();
        saveRezervacija.execute(rezervacija); //baca exception
    }

    public void saveRezervacije(List<Rezervacija> rezervacije) throws Exception {
        AbstractSystemOperation saveRezervacije = new SaveRezervacije();
        saveRezervacije.execute(rezervacije); //baca exception
    }

    public Radnik getRadnik(String korisnickoIme) throws Exception {
        AbstractSystemOperation getRadnik = new GetRadnik();
        getRadnik.execute(new Radnik(korisnickoIme)); //baca exception
        return ((GetRadnik) getRadnik).getRadnik();
    }

    public Model getModel(String nazivModela) throws Exception {
        AbstractSystemOperation getModel = new GetModel();
        getModel.execute(new Model(null, nazivModela)); //baca exception
        return ((GetModel) getModel).getModel();
    }

    public Marka getMarka(String nazivMarke) throws Exception {
        AbstractSystemOperation getMarka = new GetMarka();
        getMarka.execute(new Marka(nazivMarke)); //baca exception
        return ((GetMarka) getMarka).getMarka();
    }

    public String getNazivModela(Model model) throws Exception {
        AbstractSystemOperation getNazivModela = new GetNazivModela();
        getNazivModela.execute(model); //baca exception
        return ((GetNazivModela) getNazivModela).getNazivModela();
    }

    public String getNazivMarke(Marka marka) throws Exception {
        AbstractSystemOperation getNazivMarke = new GetNazivMarke();
        getNazivMarke.execute(marka); //baca exception
        return ((GetNazivMarke) getNazivMarke).getNazivMarke();
    }

    public List<Marka> getMarke() throws Exception {
        AbstractSystemOperation getMarke = new GetMarke();
        getMarke.execute(new Marka()); //baca exception
        return ((GetMarke) getMarke).getMarke();
    }

    public List<Model> getModeli() throws Exception {
        AbstractSystemOperation getModeli = new GetModeli();
        getModeli.execute(new Model()); //baca exception
        return ((GetModeli) getModeli).getModeli();
    }

    public List<Model> getModeliFromNazivMarke(String nazivMarke) throws Exception {
        AbstractSystemOperation getModeliFromNazivMarke = new GetModeliFromNazivMarke();
        getModeliFromNazivMarke.execute(new Model(new Marka(nazivMarke), null)); //baca exception
        return ((GetModeliFromNazivMarke) getModeliFromNazivMarke).getModeli();
    }

    public Object getModeliFromNazivMarke2(String nazivMarke2) throws Exception {
        AbstractSystemOperation getModeliFromNazivMarke2 = new GetModeliFromNazivMarke2();
        getModeliFromNazivMarke2.execute(new Model(new Marka(nazivMarke2), null)); //baca exception
        return ((GetModeliFromNazivMarke2) getModeliFromNazivMarke2).getModeli();
    }

    public List<Musterija> getMusterijeFilter(String filter) throws Exception {
        AbstractSystemOperation getMusterijeFilter = new GetMusterijeFilter();
        getMusterijeFilter.execute(filter); //baca exception
        return ((GetMusterijeFilter) getMusterijeFilter).getMusterije();
    }

    public List<Musterija> getMusterije() throws Exception {
        AbstractSystemOperation getMusterije = new GetMusterije();
        getMusterije.execute(new Musterija()); //baca exception
        return ((GetMusterije) getMusterije).getMusterije();

    }

    public List<Radnik> getRadniciFilter(String filter) throws Exception {
        AbstractSystemOperation getRadniciFilter = new GetRadniciFilter();
        getRadniciFilter.execute(filter); //baca exception
        return ((GetRadniciFilter) getRadniciFilter).getRadnici();
    }

    public List<Radnik> getRadnici() throws Exception {
        AbstractSystemOperation getRadnici = new GetRadnici();
        getRadnici.execute(new Radnik()); //baca exception
        return ((GetRadnici) getRadnici).getRadnici();
    }

    public List<Automobil> getAutomobiliFilter(String filter) throws Exception {
        AbstractSystemOperation getAutomobiliFilter = new GetAutomobiliFilter();
        getAutomobiliFilter.execute(filter); //baca exception
        return ((GetAutomobiliFilter) getAutomobiliFilter).getAutomobili();
    }

    public List<Automobil> getAutomobili() throws Exception {
        AbstractSystemOperation getAutomobili = new GetAutomobili();
        getAutomobili.execute(new Automobil()); //baca exception
        return ((GetAutomobili) getAutomobili).getAutomobili();
    }

    public List<Rezervacija> getRezervacijeFilter(String filter) throws Exception {
        AbstractSystemOperation getRezervacijeFilter = new GetRezervacijeFilter();
        getRezervacijeFilter.execute(filter); //baca exception
        return ((GetRezervacijeFilter) getRezervacijeFilter).getRezervacije();
    }

    public List<Rezervacija> getRezervacije() throws Exception {
        AbstractSystemOperation getRezervacije = new GetRezervacije();
        getRezervacije.execute(new Rezervacija()); //baca exception
        return ((GetRezervacije) getRezervacije).getRezervacije();
    }

    public void deleteMusterija(Musterija musterija) throws Exception {
        AbstractSystemOperation deleteMusterija = new DeleteMusterija();
        deleteMusterija.execute(musterija); //baca exception
    }

    public void deleteAutomobil(Automobil automobil) throws Exception {
        AbstractSystemOperation deleteAutomobil = new DeleteAutomobil();
        deleteAutomobil.execute(automobil); //baca exception
    }

    public void deleteRezervacija(Rezervacija rezervacija) throws Exception {
        AbstractSystemOperation deleteRezervacija = new DeleteRezervacija();
        deleteRezervacija.execute(rezervacija); //baca exception
    }

    public void updateMusterija(Musterija musterija) throws Exception {
        AbstractSystemOperation updateMusterija = new UpdateMusterija();
        updateMusterija.execute(musterija); //baca exception
    }

    public void updateAutomobil(Automobil automobil) throws Exception {
        AbstractSystemOperation updateAutomobil = new UpdateAutomobil();
        updateAutomobil.execute(automobil); //baca exception
    }

    public void updateRezervacija(Rezervacija rezervacija) throws Exception {
        AbstractSystemOperation updateRezervacija = new UpdateRezervacija();
        updateRezervacija.execute(rezervacija); //baca exception

    }

    // DODATO
    public void saveMotor(Motor motor) throws Exception {
        AbstractSystemOperation saveMotor = new SaveMotor();
        saveMotor.execute(motor);
    }

    public Motor getMotor(Motor motor) throws Exception {
        AbstractSystemOperation getMotor = new GetMotor();
        getMotor.execute(motor);
        return ((GetMotor) getMotor).getMotor();
    }

    public void saveServis(Servis servis) throws Exception {
        AbstractSystemOperation saveServis = new SaveServis();
        saveServis.execute(servis);
    }

    public Servis getServis(Servis servis) throws Exception {
        AbstractSystemOperation getServis = new GetServis();
        getServis.execute(servis);
        return ((GetServis) getServis).getServis();
    }
}
