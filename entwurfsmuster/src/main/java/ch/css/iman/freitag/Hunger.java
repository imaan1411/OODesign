package ch.css.iman.freitag;

import java.util.ArrayList;
import java.util.List;

public class Hunger {
    private List<Essen> zmittag = new ArrayList<>();

    public void setZmittag(List<Essen> zmittag) {
        this.zmittag = zmittag;
    }

    public void zittagZubereiten() {
        this.zmittag.forEach(Essen::kochen);
    }
}
