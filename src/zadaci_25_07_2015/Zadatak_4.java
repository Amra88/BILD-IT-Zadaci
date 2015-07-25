package zadaci_25_07_2015;

public class Zadatak_4 {
	/*
	 * Napisati program koji pita korisnika da unese neki string te mu ispisuje
	 * sve karaktere koji se nalaze na neparnim pozicijama. Na primjer, ako
	 * korisnik unese string Beijing Chicago, program vraæa BiigCiao.
	 */
	// Metoda za ispis karaktera na neparnim pozicijama
	public static void getOddChars(String s) {
		for (int i = 0; i < s.length(); i++) {
			if ((i + 1) % 2 != 0) { // provjeravamo da li je indeks neparan
				System.out.print(s.charAt(i));// ako jeste, printamo karakter na
												// tom indeksu
			}
		}
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// String unosi korisnik
		System.out.println("Unesite tekst: ");
		String str = input.nextLine();
		System.out.print("\nKarakteri na neparnim pozicijama su:\t");
		// pozivamo metodu i ispisujemo rezultat
		getOddChars(str);

	}
}
