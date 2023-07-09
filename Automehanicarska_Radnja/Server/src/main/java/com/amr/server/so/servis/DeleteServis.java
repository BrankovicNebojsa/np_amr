package com.amr.server.so.servis;

import com.amr.common.domain.Servis;
import com.amr.server.so.AbstractSystemOperation;

/**
 * Sistemska operacija za brisanje servisa
 *
 * @author Nebojsa Brankovic
 */
public class DeleteServis extends AbstractSystemOperation {

    /**
     * Neparametrizovani konstuktor
     */
    public DeleteServis() {
    }

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Servis)) {
            throw new Exception("Objekat nije instanca klase Servis!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        repository.delete((Servis) ado);
    }

}
