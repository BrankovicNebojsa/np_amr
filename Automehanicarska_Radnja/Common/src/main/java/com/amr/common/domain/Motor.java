package com.amr.common.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Klasa koja predstavlja motor automobila
 *
 * @author Nebojsa Brankovic
 */
public class Motor implements GenericObject {

    /**
     * primarni kljuc motora
     */
    private int motorId;
    /**
     * broj cilindara motora
     */
    private int brojCilindara;
    /**
     * kubikaza motora u kubnim metrima
     */
    private double kubikaza;
    /**
     * konjska snaga motora
     */
    private int konjskaSnaga;

    /**
     * Konstruktor bez parametra
     */
    public Motor() {
    }

    /**
     * Konstruktor sa vise ulaznih parametara
     *
     * @param brojCilindara Broj cilindara motora
     * @param kubikaza Kubikaza motora
     * @param konjskaSnaga Konjska snaga motora
     */
    public Motor(int brojCilindara, double kubikaza, int konjskaSnaga) {
        this.brojCilindara = brojCilindara;
        this.kubikaza = kubikaza;
        this.konjskaSnaga = konjskaSnaga;
    }

    /**
     * Konstruktor sa svim ulaznim parametara
     *
     * @param brojCilindara Broj cilindara motora
     * @param kubikaza Kubikaza motora
     * @param konjskaSnaga Konjska snaga motora
     * @param motorId Primarni kljuc motora
     */
    public Motor(int motorId, int brojCilindara, double kubikaza, int konjskaSnaga) {
        this.motorId = motorId;
        this.brojCilindara = brojCilindara;
        this.kubikaza = kubikaza;
        this.konjskaSnaga = konjskaSnaga;
    }

    /**
     * Metoda koja vraca primarni kljuc motora
     *
     * @return Primarni kljuc motora
     */
    public int getMotorId() {
        return motorId;
    }

    /**
     * Metoda koja postavlja primarni kljuc motora
     *
     * @param motorId Primarni kljuc motora
     * @throws IllegalArgumentException ukoliko je unet id manji od 0
     */
    public void setMotorId(int motorId) throws IllegalArgumentException {
        if (motorId < 0) {
            throw new IllegalArgumentException("Unet id manji od 0");
        }
        this.motorId = motorId;
    }

    /**
     * Metoda koja vraca broj cilindara motora
     *
     * @return Broj cilindara motora
     */
    public int getBrojCilindara() {
        return brojCilindara;
    }

    /**
     * Metoda koja postavlja broj cilindara motora
     *
     * @param brojCilindara Broj cilindara motora
     * @throws IllegalArgumentException ukoliko je unet broj cilindara manji od
     * 0
     */
    public void setBrojCilindara(int brojCilindara) throws IllegalArgumentException {
        if (brojCilindara < 0) {
            throw new IllegalArgumentException("Unet broj cilindara manji od 0");
        }
        this.brojCilindara = brojCilindara;
    }

    /**
     * Metoda koja vraca kubikazu motora
     *
     * @return Kubikaza motora
     */
    public double getKubikaza() {
        return kubikaza;
    }

    /**
     * Metoda koja postavlja kubikazu motora
     *
     * @param kubikaza Kubikaza motora
     * @throws IllegalArgumentException ukoliko je uneta kubikaza manja od 0
     */
    public void setKubikaza(double kubikaza) throws IllegalArgumentException {
        if (kubikaza < 0) {
            throw new IllegalArgumentException("Uneta kubikaza manja od 0");
        }
        this.kubikaza = kubikaza;
    }

    /**
     * Metoda koja vraca konjsku snagu motora
     *
     * @return Konjska snaga motora
     */
    public int getKonjskaSnaga() {
        return konjskaSnaga;
    }

    /**
     * Metoda koja postavlja konjsku snagu motora
     *
     * @param konjskaSnaga Konjska snaga motora
     * @throws IllegalArgumentException ukoliko je uneta konjska snaga manja od
     * 0
     */
    public void setKonjskaSnaga(int konjskaSnaga) throws IllegalArgumentException {
        if (konjskaSnaga < 0) {
            throw new IllegalArgumentException("Uneta konjska snaga manja od 0");
        }
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

    /**
     * Metoda equals poredi 2 objekta i vraca true ako su oba klase Motor i
     * imaju sve iste atribute
     *
     * @param obj objekat s kojim se poredi instanca ove klase
     * @return da li imaju iste atribute
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Motor other = (Motor) obj;
        if (this.brojCilindara != other.brojCilindara) {
            return false;
        }
        if (Double.doubleToLongBits(this.kubikaza) != Double.doubleToLongBits(other.kubikaza)) {
            return false;
        }
        return this.konjskaSnaga == other.konjskaSnaga;
    }

}
