package paquetedemo1;

import java.util.Scanner;




/*************************************************************************
 *  Compilation:  javac Deal.java
 *  Execution:    java Deal PLAYERS
 *
 *  Deal 5-card hands at random to the given number of players.
 *
 *  % java Deal 3
 *  4 of Spades
 *  9 of Spades
 *  Ace of Hearts
 *  9 of Clubs
 *  9 of Diamonds
 *
 *  6 of Spades
 *  10 of Hearts
 *  Queen of Hearts
 *  8 of Hearts
 *  King of Spades
 *
 *  7 of Hearts
 *  8 of Diamonds
 *  Queen of Spades
 *  3 of Spades
 *  4 of Diamonds
 *
 *************************************************************************/

public class Deal {
    public static void main(String[] args) {
        int CARDS_PER_PLAYER = 5;
        int more = 1;
        
        Scanner console = new Scanner(System.in);
        System.out.print("Number of players: ");
        int PLAYERS = console.nextInt();
        
        String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        // avoid hardwired constants
        int SUITS = suit.length;
        int RANKS = rank.length;
        int CARDS = SUITS * RANKS;

        if (CARDS_PER_PLAYER * PLAYERS > CARDS) throw new RuntimeException("Too many players");
        
        // initialize deck
        String[] deck = new String[CARDS];
        for (int i = 0; i < RANKS; i++) {
            for (int j = 0; j < SUITS; j++) {
                deck[SUITS*i + j] = rank[i] + " of " + suit[j];
            }
        }

        // shuffle
        for (int i = 0; i < CARDS; i++) {
            int r = i + (int) (Math.random() * (CARDS-i));
            String t = deck[r];
            deck[r] = deck[i];
            deck[i] = t;
        }

        // print player deck
        int j = 0;
        while (more == 1)
        {	
            	System.out.println(deck[j] + " Player ");
                Scanner answer = new Scanner(System.in);
                System.out.print("Other Card  (1 to Yes) (0 to No)");
                more = answer.nextInt();            	
                j++;
        }
           
        System.out.println();
        Scanner dealer = new Scanner(System.in);
        System.out.print("Number of cards for dealer");
        int moredealer = dealer.nextInt();  
        
        // print shuffled deck
        for (int i = 0; i <  moredealer; i++) {
            System.out.println(deck[i]);           
        }
    }

}