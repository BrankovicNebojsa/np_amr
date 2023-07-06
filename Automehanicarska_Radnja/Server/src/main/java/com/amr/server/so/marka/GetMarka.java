package com.amr.server.so.marka;

import com.amr.common.domain.Marka;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Sistemska operacija za vracanje marke
 *
 * @author Nebojsa Brankovic
 */
public class GetMarka extends AbstractSystemOperation {

    /**
     * Marka iz baze
     */
    private Marka marka;

    /**
     * Neparametrizovani konstuktor
     */
    public GetMarka() {
    }

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Marka)) {
            throw new Exception("Objekat nije instanca klase Marka!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        List<Marka> marke = repository.getAll((Marka) ado);
        for (Marka marka : marke) {
            if (marka.getNazivMarke().equals(((Marka) ado).getNazivMarke())) {
                this.marka = marka;
            }
        }
    }

    /**
     * Metoda koja vraca pronadjenu marku iz baze
     *
     * @return marka iz baze
     */
    public Marka getMarka() {
        return this.marka;
    }

}
