package de.thorstendiekhof.kurs.entwurfsmuster.kommando.iman;

import java.util.ArrayList;
import java.util.List;

public class Spielfigur {
    private List<Aktion> aktionen = new ArrayList<Aktion>();

    public void setAktionen(Aktion aktion) {
        this.aktionen.add(aktion);
    }

    public void aktionAusfuehren() {
        aktionen.forEach(Aktion::ausfuehren);
    }
}
