package com.amr.server.so.musterija;

import com.amr.common.domain.Musterija;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Sistemska operacija koja vraca sve musterije za neki filter
 *
 * @author Nebojsa Brankovic
 */
public class GetMusterijeFilter extends AbstractSystemOperation {

    /**
     * Lista musterija iz baze
     */
    private List<Musterija> musterije;

    /**
     * Neparametrizovani konstuktor
     */
    public GetMusterijeFilter() {
    }

    @Override
    protected void preconditions(Object ado) throws Exception {
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        this.musterije = repository.getAllFilter(new Musterija(), (String) ado);
    }

    /**
     * Metoda koja vraca nadjene musterije za filter
     *
     * @return nadjene musterije za filter
     */
    public List<Musterija> getMusterije() {
        return this.musterije;
    }
}
