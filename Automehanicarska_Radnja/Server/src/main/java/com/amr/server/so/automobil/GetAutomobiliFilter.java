package com.amr.server.so.automobil;

import com.amr.common.domain.Automobil;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class GetAutomobiliFilter extends AbstractSystemOperation {

    private List<Automobil> automobili;

    @Override
    protected void preconditions(Object ado) throws Exception {
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        this.automobili = repository.getAllFilter(new Automobil(), (String) ado);
    }

    public List<Automobil> getAutomobili() {
        return this.automobili;
    }

}
