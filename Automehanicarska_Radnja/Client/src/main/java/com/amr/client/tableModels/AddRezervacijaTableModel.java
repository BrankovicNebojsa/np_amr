package com.amr.client.tableModels;

import com.amr.common.domain.Rezervacija;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Klasa za tabelu za dodavanje rezervacije
 *
 * @author Nebojsa Brankovic
 */
public class AddRezervacijaTableModel extends AbstractTableModel {

    /**
     * lista rezervacija
     */
    private List<Rezervacija> rezervacije = new ArrayList<>();

    /**
     * Neparametrizovani konstuktor
     */
    public AddRezervacijaTableModel() {
    }

    @Override
    public int getRowCount() {
        return rezervacije.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return rezervacije.get(rowIndex).getAutomobil().getRegistracioniBroj();
            case 1:
                String pocetakServisa = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(rezervacije.get(rowIndex).getPocetakServisa());
                return pocetakServisa;
            case 2:
                return rezervacije.get(rowIndex).getTrajanjeServisa();
            case 3:
                return rezervacije.get(rowIndex).getAutomobil().getMusterija().getImeMusterije() + " "
                        + rezervacije.get(rowIndex).getAutomobil().getMusterija().getPrezimeMusterije();
            case 4:
                return rezervacije.get(rowIndex).getRadnik().getImeRadnika() + " "
                        + rezervacije.get(rowIndex).getRadnik().getPrezimeRadnika();
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
                return "Pocetak servisa";
            case 2:
                return "Trajanje servisa (min)";
            case 3:
                return "Vlasnik";
            case 4:
                return "Radnik";
            default:
                return "N/A";
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    /**
     * Metoda koja vraca sve rezervacije iz tabele
     *
     * @return lista rezervacija
     */
    public List<Rezervacija> getRezervacije() {
        return rezervacije;
    }

    /**
     * Metoda koja dodaje rezervaciju u tabelu
     *
     * @param rezervacija rezervacija koja se dodaje u tabelu
     */
    public void addRezervacija(Rezervacija rezervacija) {
        rezervacije.add(rezervacija);
        fireTableDataChanged();
    }
}
