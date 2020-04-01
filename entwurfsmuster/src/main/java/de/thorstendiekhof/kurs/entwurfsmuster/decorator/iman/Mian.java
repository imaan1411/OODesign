package de.thorstendiekhof.kurs.entwurfsmuster.decorator.iman;

public class Mian {

    public static void main(String[] args) {
        KaffeeSpezialitaet kaffemitMilchUndZucker = new Zucker(new Milch(new Kaffee()));

        System.out.println(kaffemitMilchUndZucker.getDescription());
        System.out.println(kaffemitMilchUndZucker.getPrice());
    }
}
