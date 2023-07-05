package com.amr.server.so.marka;

import com.amr.common.domain.Marka;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Sistemska operacija koja vraca naziv marke za id marke
 *
 * @author Nebojsa Brankovic
 */
public class GetNazivMarke extends AbstractSystemOperation {

    /**
     * Odgovarajuci naziv marke u bazi
     */
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
            if (marka.getMarkaId() == ((Marka) ado).getMarkaId()) {
                this.nazivMarke = marka.getNazivMarke();
            }
        }
    }

    /**
     * Metoda koja vraca naziv marke
     *
     * @return naziv marke
     */
    public String getNazivMarke() {
        return this.nazivMarke;
    }
}
