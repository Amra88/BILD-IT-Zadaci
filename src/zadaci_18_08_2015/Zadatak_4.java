package zadaci_18_08_2015;

import java.util.ArrayList;

public class Zadatak_4 {
	/*
	 * (Remove duplicates) Write a method that removes the duplicate elements
	 * from an array list of integers using the following header: public static
	 * void removeDuplicate(ArrayList<Integer> list) Write a test program that
	 * prompts the user to enter 10 integers to a list and displays the distinct
	 * integers separated by exactly one space.
	 */
	// Metoda za uklanjanje duplikata iz ArrayListe integera
	// listu prosljedjujemo kao argument
	public static void removeDuplicate(ArrayList<Integer> list) {
		// koristeci nested for petlju, poredimo svaki broj iz liste sa ostalim
		// brojevima u listi
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					// ukoliko se neki broj ponovi, uklanjamo ga iz liste
					list.remove(j);
				}
			}
		}
		// nakon sto petlja zavrsi s radom, dobijamo listu bez duplih brojeva
		// printamo dobijenu listu
		for (Integer i : list) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi 10 brojeva
		System.out.println("Enter ten integers: ");
		// kreiramo novu ArrayList-u integera
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			// brojeve dodajemo u listu
			list.add(input.nextInt());
		}
		// printamo unesenu listu
		System.out.println("Your list: \n" + list);
		// pozivamo metodu removeDuplicate, prosljedjujemo joj listu i
		// ispisujemo rezultat, odnosno, listu bez duplikata
		System.out.println("\nList with removed duplicates: ");
		removeDuplicate(list);

	}
}
