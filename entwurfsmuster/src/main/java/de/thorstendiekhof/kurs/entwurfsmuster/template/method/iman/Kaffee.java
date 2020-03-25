package de.thorstendiekhof.kurs.entwurfsmuster.template.method.iman;

public class Kaffee extends KaffeeSpezialitaet {

    @Override
    void bohnenMahlen() {
        System.out.println("Es werden 5g Bohnen gemahlen.");
    }

    @Override
    void wasserAufkochen() {
        System.out.println("Es wird 200ml Wasser gekocht.");
    }
}
