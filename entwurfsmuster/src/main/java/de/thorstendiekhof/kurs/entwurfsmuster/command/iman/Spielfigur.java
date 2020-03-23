package de.thorstendiekhof.kurs.entwurfsmuster.command.iman;

import java.util.ArrayList;
import java.util.List;

public class Spielfigur {
    private List<Aktion> aktionen = new ArrayList<Aktion>();

    public void addAktion(Aktion aktion) {
        this.aktionen.add(aktion);
    }

    public void aktionenAusfuehren() {
        aktionen.forEach(Aktion::ausfuehren);
    }
}
