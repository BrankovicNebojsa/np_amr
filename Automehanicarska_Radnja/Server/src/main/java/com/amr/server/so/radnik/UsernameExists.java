package com.amr.server.so.radnik;

import com.amr.common.domain.Radnik;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Sistemska operacija za proveru postojanja korisnickog imena u bazi
 *
 * @author Nebojsa Brankovic
 */
public class UsernameExists extends AbstractSystemOperation {

    /**
     * da li postoji korisnicko ime u bazi
     */
    private boolean status;

    /**
     * Neparametrizovani konstuktor
     */
    public UsernameExists() {
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
            if (radnik.getKorisnickoIme().equals(((Radnik) ado).getKorisnickoIme())) {
                this.status = true;
                return;
            }
        }
        this.status = false;
    }

    /**
     * Metoda koja vraca da li postoji korisnicko ime u bazi
     *
     * @return da li postoji korisnicko ime u bazi
     */
    public boolean getStatus() {
        return this.status;
    }
}
