import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	// Scanner for player input
	Scanner kb = new Scanner(System.in);
	
	// Create, instantiate, and shuffle the new deck before play begins
	Deck deck = new Deck();
	deck.makeCardDeck();
	deck.shuffle();
	
	
	// Welcome players and create the players		
	System.out.print("Player One, please enter your name : ");
	String p1Name = kb.next();
	System.out.print("Player Two, please enter your name : \n\n");
	String p2Name = kb.next();

	input.nextln();
	
	Player player1 = new Player(p1Name);
	Player player2 = new Player(p2Name);
	
	
	// System.out.println("Please press enter to begin WAR with a shuffled deck\n\n"); 
	
	// 
	player1.welcomePlayer();
	player2.welcomePlayer();
	
	player1.makePlayersHand(deck);
	System.out.println("Player 1's Hand:");
	player1.describe();
	
	
	player2.makePlayersHand(deck);
	System.out.println("Player 2's Hand:");
	player2.describe();

	
	System.out.println("\n\nPlayer 1 turn");
	Card cardFlippedValueP1 = player1.flip();
	player1.sizeOfPlayerHand();
	System.out.println(cardFlippedValueP1.getValue() + " of " + cardFlippedValueP1.getSuit());
	
	System.out.println("\n\nPlayer 2 turn");
	Card cardFlippedValueP2 = player2.flip();
	player2.sizeOfPlayerHand();
	System.out.println(cardFlippedValueP2.getValue() + " of " + cardFlippedValueP2.getSuit());
	
	
		
	}
	
}

