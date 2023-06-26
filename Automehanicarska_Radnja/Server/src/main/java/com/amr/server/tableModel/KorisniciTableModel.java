package com.amr.server.tableModel;

import com.amr.common.domain.Korisnik;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Nebojsa Brankovic
 */
public class KorisniciTableModel extends AbstractTableModel {

    private final List<Korisnik> korisnici;

    public KorisniciTableModel() {
        korisnici = new ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return korisnici.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Korisnik";
            case 1:
                return "Vreme povezivanja";
            default:
                return "Greska";
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return korisnici.get(rowIndex).getRadnik().getImeRadnika() + " "
                        + korisnici.get(rowIndex).getRadnik().getPrezimeRadnika();
            case 1:
                String datum = new SimpleDateFormat("HH:mm:ss yyyy-MM-dd").format(korisnici.get(rowIndex).getDatumPovezivanja());
                return datum;
            default:
                return "Greska u getValueAt";
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public void addUser(Korisnik user) {
        korisnici.add(user);
        fireTableDataChanged();
    }

    public void removeUser(Korisnik user) {
        for (Korisnik korisnik : korisnici) {
            if (korisnik.getRadnik().getImeRadnika().equals(user.getRadnik().getImeRadnika())
                    && korisnik.getRadnik().getPrezimeRadnika().equals(user.getRadnik().getPrezimeRadnika())
                    && korisnik.getRadnik().getKorisnickoIme().equals(user.getRadnik().getKorisnickoIme())
                    && korisnik.getRadnik().getSifra().equals(user.getRadnik().getSifra())
                    && korisnik.getRadnik().getRadnikId() == user.getRadnik().getRadnikId()) {
                korisnici.remove(korisnik);
                break;
            }
        }
        fireTableDataChanged();
    }

}
