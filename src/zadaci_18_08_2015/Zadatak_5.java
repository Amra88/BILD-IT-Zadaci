package zadaci_18_08_2015;

import java.util.ArrayList;

public class Zadatak_5 {
	/*
	 * (Combine two lists) Write a method that returns the union of two array
	 * lists of integers using the following header: public static
	 * ArrayList<Integer> union( ArrayList<Integer> list1, ArrayList<Integer>
	 * list2). For example, the union of two array lists {2, 3, 1, 5} and {3, 4,
	 * 6} is {2, 3, 1, 5, 3, 4, 6}. Write a test program that prompts the user
	 * to enter two lists, each with five integers, and displays their union.
	 * The numbers are separated by exactly one space in the output.
	 */
	// Metoda koja vrsi spajanje dvije ArrayList-e brojeva u jednu
	// kao argument, metoda prima dvije liste integera
	public static ArrayList<Integer> union(ArrayList<Integer> list1,
			ArrayList<Integer> list2) {
		// kreiramo novu ArrayListu
		ArrayList<Integer> list3 = new ArrayList<>();
		// u kreiranu listu dodajemo sve elemente prve i druge proslijedjene
		// liste
		list3.addAll(list1);
		list3.addAll(list2);

		return list3;// metoda vraca kombinovanu listu

	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter five integers for list1: ");
		// kreiramo dvije ArrayListe cijelih brojeva
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		// korisnik unosi 5 brojeva za prvu i 5 brojeva za drugu listu
		// brojeve dodajemo u liste
		for (int i = 0; i < 5; i++) {

			list1.add(input.nextInt());
		}
		System.out.println("Enter five integers for list2: ");
		for (int i = 0; i < 5; i++) {
			list2.add(input.nextInt());
		}
		// pozivamo metodu union, prosljedjujemo joj unesene liste brojeva i
		// ispisujemo kombinovanu listu
		System.out.println("\nThe combined list is: " + union(list1, list2));
	}

}
