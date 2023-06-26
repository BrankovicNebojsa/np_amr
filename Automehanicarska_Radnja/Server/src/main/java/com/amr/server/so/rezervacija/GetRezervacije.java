package com.amr.server.so.rezervacija;

import com.amr.common.domain.Rezervacija;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class GetRezervacije extends AbstractSystemOperation {

    private List<Rezervacija> rezervacije;

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

    public List<Rezervacija> getRezervacije() {
        return this.rezervacije;
    }
}
