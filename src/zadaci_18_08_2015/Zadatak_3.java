package zadaci_18_08_2015;

import java.util.ArrayList;

public class Zadatak_3 {
	/*
	 * (Sum ArrayList) Write the following method that returns the sum of all
	 * numbers in an ArrayList: public static double sum(ArrayList<Double> list)
	 * Write a test program that prompts the user to enter 5 numbers, stores
	 * them in an array list, and displays their sum.
	 */
	// Metoda koja vrsi sabiranje svih elemenata iz liste proslijedjene kao
	// argument
	public static double sum(ArrayList<Double> list) {
		double result = 0;// ukupna suma
		for (int i = 0; i < list.size(); i++) {
			// sabiramo sve elemente iz liste i rezultat spremamo u varijablu
			// result
			result += list.get(i);
		}
		return result;// metoda vraca sumu svih elemenata iz liste
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi 5 brojeva
		System.out.println("Enter five numbers: ");
		//kreiramo novu ArrayList-u
		ArrayList<Double> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			// brojeve dodajemo u listu
			list.add(input.nextDouble());
		}
		// printamo unesenu listu brojeva
		System.out.println("Your list: \n" + list);
		// pozivamo metodu sum, prosljedjujemo joj unesenu listu i ispisujemo
		// sumu elemenata
		System.out.printf("\nSum of all numbers in an ArrayList: %3.2f",
				sum(list));
	}
}
