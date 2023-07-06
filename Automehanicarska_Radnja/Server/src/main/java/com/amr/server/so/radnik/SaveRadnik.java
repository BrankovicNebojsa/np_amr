package com.amr.server.so.radnik;

import com.amr.common.domain.Radnik;
import com.amr.server.so.AbstractSystemOperation;

/**
 * Sistemska operacija za cuvanje radnika
 *
 * @author Nebojsa Brankovic
 */
public class SaveRadnik extends AbstractSystemOperation {

    /**
     * Neparametrizovani konstuktor
     */
    public SaveRadnik() {
    }

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Radnik)) {
            throw new Exception("Objekat nije instanca klase Radnik!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        repository.save((Radnik) ado);
    }

}
