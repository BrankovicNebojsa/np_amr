package com.amr.client.tableModels;

import com.amr.common.domain.Marka;
import javax.swing.table.AbstractTableModel;

/**
 * Klasa za tabelu za dodavanje marke
 *
 * @author Nebojsa Brankovic
 */
public class AddMarkaTableModel extends AbstractTableModel {

    /**
     * Objekat klase marka
     */
    private Marka marka;

    /**
     * Konstuktor koji inicijalizuje marku
     *
     * @param marka marka koja se dodaje
     */
    public AddMarkaTableModel(Marka marka) {
        this.marka = marka;
    }

    @Override
    public int getRowCount() {
        if (marka.getModeli() == null) {
            return 0;
        }
        return marka.getModeli().size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Marka";
            case 1:
                return "Model";
            default:
                return "Greska";
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return marka.getNazivMarke();
            case 1:
                return marka.getModeli().get(rowIndex).getNazivModela();
            default:
                return "Greska";
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    /**
     * Metoda koja postavlja marku u tabelu
     *
     * @param marka marka koja se postavlja
     */
    public void setMarka(Marka marka) {
        this.marka = marka;
        fireTableDataChanged();
    }
}
