import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Blackjack {
	
	private static Random rnd = ThreadLocalRandom.current();
	
	public static int getrandom(int max) {
		return rnd.nextInt(max);
	}
	
	private static Player player;
	private static Player banque;
	private static Deck pioche;
	
	public static void main(String[] args) {
		
		Scanner myScanner= new Scanner(System.in);
		String username;
		
		System.out.println("Bienvenue dans le BlackJack !");
		do {
			System.out.println("Entrez votre prenom :");
			username = myScanner.nextLine();
			if (username.length() == 0) {
				System.err.println("Nom incorect ! ");
			}
		}
		while (username.length() == 0);
		
		pioche = new Deck();
		pioche.shuffle();
		player = new Player(username, 1000);
		banque = new Player("banque", 10000000);
		player.addCard(pioche.draw());
		banque.addCard(pioche.draw());
		banque.addCard(pioche.draw());
		System.out.println("Bonjour " + username + " la partie va commencer !");
		System.out.println("Pour rappel vous commence avec une somme total de 1000 euros.");
		System.out.println("Combien voulez-vous misez ?");
		int Mise = Integer.valueOf(myScanner.nextLine());
		System.out.println("Votre mise est de : " + Mise);
		player.subMoney(Mise);
		System.out.println("Il vous reste : " + player.Money);
		System.out.println("Voici vos cartes : " + player.hand);	
		System.out.println("Voici les carte de la banque : " + banque.hand);
		String reponse;
		do {
			System.out.println("Voulez-vous piocher une carte ? oui = o  non = n");
			reponse = myScanner.nextLine();
			if (reponse.equals("o")){
				player.addCard(pioche.draw());
			}
			System.out.println("Voici vos cartes : " + player.hand);	
		}
		while (reponse.equals("o"));
		
		System.out.println(player.getValue());
		
		
	}

}
