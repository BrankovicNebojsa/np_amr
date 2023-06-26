package com.amr.client.controller;

import com.amr.common.communication.*;
import com.amr.common.domain.*;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class Controller {

    private Request reqest;
    private Sender sender;
    private Response response;
    private Receiver receiver;

    public Controller() {
    }

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

    public void quit(Radnik radnik) {
        try {
            reqest = new Request(Operation.QUIT, radnik);
            sender = new Sender(SocketFactory.getInstance().getSocket());
            sender.send(reqest);
        } catch (Exception ex) {
            System.out.println("Greska u Controller.quit()");
        }
    }

    public void sendRadnik(Radnik radnik) {
        sendRequest(Operation.CONNECT, radnik);
    }

    public boolean logInCredentialsExist(Radnik radnik) {
        Response response1 = sendRequest(Operation.LOGIN, radnik);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    public boolean userNameExists(Radnik radnik) {
        Response response1 = sendRequest(Operation.USERNAME_EXISTS, radnik);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    public boolean automobilExists(Automobil auto) {
        Response response1 = sendRequest(Operation.AUTOMOBIL_EXISTS, auto);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    public boolean saveRadnik(Radnik noviRadnik) {
        Response response1 = sendRequest(Operation.SAVE_RADNIK, noviRadnik);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    public boolean saveMusterija(Musterija musterija) {
        Response response1 = sendRequest(Operation.SAVE_MUSTERIJA, musterija);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    public boolean saveMusterije(List<Musterija> musterije) {
        Response response1 = sendRequest(Operation.SAVE_MUSTERIJE, musterije);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    public boolean saveMarka(Marka marka) {
        Response response1 = sendRequest(Operation.SAVE_MARKA, marka);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    public boolean saveAutomobil(Automobil auto) {
        Response response1 = sendRequest(Operation.SAVE_AUTOMOBIL, auto);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    public boolean saveAutomobili(List<Automobil> automobili) {
        Response response1 = sendRequest(Operation.SAVE_AUTOMOBILI, automobili);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    public boolean saveRezervacija(Rezervacija rezervacija) {
        Response response1 = sendRequest(Operation.SAVE_REZERVACIJA, rezervacija);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    public boolean saveRezervacije(List<Rezervacija> rezervacije) {
        Response response1 = sendRequest(Operation.SAVE_REZERVACIJE, rezervacije);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    public Radnik getRadnik(String korisnickoIme) {
        Response response1 = sendRequest(Operation.GET_RADNIK, korisnickoIme);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (Radnik) response1.getResult();
        }
        return null;
    }

    public int getModelId(String nazivModela) {
        Response response1 = sendRequest(Operation.GET_MODELID, nazivModela);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (int) response1.getResult();
        }
        return -1;
    }

    public Marka getMarka(String nazivMarke) {
        Response response1 = sendRequest(Operation.GET_MARKA, nazivMarke);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (Marka) response1.getResult();
        }
        return null;
    }

    public String getNazivModela(Model model) {
        Response response1 = sendRequest(Operation.GET_NAZIVMODELA, model);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (String) response1.getResult();
        }
        return null;
    }

    public String getNazivMarke(Marka marka) {
        Response response1 = sendRequest(Operation.GET_NAZIVMARKE, marka);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (String) response1.getResult();
        }
        return null;
    }

    public List<Marka> getMarke() {
        Response response1 = sendRequest(Operation.GET_MARKE, null);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (List<Marka>) response1.getResult();
        }
        return null;
    }

    public List<Model> getModeli() {
        Response response1 = sendRequest(Operation.GET_MODELI2, null);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (List<Model>) response1.getResult();
        }
        return null;
    }

    public List<Model> getModeli(String nazivMarke) {
        Response response1 = sendRequest(Operation.GET_MODELI, nazivMarke);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (List<Model>) response1.getResult();
        }
        return null;
    }

    public List<Model> getModeliFromNazivMarke(String nazivMarke) {
        Response response1 = sendRequest(Operation.GET_MODELIFNM, nazivMarke);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (List<Model>) response1.getResult();
        }
        return null;
    }

    public List<Musterija> getMusterijeFilter(String filter) {
        Response response1 = sendRequest(Operation.GET_MUSTERIJEFILTER, filter);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (List<Musterija>) response1.getResult();
        }
        return null;
    }

    public List<Musterija> getMusterije() {
        Response response1 = sendRequest(Operation.GET_MUSTERIJE, null);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (List<Musterija>) response1.getResult();
        }
        return null;
    }

    public List<Radnik> getRadniciFilter(String filter) {
        Response response1 = sendRequest(Operation.GET_RADNICIFILTER, filter);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (List<Radnik>) response1.getResult();
        }
        return null;
    }

    public List<Radnik> getRadnici() {
        Response response1 = sendRequest(Operation.GET_RADNICI, null);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (List<Radnik>) response1.getResult();
        }
        return null;
    }

    public List<Automobil> getAutomobiliFilter(String filter) {
        Response response1 = sendRequest(Operation.GET_AUTOMOBILIFILTER, filter);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (List<Automobil>) response1.getResult();
        }
        return null;
    }

    public List<Automobil> getAutomobili() {
        Response response1 = sendRequest(Operation.GET_AUTOMOBILI, null);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (List<Automobil>) response1.getResult();
        }
        return null;
    }

    public List<Rezervacija> getRezervacijeFilter(String filter) {
        Response response1 = sendRequest(Operation.GET_REZERVACIJEFILTER, filter);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (List<Rezervacija>) response1.getResult();
        }
        return null;
    }

    public List<Rezervacija> getRezervacije() {
        Response response1 = sendRequest(Operation.GET_REZERVACIJE, null);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (List<Rezervacija>) response1.getResult();
        }
        return null;
    }

    public boolean deleteMusterija(Musterija musterija) {
        Response response1 = sendRequest(Operation.DELETE_MUSTERIJA, musterija);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    public boolean deleteAutomobil(Automobil automobil) {
        Response response1 = sendRequest(Operation.DELETE_AUTOMOBIL, automobil);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    public boolean deleteRezervacija(Rezervacija rezervacija) {
        Response response1 = sendRequest(Operation.DELETE_REZERVACIJA, rezervacija);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    public boolean updateMusterija(Musterija musterija) {
        Response response1 = sendRequest(Operation.UPDATE_MUSTERIJA, musterija);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    public boolean updateAutomobilPoslednjiServis(Automobil automobil) {
        Response response1 = sendRequest(Operation.UPDATE_AUTOMOBIL_POSLEDNJISERVIS, automobil);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    public boolean updateRezervacija(Rezervacija rezervacija) {
        Response response1 = sendRequest(Operation.UPDATE_REZERVACIJA, rezervacija);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    public boolean saveMotor(Motor motor) {
        Response response1 = sendRequest(Operation.SAVE_MOTOR, motor);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    public Motor getMotor(Motor motor) {
        Response response1 = sendRequest(Operation.GET_MOTOR, motor);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (Motor) response1.getResult();
        }
        return null;
    }

    public boolean saveServis(Servis servis) {
        Response response1 = sendRequest(Operation.SAVE_SERVIS, servis);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (boolean) response1.getResult();
        }
        return false;
    }

    public Servis getServis(Servis servis) {
        Response response1 = sendRequest(Operation.GET_SERVIS, servis);
        if (response1.getStatus().equals(ResponseType.SUCCESS)) {
            return (Servis) response1.getResult();
        }
        return null;
    }

}
