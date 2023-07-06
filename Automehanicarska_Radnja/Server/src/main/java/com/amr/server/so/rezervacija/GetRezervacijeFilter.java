package com.amr.server.so.rezervacija;

import com.amr.common.domain.Rezervacija;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Sistemska operacija koja vraca sve rezervacije za odgovarajuci filter
 *
 * @author Nebojsa Brankovic
 */
public class GetRezervacijeFilter extends AbstractSystemOperation {

    /**
     * Lista rezervacija koje odgovaraju filteru
     */
    private List<Rezervacija> rezervacije;

    /**
     * Neparametrizovani konstuktor
     */
    public GetRezervacijeFilter() {
    }

    @Override
    protected void preconditions(Object ado) throws Exception {
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        this.rezervacije = repository.getAllFilter(new Rezervacija(), (String) ado);
    }

    /**
     * Metoda koja vraca sve rezervacije
     *
     * @return rezervacije iz baze
     */
    public List<Rezervacija> getRezervacije() {
        return this.rezervacije;
    }
}
