package com.amr.client.tableModels;

import com.amr.common.domain.Radnik;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Klasa koja predstavlja tabelu pretrage radnika
 *
 * @author Nebojsa Brankovic
 */
public class SearchRadnikTableModel extends AbstractTableModel {

    /**
     * lista radnika
     */
    private List<Radnik> radnici = new ArrayList<>();

    /**
     * konstuktor koji inicijalizuje radnike
     *
     * @param radnici lista radnika
     */
    public SearchRadnikTableModel(List<Radnik> radnici) {
        this.radnici = radnici;
    }

    @Override
    public int getRowCount() {
        return radnici.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return radnici.get(rowIndex).getImeRadnika();
            case 1:
                return radnici.get(rowIndex).getPrezimeRadnika();
            case 2:
                return radnici.get(rowIndex).getStrucnaSprema().toString();
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
                return "Strucna sprema";
            default:
                return "N/A";
        }
    }

    /**
     * Metoda koja vraca sve radnike iz tabele
     *
     * @return lista radnika
     */
    public List<Radnik> getRadnici() {
        return radnici;
    }
}
