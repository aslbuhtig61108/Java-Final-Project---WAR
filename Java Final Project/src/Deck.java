import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {

	// INSTANCE FIELDS
	// Using our card class, we instantiate 52 unique cards as a list to create our playing deck 
	private List<Card> cards = new ArrayList<Card>();
	private List<String> suit = Arrays.asList("Club", "Diamond", "Hearts", "Spades");
	private List<Integer> value = Arrays.asList(2, 3, 4, 5, 6, 7, 8 , 9, 10, 11, 12, 13, 14);
	
	// CONSTRUCTORS
	// This constructor ensures that a new instantiated deck of 52 cards have been populated
	public void makeCardDeck() {
		for (String s : suit) {
			for (int v : value) {
				cards.add(new Card(s, v));
			}
		}
	}
	// I created this method to test the size of the new deck	
	public int sizeOf() {
		return cards.size();
	}
	
	// PUBLIC METHODS OF THE DECK CLASS	
	public void printDeck() {
	for (int i = 0; i < cards.size(); i++) {
		int currentCardValue = cards.get(i).getValue();
		String currentCardSuit = cards.get(i).getSuit();
		System.out.println("This is a " + currentCardValue + " of " + currentCardSuit);
		}
	}
	
	// This method shuffles the 52 cards created
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	// This method draws cards of the deck when splitting between two players
	public Card draw () {
		Card bottomCard = cards.get(cards.size()-1);
		return bottomCard;
	}
	
	// This method removes a card from the deck that is added to a players hand
	public void remove () {
		cards.remove(cards.get(cards.size()-1));
	}
	
}
	

	
	
	
	
	
		


	


