package com.amr.server.so.automobil;

import com.amr.common.domain.Automobil;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Sistemska operacija za vracanje automobila uz pomoc filtera
 *
 * @author Nebojsa Brankovic
 */
public class GetAutomobiliFilter extends AbstractSystemOperation {

    /**
     * automobili koji odgovaraju filteru
     */
    private List<Automobil> automobili;

    /**
     * Neparametrizovani konstuktor
     */
    public GetAutomobiliFilter() {
    }

    @Override
    protected void preconditions(Object ado) throws Exception {
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        this.automobili = repository.getAllFilter(new Automobil(), (String) ado);
    }

    /**
     * Metoda koja vraca sve automobile koje smo nasli u bazi za filter
     *
     * @return automobili iz baze
     */
    public List<Automobil> getAutomobili() {
        return this.automobili;
    }

}
