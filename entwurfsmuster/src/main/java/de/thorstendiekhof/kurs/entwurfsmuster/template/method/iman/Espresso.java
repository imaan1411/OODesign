package de.thorstendiekhof.kurs.entwurfsmuster.template.method.iman;

public class Espresso extends KaffeeSpezialitaet {

    @Override
    void bohnenMahlen() {
        System.out.println("Es werden 3g Bohnen gemahlen.");
    }
}
