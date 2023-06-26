package com.amr.server.so.servis;

import com.amr.common.domain.Servis;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class GetServis extends AbstractSystemOperation {

    private Servis servis = null;

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Servis)) {
            throw new Exception("Objekat nije instanca klase Servis!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        List<Servis> servisi = repository.getAll((Servis) ado);
        for (Servis servis : servisi) {
            if (servis.getAutomobil().getRegistracioniBroj().equals(((Servis) ado).getAutomobil().getRegistracioniBroj())) {
                this.servis = servis;
            }
        }
    }

    public Servis getServis() {
        return this.servis;
    }
}
