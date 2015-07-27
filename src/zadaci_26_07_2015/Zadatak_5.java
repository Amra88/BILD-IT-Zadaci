package zadaci_26_07_2015;

public class Zadatak_5 {
	/*
	 * Napisati metodu koja provjerava da li je unijeti string validan password.
	 * Pravila da bi password bio validan su sljedeæa: 1. Password mora biti
	 * saèinjen od najmanje 8 karaktera. 2. Password smije da se sastoji samo od
	 * slova i brojeva. 3. Password mora sadržati najmanje 2 broja. Napisati
	 * program koji pita korisnika da unese password te mu ispisuje
	 * "password je validan" ukoliko su sva pravila ispoštovana ili
	 * "password nije validan" ukoliko pravila nisu ispoštovana.
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi password
		System.out.println("Unesite password: ");
		String password = input.next();
		checkPassword(password);// pozivamo metodu i ispisujemo rezultat
	}

	// metoda provjerava da li je password ispravan
	// kao argument prima String koji unosi korisnik
	public static void checkPassword(String pass) {

		int count = 0;// brojac brojeva u unesenom passwordu
		boolean condition = true;// uslov za nastavak
		if (pass.length() < 8) {
			// ako password ima manje od 8 karaktera, ispisujemo poruku
			System.out.println("Password mora sadrzati minimalno 8 karaktera!");
			condition = false;// uslov nije ispunjen, program zavrsava s radom
		} else {
			// u suprotnom
			pass = pass.toLowerCase();// sva slova postavljamo na mala
			for (int i = 0; i < pass.length(); i++) {
				// provjeravamo da li su karakteri brojevi ili slova
				if (!((pass.charAt(i) >= '0' && pass.charAt(i) <= '9') || (pass
						.charAt(i) >= 'a' && pass.charAt(i) <= 'z'))) {
					// ako nisu, uslov nije ispunjen
					condition = false;
					break;
				}
			}

			for (int i = 0; i < pass.length(); i++) {
				// provjeravamo koliko ima brojeva u passwordu
				if (pass.charAt(i) >= '0' && pass.charAt(i) <= '9') {
					// ukoliko je neki od karaktera broj od 0 do 9
					count++;// uvecavamo brojac

				}
			}
			if (count < 2) {
				// ako password sadrzi manje od 2 broja
				// ispisujemo poruku
				System.out.println("Password mora sadrzati minimalno 2 broja!");
				condition = false;// uslov nije ispunjen

			}

			if (condition) {
				// ukoliko su svi uslovi ispunjeni, printamo poruku
				System.out.println("Password je validan!");
			} else {
				// ukoliko neki od uslova nije ispunjen, poruka:
				System.out.println("Password nije validan!");

			}
		}
	}
}
