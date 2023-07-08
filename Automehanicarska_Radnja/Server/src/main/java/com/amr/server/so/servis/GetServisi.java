package com.amr.server.so.servis;

import com.amr.common.domain.Servis;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Sistemska operacija za vracanje servisa
 *
 * @author Nebojsa Brankovic
 */
public class GetServisi extends AbstractSystemOperation {

    /**
     * servis u bazi
     */
    private List<Servis> servisi = null;

    /**
     * Neparametrizovani konstuktor
     */
    public GetServisi() {
    }

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Servis)) {
            throw new Exception("Objekat nije instanca klase Servis!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        servisi = repository.getAll((Servis) ado);
    }

    /**
     * Metoda koja vraca servis iz baze
     *
     * @return servis iz baze
     */
    public List<Servis> getServisi() {
        return this.servisi;
    }
}
