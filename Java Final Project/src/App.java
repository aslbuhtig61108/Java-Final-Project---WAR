import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	// I received an resource leak error on my scanner
	// I remember in Week 6 meeting the discussion of a try-catch option
	try (// Scanner for player input
	Scanner kb = new Scanner(System.in)) {
		int scoreP1 = 0; // score for player1 to capture from a player's incrementScore() LINE65
		int scoreP2 = 0; // score for player1 to capture from a player's incrementScore() LINE67
		
		// Create, instantiate, and shuffle the new deck before play begins
		Deck deck = new Deck();
		deck.makeCardDeck();
		deck.shuffle();
		
		// Welcome players and create the players		
		System.out.print("Player One, please enter your name : ");
		String p1Name = kb.next();
		System.out.print("Player Two, please enter your name : ");
		String p2Name = kb.next();

		// The players created using my Player class
		Player player1 = new Player(p1Name, 0);
		Player player2 = new Player(p2Name, 0);
			
		// These methods welcome the players
		player1.welcomePlayer();
		player2.welcomePlayer();
		
		// This method creates and prints out player1's hand of 26 cards taken
		// from a shuffled deck of cards 
		player1.makePlayersHand(deck);
		System.out.println("Player 1's Hand:");
		player1.describe();

		// This method creates and prints out player2's hand of 26 cards taken
		// from a shuffled deck of cards
		player2.makePlayersHand(deck);
		System.out.println("Player 2's Hand:");
		player2.describe();

		// This is the WAR logic within the APP class
		// As instructed both players flip all 26 cards as seen 
		// in the for loop below
		for (int ctr = 0; ctr < 26; ctr++ ) {
			// This section of code is supposedly the WAR between PLAYERS ONE and TWO
			// I had trouble debugging so I used the SYS OUT to show each
			// iteration of each 26 flips between players
			System.out.println("\n\nPlayer 1 turn");
			Card cardFlippedValueP1 = player1.flip();
			player1.sizeOfPlayerHand();
			System.out.println(cardFlippedValueP1.getValue() + " of " + cardFlippedValueP1.getSuit());
		
			System.out.println("\n\nPlayer 2 turn");
			Card cardFlippedValueP2 = player2.flip();
			player2.sizeOfPlayerHand();
			System.out.println(cardFlippedValueP2.getValue() + " of " + cardFlippedValueP2.getSuit());
		
			// This is the scoring method
			// For each iteration, the highest value card wins and adds 1 point to the player's score. 
			// This is where I encountered a problem and unable to solve the scoring problem
			// I believe there is a counter issue making it cumulatively difficult to 
			// add the score from each iteration
			if (cardFlippedValueP1.getValue() > cardFlippedValueP2.getValue()) {
				scoreP1 = player1.incrementScore();
			} else {
				scoreP2 =player2.incrementScore();
			}
		}
		
		// These two lines sysout the final scores of both Players 1 and 2
		System.out.println("\n\n" + player1.getName() + "'s score : " + scoreP1);
		System.out.println(player2.getName() + "'s score : " + scoreP2);
	}
	}
	
}

