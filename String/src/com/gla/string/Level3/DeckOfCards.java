package com.gla.string.level3;

import java.util.*;

class DeckOfCards {

    public static String[] initializeDeck() {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10",
                "Jack","Queen","King","Ace"};

        String[] deck = new String[suits.length * ranks.length];
        int index = 0;

        for (String suit : suits)
            for (String rank : ranks)
                deck[index++] = rank + " of " + suit;

        return deck;
    }

    public static void shuffle(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int random = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] deck = initializeDeck();
        shuffle(deck);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        int cardsPerPlayer = deck.length / players;

        for (int i = 0; i < players; i++) {
            System.out.println("\nPlayer " + (i+1));
            for (int j = 0; j < cardsPerPlayer; j++)
                System.out.println(deck[i*cardsPerPlayer + j]);
        }
    }
}
