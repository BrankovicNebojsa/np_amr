package com.amr.server.so.radnik;

import com.amr.common.domain.Radnik;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Sistemska operacija koja vraca radnika za id radnika
 *
 * @author Nebojsa Brankovic
 */
public class GetRadnikFromRadnikId extends AbstractSystemOperation {

    /**
     * Pronadjeni radnik
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
            if (radnik.getRadnikId() == ((Radnik) ado).getRadnikId()) {
                this.radnik = radnik;
            }
        }
    }

    /**
     * Metoda koja vraca pronadjenog radnika iz baze
     *
     * @return radnik iz baze
     */
    public Radnik getRadnik() {
        return this.radnik;
    }

}
