package zadaci_21_07_2015;

public class Zadatak_2 {
	/*
	 * Napisati metodu koja prima jedan argument, broj pitanja, te generise
	 * toliko nasumicnih, jednostavnih pitanja oduzimanja tipa : „Koliko je 5 -
	 * 2 ?“. Metoda treba da broji broj tacnih i netacnih odgovora te ih ispise
	 * korisniku.
	 */

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// unos broja pitanja
		System.out.println("Unesite zeljeni broj pitanja: ");
		int numOfQuestions = input.nextInt();
		// pozivanje metode getRandomQuestions i ispis rezultata
		getRandomQuestions(numOfQuestions);
	}

	// Metodi prosljedjujemo broj pitanja (n)
	public static void getRandomQuestions(int n) {
		int count = 0;// brojac tacnih odgovora
		// koristeci for petlju postavljamo onoliko pitanja koliko je korisnik
		// trazio (broj n)
		for (int i = 0; i < n; i++) {

			// generisanje nasumicnih brojeva
			int num1 = (int) (Math.random() * 10);
			int num2 = (int) (Math.random() * 10);
			// ukoliko je prvi broj manji od drugog, zamijeniti brojeve
			if (num1 < num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			// upit korisniku
			System.out.println("Koliko je " + num1 + " - " + num2 + "?");
			java.util.Scanner input = new java.util.Scanner(System.in);
			// unos odgovora od strane korisnika
			int answer = input.nextInt();
			// ukoliko je odgovor tacan, uvecava se brojac tacnih odgovora
			if (answer == num1 - num2) {
				count++;
			}
		}
		// ispis rezultata
		System.out.println("Broj tacnih odgovora je: " + count);
		System.out.println("Broj netacnih odgovora je: " + (n - count));
	}
}
