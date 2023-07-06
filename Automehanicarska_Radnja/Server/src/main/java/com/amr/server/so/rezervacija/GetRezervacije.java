package com.amr.server.so.rezervacija;

import com.amr.common.domain.Rezervacija;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Sistemska operacija za vracanje svih rezervacija
 *
 * @author Nebojsa Brankovic
 */
public class GetRezervacije extends AbstractSystemOperation {

    /**
     * Lista rezervacija iz baze
     */
    private List<Rezervacija> rezervacije;

    /**
     * Neparametrizovani konstuktor
     */
    public GetRezervacije() {
    }

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Rezervacija)) {
            throw new Exception("Objekat nije instanca klase Rezervacija!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        this.rezervacije = repository.getAll((Rezervacija) ado);
    }

    /**
     * Metoda koja vraca sve rezervacije iz baze
     *
     * @return rezervacije iz bazr
     */
    public List<Rezervacija> getRezervacije() {
        return this.rezervacije;
    }
}
