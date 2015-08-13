package zadaci_12_08_2015;

import java.util.ArrayList;

public class Zadatak_4 {
	/*
	 * (Displaying the prime factors) Write a program that prompts the user to
	 * enter a positive integer and displays all its smallest factors in
	 * decreasing order. For example, if the integer is 120, the smallest
	 * factors are displayed as 5, 3, 2, 2, 2. Use the StackOfIntegers class to
	 * store the factors (e.g., 2, 2, 2, 3, 5) and retrieve and display them in
	 * reverse order.
	 */

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi broj
		System.out.println("Enter a positive integer: ");
		int num = input.nextInt();
		// kreiramo novu instancu klase StackOfIntegers
		StackOfIntegers stack = new StackOfIntegers(num);
		ArrayList<Integer> list = new ArrayList<>();// kreiramo novu ArrayList-u
		// nad objektom pozivamo metodu getFactors i dobijamo faktore
		// proslijedjenog broja
		// dobijene faktore spremamo u listu
		list = stack.getFactors();
		System.out.print("The smallest factors in decreasing order are: ");
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");// elemente liste ispisujemo u
												// opadajucem redoslijedu
		}
	}
}
