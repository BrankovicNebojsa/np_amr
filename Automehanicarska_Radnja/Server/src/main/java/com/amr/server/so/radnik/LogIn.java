package com.amr.server.so.radnik;

import com.amr.common.domain.Radnik;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class LogIn extends AbstractSystemOperation {

    private boolean status;

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Radnik)) {
            throw new Exception("Objekat nije instanca klase Radnik!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        List<Radnik> radnici = repository.getAll((Radnik) ado);
        for (Radnik radnik : radnici) {
            if (radnik.getKorisnickoIme().equals(((Radnik) ado).getKorisnickoIme())
                    && radnik.getSifra().equals(((Radnik) ado).getSifra())) {
                this.status = true;
                return;
            }
        }
        this.status = false;
    }

    public boolean getStatus() {
        return this.status;
    }

}
