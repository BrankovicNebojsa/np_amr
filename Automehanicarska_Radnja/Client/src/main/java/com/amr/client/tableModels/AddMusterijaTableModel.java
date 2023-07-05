package com.amr.client.tableModels;

import com.amr.common.domain.Musterija;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Klasa za tabelu za dodavanje musterije
 *
 * @author Nebojsa Brankovic
 */
public class AddMusterijaTableModel extends AbstractTableModel {

    /**
     * lista musterija
     */
    private List<Musterija> musterije = new ArrayList<>();

    /**
     * Neparametrizovani konstuktor
     */
    public AddMusterijaTableModel() {

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
        return false;
    }

    /**
     * Metoda za vracanje svih musterija iz tabele
     *
     * @return lista musterija u tabeli
     */
    public List<Musterija> getMusterije() {
        return musterije;
    }

    /**
     * Metoda koja dodaje musteriju u tabelu
     *
     * @param musterija musterija koju dodajemo u tabelu
     */
    public void addMusterija(Musterija musterija) {
        musterije.add(musterija);
        fireTableDataChanged();
    }
}
