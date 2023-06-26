package com.amr.server.so.automobil;

import com.amr.common.domain.Automobil;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class SaveAutomobil extends AbstractSystemOperation {

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Automobil)) {
            throw new Exception("Objekat nije instanca klase Automobil!");
        }

        List<Automobil> automobili = repository.getAll(ado);

        for (Automobil automobil : automobili) {
            if (automobil.getRegistracioniBroj().equals(((Automobil) ado).getRegistracioniBroj())) {
                throw new Exception("Vec postoji automobil sa unetim tablicama");
            }
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        repository.save((Automobil) ado);
    }

}
