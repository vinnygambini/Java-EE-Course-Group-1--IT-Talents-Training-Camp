package PokerGame;

import java.util.Random;

public class Dealer {

	private String name;
	private Card[] cards = new Card[52];
	int dealtCards = 0;
	
	Dealer()
	{
		for(int i = 0; i < cards.length; i++)
		{
			cards[i] = new Card(i);
		}
		
		shuffle(cards);
		//printCards();
	}
	
	private void shuffle(Card[] cards)
	{
		Random rgen = new Random();  // Random number generator			
		 
		for (int i=0; i<cards.length; i++) {
		    int randomPosition = rgen.nextInt(cards.length);
		    Card temp = cards[i];
		    cards[i] = cards[randomPosition];
		    cards[randomPosition] = temp;
		}
	}
	
	void dealCard(Player p)
	{
		if(dealtCards<52)
		{
			Card dealtCard = cards[cards.length-1-dealtCards];
			p.takeCard(dealtCard);
			dealtCards++;
		}
	}
	
	private void printCards()
	{
		for(int i = 0; i < cards.length; i++)
		{
			System.out.println(cards[i].print());
		}
	}
}
