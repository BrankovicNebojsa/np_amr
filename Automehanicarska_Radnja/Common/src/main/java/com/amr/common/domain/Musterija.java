package com.amr.common.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class Musterija implements GenericObject {

    private int musterijaId;
    private String imeMusterije;
    private String prezimeMusterije;
    private String mailMusterije;
    private String telefonMusterije;

    public Musterija() {
    }

    public Musterija(int musterijaId) {
        this.musterijaId = musterijaId;
    }

    public Musterija(String imeMusterije, String prezimeMusterije, String mailMusterije, String telefonMusterije) {
        this.imeMusterije = imeMusterije;
        this.prezimeMusterije = prezimeMusterije;
        this.mailMusterije = mailMusterije;
        this.telefonMusterije = telefonMusterije;
    }

    public Musterija(int musterijaId, String imeMusterije, String prezimeMusterije, String mailMusterije, String telefonMusterije) {
        this.musterijaId = musterijaId;
        this.imeMusterije = imeMusterije;
        this.prezimeMusterije = prezimeMusterije;
        this.mailMusterije = mailMusterije;
        this.telefonMusterije = telefonMusterije;
    }

    public int getMusterijaId() {
        return musterijaId;
    }

    public void setMusterijaId(int musterijaId) {
        this.musterijaId = musterijaId;
    }

    public String getImeMusterije() {
        return imeMusterije;
    }

    public void setImeMusterije(String imeMusterije) {
        this.imeMusterije = imeMusterije;
    }

    public String getPrezimeMusterije() {
        return prezimeMusterije;
    }

    public void setPrezimeMusterije(String prezimeMusterije) {
        this.prezimeMusterije = prezimeMusterije;
    }

    public String getMailMusterije() {
        return mailMusterije;
    }

    public void setMailMusterije(String mailMusterije) {
        this.mailMusterije = mailMusterije;
    }

    public String getTelefonMusterije() {
        return telefonMusterije;
    }

    public void setTelefonMusterije(String telefonMusterije) {
        this.telefonMusterije = telefonMusterije;
    }

    @Override
    public String getTableName() {
        return "musterija";
    }

    @Override
    public String getAlias() {
        return " mu ";
    }

    @Override
    public String getJoinValues() {
        return "";
    }

    @Override
    public String getPrimaryKey() {
        return "musterijaId";
    }

    @Override
    public String getSelectColumns() {
        return "musterijaId, imeMusterije, prezimeMusterije, mailMusterije, telefonMusterije";
    }

    @Override
    public String getSelectOrderBy() {
        return "imeMusterije";
    }

    @Override
    public String getSelectWhereCondition() {
        return "imeMusterije";
    }

    @Override
    public String getInsertColumns() {
        return "(imeMusterije, prezimeMusterije, mailMusterije, telefonMusterije)";
    }

    @Override
    public String getInsertValues() {
        return "('" + this.getImeMusterije() + "', '" + this.getPrezimeMusterije()
                + "', '" + this.getMailMusterije() + "', '" + this.getTelefonMusterije() + "')";
    }

    @Override
    public String getUpdateSet() {
        return "imeMusterije='" + this.getImeMusterije()
                + "', prezimeMusterije='" + this.getPrezimeMusterije()
                + "', mailMusterije='" + this.getMailMusterije().toString()
                + "', telefonMusterije='" + this.getTelefonMusterije() + "'";
    }

    @Override
    public String getUpdateWhereCondition() {
        return "musterijaId=" + this.getMusterijaId();
    }

    @Override
    public String getDeleteWhereCondition() {
        return "musterijaId=" + this.getMusterijaId();
    }

    @Override
    public List<GenericObject> getListOfSelectedRows(ResultSet rs) throws SQLException {
        List<GenericObject> objects = new ArrayList<>();
        while (rs.next()) {
            Musterija musterija = new Musterija();
            musterija.setMusterijaId(rs.getInt("musterijaId"));
            musterija.setImeMusterije(rs.getString("imeMusterije"));
            musterija.setPrezimeMusterije(rs.getString("prezimeMusterije"));
            musterija.setMailMusterije(rs.getString("mailMusterije"));
            musterija.setTelefonMusterije(rs.getString("telefonMusterije"));
            objects.add(musterija);
        }
        return objects;
    }

}
