package com.amr.client.controller;

import com.amr.common.communication.*;
import com.amr.common.domain.*;
import java.util.List;

/**
 * Klasa koja predstavlja kontroler klijentske strane
 *
 * @author Nebojsa Brankovic
 */
public class Controller {

    /**
     * zahtev
     */
    private Request reqest;
    /**
     * posiljalac
     */
    private Sender sender;
    /**
     * odgovor
     */
    private Response response;
    /**
     * primalac
     */
    private Receiver receiver;

    /**
     * Neparametrizovani konstuktor
     */
    public Controller() {
    }

    /**
     * Metoda za slanje zahteva serverskoj strani
     *
     * @param operation operaciju koju je potrebno izvesti
     * @param argument argument koji se prosledjuje serveru
     * @return odgovor servera
     */
    private Response sendRequest(Operation operation, Object argument) {
        try {
            reqest = new Request(operation, argument);
            sender = new Sender(SocketFactory.getInstance().getSocket());
            sender.send(reqest);
            receiver = new Receiver(SocketFactory.getInstance().getSocket());
            response = (Response) receiver.receive();
            return response;
        } catch (Exception ex) {
            System.out.println("Greska u Controller.sendRequest");
        }
        return null;
    }

    /**
     * Gasenje programa
     *
     * @param radnik Klijent
     */
    public void quit(Radnik radnik) {
        try {
            reqest = new Request(Operation.QUIT, radnik);
            sender = new Sender(SocketFactory.getInstance().getSocket());
            sender.send(reqest);
        } catch (Exception ex) {
            System.out.println("Greska u Controller.quit()");
        }
    }

    /**
     * Slanje trenutnog radnika zbog povezivanja
     *
     * @param radnik klijent
     */
    public void sendRadnik(Radnik radnik) {
        sendRequest(Operation.CONNECT, radnik);
    }

    /**
     * Metoda koja ispituje da li postoje kredencijali za radnika
     *
     * @param radnik radnik ciji se kredencijali ispituju
     * @return uspesnost metode
     */
    public boolean logInCredentialsExist(Radnik radnik) {
        Response response1 = sendRequest(Operation.LOGIN, radnik);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    /**
     * Metoda koja proverava da li korisnicko ime vec postoji
     *
     * @param radnik radnik cije se korisnicko ime ispituje
     * @return uspesnost metode
     */
    public boolean userNameExists(Radnik radnik) {
        Response response1 = sendRequest(Operation.USERNAME_EXISTS, radnik);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    /**
     * Metoda koja proverava da li vec postoji automobil sa tom registracijom
     *
     * @param auto automobil
     * @return uspesnost metode
     */
    public boolean automobilExists(Automobil auto) {
        Response response1 = sendRequest(Operation.AUTOMOBIL_EXISTS, auto);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    /**
     * Metoda za cuvanje radnika
     *
     * @param noviRadnik radnik kojeg treba sacuvati
     * @return uspesnost metode
     */
    public boolean saveRadnik(Radnik noviRadnik) {
        Response response1 = sendRequest(Operation.SAVE_RADNIK, noviRadnik);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    /**
     * Metoda za cuvanje musterije
     *
     * @param musterija musterija koju cuvamo
     * @return uspesnost metode
     */
    public boolean saveMusterija(Musterija musterija) {
        Response response1 = sendRequest(Operation.SAVE_MUSTERIJA, musterija);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    /**
     * Metoda za cuvanje vise musterija
     *
     * @param musterije musterije koje treba da sacuvamo u bazi
     * @return uspesnost metode
     */
    public boolean saveMusterije(List<Musterija> musterije) {
        Response response1 = sendRequest(Operation.SAVE_MUSTERIJE, musterije);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    /**
     * Metoda za cuvanje marke
     *
     * @param marka marka koju cuvamo
     * @return uspesnost metode
     */
    public boolean saveMarka(Marka marka) {
        Response response1 = sendRequest(Operation.SAVE_MARKA, marka);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    /**
     * Metoda za cuvanje automobila
     *
     * @param auto automobil koji cuvamo
     * @return uspesnost metode
     */
    public boolean saveAutomobil(Automobil auto) {
        Response response1 = sendRequest(Operation.SAVE_AUTOMOBIL, auto);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    /**
     * Metoda za cuvanje vise automobila
     *
     * @param automobili automobili koje cuvamo
     * @return uspesnost metode
     */
    public boolean saveAutomobili(List<Automobil> automobili) {
        Response response1 = sendRequest(Operation.SAVE_AUTOMOBILI, automobili);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    /**
     * Metoda za cuvanje rezervacije
     *
     * @param rezervacija rezervacija koju cuvamo
     * @return uspesnost metode
     */
    public boolean saveRezervacija(Rezervacija rezervacija) {
        Response response1 = sendRequest(Operation.SAVE_REZERVACIJA, rezervacija);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    /**
     * Metoda za cuvanje vise rezervacija
     *
     * @param rezervacije rezervacije koje cuvamo
     * @return uspesnost metode
     */
    public boolean saveRezervacije(List<Rezervacija> rezervacije) {
        Response response1 = sendRequest(Operation.SAVE_REZERVACIJE, rezervacije);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    /**
     * Metoda za vracanje radnika
     *
     * @param korisnickoIme korisnicko ime radnika
     * @return radnik sa tim korisnickim imenom
     */
    public Radnik getRadnik(String korisnickoIme) {
        Response response1 = sendRequest(Operation.GET_RADNIK, korisnickoIme);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (Radnik) response1.getResult();
        }
        return null;
    }

    /**
     * Metoda za vracanje primarnog kljuca modela
     *
     * @param nazivModela naziv modela
     * @return primarni kljuc modela
     */
    public int getModelId(String nazivModela) {
        Response response1 = sendRequest(Operation.GET_MODELID, nazivModela);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (int) response1.getResult();
        }
        return -1;
    }

    /**
     * Metoda za vraca marke preko naziva makre
     *
     * @param nazivMarke naziv marke
     * @return marka
     */
    public Marka getMarka(String nazivMarke) {
        Response response1 = sendRequest(Operation.GET_MARKA, nazivMarke);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (Marka) response1.getResult();
        }
        return null;
    }

    /**
     * Metoda za vracanje naziva modela preko id-a
     *
     * @param model model koji ima id
     * @return nazv modela
     */
    public String getNazivModela(Model model) {
        Response response1 = sendRequest(Operation.GET_NAZIVMODELA, model);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (String) response1.getResult();
        }
        return null;
    }

    /**
     * Metoda za vracanje naziva marke
     *
     * @param marka marka koja ima id
     * @return naziv marke
     */
    public String getNazivMarke(Marka marka) {
        Response response1 = sendRequest(Operation.GET_NAZIVMARKE, marka);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (String) response1.getResult();
        }
        return null;
    }

    /**
     * Metoda koja vraca sve marke iz baze
     *
     * @return list marka u bazi
     */
    public List<Marka> getMarke() {
        Response response1 = sendRequest(Operation.GET_MARKE, null);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (List<Marka>) response1.getResult();
        }
        return null;
    }

    /**
     * Metoda koja vraca sve modele iz baze
     *
     * @return lista modela u bazi
     */
    public List<Model> getModeli() {
        Response response1 = sendRequest(Operation.GET_MODELI2, null);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (List<Model>) response1.getResult();
        }
        return null;
    }

    /**
     * Metoda koja vraca sve modele za jednu marku
     *
     * @param nazivMarke naziv neke marke
     * @return lista modela
     */
    public List<Model> getModeli(String nazivMarke) {
        Response response1 = sendRequest(Operation.GET_MODELI, nazivMarke);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (List<Model>) response1.getResult();
        }
        return null;
    }

    /**
     * Metoda koja vraca sve modele preko naziva marke
     *
     * @param nazivMarke naziv marke
     * @return lista modela
     */
    public List<Model> getModeliFromNazivMarke(String nazivMarke) {
        Response response1 = sendRequest(Operation.GET_MODELIFNM, nazivMarke);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (List<Model>) response1.getResult();
        }
        return null;
    }

    /**
     * Metoda koja vraca sve musterije preko filtera
     *
     * @param filter filter koji je klijent uneo
     * @return lista musterija
     */
    public List<Musterija> getMusterijeFilter(String filter) {
        Response response1 = sendRequest(Operation.GET_MUSTERIJEFILTER, filter);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (List<Musterija>) response1.getResult();
        }
        return null;
    }

    /**
     * Metoda koja vraca sve musterije
     *
     * @return lista musterija u bazi
     */
    public List<Musterija> getMusterije() {
        Response response1 = sendRequest(Operation.GET_MUSTERIJE, null);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (List<Musterija>) response1.getResult();
        }
        return null;
    }

    /**
     * Metoda koja vraca sve radnike preko filtear
     *
     * @param filter filter koji je klijent uneo
     * @return lista radnika
     */
    public List<Radnik> getRadniciFilter(String filter) {
        Response response1 = sendRequest(Operation.GET_RADNICIFILTER, filter);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (List<Radnik>) response1.getResult();
        }
        return null;
    }

    /**
     * Metoda koja vraca sve radnike
     *
     * @return lista radnika
     */
    public List<Radnik> getRadnici() {
        Response response1 = sendRequest(Operation.GET_RADNICI, null);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (List<Radnik>) response1.getResult();
        }
        return null;
    }

    /**
     * Metoda koja vraca sve automobile preko filtera
     *
     * @param filter filter koji je klijent uneo
     * @return lista automobila
     */
    public List<Automobil> getAutomobiliFilter(String filter) {
        Response response1 = sendRequest(Operation.GET_AUTOMOBILIFILTER, filter);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (List<Automobil>) response1.getResult();
        }
        return null;
    }

    /**
     * Metoda koja vraca sve automobile
     *
     * @return lista automobila
     */
    public List<Automobil> getAutomobili() {
        Response response1 = sendRequest(Operation.GET_AUTOMOBILI, null);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (List<Automobil>) response1.getResult();
        }
        return null;
    }

    /**
     * Metoda koja vraca sve rezervacije preko filtera
     *
     * @param filter filter koji je klijent uneo
     * @return lista rezervacija
     */
    public List<Rezervacija> getRezervacijeFilter(String filter) {
        Response response1 = sendRequest(Operation.GET_REZERVACIJEFILTER, filter);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (List<Rezervacija>) response1.getResult();
        }
        return null;
    }

    /**
     * Metoda koja vraca sve rezervacije
     *
     * @return lista rezervacije iz baze
     */
    public List<Rezervacija> getRezervacije() {
        Response response1 = sendRequest(Operation.GET_REZERVACIJE, null);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (List<Rezervacija>) response1.getResult();
        }
        return null;
    }

    /**
     * Metoda koja brise musteriju
     *
     * @param musterija musterija kojeg brisemo
     * @return uspesnost sistemske operacije
     */
    public boolean deleteMusterija(Musterija musterija) {
        Response response1 = sendRequest(Operation.DELETE_MUSTERIJA, musterija);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    /**
     * Metoda koja brise automobil
     *
     * @param automobil automobil koji brisemo
     * @return uspesnost sistemske operacije
     */
    public boolean deleteAutomobil(Automobil automobil) {
        Response response1 = sendRequest(Operation.DELETE_AUTOMOBIL, automobil);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    /**
     * Metoda koja brise rezervaciju
     *
     * @param rezervacija rezervacija koju brisemo
     * @return uspesnost sistemske operacije
     */
    public boolean deleteRezervacija(Rezervacija rezervacija) {
        Response response1 = sendRequest(Operation.DELETE_REZERVACIJA, rezervacija);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    /**
     * Metoda koja menja podatke o musteriji
     *
     * @param musterija musterija kojeg menjamo
     * @return uspesnost sistemske operacije
     */
    public boolean updateMusterija(Musterija musterija) {
        Response response1 = sendRequest(Operation.UPDATE_MUSTERIJA, musterija);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    /**
     * Metoda koja menja poslednji servis automobila
     *
     * @param automobil automobil kojem menjamo poslednji servis
     * @return uspesnost sistemske operacije
     */
    public boolean updateAutomobilPoslednjiServis(Automobil automobil) {
        Response response1 = sendRequest(Operation.UPDATE_AUTOMOBIL_POSLEDNJISERVIS, automobil);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    /**
     * Metoda koja menja rezervaciju
     *
     * @param rezervacija rezervacija koju menjamo
     * @return uspesnost sistemske operacije
     */
    public boolean updateRezervacija(Rezervacija rezervacija) {
        Response response1 = sendRequest(Operation.UPDATE_REZERVACIJA, rezervacija);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    /**
     * Metoda koja cuva motor
     *
     * @param motor motor koji cuvamo u bazi
     * @return uspesnost sistemske operacije
     */
    public boolean saveMotor(Motor motor) {
        Response response1 = sendRequest(Operation.SAVE_MOTOR, motor);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    /**
     * Metoda koja vraca motor
     *
     * @param motor motor sa nekim parametrom preko kojeg trazimo objekat
     * @return Motor iz baze
     */
    public Motor getMotor(Motor motor) {
        Response response1 = sendRequest(Operation.GET_MOTOR, motor);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (Motor) response1.getResult();
        }
        return null;
    }

    /**
     * Metoda koja cuva servis
     *
     * @param servis servis koji cuvamo
     * @return uspesnost sistemske operacije
     */
    public boolean saveServis(Servis servis) {
        Response response1 = sendRequest(Operation.SAVE_SERVIS, servis);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    /**
     * Metoda koja vraca servis iz baze
     *
     * @param servis servis koji ima neki parametar preko kojeg nalazimo objekat
     * u bazi
     * @return servis iz baze
     */
    public Servis getServis(Servis servis) {
        Response response1 = sendRequest(Operation.GET_SERVIS, servis);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (Servis) response1.getResult();
        }
        return null;
    }

}
