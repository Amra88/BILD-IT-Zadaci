package zadaci_12_08_2015;

import java.util.*;

public class StackOfIntegers {
	// definisemo data field
	private int number;

	// konstruktor koji kreira instancu sa proslijedjenom vrijednosti
	public StackOfIntegers(int n) {
		this.number = n;
	}

	// Metoda za dobijanje najmanjih faktora nekog broja
	public ArrayList<Integer> getFactors() {
		// kreiramo novu array listu
		ArrayList<Integer> list = new ArrayList<>();
		// trazenje faktora
		while (number > 1) {
			for (int i = 2; i <= number; i++) {
				// pomocu petlje broj dijelimo sa brojevima od 2 pa do samog
				// broja
				// "i" je djelilac
				if (number % i == 0) {// ako nema ostatka pri dijeljenju
					list.add(i);// djelilac dodajemo u listu
					number = number / i; // zatim broj podijelimo sa tim
											// djeliocem
					break;// vracamo se u petlju
				}
			}
		}
		// dobijenu listu sortiramo pozivajuci sort metodu iz Collections klase
		Collections.sort(list);
		return list;// metoda vraca listu najmanjih faktora sortiranu u rastucem
					// redoslijedu
	}

	// Metoda provjerava da li je broj prost
	// metodi prosljedjujemo broj
	public boolean isPrime(int n) {
		boolean prime = true;// boolean vrijednost ako je broj prost
		for (int i = 2; i < n; i++) {
			// broj dijelimo sa brojevima od 2 pa do samog broja
			if (n % i == 0) {
				prime = false;
				// ako je broj djeljiv s nekim brojem osim sa sobom i 1, nije
				// prost
			}
		}
		return prime;// metoda vraca boolean vrijednost true ili false
	}

	// metoda za dobijanje liste prostih brojeva
	public ArrayList<Integer> getPrimes() {
		ArrayList<Integer> primes = new ArrayList<>();// kreiramo array listu
		for (int i = 0; i < number; i++) {
			if (isPrime(i)) {// pozivamo metodu isPrime i provjeravamo da li je
								// broj prost
				primes.add(i);// ako jeste, broj spremamo u listu
			}
		}
		return primes;// metoda vraca listu prostih brojeva, od 1 pa do
						// broja(vrijednosti koju ima objekat)
	}
}
