import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.plaf.synth.SynthOptionPaneUI;

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
		int Mise;
		do {
			try {
				System.out.println("Combien voulez-vous misez ?");
				Mise = Integer.valueOf(myScanner.nextLine());
			} catch (Exception e) {
				System.err.println("Vous avez entré autre chose qu'un entier !!!");
				Mise = 0;
			}
		}
		while(Mise <= 0);
		System.out.println("Votre mise est de : " + Mise + " euros.");
		player.subMoney(Mise);
		System.out.println("Il vous reste : " + player.Money + " euros.");
		System.out.println("Voici vos cartes : " + player.hand);	
		System.out.println("Voici les carte de la banque : " + banque.hand);
		String reponse;
		do {
			System.out.println("Votre main contient : " + player.getValue() + " points.");
			System.out.println("Voulez-vous piocher une carte ? oui = o  non = n");
			reponse = myScanner.nextLine();
			if (reponse.equals("o")){
				player.addCard(pioche.draw());
			}
			System.out.println("Voici vos cartes : " + player.hand);	
		}
		while (reponse.equals("o") && player.getValue() < 22);
		if (player.getValue() > 22) {
			System.out.println("Vous avez perdu !");
			System.out.println("Votre main était de : " + player.getValue() + " points.");
		}
		else if(player.getValue() > 21) {
			System.out.println("BlackJack !!!!!!");
		}
		else {
			System.out.println("Au tour de la banque.");
			System.out.println("Votre main contient : " + player.getValue() + " points.");
			do {
				System.out.println("La main de la banque contient : " + banque.getValue() + " points.");
				banque.addCard(pioche.draw());
				System.out.println("Voici les carte de la banque cartes : " + banque.hand);	
			}
			while (banque.getValue() < 17);
			System.out.println("La main de la banque contient : " + banque.getValue() + " points.");
		}
	}
}
	


