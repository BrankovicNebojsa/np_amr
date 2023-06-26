package com.amr.server.so.automobil;

import com.amr.common.domain.Automobil;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class GetAutomobili extends AbstractSystemOperation {

    private List<Automobil> automobili;

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Automobil)) {
            throw new Exception("Objekat nije instanca klase Automobil!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        this.automobili = repository.getAll((Automobil) ado);
    }

    public List<Automobil> getAutomobili() {
        return this.automobili;
    }
}
