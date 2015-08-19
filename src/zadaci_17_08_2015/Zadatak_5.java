package zadaci_17_08_2015;

import java.util.*;

public class Zadatak_5 {
	/*
	 * (Shuffle ArrayList) Write the following method that shuffles the elements
	 * in an ArrayList of integers. public static void
	 * shuffle(ArrayList<Integer> list)
	 */
	// metoda koja vrsi "mijesanje" elemenata u listi
	// metodi prosljedjujemo ArrayListu Integera kao argument
	public static void shuffle(ArrayList<Integer> list) {
		// pozivajuci metodu shuffle() iz Collections klase, nasumicno
		// premjestamo elemente u listi, te printamo listu
		Collections.shuffle(list);
		System.out.print(list);

	}

	public static void main(String[] args) {
		// kreiramo novu ArrayList-u
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i <= 20; i++) {
			// u listu dodajemo brojeve od 0 do 20
			list.add(i);
		}
		// printamo listu
		System.out.println("List:\n\n" + list);
		System.out.println("\nShuffling list...\n\nShuffled list:\n");
		// pozivamo metodu shuffle i printamo listu sa izmijesanim elementima
		shuffle(list);
	}
}
