package com.amr.server.dbrepository.concrete;

import com.amr.common.domain.GenericObject;
import com.amr.server.dbrepository.DBConnectionFactory;
import com.amr.server.dbrepository.DBRepository;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Klasa koja je zaduzena za implementaciju manipulacije nad bazom podataka
 *
 * @author Nebojsa Brankovic
 */
public class GenericObjectDBRepository implements DBRepository<GenericObject> {

    /**
     * Prazan konstuktor
     */
    public GenericObjectDBRepository() {
    }

    @Override
    public List<GenericObject> getAllFilter(GenericObject ado, String filter) throws Exception {
        List<GenericObject> objects = new ArrayList<>();
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        String query = "SELECT * FROM " + ado.getTableName() + ado.getAlias() + ado.getJoinValues() + " WHERE "
                + ado.getSelectWhereCondition() + " LIKE '" + filter + "%' ORDER BY " + ado.getSelectOrderBy();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        objects = ado.getListOfSelectedRows(rs);
        statement.close();
        return objects;
    }

    @Override
    public List<GenericObject> getAll(GenericObject ado) throws Exception {
        List<GenericObject> objects = new ArrayList<>();
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        String query = "SELECT * FROM " + ado.getTableName() + ado.getAlias() + ado.getJoinValues()
                + " ORDER BY " + ado.getSelectOrderBy();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        objects = ado.getListOfSelectedRows(rs);
        statement.close();
        return objects;
    }

    @Override
    public void save(GenericObject ado) throws Exception {
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        String query = "INSERT INTO " + ado.getTableName() + " " + ado.getInsertColumns()
                + " VALUES " + ado.getInsertValues();
        Statement statement = connection.createStatement();
        statement.execute(query);
        statement.close();
    }

    @Override
    public void update(GenericObject ado) throws Exception {
        Connection connection = DBConnectionFactory.getInstance().getConnection();
        String query = "UPDATE " + ado.getTableName() + " SET " + ado.getUpdateSet()
                + " WHERE " + ado.getUpdateWhereCondition();
        Statement statement = connection.createStatement();
        statement.execute(query);
        statement.close();
    }

    @Override
    public void delete(GenericObject ado) throws Exception {
        try {
            Connection connection = DBConnectionFactory.getInstance().getConnection();
            String query = "DELETE FROM " + ado.getTableName() + " WHERE " + ado.getDeleteWhereCondition();
            Statement statement = connection.createStatement();
            statement.execute(query);
            statement.close();
        } catch (Exception e) {
            throw e;
        }
    }

}
