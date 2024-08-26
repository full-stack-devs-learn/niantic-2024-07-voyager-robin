package com.niantic.application;

import com.niantic.models.Card;
import com.niantic.models.CenterOfTable;
import com.niantic.models.Deck;
import com.niantic.models.Player;
import com.niantic.ui.UserInterface;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


/* *********************** HOW TO PLAY ***********************

ELEMENTS is a card game in which players build their score by using the
elements against each other!

The deck consists of fifty cards in five types; Plant, Earth, Lightning, Water, and Fire. If the number of
cards isn't evenly divisible by the number of players, cards are discarded at random until they can be dealt evenly.

Each round, the first player will play a card onto the Stack, which is where elements compete.
The next player chooses the card they would like to play; if the element on the Stack is beaten,
the winning card is placed on top of it. If the card played cannot beat the card on top
of the Stack, it is discarded face-down. At the end of the round, the player whose card is on top of
the Stack takes all the cards that have been played that round and adds them to their score. The player with
the highest score when all cards have been played is the winner!

Cards win or lose to each other based on their element:

Plants draw nutrition from Earth, thus PLANT BEATS EARTH;

Earth grounds lightning, thus EARTH BEATS LIGHTNING;

Lightning is conducted through Water, thus LIGHTNING BEATS WATER;

Water quenches Fire, thus WATER BEATS FIRE;

Fire burns Plants, thus FIRE BEATS PLANT;


 **************************************************************/

public class CardGameApplication
{
    Deck deck = new Deck();
    ArrayList<Player> players = new ArrayList<>();
    int discardPile = 0;

    public void run() {
        addPlayers();
        dealCards();
        gameplayLoop();
    }

    private void dealCards() {
        System.out.println("The dealer shuffles the deck!");
        // Three shuffles for good luck!
        deck.shuffle();
        deck.shuffle();
        deck.shuffle();

        // Ensure that the deck starts with a number of cards
        // that can be equally divided amongst players.
        while (deck.getCardCount() % players.size() != 0) {
            deck.dealCard();
            discardPile++;
        }

        while (deck.getCardCount() > 0) {
            for (Player player : players) {
                if (deck.getCardCount() > 0) {
                    Card card = deck.dealCard();
                    player.dealTo(card);
                }
            }
        }
    }

    private void addPlayers() {
        Scanner scanner = new Scanner(System.in);
        int numberOfPlayers = 0;

        System.out.println("How many players are there?");
        numberOfPlayers = scanner.nextInt();

        for (int i = 1; i <= numberOfPlayers; i++) {
            System.out.println("What is the name of Player " + i + "?");
            players.add(new Player(scanner.next()));
        }
    }

    // Create function for looping through rounds and turns until the game ends:
    private void gameplayLoop() {
        // While there are still cards in play, loop through rounds of play:
        while (discardPile < 50) {
            Player roundWinner = null;

            // Clear the previous hand (if any) and start with a fresh tabletop:
            CenterOfTable center = new CenterOfTable();
            for (Player player : players) {
                Card cardPlayed = null;


                UserInterface.displayCenterOfTable(center);
                UserInterface.displayCurrentPlayersHand(player);

                while (cardPlayed == null) {
                    cardPlayed = playerTurn(player);
                }

                // If the stack is empty, the card played goes on top
                if (center.getCenterStack().isEmpty()) {
                    center.addCardToStack(cardPlayed);
                    roundWinner = player;
                }
                // If the card played beats the card on top of the stack,
                // place it on top
                else if (Objects.equals(center.getCenterStack().peek().getWeakAgainst().toLowerCase()
                        , cardPlayed.getType().toLowerCase())) {
                    center.addCardToStack(cardPlayed);
                    roundWinner = player;
                }
                // If the card played cannot beat the card on the stack, discard it.
                else {
                    center.addCardToDiscard();
                }
            }

            // After all players have played, give the winner an amount of points
            // equal to the amount of cards in the center, then discard those cards.
            System.out.println();
            System.out.println(roundWinner.getName() + " gains "
                    + (center.getCenterDiscard()
                    + center.getCenterStack().size()) + " points!");

            roundWinner.setScore(roundWinner.getScore()
                    + center.getCenterDiscard()
                    + center.getCenterStack().size());

            discardPile += center.getCenterDiscard()
                    + center.getCenterStack().size();

            System.out.println(discardPile + " cards have been played");
            System.out.println();
        }
        // After every card has been played, display the score:
        UserInterface.displayFinalScore(players);
    }

    private Card playerTurn(Player player) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println();
        System.out.println("What type of card would you like to play?");
        input = scanner.nextLine();
        for (Card card : player.getHand().getCards()) {
            if (Objects.equals(card.getType().toLowerCase(), input.toLowerCase())) {
                player.getHand().getCards().remove(card);
                return card;
            }
        }
        return null;
    }
}