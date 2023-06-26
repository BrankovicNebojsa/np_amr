package com.amr.server.so.servis;

import com.amr.common.domain.Servis;
import com.amr.server.so.AbstractSystemOperation;

/**
 *
 * @author Nebojsa Brankovic
 */
public class SaveServis extends AbstractSystemOperation {

    @Override
    protected void preconditions(Object ado) throws Exception {
        
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        repository.save((Servis) ado);
    }

}
