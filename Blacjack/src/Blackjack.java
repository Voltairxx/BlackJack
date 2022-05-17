import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Blackjack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deck d = new Deck();
		d.shuffle();
		System.out.println(d);
		
		
	}
	
		private static Random rnd = ThreadLocalRandom.current();
		public static int getRandomNb(int max) {
			return rnd.nextInt(max);
	
		
		//System.out.println(d.getCard(15));
	}

}
