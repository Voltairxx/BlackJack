import java.util.ArrayList;

public class Player {
	public String Name;
	public int Money;
	public ArrayList<Card> hand = new ArrayList<Card>();
	
	public Player(String n, int m) {
		Name = n;
		Money = m;
	}
	
	public int getValue() {
		int points = 0;
		for(int i=0; i < this.hand.size(); i++) {
			Card c = this.hand.get(i);
			points += c.getPoints();
		}
		return points;
		
	}
	
	public void addCard(Card c) {
		hand.add(c);
	}
	
	public void addMoney(int m) {
		Money += m;
	}
	
	public void subMoney(int m) {
		Money -= m;
	}
}
