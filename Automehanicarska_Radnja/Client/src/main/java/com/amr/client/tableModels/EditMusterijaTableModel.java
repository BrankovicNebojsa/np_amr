package com.amr.client.tableModels;

import com.amr.client.controller.Controller;
import com.amr.common.domain.Musterija;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Klasa za tabelu za izmenu musterija
 *
 * @author Nebojsa Brankovic
 */
public class EditMusterijaTableModel extends AbstractTableModel {

    /**
     * lista musterija
     */
    private List<Musterija> musterije = new ArrayList<>();
    /**
     * Klijentski kontroler
     */
    private Controller c;

    /**
     * Konstuktor koji inicijalizuje musterije i kontroler
     *
     * @param musterije musterije koje se prikazuju u tabeli
     */
    public EditMusterijaTableModel(List<Musterija> musterije) {
        this.musterije = musterije;
        c = new Controller();
    }

    @Override
    public int getRowCount() {
        return musterije.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return musterije.get(rowIndex).getImeMusterije();
            case 1:
                return musterije.get(rowIndex).getPrezimeMusterije();
            case 2:
                return musterije.get(rowIndex).getMailMusterije();
            case 3:
                return musterije.get(rowIndex).getTelefonMusterije();
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Ime";
            case 1:
                return "Prezime";
            case 2:
                return "Mail";
            case 3:
                return "Broj telefona";
            default:
                return "N/A";
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                musterije.get(rowIndex).setImeMusterije((String) aValue);
                break;
            case 1:
                musterije.get(rowIndex).setPrezimeMusterije((String) aValue);
                break;
            case 2:
                musterije.get(rowIndex).setMailMusterije((String) aValue);
                break;
            case 3:
                musterije.get(rowIndex).setTelefonMusterije((String) aValue);
                break;
        }
        c.updateMusterija(musterije.get(rowIndex));
        fireTableDataChanged();
    }

    /**
     * Metoda koja vraca sve musterije iz tabele
     *
     * @return lista musterija
     */
    public List<Musterija> getMusterije() {
        return musterije;
    }
}
