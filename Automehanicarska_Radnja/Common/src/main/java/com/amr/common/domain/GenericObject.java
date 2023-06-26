package com.amr.common.domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author Nebojsa Brankovic
 */
public interface GenericObject extends Serializable {

    public String getTableName();

    public String getAlias();

    public String getJoinValues();

    public String getPrimaryKey();

    public String getSelectColumns();

    public String getSelectOrderBy();

    public String getSelectWhereCondition();

    public String getInsertColumns();

    public String getInsertValues();

    public String getUpdateSet();

    public String getUpdateWhereCondition();

    public String getDeleteWhereCondition();

    public List<GenericObject> getListOfSelectedRows(ResultSet rs) throws SQLException;
}
