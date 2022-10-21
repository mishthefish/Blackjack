//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;

public class Deck 
{
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

	private int topCardIndex;
	private ArrayList<Card> stackOfCards;

	public Deck ()
	{
		
		
		
		
		//initialize data - stackOfCards - topCardIndex
		
		topCardIndex = 0; 
		
		//THE ERROR IS IN THIS NESTED FOR LOOP. The ERROR shows "Multiple markers at this line Cannot instantiate the type Card Syntax error, insert ")" to complete" 
		for (int i=0;i<NUMSUITS;i++){
			for( int j=0; j<NUMFACES; j++) {
				stackOfCards.add(new Card(j,SUITS[i]));
			}
		}//loop through suits
			//loop through faces
				//add in a new card
		
	}

	//modifiers
   public void shuffle ()
	{
		//shuffle the deck
		//reset variables as needed
	}

   //accessors
	public int  size ()
	{
		return 0;
	}

	public int numCardsLeft()
	{
		return stackOfCards.size();
		
	}

	public Card nextCard()
	{
		return stackOfCards.get(topCardIndex--);
	}

	public String toString()
	{
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	} 
}
