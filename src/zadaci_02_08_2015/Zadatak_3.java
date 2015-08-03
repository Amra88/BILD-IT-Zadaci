package zadaci_02_08_2015;

public class Zadatak_3 {
	/*
	 * Napisati program koji pita korisnika da unese Social Security Number
	 * (SSN) u formatu DDD-DD-DDDD gdje D predstavlja broj. Program treba da
	 * provjerava da li je broj unesešen u ispravnom formatu. Ukoliko nije,
	 * program pita korisnika da pokuša ponovo. Ukoliko jeste unešen u pravom
	 * formatu, program završava sa radom.
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Unesite Social Security Number:");
		String ssn = "";// String koji unosi korisik
		boolean cond = true;// uslov za izvrsavanje petlje
		do {
			// korisnik unosi String (SSN)
			ssn = input.nextLine();
			// pozivamo metodu validFormat i provjeravamo da li je String unesen
			// u ispravnom formatu, te u zavisnosti od toga ispisujemo poruku
			// korisniku
			if (!validFormat(ssn)) {
				System.out.println("SSN nije ispravan! Pokusajte ponovo:");
				cond = false;
			} else {
				System.out.println("Ispravan SSN!");
				cond = true;
			}
		} while (!cond);// petlja se izvrsava sve dok uslov ne bude true(dok SSN
						// nije ispravan)
	}

	// metoda provjerava da li je proslijedjeni karakter broj, te vraca boolean
	// vrijednost true ili false
	public static boolean isDigit(char ch) {
		return (ch >= 0 && ch <= 9);

	}

	// metoda koja provjrava da li je proslijedjeni String u ispravnom formatu
	public static boolean validFormat(String s) {
		boolean isValid = false;
		// duzina stringa mora biti 11
		if (s.length() != 11) {
			isValid = false;
		}
		for (int i = 0; i < s.length(); i++) {
			// provjeravamo da li su karakteri na indeksima 3 i 6 crtice ("-")
			if (s.charAt(3) == '-' && s.charAt(6) == '-') {
				isValid = true;
				// provjeravamo da li su ostali karakteri brojevi
			} else if (isDigit(s.charAt(i))) {
				isValid = true;
			} else {
				// ako prethodni uslovi nisu ispunjeni, format nije ispravan
				isValid = false;
			}
		}
		return isValid;// metoda vraca boolean vrijednost true ili false
	}

}
