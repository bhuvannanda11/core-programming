import java.util.Arrays;
import java.util.Random;

public class CardDeckGameQ10L3 {

    // Method to initialize the deck of cards with suits and ranks
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        
        return deck;
    }

    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        Random rand = new Random();
        
        // Shuffle the deck by swapping each card with a random card from the remaining deck
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + rand.nextInt(deck.length - i); // Get random index
            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        
        return deck;
    }

    // Method to distribute the deck of n cards to x number of players
    public static String[][] distributeCards(String[] deck, int numCards, int numPlayers) {
        if (numCards % numPlayers != 0) {
            System.out.println("The cards cannot be evenly distributed among the players.");
            return null;
        }

        String[][] playersCards = new String[numPlayers][numCards / numPlayers];
        
        int cardIndex = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < numCards / numPlayers; j++) {
                playersCards[i][j] = deck[cardIndex++];
            }
        }
        
        return playersCards;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.print("Player " + (i + 1) + " has the following cards: ");
            System.out.println(Arrays.toString(playersCards[i]));
        }
    }

    public static void main(String[] args) {
        int numCards = 52; // Total number of cards in a deck
        int numPlayers = 4; // Number of players
        
        // Initialize the deck
        String[] deck = initializeDeck();
        
        // Shuffle the deck
        deck = shuffleDeck(deck);
        
        // Distribute cards to players
        String[][] playersCards = distributeCards(deck, numCards, numPlayers);
        
        // If distribution was successful, print the players' cards
        if (playersCards != null) {
            printPlayersCards(playersCards);
        }
    }
}
