package de.thorstendiekhof.kurs.entwurfsmuster.template.method.iman;

public abstract class KaffeeSpezialitaet {

    public void kaffeeZubereiten() {
        System.out.println("Kaffeemaschine wärmt auf.");
        bohnenMahlen();
        wasserAufkochen();
        System.out.println("Hier Bitte, dein Kaffee!");
        System.out.println("Trester entsorgen.");
    }

    abstract void bohnenMahlen();

    void wasserAufkochen() {
        System.out.println("Es wird 100ml Wasser gekocht.");
    }




}
