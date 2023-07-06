package com.amr.server.so.rezervacija;

import com.amr.common.domain.Rezervacija;
import com.amr.server.so.AbstractSystemOperation;

/**
 * Sistemska operacija za brisanje rezervacije
 *
 * @author Nebojsa Brankovic
 */
public class DeleteRezervacija extends AbstractSystemOperation {

    /**
     * Neparametrizovani konstuktor
     */
    public DeleteRezervacija() {
    }

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Rezervacija)) {
            throw new Exception("Objekat nije instanca klase Rezervacija!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        repository.delete((Rezervacija) ado);
    }

}
