package com.amr.server.repository;

import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public interface Repository<T> {

    List<T> getAllFilter(T param, String filter) throws Exception;

    List<T> getAll(T param) throws Exception;

    void save(T param) throws Exception;

    void update(T param) throws Exception;

    void delete(T param) throws Exception;

}
