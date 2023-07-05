package com.amr.server.so.rezervacija;

import com.amr.common.domain.Rezervacija;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Sistemska operacija za cuvanje rezervacije
 *
 * @author Nebojsa Brankovic
 */
public class SaveRezervacija extends AbstractSystemOperation {

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Rezervacija)) {
            throw new Exception("Objekat nije instanca klase Rezervacija!");
        }
        List<Rezervacija> rezervacije = repository.getAll(ado);

        for (Rezervacija rezervacija : rezervacije) {
            if (rezervacija.getPocetakServisa().equals(((Rezervacija) ado).getPocetakServisa())
                    && rezervacija.getRadnik().getRadnikId() == ((Rezervacija) ado).getRadnik().getRadnikId()) {
                throw new Exception("Vec postoji rezervacija kod " + rezervacija.getRadnik().getImeRadnika()
                        + " " + rezervacija.getRadnik().getPrezimeRadnika() + " u to vreme");
            }
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        repository.save((Rezervacija) ado);
    }

}
