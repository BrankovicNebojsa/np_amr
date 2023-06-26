package com.amr.server.so.musterija;

import com.amr.common.domain.Musterija;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class GetMusterijeFilter extends AbstractSystemOperation {

    private List<Musterija> musterije;

    @Override
    protected void preconditions(Object ado) throws Exception {
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        this.musterije = repository.getAllFilter(new Musterija(), (String) ado);
    }

    public List<Musterija> getMusterije() {
        return this.musterije;
    }
}
