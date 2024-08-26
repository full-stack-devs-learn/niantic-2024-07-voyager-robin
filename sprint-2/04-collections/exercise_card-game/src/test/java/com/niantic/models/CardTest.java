package com.niantic.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest
{
    @Test
    public void doCardsHaveCorrectStrengths_Weaknesses()
    {
        // arrange: Create a new card of each type:
        Card plantTest = new Card("plant");
        Card earthTest = new Card("earth");
        Card lightningTest = new Card("lightning");
        Card waterTest = new Card("water");
        Card fireTest = new Card("fire");

        // act/assert: ensure that each type of card
        // has the correct strengths and weaknesses:

        // Plant cards:
        Assertions.assertEquals("Fire", plantTest.getWeakAgainst(),
                "Plant cards should be weak against Fire cards!");
        Assertions.assertEquals("Earth", plantTest.getStrongAgainst(),
                "Plant cards should be strong against Earth cards!");

        // Earth cards:
        Assertions.assertEquals("Plant", earthTest.getWeakAgainst(),
                "Earth cards should be weak against Plant cards!");
        Assertions.assertEquals("Lightning", earthTest.getStrongAgainst(),
                "Earth cards should be strong against Lightning cards!");

        // Lightning cards:
        Assertions.assertEquals("Earth", lightningTest.getWeakAgainst(),
                "Lightning cards should be weak against Earth cards!");
        Assertions.assertEquals("Water", lightningTest.getStrongAgainst(),
                "Lightning cards should be strong against Water cards!");

        // Water cards:
        Assertions.assertEquals("Lightning", waterTest.getWeakAgainst(),
                "Water cards should be weak against Lightning cards!");
        Assertions.assertEquals("Fire", waterTest.getStrongAgainst(),
                "Water cards should be strong against Fire cards!");

        // Fire cards:
        Assertions.assertEquals("Water", fireTest.getWeakAgainst(),
                "Fire cards should be weak against Fire cards!");
        Assertions.assertEquals("Plant", fireTest.getStrongAgainst(),
                "Fire cards should be strong against Earth cards!");

    }

}