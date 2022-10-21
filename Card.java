//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 


public abstract class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	private String suit;
	private int number;

  	//constructors
	public Card(){
		
	}
	
	public Card ( int num, String type) {
		
		number = num; 
		suit = type;
		
	}
	
	


	// modifiers
	

 

  	//accessors
	
	public String getSuit() {
		return suit; 
	}
	
	
	public int getNumber() {
		return number; 
	}
	



  	public abstract int getValue();

	public boolean equals(Object obj)
	{
		if (getNumber()==((Card) obj).getNumber()) {
			
			return true;
		}
		
		
		return false;
	}

  	//toString
	public String toString () {
	int var = getNumber(); 
	return FACES[var] + " of " + getSuit() + " | Value " + getValue();
	
	}
  	
 }
