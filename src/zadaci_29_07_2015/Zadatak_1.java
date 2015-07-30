package zadaci_29_07_2015;

import java.util.ArrayList;

public class Zadatak_1 {
	/*
	 * Napisati program koji pita korisnika da unese imena tri grada te ih
	 * ispiše u abecednom redu. Na primjer, ukoliko korisnik unese Chicago, Los
	 * Angeles i Atlanta kao gradove, program vraæa Atlanta, Chicago, Los
	 * Angeles.
	 */
	// Metoda kao argument prima listu stringova
	public static void sort(ArrayList<String> list) {
		java.util.Collections.sort(list);// listu sortiramo po abecednom redu
											// koristeci metodu .sort iz
											// Collections klase
		System.out.println(list);// printamo sortiranu listu
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Unesite nazive tri grada:");// korisnik unosi imena
														// 3 grada
		ArrayList<String> list = new ArrayList<>();// kreiramo novu Array listu
		list.add(input.nextLine());// unos, (3 stringa) spremamo u listu
		list.add(input.nextLine());
		list.add(input.nextLine());
		System.out.println("\nSortirana lista gradova: ");
		// pozivamo metodu sort i ispisujemo rezultat
		sort(list);

	}
}
