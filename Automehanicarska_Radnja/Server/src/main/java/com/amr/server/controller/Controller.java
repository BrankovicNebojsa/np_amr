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
 * Klasa koja predstavlja Kontroler serverske strane
 *
 * @author Nebojsa Brankovic
 */
public class Controller {

    /**
     * Prazan konstruktor
     */
    public Controller() {
    }

    /**
     * Metoda koja vraca radnika
     *
     * @param radnikId id radnika
     * @return odgovarajuci radnik
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public Radnik getRadnikFromRadnikId(int radnikId) throws Exception {
        AbstractSystemOperation getRadnikFromRadnikId = new GetRadnikFromRadnikId();
        getRadnikFromRadnikId.execute(new Radnik(radnikId)); //baca exception
        return ((GetRadnikFromRadnikId) getRadnikFromRadnikId).getRadnik();
    }

    /**
     * Metoda koja vraca musteriju
     *
     * @param musterijaId id musterije
     * @return musterija za taj id
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public Musterija getMusterija(int musterijaId) throws Exception {
        AbstractSystemOperation getMusterija = new GetMusterija();
        getMusterija.execute(new Musterija(musterijaId)); //baca exception
        return ((GetMusterija) getMusterija).getMusterija();
    }

    /**
     * Metoda koja vraca automobil
     *
     * @param registracioniBroj registracioni broj automobila
     * @return automobil koji ima tu registraciju
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public Automobil getAutomobil(String registracioniBroj) throws Exception {
        AbstractSystemOperation getAutomobil = new GetAutomobil();
        getAutomobil.execute(new Automobil(registracioniBroj)); //baca exception
        return ((GetAutomobil) getAutomobil).getAutomobil();
    }

    /**
     * Metoda koja proverava da li postoji radnik sa tim kredencijalima u bazi
     *
     * @param korisnickoIme korisnicko ime radnika
     * @param sifra sifra radnika
     * @return da li postoji takav radnik u bazi
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public boolean login(String korisnickoIme, String sifra) throws Exception {
        AbstractSystemOperation login = new LogIn();
        login.execute(new Radnik(korisnickoIme, sifra)); //baca exception
        return ((LogIn) login).getStatus();
    }

    /**
     * Metoda koja proverava da li vec postoji to korisnicko ime u bazi
     *
     * @param korisnickoIme korisnicko ime
     * @return da li postoji korisnicko ime u bazi
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public boolean usernameExists(String korisnickoIme) throws Exception {
        AbstractSystemOperation usernameExists = new UsernameExists();
        usernameExists.execute(new Radnik(korisnickoIme)); //baca exception
        return ((UsernameExists) usernameExists).getStatus();
    }

    /**
     * Metoda koja vraca ako registracioni broj vec postoji u bazi
     *
     * @param registracioniBroj Registracioni broj unetog automobila
     * @return da li postoji takva registracija
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public boolean automobilExists(String registracioniBroj) throws Exception {
        AbstractSystemOperation automobilExists = new AutomobilExists();
        automobilExists.execute(new Automobil(registracioniBroj)); //baca exception
        return ((AutomobilExists) automobilExists).getStatus();
    }

    /**
     * Metoda koja cuva radnika
     *
     * @param radnik radnik kojeg cuvamo u bazi
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public void saveRadnik(Radnik radnik) throws Exception {
        AbstractSystemOperation saveRadnik = new SaveRadnik();
        saveRadnik.execute(radnik); //baca exception
    }

    /**
     * Metoda koja cuva musteriju u bazi
     *
     * @param musterija musterija kojeg cuvamo u bazi
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public void saveMusterija(Musterija musterija) throws Exception {
        AbstractSystemOperation saveMusterija = new SaveMusterija();
        saveMusterija.execute(musterija); //baca exception
    }

    /**
     * Metoda koja cuva vise musterija u bazi
     *
     * @param musterije musterije koje cuvamo u bazi
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public void saveMusterije(List<Musterija> musterije) throws Exception {
        AbstractSystemOperation saveMusterije = new SaveMusterije();
        saveMusterije.execute(musterije); //baca exception
    }

    /**
     * Metoda koja cuva marku u bazi
     *
     * @param marka marka koju cuvamo u bazi
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public void saveMarka(Marka marka) throws Exception {
        AbstractSystemOperation saveMarka = new SaveMarka();
        saveMarka.execute(marka); //baca exception
    }

    /**
     * Metoda koja cuva automobil u bazi
     *
     * @param automobil automobil koji cuvamo u bazi
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public void saveAutomobil(Automobil automobil) throws Exception {
        AbstractSystemOperation saveAutomobil = new SaveAutomobil();
        saveAutomobil.execute(automobil); //baca exception
    }

    /**
     * Metoda koja cuva vise automobila u bazi
     *
     * @param automobili automobili koje cuvamo u bazi
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public void saveAutomobili(List<Automobil> automobili) throws Exception {
        AbstractSystemOperation saveAutomobili = new SaveAutomobili();
        saveAutomobili.execute(automobili); //baca exception
    }

    /**
     * Metoda koja cuva rezervaciju u bazi
     *
     * @param rezervacija rezervacija koju cuvamo u bazi
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public void saveRezervacija(Rezervacija rezervacija) throws Exception {
        AbstractSystemOperation saveRezervacija = new SaveRezervacija();
        saveRezervacija.execute(rezervacija); //baca exception
    }

    /**
     * Metoda koja cuva vise rezervacija u bazi
     *
     * @param rezervacije rezervacije koje treba da sacuvamo u bazi
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public void saveRezervacije(List<Rezervacija> rezervacije) throws Exception {
        AbstractSystemOperation saveRezervacije = new SaveRezervacije();
        saveRezervacije.execute(rezervacije); //baca exception
    }

    /**
     * Metoda koja vraca radnika za neko korisnicko ime
     *
     * @param korisnickoIme korisnicko ime radnika
     * @return odgovarajuci Radnik za to korisnicko ime
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public Radnik getRadnik(String korisnickoIme) throws Exception {
        AbstractSystemOperation getRadnik = new GetRadnik();
        getRadnik.execute(new Radnik(korisnickoIme)); //baca exception
        return ((GetRadnik) getRadnik).getRadnik();
    }

    /**
     * Metoda koja vraca model za naziv modela
     *
     * @param nazivModela naziv nekog modela
     * @return Objekat klase Model koji ima taj naziv modela
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public Model getModel(String nazivModela) throws Exception {
        AbstractSystemOperation getModel = new GetModel();
        getModel.execute(new Model(null, nazivModela)); //baca exception
        return ((GetModel) getModel).getModel();
    }

    /**
     * Metoda koja vraca marku za neki naziv marke
     *
     * @param nazivMarke naziv nek marke
     * @return objekat koji ima uneti naziv marke
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public Marka getMarka(String nazivMarke) throws Exception {
        AbstractSystemOperation getMarka = new GetMarka();
        getMarka.execute(new Marka(nazivMarke)); //baca exception
        return ((GetMarka) getMarka).getMarka();
    }

    /**
     * Metoda koja vraca naziv modela za uneti model
     *
     * @param model model u kojem se nalazi primarni kljuc modela
     * @return naziv modela
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public String getNazivModela(Model model) throws Exception {
        AbstractSystemOperation getNazivModela = new GetNazivModela();
        getNazivModela.execute(model); //baca exception
        return ((GetNazivModela) getNazivModela).getNazivModela();
    }

    /**
     * Metoda koja vraca naziv marke za neki primarni kljuc
     *
     * @param marka objekat klase marka koji ima primarni kljuc
     * @return naziv marke
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public String getNazivMarke(Marka marka) throws Exception {
        AbstractSystemOperation getNazivMarke = new GetNazivMarke();
        getNazivMarke.execute(marka); //baca exception
        return ((GetNazivMarke) getNazivMarke).getNazivMarke();
    }

    /**
     * Metoda koja vraca sve marke
     *
     * @return sve marke iz baze
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public List<Marka> getMarke() throws Exception {
        AbstractSystemOperation getMarke = new GetMarke();
        getMarke.execute(new Marka()); //baca exception
        return ((GetMarke) getMarke).getMarke();
    }

    /**
     * Metoda koja vraca sve modele iz baze
     *
     * @return svi modeli iz baze
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public List<Model> getModeli() throws Exception {
        AbstractSystemOperation getModeli = new GetModeli();
        getModeli.execute(new Model()); //baca exception
        return ((GetModeli) getModeli).getModeli();
    }

    /**
     * Metoda koja vraca sve modele za neku marku
     *
     * @param nazivMarke naziv marke
     * @return lista modela
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public List<Model> getModeliFromNazivMarke(String nazivMarke) throws Exception {
        AbstractSystemOperation getModeliFromNazivMarke = new GetModeliFromNazivMarke();
        getModeliFromNazivMarke.execute(new Model(new Marka(nazivMarke), null)); //baca exception
        return ((GetModeliFromNazivMarke) getModeliFromNazivMarke).getModeli();
    }

    /**
     * Metoda koja vraca model za naziv marke
     *
     * @param nazivMarke2 naziv marke
     * @return model vraca se model koji ima taj naziv marke
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public Object getModeliFromNazivMarke2(String nazivMarke2) throws Exception {
        AbstractSystemOperation getModeliFromNazivMarke2 = new GetModeliFromNazivMarke2();
        getModeliFromNazivMarke2.execute(new Model(new Marka(nazivMarke2), null)); //baca exception
        return ((GetModeliFromNazivMarke2) getModeliFromNazivMarke2).getModeli();
    }

    /**
     * Metoda koja vraca sve musterije z aneki filter
     *
     * @param filter filter koji se koristi u bazi
     * @return lista musterija
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public List<Musterija> getMusterijeFilter(String filter) throws Exception {
        AbstractSystemOperation getMusterijeFilter = new GetMusterijeFilter();
        getMusterijeFilter.execute(filter); //baca exception
        return ((GetMusterijeFilter) getMusterijeFilter).getMusterije();
    }

    /**
     * Metoda koja vraca sve musterije iz baze
     *
     * @return lista musterija u bazi
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public List<Musterija> getMusterije() throws Exception {
        AbstractSystemOperation getMusterije = new GetMusterije();
        getMusterije.execute(new Musterija()); //baca exception
        return ((GetMusterije) getMusterije).getMusterije();

    }

    /**
     * Metoda koja vraca sve radnike za neki filter
     *
     * @param filter filter koji se koristi u bazi
     * @return lista radnika
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public List<Radnik> getRadniciFilter(String filter) throws Exception {
        AbstractSystemOperation getRadniciFilter = new GetRadniciFilter();
        getRadniciFilter.execute(filter); //baca exception
        return ((GetRadniciFilter) getRadniciFilter).getRadnici();
    }

    /**
     * Metoda koja vraca sve radnike
     *
     * @return lista radnika u bazi
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public List<Radnik> getRadnici() throws Exception {
        AbstractSystemOperation getRadnici = new GetRadnici();
        getRadnici.execute(new Radnik()); //baca exception
        return ((GetRadnici) getRadnici).getRadnici();
    }

    /**
     * Metoda koja vraca sve automobile za neki filter
     *
     * @param filter korisnicki unos
     * @return lista automobila
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public List<Automobil> getAutomobiliFilter(String filter) throws Exception {
        AbstractSystemOperation getAutomobiliFilter = new GetAutomobiliFilter();
        getAutomobiliFilter.execute(filter); //baca exception
        return ((GetAutomobiliFilter) getAutomobiliFilter).getAutomobili();
    }

    /**
     * Metoda koja vraca sve automobile
     *
     * @return lista automobila
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public List<Automobil> getAutomobili() throws Exception {
        AbstractSystemOperation getAutomobili = new GetAutomobili();
        getAutomobili.execute(new Automobil()); //baca exception
        return ((GetAutomobili) getAutomobili).getAutomobili();
    }

    /**
     * Metoda koja vraca sve rezervacije za neki filter koji je klijent uneo
     *
     * @param filter filter koji je klijent uneo
     * @return lista rezervacija
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public List<Rezervacija> getRezervacijeFilter(String filter) throws Exception {
        AbstractSystemOperation getRezervacijeFilter = new GetRezervacijeFilter();
        getRezervacijeFilter.execute(filter); //baca exception
        return ((GetRezervacijeFilter) getRezervacijeFilter).getRezervacije();
    }

    /**
     * Metoda koja vraca sve rezervacije
     *
     * @return lista rezervacija
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public List<Rezervacija> getRezervacije() throws Exception {
        AbstractSystemOperation getRezervacije = new GetRezervacije();
        getRezervacije.execute(new Rezervacija()); //baca exception
        return ((GetRezervacije) getRezervacije).getRezervacije();
    }

    /**
     * Metoda koja brise musteriju
     *
     * @param musterija musterija kojeg brisemo
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public void deleteMusterija(Musterija musterija) throws Exception {
        AbstractSystemOperation deleteMusterija = new DeleteMusterija();
        deleteMusterija.execute(musterija); //baca exception
    }

    /**
     * Metoda koja brise autombil
     *
     * @param automobil automobil koji brisemo
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public void deleteAutomobil(Automobil automobil) throws Exception {
        AbstractSystemOperation deleteAutomobil = new DeleteAutomobil();
        deleteAutomobil.execute(automobil); //baca exception
    }

    /**
     * Metoda koja brise rezervaciju
     *
     * @param rezervacija rezervacija koju brisemo
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public void deleteRezervacija(Rezervacija rezervacija) throws Exception {
        AbstractSystemOperation deleteRezervacija = new DeleteRezervacija();
        deleteRezervacija.execute(rezervacija); //baca exception
    }

    /**
     * Metoda koja brise radnika
     *
     * @param radnik radnik kojeg brisemo
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public void deleteRadnik(Radnik radnik) throws Exception {
        AbstractSystemOperation deleteRadnik = new DeleteRadnik();
        deleteRadnik.execute(radnik); //baca exception
    }

    /**
     * Metoda koja menja musteriju
     *
     * @param musterija musterija kojeg menjamo
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public void updateMusterija(Musterija musterija) throws Exception {
        AbstractSystemOperation updateMusterija = new UpdateMusterija();
        updateMusterija.execute(musterija); //baca exception
    }

    /**
     * Metoda koja menja automobil u bazi
     *
     * @param automobil automobil koji menjamo
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public void updateAutomobil(Automobil automobil) throws Exception {
        AbstractSystemOperation updateAutomobil = new UpdateAutomobil();
        updateAutomobil.execute(automobil); //baca exception
    }

    /**
     * Metoda koja menja rezervaciju u bazi
     *
     * @param rezervacija rezervacija koju menjamo u bazi
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public void updateRezervacija(Rezervacija rezervacija) throws Exception {
        AbstractSystemOperation updateRezervacija = new UpdateRezervacija();
        updateRezervacija.execute(rezervacija); //baca exception

    }

    /**
     * Metoda koja cuva motor
     *
     * @param motor motor koji cuvamo u bazi
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public void saveMotor(Motor motor) throws Exception {
        AbstractSystemOperation saveMotor = new SaveMotor();
        saveMotor.execute(motor);
    }

    /**
     * Metoda koja vraca motor
     *
     * @param motor motor iz baze
     * @return vraca trazeni motor
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public Motor getMotor(Motor motor) throws Exception {
        AbstractSystemOperation getMotor = new GetMotor();
        getMotor.execute(motor);
        return ((GetMotor) getMotor).getMotor();
    }

    /**
     * Metoda koja vraca listu motora
     *
     * @return lista motora
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public List<Motor> getMotori() throws Exception {
        AbstractSystemOperation getMotori = new GetMotori();
        getMotori.execute(new Motor());
        return ((GetMotori) getMotori).getMotori();
    }

    /**
     * Metoda koja cuva servis u bazu
     *
     * @param servis servis koji cuvamo u bazi
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public void saveServis(Servis servis) throws Exception {
        AbstractSystemOperation saveServis = new SaveServis();
        saveServis.execute(servis);
    }

    /**
     * Metoda koja vraca servis iz baze
     *
     * @param servis servis koji trazimo
     * @return servis iz baze
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public Servis getServis(Servis servis) throws Exception {
        AbstractSystemOperation getServis = new GetServis();
        getServis.execute(servis);
        return ((GetServis) getServis).getServis();
    }

    /**
     * Metoda koja vraca listu servisa
     *
     * @return lista servisa
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public List<Servis> getServisi() throws Exception {
        AbstractSystemOperation getServisi = new GetServisi();
        getServisi.execute(new Servis());
        return ((GetServisi) getServisi).getServisi();
    }

    /**
     * Metoda koja brise motor
     *
     * @param motor motor koji brisemo
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public void deleteMotor(Motor motor) throws Exception {
        AbstractSystemOperation deleteMotor = new DeleteMotor();
        deleteMotor.execute(motor); //baca exception
    }

    /**
     * Metoda koja brise servis
     *
     * @param servis servis koji brisemo
     * @throws Exception ukoliko dodje do izuzetka pri izvrsenju sistemske
     * operacije baca se greska
     */
    public void deleteServis(Servis servis) throws Exception {
        AbstractSystemOperation deleteServis = new DeleteServis();
        deleteServis.execute(servis); //baca exception
    }
}
