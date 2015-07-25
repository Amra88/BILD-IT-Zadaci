package zadaci_24_07_2015;

public class Zadatak_5 {
	/*
	 * Napisati metodu koja broji slova u stringu. Metoda treba koristiti
	 * sljedeæi header: public static int countLetters(String s). Napisati
	 * program koji pita korisnika da unese neki string te mu vrati koliko taj
	 * string ima slova.
	 */
	// Metodi prosljedjujemo String koji unosi korisnik
	public static int countLetters(String s) {
		int count = 0;// brojac slova u stringu
		s = s.toLowerCase();// sva slova u stringu postavljamo na mala,
							// koristeci metodu .toLowerCase
		for (int i = 0; i < s.length(); i++) {
			for (char ch = 'a'; ch <= 'z'; ch++) {
				// kroz nested for petlju provjeravamo da li u stringu ima
				// karaktera od 'a' do 'z'(malih slova)
				if (s.charAt(i) == ch) {// ako se neko od slova nalazi u stringu
					count++;// uvecavamo brojac
				}
			}
		}
		return count;// metoda vraca ukupan broj slova u stringu
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi string
		System.out.println("Unesite string: ");
		String str = input.nextLine();
		// pozivamo metodu i printamo rezultat
		System.out.println("\nString ima " + countLetters(str) + " slova.");
	}
}
