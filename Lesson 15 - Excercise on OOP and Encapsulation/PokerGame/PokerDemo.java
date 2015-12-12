package PokerGame;

public class PokerDemo {

	public static void main(String[] args) {
		
		//create a poker app
		//the game is tripple draw
		
		/*
			There are 5 Players. Each Player is dealt 5 cards.
			Each card has strength and suit.
			There is 1 Dealer. The dealer holds all 52 cards.
			The dealer deals each player a single card until all
			players are dealt 5 cards.
			Each player may choose to switch cards from his hand.
			Each player can switch up to 3 cards at a time.
			When switching, the player returns the number of cards and is dealt new cards.
			
			Write a demo that:
			1: creates 5 players and 1 Dealer ready to play.
			2: invokes a method "startGame" that:
				2.1 - commands the dealer to deal 5 cards to each player
				2.2 - prints all the cards the players have
				2.3 - commands each player to decide if he wants to switch cards
				2.4 - prints all the cards the players have
		 */
		

		Dealer dealer = new Dealer();
		Player p1 = new Player("P1", dealer);
		Player p2 = new Player("P2", dealer);
		Player p3 = new Player("P3", dealer);
		Player p4 = new Player("P4", dealer);
		Player p5 = new Player("P5", dealer);
		Player[] players = new Player[5];
		players[0] = p1;
		players[1] = p2;
		players[2] = p3;
		players[3] = p4;
		players[4] = p5;
		
		startGame(dealer, players);
	}

	private static void startGame(Dealer d, Player[] players ) 
	{
		//deals 5 cards to each player
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < players.length; j++)
			{
				d.dealCard(players[j]);
			}
		}
		
		for(int j = 0; j < players.length; j++)
		{
			players[j].printHand();
		}

		for(int j = 0; j < players.length; j++)
		{
			double rand = Math.random();
			if(rand<0.5)
				players[j].stayPat();
			else
				players[j].askForCards((int) (Math.random()*3+1));
		}
		
		for(int j = 0; j < players.length; j++)
		{
			players[j].printHand();
		}
	}
}
