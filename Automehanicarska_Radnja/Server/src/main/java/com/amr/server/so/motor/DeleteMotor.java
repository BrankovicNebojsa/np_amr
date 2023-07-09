package com.amr.server.so.motor;

import com.amr.common.domain.Motor;
import com.amr.server.so.AbstractSystemOperation;

/**
 * Sistemska operacija za brisanje motora
 *
 * @author Nebojsa Brankovic
 */
public class DeleteMotor extends AbstractSystemOperation {

    /**
     * Neparametrizovani konstuktor
     */
    public DeleteMotor() {
    }

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Motor)) {
            throw new Exception("Objekat nije instanca klase Motor!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        repository.delete((Motor) ado);
    }

}
