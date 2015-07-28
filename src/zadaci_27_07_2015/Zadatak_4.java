package zadaci_27_07_2015;

public class Zadatak_4 {
	/*
	 * Napišite program koji uèitava neodreðen broj cijelih brojeva (unos
	 * prekida nula), pronalazi najveæi od unijetih brojeva te ispisuje koliko
	 * se najveæi broj puta ponovio. Na primjer, ukoliko unesemo 3 5 2 5 5 5 0
	 * program ispisuje da je najveæi broj 5 te ispisuje da se isti ponavlja 4
	 * puta.
	 */
	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		// Korisnik unosi brojeve
		System.out.println("Unesite brojeve, unos prekida 0: ");
		int nums = input.nextInt();
		int max = 1;// inicijaliziramo varijablu koja ce sadrzati najveci broj
		int count = 0;// brojac ponavljanja najveceg broja
		do {
			// korisnik unosi brojeve sve dok ne unese 0
			nums = input.nextInt();
			if (nums > max) {
				// ako je broj koji je unesen veci od trenutnog maksimalnog
				max = nums;// taj broj postaje max
				count = 1;// trenutno postoji jedan takav broj, brojac
							// postavljamo na 1
			}

			else if (max == nums) {
				// ako korisnik unese jos brojeva koji su jednaki najvecem
				count++;// brojac se uvecava
			}

		} while (nums != 0);
		// Ispisujemo najveci broj i broj ponavljanja
		System.out.println("\nNajveci broj je broj " + max + ".");
		System.out.println("Broj se ponavlja " + count + " puta.");
	}
}
