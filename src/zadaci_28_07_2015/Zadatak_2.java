package zadaci_28_07_2015;

public class Zadatak_2 {
	/*
	 * Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. Na
	 * primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su takoðer
	 * twin primes. Napisati program koji ispisuje sve twin prime brojeve manje
	 * od 10000, 10 parova po liniji.
	 */
	// metoda koja provjera da li je broj prost
	public static boolean isPrime(int num) {
		boolean prime = true;
		for (int i = 2; i < num; i++) {
			// broj dijelimo sa brojevima od 2 pa do samog broja
			if (num % i == 0) {
				prime = false;
				// ako je broj djeljiv s nekim brojem osim sa sobom i 1, nije
				// prost
			}
		}
		return prime;// metoda vraca boolean vrijednost true ili false
	}

	public static void main(String[] args) {
		int count = 0;// brojac isprintanih twin prime brojeva
		System.out.println("Twin prime brojevi su:");
		// provjeravamo brojeve od 2 do 10 000
		for (int i = 2; i < 10000; i++) {
			// ako je broj prost(pozvali smo metodu isPrime za provjeru) i ako
			// je isti broj +2
			// takodje prost
			if (isPrime(i) && isPrime(i + 2)) {// brojevi su twin prime
				System.out.print(i + " " + (i + 2) + "; ");// printamo parove
				count++;// nakon svakog isprintanog brojac se uvecava
				if (count % 10 == 0) {// nakon 10 isprintanih, prelazi u novi
										// red
					System.out.println();
				}
			}
		}
	}
}
