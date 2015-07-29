package zadaci_28_07_2015;

public class Zadatak_4 {
	/*
	 * Napisati metodu koja pronalazi broj ponavljanja odreðenog karaktera u
	 * stringu. Metoda treba da koristi sljedeæi header: public static int
	 * count(String str, char a). Na primjer, ukoliko pozovemo metodu na
	 * sljedeæi naèin: count("Welcome", e) metoda treba da vrati 2. Napisati
	 * program koji pita korisnika da unese string i koji karakter želi da
	 * prebroji u datom stringu te mu ispiše koliko se puta odreðeni karakter
	 * ponovio u zadatom stringu.
	 */
	// metoda kao argument prima neki string i karakter koji ce brojati
	public static int count(String str, char a) {
		int counter = 0;// brojac
		for (int i = 0; i < str.length(); i++) {
			// kroz petlju provjeravamo da li string na nekom indeksu sadrzi
			// trazeni karakter
			if (str.charAt(i) == a) {
				// svaki put kad se karakter pojavi
				counter++;// brojac se uvecava
			}
		}
		return counter;// metoda vraca broj ponavljanja odredjenog karaktera
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi string
		System.out.println("Unesite tekst: ");
		String s = input.nextLine();
		// i karakter koji cemo traziti u stringu
		System.out.println("Koji karakter zelite da prebrojite: ");
		char ch = input.next().charAt(0);
		// pozivamo metodu count i ispisujemo rezultat
		System.out.println("\nKarakter " + ch + " ponovio se " + count(s, ch)
				+ " puta u tekstu koji ste unijeli.");
	}
}
