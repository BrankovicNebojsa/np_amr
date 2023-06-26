package com.amr.server.so.musterija;

import com.amr.common.domain.Musterija;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class GetMusterije extends AbstractSystemOperation {

    private List<Musterija> musterije;

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Musterija)) {
            throw new Exception("Objekat nije instanca klase Musterija!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        this.musterije = repository.getAll((Musterija) ado);
    }

    public List<Musterija> getMusterije() {
        return this.musterije;
    }
}
