package com.amr.common.domain;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Nebojsa Brankovic
 */
public class Korisnik implements Serializable {

    private Radnik radnik;
    private Date datumPovezivanja;

    public Radnik getRadnik() {
        return radnik;
    }

    public void setRadnik(Radnik radnik) {
        this.radnik = radnik;
    }

    public Date getDatumPovezivanja() {
        return datumPovezivanja;
    }

    public void setDatumPovezivanja(Date datumPovezivanja) {
        this.datumPovezivanja = datumPovezivanja;
    }

}
