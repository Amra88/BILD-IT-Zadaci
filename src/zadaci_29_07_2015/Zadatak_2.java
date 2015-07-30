package zadaci_29_07_2015;

public class Zadatak_2 {
	/*
	 * Napisati program koji ispisuje sve proste brojeve od 2 do 1000,
	 * ukljuæujuæi i 2 i 1000. Program treba da ispiše 8 brojeva po liniji te
	 * razmak izmeðu brojeva treba da bude jedan space.
	 */
	public static void main(String[] args) {
		int count = 0;// brojac isprintanih prostih brojeva
		System.out.println("Prosti brojevi izmedju 2 i 1000 su:\n");
		for (int i = 2; i <= 1000; i++) {
			// provjeravamo brojeve od 2 do 1000
			boolean isPrime = true;// boolean vrijednost ako je broj prost
			for (int j = 2; j < i; j++) {
				// broj dijelimo sa brojevima od 2 pa do samog broja
				if (i % j == 0) {
					isPrime = false;// ako je broj djeljiv s nekim brojem osim
									// sa samim sobom i 1, nije prost
					break;
				}

			}

			if (isPrime) {// ako je broj prost
				System.out.print(i + " ");// printamo broj
				count++;// brojac se uvecava za 1
				if (count % 8 == 0) {// nakon 8 isprintanih, prelazimo u novi
										// red
					System.out.println();
				}
			}

		}

	}

}
