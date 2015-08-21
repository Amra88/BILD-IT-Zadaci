package zadaci_18_08_2015;

import java.util.ArrayList;

public class Zadatak_2 {
	/*
	 * (Sort ArrayList) Write the following method that sorts an ArrayList of
	 * numbers: public static void sort(ArrayList<Integer> list). Write a test
	 * program that prompts the user to enter 5 numbers, stores them in an array
	 * list, and displays them in increasing order.
	 */
	// Metoda za sortiranje ArrayList-e cijelih brojeva
	public static void sort(ArrayList<Integer> list) {
		// koristeci metodu sort() iz Collections klase, listu sortiramo u
		// rastucem redoslijedu
		java.util.Collections.sort(list);
		// ispis sortirane liste
		System.out.println(list);
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter five integers: ");
		//kreiramo novu ArrayList-u
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			// korisnik unosi 5 cijelih brojeva
			// brojeve dodajemo u listu
			list.add(input.nextInt());
		}
		// printamo unesenu listu brojeva
		System.out.println("Your list: \n" + list);
		System.out.println("\nSorted list: ");
		// pozivajuci metodu sort, printamo i sortiranu listu
		sort(list);

	}
}
