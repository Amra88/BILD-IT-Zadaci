package zadaci_27_07_2015;

public class Zadatak_5 {
	/*
	 * Napisati metodu koja pretavara milisekunde u sate, minute i sekunde.
	 * Metoda treba da koristi sljedeæi header: public static String
	 * convertMillis(long millis). Metoda treba da vraæa vrijeme kao string u
	 * formatu sati:minute:sekunde. Na primjer convertMillis(100000) treba da
	 * vrati 0:1:40.
	 */
	// Metoda kao argument prima milisekunde
	public static String convertMillis(long millis) {
		// mislisekunde pretvaramo u sekunde
		int sec = (int) (millis / 1000);
		// zatim sekunde pretvaramo u sate
		int hour = sec / 3600;
		// nakon dobijenih sati, ostatak koristimo za dobijanje minuta
		int min = sec % 3600 / 60;
		// ostatak su preostale sekunde
		int second = sec % 3600 % 60;
		// metoda vraca String:
		return millis + " milisekundi ==>\t" + hour + ":" + min + ":" + second;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi milisekunde
		System.out.println("Unesite milisekunde: ");
		long ms = input.nextLong();
		// pozivamo metodu i ispisujemo rezultat
		System.out.println(convertMillis(ms));
	}
}
