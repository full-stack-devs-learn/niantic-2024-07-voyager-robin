package com.niantic.models;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Card implements Comparable<Card>
{
    private String suit;
    private String faceValue;

    public Card(String suit, String faceValue)
    {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public String getSuit()
    {
        return suit;
    }

    public String getFaceValue()
    {
        return faceValue;
    }

    public int getPointValue()
    {
        return cardValues.get(faceValue);
    }

    public String getColor()
    {
        switch (suit.toLowerCase())
        {
            case "hearts":
            case "diamonds":
                return "Red";
            default:
                return "Black";
        }
    }

    // lookup map
    private static final Map<String, Integer> cardValues = new HashMap<>()
    {{
        put("A", 11);
        put("K", 10);
        put("Q", 10);
        put("J", 10);
        put("10", 10);
        put("9", 9);
        put("8", 8);
        put("7", 7);
        put("6", 6);
        put("5", 5);
        put("4", 4);
        put("3", 3);
        put("2", 2);
    }};

    @Override
    public int compareTo(Card o)
    {
        // First, compare by suit:
        if (this.suit.equalsIgnoreCase(o.suit))
        {
            // If the suit is the same, compare the point value:
            if (this.getPointValue() == o.getPointValue())
            {
                // Compare by face value if point value is equal:
                int thisValue = 0;
                int oValue    = 0;

                switch (this.faceValue.toLowerCase())
                {
                    case "10":
                        thisValue = 1;
                        break;
                    case "j":
                        thisValue = 2;
                        break;
                    case "q":
                        thisValue = 3;
                        break;
                    default:
                        thisValue = 4;
                        break;
                }
                switch (o.faceValue.toLowerCase())
                {
                    case "10":
                        oValue = 1;
                        break;
                    case "j":
                        oValue = 2;
                        break;
                    case "q":
                        oValue = 3;
                        break;
                    default:
                        oValue = 4;
                        break;
                }

                return (thisValue - oValue);
            }
            else
            {
                return (this.getPointValue() - o.getPointValue());
            }
        }
        else
        {
            int thisPriority = 0;
            int oPriority    = 0;

            switch (this.suit.toLowerCase())
            {
                case "spades":
                    thisPriority = 1;
                    break;
                case "hearts":
                    thisPriority = 2;
                    break;
                case "diamonds":
                    thisPriority = 3;
                    break;
                default:
                    thisPriority = 4;
                    break;
            }
            switch (o.suit.toLowerCase())
            {
                case "spades":
                    oPriority = 1;
                    break;
                case "hearts":
                    oPriority = 2;
                    break;
                case "diamonds":
                    oPriority = 3;
                    break;
                default:
                    oPriority = 4;
                    break;
            }

            return (thisPriority - oPriority);
        }

    }
}
