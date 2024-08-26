package com.niantic.models;

import com.niantic.ui.ColorCodes;

import java.awt.*;

public class Card {
    // Declare variables for the type of card, the type of card that
    // this card is beaten by, and the type of card that this card beats:
    private String type;
    private String weakAgainst;
    private String strongAgainst;

    // Create constructor with parameters:
    public Card(String type)
    {
        // The type of card determines its strengths and weaknesses:
        switch (type.toLowerCase())
        {
            case "plant" ->
            {
                this.type = "Plant";
                this.weakAgainst = "Fire";
                this.strongAgainst = "Earth";
            }
            case "earth" ->
            {
                this.type = "Earth";
                this.weakAgainst = "Plant";
                this.strongAgainst = "Lightning";
            }
            case "lightning" ->
            {
                this.type = "Lightning";
                this.weakAgainst = "Earth";
                this.strongAgainst = "Water";
            }
            case "water" ->
            {
                this.type = "Water";
                this.weakAgainst = "Lightning";
                this.strongAgainst = "Fire";
            }
            case "fire" ->
            {
                this.type = "Fire";
                this.weakAgainst = "Water";
                this.strongAgainst = "Plant";
            }
        }
    }

    // Create getters for card info:
    public String getType()
    {
        return type;
    }

    public String getWeakAgainst()
    {
        return weakAgainst;
    }

    public String getStrongAgainst()
    {
        return strongAgainst;
    }

    // Declare a method to generate an ASCII art card:
    public String displayCard()
    {
        String output = "";

        // CREATE ASCII DISPLAYS FOR EACH CARD:
        switch (this.type.toLowerCase()) {
            case "plant" ->
            {
                output = STR."""
            \{ColorCodes.BLACK}\{ColorCodes.GREEN_BACKGROUND}+~~~~~~~~~~~+\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.GREEN_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.GREEN_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.GREEN_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.GREEN_BACKGROUND}|   Plant   |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.GREEN_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.GREEN_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.GREEN_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.GREEN_BACKGROUND}+~~~~~~~~~~~+\{ColorCodes.RESET}
            """;
            }
            case "earth" ->
            {
                output = STR."""
            \{ColorCodes.BLACK}\{ColorCodes.ORANGE_BACKGROUND}+~~~~~~~~~~~+\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.ORANGE_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.ORANGE_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.ORANGE_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.ORANGE_BACKGROUND}|   Earth   |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.ORANGE_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.ORANGE_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.ORANGE_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.ORANGE_BACKGROUND}+~~~~~~~~~~~+\{ColorCodes.RESET}
            """;
            }
            case "lightning" ->
            {
                output = STR."""
            \{ColorCodes.BLACK}\{ColorCodes.YELLOW_BACKGROUND}+~~~~~~~~~~~+\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.YELLOW_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.YELLOW_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.YELLOW_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.YELLOW_BACKGROUND}| Lightning |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.YELLOW_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.YELLOW_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.YELLOW_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.YELLOW_BACKGROUND}+~~~~~~~~~~~+\{ColorCodes.RESET}
            """;

            }
            case "water" ->
            {
                output = STR."""
            \{ColorCodes.BLACK}\{ColorCodes.CYAN_BACKGROUND}+~~~~~~~~~~~+\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.CYAN_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.CYAN_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.CYAN_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.CYAN_BACKGROUND}|   Water   |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.CYAN_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.CYAN_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.CYAN_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.CYAN_BACKGROUND}+~~~~~~~~~~~+\{ColorCodes.RESET}
            """;
            }
            case "fire" ->
            {
                output =
                        STR."""
            \{ColorCodes.BLACK}\{ColorCodes.RED_BACKGROUND}+~~~~~~~~~~~+\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.RED_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.RED_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.RED_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.RED_BACKGROUND}|   Fire    |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.RED_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.RED_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.RED_BACKGROUND}|           |\{ColorCodes.RESET}
            \{ColorCodes.BLACK}\{ColorCodes.RED_BACKGROUND}+~~~~~~~~~~~+\{ColorCodes.RESET}
            """;
            }
        }
        return output;
    }
}
