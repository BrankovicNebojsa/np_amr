package com.amr.server.so.radnik;

import com.amr.common.domain.Radnik;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Metoda za prijavljivanje na aplikaciju
 *
 * @author Nebojsa Brankovic
 */
public class LogIn extends AbstractSystemOperation {

    /**
     * da li postoji korisnik
     */
    private boolean status;

    /**
     * Neparametrizovani konstuktor
     */
    public LogIn() {
    }

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

    /**
     * Metoda koja vraca da li postoji radnik sa tim kredencijalima
     *
     * @return da li postoji takav radnik
     */
    public boolean getStatus() {
        return this.status;
    }

}
