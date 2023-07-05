package com.amr.server.so.model;

import com.amr.common.domain.Model;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Sistemska operacija koja vraca model
 *
 * @author Nebojsa Brankovic
 */
public class GetModel extends AbstractSystemOperation {

    /**
     * Model koji vracamo iz baze
     */
    private Model model;

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
            if (model.getNazivModela().equals(((Model) ado).getNazivModela())) {
                this.model = model;
            }
        }
    }

    /**
     * Metoda koja vraca pronadjeni model
     *
     * @return pronadjeni model iz baze
     */
    public Model getModel() {
        return model;
    }

}
