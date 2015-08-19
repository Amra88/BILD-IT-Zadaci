package zadaci_17_08_2015;

import java.util.*;

public class Zadatak_3 {
	/*
	 * (Maximum element in ArrayList) Write the following method that returns
	 * the maximum value in an ArrayList of integers. The method returns null if
	 * the list is null or the list size is 0. public static Integer
	 * max(ArrayList<Integer> list) Write a test program that prompts the user
	 * to enter a sequence of numbers ending with 0, and invokes this method to
	 * return the largest number in the input.
	 */
	// metoda koja vraca najveci elemnent u array listi integera
	// metoda prima ArrayListu kao argument
	public static Integer max(ArrayList<Integer> list) {
		// ako su elementi u listi = 0, metoda vraca null
		if (list == null || list.size() == 0) {
			return null;
		} else {
			// u suprotnom, sortiramo listu u rastucem redoslijedu
			Collections.sort(list);
			return list.get(list.size() - 1);// metoda vraca posljednji element
												// iz liste
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// kreiramo novu ArrayList-u
		ArrayList<Integer> userList = new ArrayList<>();
		System.out.println("Enter a sequence of numbers ending with 0: ");
		int nums = 1;
		do {
			// korisnik unosi brojeve
			nums = input.nextInt();
			// brojeve dodajemo u listu
			userList.add(nums);
		} while (nums != 0);// unos zavrsava 0
		// pozivamo metodu max, prosljedjujemo joj listu i ispisujemo rezultat
		System.out
				.println("\nThe largest number in the sequence of numbers is: "
						+ max(userList));
	}
}
