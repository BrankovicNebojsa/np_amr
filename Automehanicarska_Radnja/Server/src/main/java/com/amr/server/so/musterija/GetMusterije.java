package com.amr.server.so.musterija;

import com.amr.common.domain.Musterija;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Sistemska operacija koja vraca sve musterije iz baze
 *
 * @author Nebojsa Brankovic
 */
public class GetMusterije extends AbstractSystemOperation {

    /**
     * Lista musteriju u bazi
     */
    private List<Musterija> musterije;

    /**
     * Neparametrizovani konstuktor
     */
    public GetMusterije() {
    }

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Musterija)) {
            throw new Exception("Objekat nije instanca klase Musterija!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        this.musterije = repository.getAll((Musterija) ado);
    }

    /**
     * Metoda koja vraca sve musterije iz baze
     *
     * @return musterije iz baze
     */
    public List<Musterija> getMusterije() {
        return this.musterije;
    }
}
