package zadaci_27_07_2015;

public class Zadatak_3 {
	/*
	 * Napišite program koji ispisuje sve brojeve, od 100 do 1000, 10 brojeva po
	 * liniji, koji su djeljivi i sa 5 i sa 6. Razmak izmeðu brojeva treba biti
	 * taèno jedan space.
	 */
	public static void main(String[] args) {
		int count = 0;// brojac isprintanih brojeva
		for (int i = 100; i < 1000; i++) {
			// kroz petlju provjeravamo sve brojeve od 100 do 1000
			if (i % 5 == 0 && i % 6 == 0) {
				// ako je broj djeljiv sa 5 i 6
				// printamo broj
				System.out.print(i + " ");
				count++;// brojac se uvecava za 1
				if (count % 10 == 0) {
					// kada brojac izbroji 10 takvih brojeva
					System.out.println();// prelazimo u novi red i nastavljamo
											// printanje
				}
			}
		}
	}
}
