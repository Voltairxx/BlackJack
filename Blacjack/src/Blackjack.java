import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Blackjack {
	
	private static Random rnd = ThreadLocalRandom.current();
	
	public static int getrandom(int max) {
		return rnd.nextInt(max);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deck d = new Deck();
		d.shuffle();
		System.out.println(d);
		System.out.println(d.draw());
		System.out.println(d);
	}

}
