package zadaci_22_07_2015;

public class Zadatak_3 {
	/*
	 * Nizovi niz1 i niz2 su striktno identièni ukoliko su svi njihovi elementi
	 * na istim pozicijama jednaki. Napisati metodu koja vraæa true ukoliko su
	 * nizovi niz1 i niz2 striktno identièni. Koristiti sljedeæi header: public
	 * static boolean equals(int[ ] niz1, int[ ] niz2) Napisati testni program
	 * koji pita korisnika da unese dva niza cijelih brojeva te provjerava da li
	 * su striktno identièni.
	 */

	// Metodi equals prosljedjujemo 2 array-a
	public static boolean equals(int[] arr1, int[] arr2) {
		// iz Arrays klase pozivamo metodu .equals koja provjerava da li su
		// nizovi identicni
		// kao rezultat vracamo boolean vrijednost
		return java.util.Arrays.equals(arr1, arr2);
	}

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi duzinu array-a
		System.out.println("Enter array length: ");
		int l = input.nextInt();
		// kreiramo 2 array-a
		int[] list1 = new int[l];
		int[] list2 = new int[l];
		// korisnik unosi elemente ova 2 array-a
		// unos vrsimo pomocu for petlje
		System.out.println("Enter list1: ");
		for (int i = 0; i < l; i++) {
			list1[i] = input.nextInt();
		}
		System.out.println("Enter list2: ");
		for (int i = 0; i < l; i++) {
			list2[i] = input.nextInt();
		}
		// pozivamo metodu equals i ispisujemo rezultat
		System.out.println("\nTwo lists are strictly identical: "
				+ equals(list1, list2));
	}
}
