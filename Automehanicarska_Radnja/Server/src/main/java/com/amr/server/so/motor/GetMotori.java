package com.amr.server.so.motor;

import com.amr.common.domain.Motor;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Sistemska operacija za vracanje servisa
 *
 * @author Nebojsa Brankovic
 */
public class GetMotori extends AbstractSystemOperation {

    /**
     * servis u bazi
     */
    private List<Motor> motori;

    /**
     * Neparametrizovani konstuktor
     */
    public GetMotori() {
    }

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Motor)) {
            throw new Exception("Objekat nije instanca klase Motor!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        motori = repository.getAll((Motor) ado);
    }

    /**
     * Metoda koja vraca servis iz baze
     *
     * @return servis iz baze
     */
    public List<Motor> getMotori() {
        return this.motori;
    }
}
