package com.amr.server.so.rezervacija;

import com.amr.common.domain.Rezervacija;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class GetRezervacijeFilter extends AbstractSystemOperation {

    private List<Rezervacija> rezervacije;

    @Override
    protected void preconditions(Object ado) throws Exception {
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        this.rezervacije = repository.getAllFilter(new Rezervacija(), (String) ado);
    }

    public List<Rezervacija> getRezervacije() {
        return this.rezervacije;
    }
}
