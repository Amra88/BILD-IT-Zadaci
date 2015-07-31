package zadaci_30_07_2015;

public class Zadatak_4 {
	/*
	 * Napisati program koji pita korisnika da unese 3 cijela broja te mu ispiše
	 * ta ista tri broja u rastuæem redosljedu. Bonus: Napisati metodu koja
	 * prima tri cijela broja kao argumente te vraæa brojeve u rastuæem
	 * redosljedu.
	 */
	// Metoda za sortiranje niza brojeva
	public static int[] sortArr(int[] arr) {
		java.util.Arrays.sort(arr);// koristeci metodu .sort iz Arrays klase,
									// niz sortiramo u rastucem redoslijedu

		return arr;// metoda vraca sortirani niz
	}

	// Metoda za printanje niza
	public static void print(int[] arr) {
		System.out.println("Brojevi u rastucem redoslijedu su: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[] array = new int[3];// kreiramo novi niz koji sadrzi 3 elementa
		// korisnik unosi 3 broja
		System.out.println("Unesite tri cijela broja: ");
		for (int i = 0; i < 3; i++) {
			array[i] = input.nextInt();// brojeve spremamo u niz
		}
		// ispis rezultata
		print(sortArr(array));// pozivamo metodu print i prosljedjujemo joj
								// sortirani niz
	}
}
