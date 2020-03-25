package de.thorstendiekhof.kurs.entwurfsmuster.observer.iman;

import de.thorstendiekhof.kurs.entwurfsmuster.observer.iman.v1.Lebensbalken;
import de.thorstendiekhof.kurs.entwurfsmuster.observer.iman.v1.ManaBalken;
import de.thorstendiekhof.kurs.entwurfsmuster.observer.iman.v1.Ritter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    //Observer-Pattern Test

    @Test
    void testWhenRitterGetsHurtThenLebensbalkenDecreases() {
        // Arrange
        Ritter observable = new Ritter();
        Lebensbalken observer = new Lebensbalken();
        ManaBalken observer2 = new ManaBalken();
        observable.registriereBeobachter(observer);
        observable.registriereBeobachter(observer2);

        // Act
        observable.chriege();

        // Assert
        assertEquals(observer.getLebenspunkte(), 5);
        assertEquals(observer2.getLebenspunkte(), 5);

    }
    @Test
    void testWhenRitterGetsHurtThenLebensbalkenIsZero() {
        // Arrange
        Ritter observable = new Ritter();
        Lebensbalken observer = new Lebensbalken();
        ManaBalken observer2 = new ManaBalken();
        observable.registriereBeobachter(observer);
        observable.registriereBeobachter(observer2);

        // Act
        observable.chriege();
        observable.chriege();

        // Assert
        assertEquals(observer.getLebenspunkte(), 0);
        assertEquals(observer2.getLebenspunkte(), 0);

    }
}