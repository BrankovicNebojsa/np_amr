package com.amr.server.so.model;

import com.amr.common.domain.Model;
import com.amr.server.so.AbstractSystemOperation;
import java.util.ArrayList;
import java.util.List;

/**
 * Sistemska operacija koja vraca modele za konkretnu marku
 *
 * @author Nebojsa Brankovic
 */
public class GetModeliFromNazivMarke extends AbstractSystemOperation {

    /**
     * Lista modela neke marke
     */
    private List<Model> modeli;

    /**
     * Neparametrizovani konstuktor
     */
    public GetModeliFromNazivMarke() {
    }

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Model)) {
            throw new Exception("Objekat nije instanca klase Model!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        List<Model> modeli1 = repository.getAll((Model) ado);
        this.modeli = new ArrayList<>();
        for (Model model : modeli1) {
            if (model.getMarka().getNazivMarke().equals(((Model) ado).getMarka().getNazivMarke())) {
                this.modeli.add(model);
            }
        }
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
