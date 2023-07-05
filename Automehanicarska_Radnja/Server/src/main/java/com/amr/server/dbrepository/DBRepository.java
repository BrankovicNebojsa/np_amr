package com.amr.server.dbrepository;

import com.amr.server.repository.Repository;

/**
 * Interfejs koji dopunjuje Repository interfejs
 *
 * @author Nebojsa Brankovic
 */
public interface DBRepository<T> extends Repository<T> {

    /**
     * Pravljenje konekcije sa bazom
     *
     * @throws Exception
     */
    default public void connect() throws Exception {
        DBConnectionFactory.getInstance().getConnection();
    }

    /**
     * Prekid konekcije sa bazom
     *
     * @throws Exception
     */
    default public void disconnect() throws Exception {
        DBConnectionFactory.getInstance().getConnection().close();
    }

    /**
     * Potvrda unetih promena u bazu
     *
     * @throws Exception
     */
    default public void commit() throws Exception {
        DBConnectionFactory.getInstance().getConnection().commit();
    }

    /**
     * Vraca unete izmene u bazu
     *
     * @throws Exception
     */
    default public void rollback() throws Exception {
        DBConnectionFactory.getInstance().getConnection().rollback();
    }
}
