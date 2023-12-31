package com.amr.server.so.automobil;

import com.amr.common.domain.Automobil;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Sistemska operacija za vracanje automobila
 *
 * @author Nebojsa Brankovic
 */
public class GetAutomobil extends AbstractSystemOperation {

    /**
     * automobil koji se vraca iz baze
     */
    private Automobil automobil;

    /**
     * Neparametrizovani konstuktor
     */
    public GetAutomobil() {
    }

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Automobil)) {
            throw new Exception("Objekat nije instanca klase Automobil!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        List<Automobil> automobili = repository.getAll((Automobil) ado);
        for (Automobil automobil : automobili) {
            if (automobil.getRegistracioniBroj().equals(((Automobil) ado).getRegistracioniBroj())) {
                this.automobil = automobil;
            }
        }
    }

    /**
     * Metoda koja vraca automobil koji je nadjen u bazi
     *
     * @return automobil iz baze
     */
    public Automobil getAutomobil() {
        return this.automobil;
    }

}
