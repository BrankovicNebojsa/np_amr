package com.amr.server.so.automobil;

import com.amr.common.domain.Automobil;
import com.amr.server.so.AbstractSystemOperation;

/**
 * Sistemska operacija za izmenu nad automobilom
 *
 * @author Nebojsa Brankovic
 */
public class UpdateAutomobil extends AbstractSystemOperation {

    /**
     * Neparametrizovani konstuktor
     */
    public UpdateAutomobil() {
    }

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Automobil)) {
            throw new Exception("Objekat nije instanca klase Automobil!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        repository.update((Automobil) ado);
    }
}
