package com.amr.server.so.automobil;

import com.amr.common.domain.Automobil;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Klasa za proveru postojanja automobila
 *
 * @author Nebojsa Brankovic
 */
public class AutomobilExists extends AbstractSystemOperation {

    /**
     * da li postoji automobil
     */
    private boolean status;

    /**
     * Neparametrizovani konstuktor
     */
    public AutomobilExists() {
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
                this.status = true;
                return;
            }
        }
        this.status = false;
    }

    /**
     * Metoda koja postavlja status postojanja automobila u bazi
     *
     * @return status postojanja automobila u bazi
     */
    public boolean getStatus() {
        return status;
    }

}
