package com.amr.server.so.model;

import com.amr.common.domain.Model;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Sistemska operacija koja vraca modele za konkretnu marku
 *
 * @author Nebojsa Brankovic
 */
public class GetModeliFromNazivMarke2 extends AbstractSystemOperation {

    /**
     * Lista modele marke
     */
    private List<Model> modeli;

    /**
     * Neparametrizovani konstuktor
     */
    public GetModeliFromNazivMarke2() {
    }

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Model)) {
            throw new Exception("Objekat nije instanca klase Model!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        this.modeli = repository.getAllFilter((Model) ado, ((Model) ado).getMarka().getNazivMarke());
    }

    /**
     * Metoda koja vraca sve modele jedne marke
     *
     * @return lista modela marke
     */
    public List<Model> getModeli() {
        return this.modeli;
    }
}
