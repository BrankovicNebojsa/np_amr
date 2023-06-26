package com.amr.client.tableModels;

import com.amr.common.domain.Marka;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Nebojsa Brankovic
 */
public class AddMarkaTableModel extends AbstractTableModel {

    private Marka marka;

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

    public void setMarka(Marka marka) {
        this.marka = marka;
        fireTableDataChanged();
    }
}
