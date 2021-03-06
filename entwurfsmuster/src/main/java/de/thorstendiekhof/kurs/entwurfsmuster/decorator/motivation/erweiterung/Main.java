package de.thorstendiekhof.kurs.entwurfsmuster.decorator.motivation.erweiterung;

public class Main {
    public static void main(String[] args) {
        Kaffeespezialitaet kaffeMitMilch = new KaffeeMitMilch();
        Kaffeespezialitaet kaffeMitMilchUndZucker = new KaffeeMitMilchUndZucker();
        Kaffeespezialitaet entkoffeinierterKaffeeMitMilchUndZucker = new EntkoffeinierterKaffeeMitMilchUndZucker();

        System.out.println(kaffeMitMilch.getBeschreibung() + " für " + kaffeMitMilch.getPreis() + "Cent");
        System.out.println(kaffeMitMilchUndZucker.getBeschreibung() + " für " + kaffeMitMilchUndZucker.getPreis() + "Cent");
        System.out.println(entkoffeinierterKaffeeMitMilchUndZucker.getBeschreibung() + " für " + entkoffeinierterKaffeeMitMilchUndZucker.getPreis() + "Cent");
    }
}