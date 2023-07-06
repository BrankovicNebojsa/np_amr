package com.amr.server.so.musterija;

import com.amr.common.domain.Musterija;
import com.amr.server.so.AbstractSystemOperation;

/**
 * Sistemska operacija za brisanje musterije
 *
 * @author Nebojsa Brankovic
 */
public class DeleteMusterija extends AbstractSystemOperation {

    /**
     * Neparametrizovani konstuktor
     */
    public DeleteMusterija() {
    }

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Musterija)) {
            throw new Exception("Objekat nije instanca klase Musterija!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        repository.delete((Musterija) ado);
    }

}
