package ch.css.iman.freitag;

import java.util.ArrayList;
import java.util.List;

public class Iman {

    public static void main(String[] args) {
        System.out.println("Es ist Mittagszeit.  Du bekommst langsam hunger!");
        Hunger hunger = new Hunger();
        System.out.println("Du überlegst dir was du essen willst.");
        System.out.println("Nun beginnst du zu kochen.");

        final List<Essen> essenZubereiten = new ArrayList<>();
        essenZubereiten.add(new Schaelen());
        essenZubereiten.add(new Braten());
        hunger.setZmittag(essenZubereiten);

        hunger.zittagZubereiten();
        System.out.println("Du isst das zubereitete essen");
    }
}
