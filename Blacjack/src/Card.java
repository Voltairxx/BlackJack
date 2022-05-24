public class Card {
	public char color;
	public int value;
	
	public Card(int color, int value) {
		this.value = value;
		if (color == 0) {this.color = 'H';}
		if (color == 1) {this.color = 'D';}
		if (color == 2) {this.color = 'S';}
		if (color == 3) {this.color = 'C';}
	}
	
	
	@Override
	public String toString() {
		return "" + this.color + this.value;
	}


}