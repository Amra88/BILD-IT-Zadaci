package zadaci_03_08_2015;

public class Zadatak_3 {
	/*
	 * Napisati program koji pita korisnika da unese slovo te provjerava da li
	 * je unijeti karakter samoglasnik ili suglasnik. Na primjer, ukoliko
	 * korisnik unese B, program vraæa da je dati karakter suglasnik. Ukoliko
	 * unese A, program vraæa da je dati karakter samoglasnik.
	 */
	// Metoda koja provjerava da li je proslijedjeni karakter samoglasnik
	public static boolean isVowel(char ch) {
		String vowels = "aeiouAEIOU";// string koji sadrzi sve samoglasnike
		for (int i = 0; i < vowels.length(); i++) {
			// provjeravamo da li string sadrzi proslijedjeni karakter, te u
			// zavisnosti od toga metoda vraca true ili false
			if (ch == vowels.charAt(i)) {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Unesite slovo: ");
		// korisnik unosi slovo
		char character = input.next().charAt(0);
		// pozivajuci metodu isVowel provjeravamo da li je slovo samoglasnik
		// ispisujemo rezultat
		if (isVowel(character)) {
			System.out.println("Karakter " + character + " je samoglasnik.");
		} else if (Character.isLetter(character)) {
			System.out.println("Karakter " + character + " je suglasnik.");
		} else {
			System.out.println("Karakter " + character
					+ " nije ni samoglasnik ni suglasnik!");
		}
	}

}
