package zadaci_24_08_2015;

import java.util.*;

public class Zadatak_4 {
	/**
	 * (Shuffle ArrayList) Write the following method that shuffles an ArrayList
	 * of numbers: public static void shuffle(ArrayList<Number> list)
	 */
	// Metoda koja vrsi nasumicno premijestanje elemenata u listi brojeva
	// kao argument, metodi prosljedjujemo listu Number objekata
	public static void shuffle(ArrayList<Number> list) {
		// koristimo metodu shuffle za mijesanje elemenata u listi
		Collections.shuffle(list);
		// printamo izmijenjenu listu
		System.out.println(list);
	}

	public static void main(String[] args) {
		// kreiramo listu objekata apstraktne klase Number
		ArrayList<Number> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			// u listu dodajemo brojeve od 0 do 100
			list.add(i);
		}
		// Printamo listu, a zatim i listu nakon pozivanja metode shuffle
		System.out.println("List of numbers:\n" + list);
		System.out.println("\nList after shuffling:");
		shuffle(list);

	}
}
