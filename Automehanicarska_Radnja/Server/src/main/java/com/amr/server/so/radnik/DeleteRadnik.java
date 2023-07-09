package com.amr.server.so.radnik;

import com.amr.common.domain.Radnik;
import com.amr.server.so.AbstractSystemOperation;

/**
 * Sistemska operacija za brisanje radnika
 *
 * @author Nebojsa Brankovic
 */
public class DeleteRadnik extends AbstractSystemOperation {

    /**
     * Neparametrizovani konstuktor
     */
    public DeleteRadnik() {
    }

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Radnik)) {
            throw new Exception("Objekat nije instanca klase Radnik!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        repository.delete((Radnik) ado);
    }

}
