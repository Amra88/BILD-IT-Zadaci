package zadaci_20_07_2015;

import java.util.*;

public class Zadatak_1 {

	/*
	 * Napisati sljedeæu metodu koja vraæa najveæu vrijednost u ArrayListu
	 * Integera. Metoda vraæa null ukoliko je lista null iil ukoliko lista
	 * sadrži 0 elemenata. public static Integer max(ArrayList<Integer> list)
	 */
	public static Integer max(ArrayList<Integer> list) {
		int max; // varijabla koja ce sadrzati najvecu vrijednost
		if (list.isEmpty() || list == null) {
			// ako lista sadrzi 0 elemenata ili je null, vracamo null
			return null;
		} else {
			// u suprotnom, sortiramo listu
			Collections.sort(list);
			// iz sortirane liste biramo posljednji element(najveci)
			max = list.get(list.size() - 1);
		}
		// vracamo rezultat
		return max;
	}

	public static void main(String[] args) {
		// kreiramo listu integera i dodajemo neke vrijednosti
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(8);
		list.add(23);
		list.add(1234);
		list.add(98);
		list.add(54);
		// pozivanje metode max i ispis rezultata
		System.out.println("The largest number in the list is " + max(list)
				+ ".");
	}
}
