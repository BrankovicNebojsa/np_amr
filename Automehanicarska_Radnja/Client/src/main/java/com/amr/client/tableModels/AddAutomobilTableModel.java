package com.amr.client.tableModels;

import com.amr.client.controller.Controller;
import com.amr.common.domain.Automobil;
import com.amr.common.domain.Marka;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Model tabele za dodavanje automobila
 *
 * @author Nebojsa Brankovic
 */
public class AddAutomobilTableModel extends AbstractTableModel {

    /**
     * Lista automobila
     */
    private List<Automobil> automobili = new ArrayList<>();
    /**
     * Kontroler klijentski
     */
    private Controller c;

    /**
     * Konstuktor koji inicijalizuje kontroler
     */
    public AddAutomobilTableModel() {
        c = new Controller();
    }

    @Override
    public int getRowCount() {
        return automobili.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return automobili.get(rowIndex).getRegistracioniBroj();
            case 1:
                Marka m = new Marka();
                m.setMarkaId(automobili.get(rowIndex).getModel().getMarka().getMarkaId());
                return c.getNazivMarke(m);
            case 2:
                return automobili.get(rowIndex).getModel().getNazivModela();
            case 3:
                return automobili.get(rowIndex).getGodiste();
            case 4:
                return automobili.get(rowIndex).getMotor().getKubikaza();
            case 5:
                return automobili.get(rowIndex).getMotor().getKonjskaSnaga();
            case 6:
                return automobili.get(rowIndex).getMusterija().getImeMusterije() + " "
                        + automobili.get(rowIndex).getMusterija().getPrezimeMusterije();
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Registracioni broj";
            case 1:
                return "Marka";
            case 2:
                return "Model";
            case 3:
                return "Godiste";
            case 4:
                return "Kubikaza";
            case 5:
                return "Konjska snaga";
            case 6:
                return "Vlasnik";
            default:
                return "N/A";
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    /**
     * Metoda za vracanje svih automobila iz tabele
     *
     * @return lista automobila
     */
    public List<Automobil> getAutomobili() {
        return automobili;
    }

    /**
     * Metoda za dodavanje automobila u tabelu
     *
     * @param automobil automobil koji se dodaje u tabelu
     */
    public void addAutomobil(Automobil automobil) {
        automobili.add(automobil);
        fireTableDataChanged();
    }
}
