package com.niantic.models;

public class Player
{
    // Declare private variables:
    private String name;
    private Hand hand;
    private int score;

    // Create constructor:
    public Player(String name)
    {
        this.name = name;
        hand = new Hand();
        this.score = 0;
    }

    // Create getters and setters:
    public String getName()
    {
        return name;
    }
    public int getScore()
    {
        return score;
    }
    public Hand getHand()
    {
        return hand;
    }
    public void setScore(int score)
    {
        this.score = score;
    }

    // Create method for dealing cards into this
    // player's hand:
    public void dealTo(Card card)
    {
        hand.dealTo(card);
    }


}
