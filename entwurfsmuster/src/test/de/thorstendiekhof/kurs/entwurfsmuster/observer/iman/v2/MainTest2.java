package de.thorstendiekhof.kurs.entwurfsmuster.observer.iman.v2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest2 {

    @Test
    void testWhenDragonGetsHurtThenLebensbalkenDecreases() {
        // Arrange
        Drache observable = new Drache();
        Lebensbalken observer = new Lebensbalken();

        observable.addObserver(observer);

        // Act
        observable.benachrichtigeObserver(15);

        // Assert
        assertEquals(observer.getLebenspunkte(), 15);


    }

}