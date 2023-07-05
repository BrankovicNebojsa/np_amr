package com.amr.server.so.marka;

import com.amr.common.domain.Marka;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Sistemska operacija koja vraca sve marke
 *
 * @author Nebojsa Brankovic
 */
public class GetMarke extends AbstractSystemOperation {

    /**
     * sve marke iz baze
     */
    private List<Marka> marke;

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Marka)) {
            throw new Exception("Objekat nije instanca klase Marka!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        this.marke = repository.getAll((Marka) ado);
    }

    /**
     * Metoda koja vraca sve marke
     *
     * @return marke iz baze
     */
    public List<Marka> getMarke() {
        return this.marke;
    }

}
