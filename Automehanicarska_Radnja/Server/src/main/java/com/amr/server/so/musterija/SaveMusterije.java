package com.amr.server.so.musterija;

import com.amr.common.domain.Musterija;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Sistemska operacija za cuvanje vise musterija
 *
 * @author Nebojsa Brankovic
 */
public class SaveMusterije extends AbstractSystemOperation {

    /**
     * Neparametrizovani konstuktor
     */
    public SaveMusterije() {
    }

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (ado == null) {
            throw new Exception("Null vrednost");
        }

        List<Musterija> musterije = (List<Musterija>) ado;
        List<Musterija> musterijeIzBaze = repository.getAll(new Musterija());

        for (Musterija musterija : musterije) {
            for (Musterija musterijaIzBaze : musterijeIzBaze) {
                if (musterija.getImeMusterije().equals(musterijaIzBaze.getImeMusterije())
                        && musterija.getPrezimeMusterije().equals(musterijaIzBaze.getPrezimeMusterije())
                        && musterija.getMailMusterije().equals(musterijaIzBaze.getMailMusterije())
                        && musterija.getTelefonMusterije().equals(musterijaIzBaze.getTelefonMusterije())) {
                    throw new Exception("Vec postoji musterija sa unetim vrednostima");
                }
            }
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        for (Musterija musterija : (List<Musterija>) ado) {
            repository.save(musterija);
        }
    }
}
