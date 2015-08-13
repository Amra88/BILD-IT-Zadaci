package zadaci_12_08_2015;

import java.util.ArrayList;

public class Zadatak_5 {
	/*
	 * (Displaying the prime numbers) Write a program that displays all the
	 * prime numbers less than 120 in decreasing order. Use the StackOfIntegers
	 * class to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and
	 * display them in reverse order.
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi broj
		System.out.println("Enter a positive integer: ");
		int n = input.nextInt();
		// kreiramo novu instancu klase StackOfIntegers
		StackOfIntegers stack = new StackOfIntegers(n);
		// kreiramo novu array listu
		ArrayList<Integer> primeList = new ArrayList<>();
		// nad objektom pozivamo metodu getPrimes i dobijamo proste brojeve od 1
		// do proslijedjenog broja
		// dobijene proste brojeve spremamo u listu
		primeList = stack.getPrimes();
		System.out.print("Prime numbers in reverse order: ");
		for (int i = primeList.size() - 1; i > 1; i--) {
			System.out.print(primeList.get(i) + " ");// brojeve iz liste
														// ispisujemo u obrnutom
														// redoslijedu
		}
	}

}
