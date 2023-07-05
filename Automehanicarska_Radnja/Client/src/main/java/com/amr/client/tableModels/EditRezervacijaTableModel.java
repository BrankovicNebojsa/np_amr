package com.amr.client.tableModels;

import com.amr.client.controller.Controller;
import com.amr.common.domain.Rezervacija;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Klasa za tabelu za izmenu rezervacija
 *
 * @author Nebojsa Brankovic
 */
public class EditRezervacijaTableModel extends AbstractTableModel {

    /**
     * lista rezervacija
     */
    private List<Rezervacija> rezervacije = new ArrayList<>();
    /**
     * Kontroler klijentski
     */
    private Controller c;

    /**
     * Konstuktor koji inicijalizuje rezervacije i kontroler
     *
     * @param rezervacije rezervacije koje se prikazuju u tabeli
     */
    public EditRezervacijaTableModel(List<Rezervacija> rezervacije) {
        this.rezervacije = rezervacije;
        c = new Controller();
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
        if (columnIndex == 1 || columnIndex == 2) {
            return true;
        }
        return false;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 1:
                Date pocetakServisa;
                try {
                    pocetakServisa = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse((String) aValue);
                    rezervacije.get(rowIndex).setPocetakServisa(pocetakServisa);
                    break;
                } catch (ParseException ex) {
                    System.out.println("Greska pri parsiranju u setValueAt u EditRezervacijaTableModel");
                }
            case 2:
                rezervacije.get(rowIndex).setTrajanjeServisa(Integer.parseInt((String) aValue));
                break;
        }
        c.updateRezervacija(rezervacije.get(rowIndex));
        fireTableDataChanged();
    }

    /**
     * Metoda koja vraca sve rezervacije iz tabele
     *
     * @return lista rezervacija
     */
    public List<Rezervacija> getRezervacije() {
        return rezervacije;
    }

}
