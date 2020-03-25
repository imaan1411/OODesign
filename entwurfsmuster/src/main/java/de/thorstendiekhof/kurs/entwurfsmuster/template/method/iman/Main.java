package de.thorstendiekhof.kurs.entwurfsmuster.template.method.iman;

public class Main {

    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        espresso.kaffeeZubereiten();

        Kaffee kaffee = new Kaffee();
        kaffee.kaffeeZubereiten();
    }
}
