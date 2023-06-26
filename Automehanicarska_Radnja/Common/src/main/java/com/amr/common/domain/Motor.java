package com.amr.common.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class Motor implements GenericObject {

    private int motorId;
    private int brojCilindara;
    private double kubikaza;
    private int konjskaSnaga;

    public Motor() {
    }

    public Motor(int brojCilindara, double kubikaza, int konjskaSnaga) {
        this.brojCilindara = brojCilindara;
        this.kubikaza = kubikaza;
        this.konjskaSnaga = konjskaSnaga;
    }

    public Motor(int motorId, int brojCilindara, double kubikaza, int konjskaSnaga) {
        this.motorId = motorId;
        this.brojCilindara = brojCilindara;
        this.kubikaza = kubikaza;
        this.konjskaSnaga = konjskaSnaga;
    }

    public int getMotorId() {
        return motorId;
    }

    public void setMotorId(int motorId) {
        this.motorId = motorId;
    }

    public int getBrojCilindara() {
        return brojCilindara;
    }

    public void setBrojCilindara(int brojCilindara) {
        this.brojCilindara = brojCilindara;
    }

    public double getKubikaza() {
        return kubikaza;
    }

    public void setKubikaza(double kubikaza) {
        this.kubikaza = kubikaza;
    }

    public int getKonjskaSnaga() {
        return konjskaSnaga;
    }

    public void setKonjskaSnaga(int konjskaSnaga) {
        this.konjskaSnaga = konjskaSnaga;
    }

    @Override
    public String getTableName() {
        return "motor";
    }

    @Override
    public String getAlias() {
        return " mot ";
    }

    @Override
    public String getJoinValues() {
        return "";
    }

    @Override
    public String getPrimaryKey() {
        return "motorId";
    }

    @Override
    public String getSelectColumns() {
        return "motorId, brojCilindara, kubikaza, konjskaSnaga";
    }

    @Override
    public String getSelectOrderBy() {
        return "konjskaSnaga";
    }

    @Override
    public String getSelectWhereCondition() {
        return "brojCilindara";
    }

    @Override
    public String getInsertColumns() {
        return "(brojCilindara, kubikaza, konjskaSnaga)";
    }

    @Override
    public String getInsertValues() {
        return "('" + this.getBrojCilindara() + "', '" + this.getKubikaza()
                + "', '" + this.getKonjskaSnaga() + "')";
    }

    @Override
    public String getUpdateSet() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getUpdateWhereCondition() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getDeleteWhereCondition() {
        return "motorId=" + this.getMotorId();
    }

    @Override
    public List<GenericObject> getListOfSelectedRows(ResultSet rs) throws SQLException {
        List<GenericObject> objects = new ArrayList<>();
        while (rs.next()) {
            Motor motor = new Motor();
            motor.setMotorId(rs.getInt("motorId"));
            motor.setBrojCilindara(rs.getInt("brojCilindara"));
            motor.setKubikaza(rs.getDouble("kubikaza"));
            motor.setKonjskaSnaga(rs.getInt("konjskaSnaga"));
            objects.add(motor);
        }
        return objects;
    }

}
