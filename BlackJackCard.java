//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class BlackJackCard extends Card
{
  	//constructors
	public BlackJackCard(int number, String suit)
	{
		super(number,suit); 
	}

	public BlackJackCard() {
		super();
	}
  	public int getValue()
  	{
  		//enables you to build the value for the game into the card
  		//this makes writing the whole program a little easier
  		if(getNumber() >= 10) {
  			return 10;
  		}
  		
  		return getNumber();
  		
  	}
  	
 }
 
