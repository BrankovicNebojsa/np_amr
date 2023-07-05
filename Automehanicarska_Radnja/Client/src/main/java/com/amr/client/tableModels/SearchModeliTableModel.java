package com.amr.client.tableModels;

import com.amr.common.domain.Model;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Klasa za tabelu za pregled svih modela
 *
 * @author Nebojsa Brankovic
 */
public class SearchModeliTableModel extends AbstractTableModel {

    /**
     * lista modela
     */
    private List<Model> modeli;

    /**
     * Konstuktor koji inicilizuje modele kroz parametar
     *
     * @param modeli modeli koji se unose u tabelu
     */
    public SearchModeliTableModel(List<Model> modeli) {
        this.modeli = modeli;
    }

    @Override
    public int getRowCount() {
        return modeli.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return modeli.get(rowIndex).getMarka().getNazivMarke();
            case 1:
                return modeli.get(rowIndex).getNazivModela();
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Marka";
            case 1:
                return "Model";
            default:
                return "N/A";
        }
    }

    /**
     * Metoda koja vraca sve modele iz tabele
     *
     * @return lista modela
     */
    public List<Model> getModeli() {
        return modeli;
    }

    /**
     * Metoda koja postavlja modele
     *
     * @param modeli lista modela
     */
    public void setModeli(List<Model> modeli) {
        this.modeli = modeli;
        fireTableDataChanged();
    }
}
