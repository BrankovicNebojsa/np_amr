package com.amr.server.so.musterija;

import com.amr.common.domain.Musterija;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Sistemska operacija za vracanje musterije
 *
 * @author Nebojsa Brankovic
 */
public class GetMusterija extends AbstractSystemOperation {

    /**
     * pronadjena musterije iz baze
     */
    private Musterija musterija;

    /**
     * Neparametrizovani konstuktor
     */
    public GetMusterija() {
    }

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Musterija)) {
            throw new Exception("Objekat nije instanca klase Musterija!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        List<Musterija> musterije = repository.getAll((Musterija) ado);
        for (Musterija musterija : musterije) {
            if (musterija.getMusterijaId() == ((Musterija) ado).getMusterijaId()) {
                this.musterija = musterija;
            }
        }
    }

    /**
     * Metoda koja vraca musteriju iz baze
     *
     * @return musterija iz baze
     */
    public Musterija getMusterija() {
        return this.musterija;
    }

}
