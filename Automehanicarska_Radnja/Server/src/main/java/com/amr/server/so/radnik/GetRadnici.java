package com.amr.server.so.radnik;

import com.amr.common.domain.Radnik;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Sistemska operacija za vracanja svih radnika
 *
 * @author Nebojsa Brankovic
 */
public class GetRadnici extends AbstractSystemOperation {

    /**
     * Lista svih radnika
     */
    private List<Radnik> radnici;

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Radnik)) {
            throw new Exception("Objekat nije instanca klase Radnik!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        this.radnici = repository.getAll((Radnik) ado);
    }

    /**
     * Metoda koja vraca radnike iz baze
     *
     * @return radnici iz baze
     */
    public List<Radnik> getRadnici() {
        return this.radnici;
    }
}
