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
		return 0;
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
