package zadaci_30_07_2015;

public class Zadatak_3 {
	/*
	 * Napisati metodu sa sljedeæim headerom: public static int isPrime(int n)
	 * koja provjerava da li je broj prost/prime. Napsati test program koji
	 * poziva ovu metodu i ispisuje sve proste brojeve u rasponu od 0 do 100000.
	 */
	// Metoda provjerava da li je broj prost
	// metodi prosljedjujemo broj
	public static boolean isPrime(int n) {
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

	public static void main(String[] args) {
		int count = 0;// brojac isprintanih prostih brojeva
		for (int i = 2; i < 100000; i++) {
			// provjeravamo brojeve od 0 do 100000
			if (isPrime(i)) {
				// ako je broj prost
				System.out.print(i + " ");// printamo broj
				count++;// nakon svakog isprintanog brojac se uvecava
				if (count % 10 == 0) {// nakon 10 isprintanih, prelazi u novi
										// red
					System.out.println();
				}
			}
		}
	}
}
