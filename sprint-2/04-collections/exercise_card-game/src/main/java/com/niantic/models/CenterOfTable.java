package com.niantic.models;

import com.niantic.ui.ColorCodes;

import java.sql.SQLOutput;
import java.util.Stack;

// Create a class to hold the current cards in play:
public class CenterOfTable
{
    // Declare private variables to hold the Stack and Discard piles.
    private Stack<Card> centerStack;
    private int centerDiscard;

    // Declare constructor:
    public CenterOfTable()
    {
        centerStack   = new Stack<>();
        centerDiscard = 0;
    }

    // Declare getters:
    public Stack<Card> getCenterStack()
    {
        return centerStack;
    }

    public int getCenterDiscard()
    {
        return centerDiscard;
    }

    // Declare a method to add a card to the center Discard pile:
    public void addCardToDiscard()
    {
        this.centerDiscard++;
    }

    // Declare a method to add a card to the center Stack:
    public void addCardToStack(Card card)
    {
        centerStack.add(card);
    }
}
