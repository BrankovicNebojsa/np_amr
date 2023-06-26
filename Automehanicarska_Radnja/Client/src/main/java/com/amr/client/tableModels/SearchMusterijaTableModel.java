package com.amr.client.tableModels;

import com.amr.common.domain.Musterija;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Nebojsa Brankovic
 */
public class SearchMusterijaTableModel extends AbstractTableModel {

    private List<Musterija> musterije = new ArrayList<>();

    public SearchMusterijaTableModel(List<Musterija> musterije) {
        this.musterije = musterije;
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

    public List<Musterija> getMusterije() {
        return musterije;
    }
}
