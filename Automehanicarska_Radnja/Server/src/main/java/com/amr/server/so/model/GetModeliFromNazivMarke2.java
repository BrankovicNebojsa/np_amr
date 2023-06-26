package com.amr.server.so.model;

import com.amr.common.domain.Model;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class GetModeliFromNazivMarke2 extends AbstractSystemOperation {

    private List<Model> modeli;

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

    public List<Model> getModeli() {
        return this.modeli;
    }
}
