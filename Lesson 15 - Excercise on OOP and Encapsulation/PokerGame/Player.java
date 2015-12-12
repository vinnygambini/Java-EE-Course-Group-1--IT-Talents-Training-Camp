package PokerGame;

public class Player {

	private static Dealer dealer;
	private String name;
	private Card[] hand = new Card[5];
	int receivedCards = 0;
	
	Player(String name, Dealer d)
	{
		this.name = name;
		dealer = d;
	}
	
	void askForCards(int numberOfCards)
	{
		for(int i = 0; i < numberOfCards; i++)
		{
			hand[hand.length-1-i] = null;
			receivedCards--;
		}
		for(int i = 0; i < numberOfCards; i++)
		{
			dealer.dealCard(this);
		}
	}
	
	void stayPat()
	{
		System.out.println( name + " is Pat!");
	}
	
	void printHand()
	{
		System.out.println(name + " has: ");
		for(int i = 0; i < hand.length; i++)
			System.out.println(hand[i].print());;
	}

	public void takeCard(Card dealtCard) 
	{	
		if(receivedCards > hand.length-1)
			System.out.println("No need, thank you!");
		else
		{
			hand[receivedCards] = dealtCard;
			receivedCards++;
		}
	}
}
