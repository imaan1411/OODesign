package de.thorstendiekhof.kurs.entwurfsmuster.beobachter.iman;

import de.thorstendiekhof.kurs.entwurfsmuster.beobachter.iman.Lebensbalken;
import de.thorstendiekhof.kurs.entwurfsmuster.beobachter.iman.Ritter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //Observer-Pattern Test

    @Test
    void testWhenRitterGetsHurtThenLebensbalkenDecreases() {
        // Arrange
        Ritter observable = new Ritter();
        Lebensbalken observer = new Lebensbalken();
        observable.registriereBeobachter(observer);

        // Act
        observable.benachrichtigeBeobachter(5);

        // Assert
        assertEquals(observer.getLebenspunkte(), 5);

    }
}