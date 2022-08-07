
public class Card {

	// INSTANCE FIELDS
	private String suit; // a name representing the four card suits: clubs, diamonds, hearts, and spades (lowest to highest)
	private int value; // contains a value from 2-14 representing cards 2-Ace
	private String name; // a reference describing the value and name of a specific card
		
	// CONSTRUCTORS
	public Card() {}

	public Card(String suit, int value) {
		this.suit = suit;
		this.value = value;
	}
	
	public Card(String suit, int value, String name) {
		this.suit = suit;
		this.value = value;
		this.name = name;
		
	}
	
	// PUBLIC METHODS OF THE CARD CLASS
	// The describe() prints out a description of a card
	public void describe() {
		System.out.println("This is a " + value + " of :" + suit);
	}
	
	// GETTERS AND SETTERS
	public void setValue (int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}


