package com.amr.server.so.musterija;

import com.amr.common.domain.Musterija;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class SaveMusterija extends AbstractSystemOperation {

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Musterija)) {
            throw new Exception("Objekat nije instanca klase Musterija!");
        }

        List<Musterija> musterije = repository.getAll(ado);

        for (Musterija musterija : musterije) {
            if (musterija.getImeMusterije().equals(((Musterija) ado).getImeMusterije())
                    && musterija.getPrezimeMusterije().equals(((Musterija) ado).getPrezimeMusterije())
                    && musterija.getMailMusterije().equals(((Musterija) ado).getMailMusterije())
                    && musterija.getTelefonMusterije().equals(((Musterija) ado).getTelefonMusterije())) {
                throw new Exception("Vec postoji musterija sa unetim vrednostima");
            }
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        repository.save((Musterija) ado);
    }

}
