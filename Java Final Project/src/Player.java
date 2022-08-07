import java.util.ArrayList;
import java.util.List;

public class Player {

	// INSTANCE FIELDS
	private String name;
	private int score;
	private List<Card> playerHand;
	
	// CONSTRUCTORS
	public Player () {}
	
	// This constructor creates a player for the first time
	public Player (String name, int score) {
		this.name = name;
		this.score = 0; // score is set to 0 
	}
	
	// PUBLIC METHODS OF THE PLAYER CLASS
	// This method uses the parameter from the player constructor
	// and greets the player to a game of WAR
	public void welcomePlayer() {
		System.out.println("Welcome to a WAR of SHUFFLED CARDS, " + this.name + "!!!\n");
	}
	
	// This method creates a player's hands consisting of 26 cards from a shuffled deck of 52 cards
	public void makePlayersHand(Deck deck) {
		List<Card> playerHand = new ArrayList<Card>();
		for (int i = 0; i < 26; i++) {
			Card card = deck.draw();
			playerHand.add(card);
			deck.remove();
		}
		this.playerHand = playerHand;
	}
	
	// I created this method to confirm the size of player's hand for testing purposes
	// such when a card is flipped is the card removed from the player's hand 
	public void sizeOfPlayerHand() {
		System.out.println(this.playerHand.size());
	}
	
	// This method allows the players to see all 26 cards in their hands
	public void describe () {
		for (int i = 0; i < 26; i++) {
			int currentCardValueHand = this.playerHand.get(i).getValue();
			String currentCardSuitHand = this.playerHand.get(i).getSuit();
			System.out.println("This is a " + currentCardValueHand + " of " + currentCardSuitHand);
		}
	}

	// This flip method refers to the action of showing your card 
	// for comparison and removing the card from the player's hand
	public Card flip () {
		Card flippedCard = this.playerHand.get(this.playerHand.size()-1);
		this.playerHand.remove(this.playerHand.size()-1);
		return flippedCard;
	}
	
	public int incrementScore() {
		int newScore = 0;
		newScore = score + 1;
		
		return newScore;
	}
	
	// GETTERS AND SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}




	
	
	
	
	
}
