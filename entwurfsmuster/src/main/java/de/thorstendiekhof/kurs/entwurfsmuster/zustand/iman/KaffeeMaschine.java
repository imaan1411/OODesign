package de.thorstendiekhof.kurs.entwurfsmuster.zustand.iman;

public class KaffeeMaschine {
    // Zustaende
    private static String WARTEN = "Warten";
    private static String KAFFEE_ZUBEREITEN = "KaffeeZubereiten";
    private static String ESPRESSO_ZUBEREITEN = "EspressoZubereiten";
    private static String KEINE_BOHNEN = "KeineBohnen";
    private static String KEIN_WASSER = "KeinWasser";


    Zustand aktuellerZustand;

}
