package com.amr.server.so.model;

import com.amr.common.domain.Model;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Sistemska operacija koja vraca sve modele iz baze
 *
 * @author Nebojsa Brankovic
 */
public class GetModeli extends AbstractSystemOperation {

    /**
     * Svi modeli iz baze
     */
    private List<Model> modeli;

    /**
     * Neparametrizovani konstuktor
     */
    public GetModeli() {
    }

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Model)) {
            throw new Exception("Objekat nije instanca klase Model!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        modeli = repository.getAll((Model) ado);
    }

    /**
     * Metoda koja vraca pronadjene modele iz baze
     *
     * @return pronadjeni modeli iz baze
     */
    public List<Model> getModeli() {
        return this.modeli;
    }

}
