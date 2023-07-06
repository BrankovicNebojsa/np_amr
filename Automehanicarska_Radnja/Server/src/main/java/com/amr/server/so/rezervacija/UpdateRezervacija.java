package com.amr.server.so.rezervacija;

import com.amr.common.domain.Rezervacija;
import com.amr.server.so.AbstractSystemOperation;

/**
 * Sistemska operacija za izmenu rezervacije
 *
 * @author Nebojsa Brankovic
 */
public class UpdateRezervacija extends AbstractSystemOperation {

    /**
     * Neparametrizovani konstuktor
     */
    public UpdateRezervacija() {
    }

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Rezervacija)) {
            throw new Exception("Objekat nije instanca klase Rezervacija!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        repository.update((Rezervacija) ado);
    }

}
