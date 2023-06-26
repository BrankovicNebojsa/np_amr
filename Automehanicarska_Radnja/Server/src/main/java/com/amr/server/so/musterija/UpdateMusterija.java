package com.amr.server.so.musterija;

import com.amr.common.domain.Musterija;
import com.amr.server.so.AbstractSystemOperation;

/**
 *
 * @author Nebojsa Brankovic
 */
public class UpdateMusterija extends AbstractSystemOperation {

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Musterija)) {
            throw new Exception("Objekat nije instanca klase Musterija!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        repository.update((Musterija) ado);
    }

}
