package com.niantic.models;

import java.util.ArrayList;

public class Hand
{
    private final ArrayList<Card> cardsInHand = new ArrayList<>();

    public ArrayList<Card> getCards()
    {
        return cardsInHand;
    }

    public int getCardCount()
    {
        return cardsInHand.size();
    }

    public void dealTo(Card card)
    {
        cardsInHand.add(card);
    }
}
