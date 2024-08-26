package com.niantic.ui;

import com.niantic.models.Card;
import com.niantic.models.CenterOfTable;
import com.niantic.models.Player;
import com.niantic.models.Deck;

import java.util.ArrayList;

public class UserInterface
{
    public static void displayAllPlayersCards(ArrayList<Player> players)
    {
        System.out.println("All Players");
        System.out.println("-".repeat(30));
        for (Player player : players)
        {
            System.out.println(player.getName() + ": ");
            for (Card card : player.getHand().getCards())
            {
                System.out.println("  " + card.getType() + " ");
            }
            System.out.println();
        }
    }

    // Create method for displaying the play area:
    public static void displayCenterOfTable(CenterOfTable center)
    {
        String discard;
        if (!center.getCenterStack().isEmpty())
        {
            System.out.println(center.getCenterStack().peek().displayCard());
        }
        discard = STR."""
            \{ColorCodes.BLACK}\{ColorCodes.GRAY_BACKGROUND}+~~~~~~~~~~~~+\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.GRAY_BACKGROUND}|  Discard:  |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.GRAY_BACKGROUND}|    \{center.getCenterDiscard()}       |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.GRAY_BACKGROUND}+~~~~~~~~~~~~+\{ColorCodes.RESET}
            """;
        System.out.println(discard);
    }

    // Create method for displaying individual players' hands:
    public static void displayCurrentPlayersHand(Player player)
    {
        // Determine how many cards of each type the player has:
        int plantCount = 0;
        int earthCount = 0;
        int lightCount = 0;
        int waterCount = 0;
        int fireCount  = 0;

        for (Card card : player.getHand().getCards())
        {
            String type = card.getType();
            switch (type.toLowerCase())
            {
                case "plant" ->
                {
                    plantCount++;
                }
                case "earth" ->
                {
                   earthCount++;
                }
                case "lightning" ->
                {
                    lightCount++;
                }
                case "water" ->
                {
                    waterCount++;
                }
                case "fire" ->
                {
                    fireCount++;
                }
            }
        }

        // Display the contents of the current hand:
        System.out.println(player.getName() + "'s hand contains:");

        System.out.println();
        if (plantCount > 0)
        {
            System.out.print(plantCount + " Plant cards; ");
        }
        if (earthCount > 0)
        {
            System.out.print(earthCount + " Earth cards; ");
        }
        if (lightCount > 0)
        {
            System.out.print(lightCount + " Lightning cards; ");
        }
        if (waterCount > 0)
        {
            System.out.print(waterCount + " Water cards; ");
        }
        if (fireCount > 0)
        {
            System.out.print(fireCount + " Fire cards; ");
        }
        System.out.println();
        System.out.println();
    }

    // Create method for displaying final score:
    public static void displayFinalScore(ArrayList<Player> players)
    {
        System.out.println("~~~~~ FINAL SCORES ~~~~~");
        for (Player player : players)
        {
            System.out.println(player.getName() + "'s score is: " + player.getScore());
            System.out.println();
        }
    }
}
