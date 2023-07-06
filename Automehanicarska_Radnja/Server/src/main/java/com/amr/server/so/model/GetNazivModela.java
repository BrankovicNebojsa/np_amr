package com.amr.server.so.model;

import com.amr.common.domain.Model;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Sistemska operacija koja vraca naziv modele za primarni kljuc modela
 *
 * @author Nebojsa Brankovic
 */
public class GetNazivModela extends AbstractSystemOperation {

    /**
     * Naziv modela za primarni kljuc
     */
    private String nazivModela;

    /**
     * Neparametrizovani konstuktor
     */
    public GetNazivModela() {
    }

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Model)) {
            throw new Exception("Objekat nije instanca klase Model!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        List<Model> modeli = repository.getAll((Model) ado);
        for (Model model : modeli) {
            if (model.getModelId() == ((Model) ado).getModelId()) {
                this.nazivModela = model.getNazivModela();
            }
        }
    }

    /**
     * Metoda koja vraca proandjeni naziv modela
     *
     * @return proandjeni naziv modela
     */
    public String getNazivModela() {
        return this.nazivModela;
    }
}
