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
	
	public int valeurCartes () {
		return this.value;
	}
	
	public int getPoints() {
		int result = this.value;
		if(this.value > 10) {
			result = 10;
		}
		return result;
	}
	
	
	@Override
	public String toString() {
		return "" + this.color + this.value;
	}


}