package com.amr.server.so.radnik;

import com.amr.common.domain.Radnik;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Sistemska operacija za vracanje jednog radnika
 *
 * @author Nebojsa Brankovic
 */
public class GetRadnik extends AbstractSystemOperation {

    /**
     * Radnik iz baze
     */
    private Radnik radnik;

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Radnik)) {
            throw new Exception("Objekat nije instanca klase Radnik!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        List<Radnik> radnici = repository.getAll((Radnik) ado);
        for (Radnik radnik : radnici) {
            if (radnik.getKorisnickoIme().equals(((Radnik) ado).getKorisnickoIme())) {
                this.radnik = radnik;
            }
        }
    }

    /**
     * Metoda koja vraca radnika iz baze
     *
     * @return radnik iz baze
     */
    public Radnik getRadnik() {
        return this.radnik;
    }
}
