package com.amr.server.server;

import static com.amr.common.communication.Operation.*;
import com.amr.common.communication.*;
import com.amr.common.domain.*;
import com.amr.server.controller.Controller;
import com.amr.server.view.MainForm;
import java.net.Socket;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class ProcessClientsRequests extends Thread {

    private Socket socket;
    private Sender sender;
    private Receiver receiver;
    private MainForm mf;
    private Controller controller;
    private Radnik user;

    public ProcessClientsRequests(Socket socket, MainForm mf) {
        this.mf = mf;
        this.socket = socket;
        sender = new Sender(socket);
        receiver = new Receiver(socket);
        this.controller = new Controller();
    }

    public void stopThread() {
        this.interrupt();
        mf.removeUser(user);
        System.out.println("Ugasena jedna nit za obradu klijentskih zahteva.");
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            try {
                Request request = (Request) receiver.receive();
                Response response = new Response();
                try {
                    Radnik radnik;
                    Automobil automobil;
                    Musterija musterija;
                    Model model;
                    Marka marka;
                    Rezervacija rezervacija;
                    Motor motor;
                    Servis servis;
                    String filter;
                    if (request != null) {
                        switch (request.getOperation()) {
                            case CONNECT:
                                radnik = (Radnik) request.getArgument();
                                mf.addUser(radnik);
                                this.user = radnik;
                                break;
                            case LOGIN:
                                radnik = (Radnik) request.getArgument();
                                try {
                                    response.setResult(controller.login(radnik.getKorisnickoIme(), radnik.getSifra()));
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case USERNAME_EXISTS:
                                radnik = (Radnik) request.getArgument();
                                try {
                                    response.setResult(controller.usernameExists(radnik.getKorisnickoIme()));
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case AUTOMOBIL_EXISTS:
                                automobil = (Automobil) request.getArgument();
                                try {
                                    response.setResult(controller.automobilExists(automobil.getRegistracioniBroj()));

                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case SAVE_RADNIK:
                                radnik = (Radnik) request.getArgument();
                                try {
                                    controller.saveRadnik(radnik);
                                    response.setResult(true);
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case SAVE_MUSTERIJA:
                                musterija = (Musterija) request.getArgument();
                                try {
                                    controller.saveMusterija(musterija);
                                    response.setResult(true);
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case SAVE_MUSTERIJE:
                                List<Musterija> musterije = (List<Musterija>) request.getArgument();
                                try {
                                    controller.saveMusterije(musterije);
                                    response.setResult(true);
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case SAVE_MARKA:
                                marka = (Marka) request.getArgument();
                                try {
                                    controller.saveMarka(marka);
                                    response.setResult(true);
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case SAVE_AUTOMOBIL:
                                automobil = (Automobil) request.getArgument();
                                try {
                                    controller.saveAutomobil(automobil);
                                    response.setResult(true);
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case SAVE_AUTOMOBILI:
                                List<Automobil> automobili = (List<Automobil>) request.getArgument();
                                try {
                                    controller.saveAutomobili(automobili);
                                    response.setResult(true);
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case SAVE_REZERVACIJA:
                                rezervacija = (Rezervacija) request.getArgument();
                                try {
                                    controller.saveRezervacija(rezervacija);
                                    response.setResult(true);
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case SAVE_REZERVACIJE:
                                List<Rezervacija> rezervacije = (List<Rezervacija>) request.getArgument();
                                try {
                                    controller.saveRezervacije(rezervacije);
                                    response.setResult(true);
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case GET_RADNIK:
                                String korisnickoIme = (String) request.getArgument();
                                try {
                                    response.setResult(controller.getRadnik(korisnickoIme));
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case GET_MODELID:
                                String nazivModela = (String) request.getArgument();
                                try {
                                    response.setResult(controller.getModel(nazivModela).getModelId());
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case GET_MARKA:
                                String nazivMarke = (String) request.getArgument();
                                try {
                                    response.setResult(controller.getMarka(nazivMarke));
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case GET_NAZIVMODELA:
                                model = (Model) request.getArgument();
                                try {
                                    response.setResult(controller.getNazivModela(model));
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case GET_NAZIVMARKE:
                                marka = (Marka) request.getArgument();
                                try {
                                    response.setResult(controller.getNazivMarke(marka));
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case GET_MARKE:
                                System.out.print("");
                                try {
                                    response.setResult(controller.getMarke());
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case GET_MODELI:
                                String nazivMarke1 = (String) request.getArgument();
                                try {
                                    response.setResult(controller.getModeliFromNazivMarke(nazivMarke1));
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case GET_MODELIFNM:
                                String nazivMarke2 = (String) request.getArgument();
                                try {
                                    response.setResult(controller.getModeliFromNazivMarke2(nazivMarke2));
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case GET_MODELI2:
                                System.out.print("");
                                try {
                                    response.setResult(controller.getModeli());
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case GET_MUSTERIJEFILTER:
                                filter = (String) request.getArgument();
                                try {
                                    response.setResult(controller.getMusterijeFilter(filter));
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case GET_MUSTERIJE:
                                System.out.print("");
                                try {
                                    response.setResult(controller.getMusterije());
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case GET_RADNICIFILTER:
                                filter = (String) request.getArgument();
                                try {
                                    response.setResult(controller.getRadniciFilter(filter));
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case GET_RADNICI:
                                System.out.print("");
                                try {
                                    response.setResult(controller.getRadnici());
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case GET_AUTOMOBILIFILTER:
                                filter = (String) request.getArgument();
                                try {
                                    response.setResult(controller.getAutomobiliFilter(filter));
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case GET_AUTOMOBILI:
                                System.out.print("");
                                try {
                                    response.setResult(controller.getAutomobili());
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case GET_REZERVACIJEFILTER:
                                filter = (String) request.getArgument();
                                try {
                                    response.setResult(controller.getRezervacijeFilter(filter));
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case GET_REZERVACIJE:
                                System.out.print("");
                                try {
                                    response.setResult(controller.getRezervacije());
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case DELETE_MUSTERIJA:
                                musterija = (Musterija) request.getArgument();
                                try {
                                    controller.deleteMusterija(musterija);
                                    response.setResult(true);
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case DELETE_AUTOMOBIL:
                                automobil = (Automobil) request.getArgument();
                                try {
                                    controller.deleteAutomobil(automobil);
                                    response.setResult(true);
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case DELETE_REZERVACIJA:
                                rezervacija = (Rezervacija) request.getArgument();
                                try {
                                    controller.deleteRezervacija(rezervacija);
                                    response.setResult(true);
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case UPDATE_MUSTERIJA:
                                musterija = (Musterija) request.getArgument();
                                try {
                                    controller.updateMusterija(musterija);
                                    response.setResult(true);
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case UPDATE_AUTOMOBIL_POSLEDNJISERVIS:
                                automobil = (Automobil) request.getArgument();
                                try {
                                    controller.updateAutomobil(automobil);
                                    response.setResult(true);
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case UPDATE_REZERVACIJA:
                                rezervacija = (Rezervacija) request.getArgument();
                                try {
                                    controller.updateRezervacija(rezervacija);
                                    response.setResult(true);
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case QUIT:
                                this.user = (Radnik) request.getArgument();
                                this.interrupt();
                                break;
                            case SAVE_MOTOR:
                                motor = (Motor) request.getArgument();
                                try {
                                    controller.saveMotor(motor);
                                    response.setResult(true);
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case GET_MOTOR:
                                motor = (Motor) request.getArgument();
                                try {
                                    response.setResult(controller.getMotor(motor));
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case SAVE_SERVIS:
                                servis = (Servis) request.getArgument();
                                try {
                                    controller.saveServis(servis);
                                    response.setResult(true);
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                            case GET_SERVIS:
                                servis = (Servis) request.getArgument();
                                try {
                                    response.setResult(controller.getServis(servis));
                                } catch (Exception e) {
                                    response.setStatus(ResponseType.ERROR);
                                }
                                break;
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                sender.send(response);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        mf.removeUser(user);
        System.out.println("Klijentska aplikacija ugasena.");
    }
}
