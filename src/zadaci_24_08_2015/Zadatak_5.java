package zadaci_24_08_2015;

import java.util.*;

public class Zadatak_5 {
	/**
	 * (Sort ArrayList) Write the following method that sorts an ArrayList of
	 * numbers. public static void sort(ArrayList<Number> list)
	 */
	// Metoda za sortiranje liste Number objekata
	public static void sort(ArrayList<Number> list) {
		for (int i = 0; i < list.size() - 1; i++) {

			Number min = list.get(i);// minimalni broj
			int minIndex = i;// indeks min broja

			for (int j = i + 1; j < list.size(); j++) {
				// trazimo najmanji broj u listi, kao i njegov indeks
				// uporedjujemo broj sa preostalim brojevima u listi
				if (min.doubleValue() > list.get(j).doubleValue()) {

					min = list.get(j);
					minIndex = j;
				}
			}

			// ukoliko naidjemo na broj koji je manji od minimalnog, mijenjamo
			// im mjesta
			if (minIndex != i) {
				list.set(minIndex, list.get(i));
				list.set(i, min);
			}
		}
		// printamo sortiranu listu brojeva
		System.out.println(list);

	}

	public static void main(String[] args) {
		// kreiramo listu Number objekata
		ArrayList<Number> list = new ArrayList<>();
		// u listu dodajemo brojeve razlicitog tipa
		list.add(99.9);
		list.add(65.3);
		list.add(65);
		list.add(12);
		list.add(12.1);
		// printamo kreiranu listu, a zatim i listu nakon pozivanja metode sort
		System.out.println("List of numbers:\n" + list);
		System.out.println("\nSorted list:");
		sort(list);
	}
}
