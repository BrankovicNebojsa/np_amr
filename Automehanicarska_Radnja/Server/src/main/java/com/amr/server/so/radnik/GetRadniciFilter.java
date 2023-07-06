package com.amr.server.so.radnik;

import com.amr.common.domain.Radnik;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Sistemska operacija koja vraca sve radnike za neki filter
 *
 * @author Nebojsa Brankovic
 */
public class GetRadniciFilter extends AbstractSystemOperation {

    /**
     * Lista radnika za neki filter
     */
    private List<Radnik> radnici;

    /**
     * Neparametrizovani konstuktor
     */
    public GetRadniciFilter() {
    }

    @Override
    protected void preconditions(Object ado) throws Exception {
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        this.radnici = repository.getAllFilter(new Radnik(), (String) ado);
    }

    /**
     * Metoda koja vraca sve radnike
     *
     * @return lista radnika
     */
    public List<Radnik> getRadnici() {
        return this.radnici;
    }
}
