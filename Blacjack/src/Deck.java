import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> content = new ArrayList<Card>();
	public Deck() {
		for (int t = 0; t>=0 && t<4; t++) {
			for (int g = 1; g>=0 && g<=13; g++) {
				content.add(new Card(t,g));
			}
		}
	}
	
	public Card getCard(int i) {
		return content.get(i);  
	}
	
	@Override
	public String toString() {
		String result = "";
		for (int i = 0;i < content.size(); i++) {
			Card c = content.get(i);
			result += c.toString();
			result += ",";
		}
		return result;	
	}
	
	public void swap(int i, int j) {
		Card c = this.getCard(i);
		content.set(i,content.get(j));
		content.set(j, c);	
	}
	
	public void shuffle() {
		for (int i =0; i<50; i++) {
			this.swap(Blackjack.getrandom(52), Blackjack.getrandom(52));
		}
	}
	
	public Card draw() {
		if (content.size() == 0) {
			return null;
		}
		else {
			Card c = content.get(0);
			content.remove(0);
			return c;
		}
	}
}


