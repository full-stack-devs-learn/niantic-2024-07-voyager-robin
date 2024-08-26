package com.niantic.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DeckTest
{
    @Test
            public void doesDeckHaveCorrectCards() {
        // arrange: Create a new deck of cards,
        // counters for each card type, and expected values for the deck:
        Deck testDeck   = new Deck();
        int plantActualCount = 0;
        int earthActualCount = 0;
        int lightActualCount = 0;
        int waterActualCount = 0;
        int fireActualCount  = 0;
        int totalActualCount = 0;
        int totalExpected    = 50;
        int typeExpected     = 10;
        int finalExpected    = 0;
        int finalActual      = 0;

        // act: draw each card in the deck, counting the
        // total amount of cards, the amount of each type,
        // and the final amount fo cards left in the deck:
        while (testDeck.getCardCount() > 0) {
            Card testCard = testDeck.dealCard();

            if (testCard.getType().equalsIgnoreCase("plant")) {
                plantActualCount++;
                totalActualCount++;
            }
            if (testCard.getType().equalsIgnoreCase("earth")) {
                earthActualCount++;
                totalActualCount++;
            }
            if (testCard.getType().equalsIgnoreCase("lightning")) {
                lightActualCount++;
                totalActualCount++;
            }
            if (testCard.getType().equalsIgnoreCase("water")) {
                waterActualCount++;
                totalActualCount++;
            }
            if (testCard.getType().equalsIgnoreCase("fire")) {
                fireActualCount++;
                totalActualCount++;
            }
        }
        finalActual = testDeck.getCardCount();

        // assert: ensure that the counts for each card type
        // and total number of cards match expected values:
        Assertions.assertEquals(totalExpected, totalActualCount,
                "The total amount of cards in the deck should be 60.");
        Assertions.assertEquals(typeExpected, plantActualCount,
                "There should be 12 Plant cards.");
        Assertions.assertEquals(typeExpected, earthActualCount,
                "There should be 12 Earth cards.");
        Assertions.assertEquals(typeExpected, lightActualCount,
                "There should be 12 Lightning cards.");
        Assertions.assertEquals(typeExpected, waterActualCount,
                "There should be 12 Water cards.");
        Assertions.assertEquals(typeExpected, fireActualCount,
                "There should be 12 Fire cards.");
        Assertions.assertEquals(finalExpected, finalActual,
                "There should be zero cards left in the deck.");
    }

}
