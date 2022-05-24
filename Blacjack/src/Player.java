import java.util.ArrayList;

public class Player {
	private String name;
	private int money;
	private ArrayList<Card> hand = new ArrayList<Card>();
	
	public Player(String n, int m) {
		name = n;
		money = m;
	}
	
	public int getValue() {
		return 0;
	}
	
	public void addCard(Card c) {
		hand.add(c);
	}
	
	public void addMoney(int m) {
		money += m;
	}
	
	public void subMoney(int m) {
		money -= m;
	}
}
