/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amr.server.so;

import com.amr.server.dbrepository.DBRepository;
import com.amr.server.dbrepository.concrete.GenericObjectDBRepository;

/**
 *
 * @author student2
 */
public abstract class AbstractSystemOperation {

    protected final DBRepository repository;

    public AbstractSystemOperation() {
        this.repository = new GenericObjectDBRepository();
    }

    public final void execute(Object ado) throws Exception {
        try {
            preconditions(ado);
            startTransaction();
            executeOperation(ado);
            commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            rollback();
            throw ex;
        } finally {
            disconnect();
        }
    }

    // Operation-specific method
    protected abstract void preconditions(Object ado) throws Exception;

    // Operation-specific method
    protected abstract void executeOperation(Object ado) throws Exception;

    private void startTransaction() throws Exception {
        repository.connect();
    }

    private void commit() throws Exception {
        repository.commit();
    }

    private void rollback() throws Exception {
        repository.rollback();
    }

    private void disconnect() throws Exception {
        repository.disconnect();
    }

}
