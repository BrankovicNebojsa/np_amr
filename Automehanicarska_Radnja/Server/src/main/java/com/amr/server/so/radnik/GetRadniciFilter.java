package com.amr.server.so.radnik;

import com.amr.common.domain.Radnik;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class GetRadniciFilter extends AbstractSystemOperation {

    private List<Radnik> radnici;

    @Override
    protected void preconditions(Object ado) throws Exception {
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        this.radnici = repository.getAllFilter(new Radnik(), (String) ado);
    }

    public List<Radnik> getRadnici() {
        return this.radnici;
    }
}
