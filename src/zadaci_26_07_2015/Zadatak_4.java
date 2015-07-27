package zadaci_26_07_2015;

import java.util.ArrayList;

public class Zadatak_4 {
	/*
	 * Pozitivni cijeli broj je savršen broj ukoliko je jednak zbiru svih svojih
	 * pozitivnih djelilaca, iskljuèujuæi sebe. Na primjer, 6 je prvi savršeni
	 * broj jer 6 = 3 + 2 + 1. Sljedeæi savršeni broj je 28 jer 28 = 14 + 7 + 4
	 * + 2 + 1. Samo 4 savršena broja postoje u rasponu od 0 do 10.000. Napišite
	 * program koji ispisuje sva 4.
	 */
	// Metoda koja vraca sumu djelioca nekog broja
	// metodi prosljedjujemo broj
	public static int sumOfDivisors(int number) {
		int divisors = 0;// zbir djelioca nekog broja
		for (int i = 1; i < number; i++) {
			// provjeravamo da li je broj djeljiv sa brojevima od 1 pa do samog
			// broja, iskljucujuci taj broj
			if (number % i == 0) {
				// ako jeste, djelilac dodajemo sumi
				divisors += i;
			}
		}
		return divisors;// metoda vraca zbir svih djelioca nekog broja
	}

	public static void main(String[] args) {

		int number;// varijabla koja ce primati rezultat metode sumOfDivisors
		System.out.println("Savrseni brojevi u rasponu od 0 do 10 000 su: ");
		for (int i = 1; i < 10000; i++) {
			// metodi cemo prosljedjivati brojeve od 1 do 10000
			number = sumOfDivisors(i);

			if (number == i) {
				// ukoliko je rezultat koji vraca metoda jednak broju koji smo
				// proslijedili
				System.out.println(number);// broj je savrsen; printamo broj
			}
		}
	}
}
