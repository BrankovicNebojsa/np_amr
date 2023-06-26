package com.amr.server.so.marka;

import com.amr.common.domain.Marka;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class GetNazivMarke extends AbstractSystemOperation {

    private String nazivMarke;

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
            if (marka.getMarkaId()== ((Marka) ado).getMarkaId()) {
                this.nazivMarke = marka.getNazivMarke();
            }
        }
    }

    public String getNazivMarke() {
        return this.nazivMarke;
    }
}
