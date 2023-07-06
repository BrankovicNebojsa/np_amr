package com.amr.server.dbrepository;

import com.amr.server.repository.Repository;

/**
 * Interfejs koji dopunjuje Repository interfejs
 *
 * @author Nebojsa Brankovic
 * @param <T> opsti domenski objekat
 */
public interface DBRepository<T> extends Repository<T> {

    /**
     * Pravljenje konekcije sa bazom
     *
     * @throws Exception ukoliko dodje do izuzetka pri povezivanja na bazu baca
     * gresku
     */
    default public void connect() throws Exception {
        DBConnectionFactory.getInstance().getConnection();
    }

    /**
     * Prekid konekcije sa bazom
     *
     * @throws Exception ukoliko dodje do izuzetka pri skidanja veze na bazu
     * baca gresku
     */
    default public void disconnect() throws Exception {
        DBConnectionFactory.getInstance().getConnection().close();
    }

    /**
     * Potvrda unetih promena u bazu
     *
     * @throws Exception ukoliko dodje do izuzetka pri pamcenju podataka u bazi
     * baca gresku
     */
    default public void commit() throws Exception {
        DBConnectionFactory.getInstance().getConnection().commit();
    }

    /**
     * Vraca unete izmene u bazu
     *
     * @throws Exception ukoliko dodje do izuzetka pri vracanju prethodnog
     * stanja u bazi baca gresku
     */
    default public void rollback() throws Exception {
        DBConnectionFactory.getInstance().getConnection().rollback();
    }
}
