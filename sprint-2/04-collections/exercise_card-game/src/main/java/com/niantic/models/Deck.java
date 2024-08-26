package com.niantic.models;

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
    private ArrayList<Card> cardsInDeck;

    // There is only one format for a deck in this game,
    // thus we only need a parameterless constructor:
    public Deck()
    {
        // Add ten cards of each type to the deck:
        cardsInDeck    = new ArrayList<>();
        String[] types = {"Plant", "Earth", "Lightning", "Water",  "Fire"};

        for(String type : types)
        {
            for(int i = 1; i <= 10; i++)
            {
                Card card = new Card(type);
                cardsInDeck.add(card);
            }
        }
    }

    // Create getter for deck size:
    public int getCardCount()
    {
        return cardsInDeck.size();
    }

    // Create methods for shuffling and dealing from deck:
    public Card dealCard()
    {
        return cardsInDeck.removeFirst();
    }

    public void shuffle()
    {
        Collections.shuffle(cardsInDeck);
    }
}
