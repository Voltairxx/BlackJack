
public class Deck {
	private Card[] content;
	
	public Deck() {
		this.content = new Card[52];
		
		int nbCartes = 0;
		for (int j = 0; j <= 3; j++) {
			for (int i=1; i <= 13; i++) {
				this.content[nbCartes]= new Card (j,i);
				nbCartes++;
			}
		}
	}

	public Card getCard(int i) {
		return this.content[i];
	}
	
	public void swap(int i, int j) {
		Card c = this.getCard(i);
		this.content[i] = this.content[j];
		this.content[j] = c;
	}
	
	public void shuffle() {
		for(int i= 0; i < 50; i++) {
			this.swap(Blackjack.getRandomNb(52),
			Blackjack.getRandomNb(52));
		}
		
		
	}
	
	@Override
	public String toString() {
		String result = "";
		for(int i = 0; i < this.content.length; i++) {
			Card c = this.content[i];
			result += c.toString();
			result += ",";
		}
		return result;
	}
}