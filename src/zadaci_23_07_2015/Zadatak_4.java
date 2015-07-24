package zadaci_23_07_2015;

public class Zadatak_4 {
	/*
	 * Napisati metodu koja printa 100 nasumiènih uppercase karaktera i 100
	 * nasumiènih brojeva, 10 po liniji.
	 */
	// Metoda za printanje nasumicnih karaktera i brojeva
	public static void printRandoms() {
		int count = 0;// brojac isprintanih
		// pomocu for petlje printamo 100 karaktera
		for (int i = 0; i < 100; i++) {
			// nasumicno biramo uppercase karakter
			char ch = (char) (Math.random() * 26 + 'A');
			count++;// sa svakim odabranim karakterom, uvecavamo brojac za 1
			// uslovi za printanje 10 karaktera po liniji:
			if (count % 10 == 0) {
				System.out.println(ch);
			} else {
				System.out.print(ch + " ");
			}
		}
		System.out.println();
		// pomocu for petlje printamo 100 brojeva
		for (int i = 0; i < 100; i++) {
			// nasumicno biramo brojeve
			int num = (int) (Math.random() * 10);
			count++;// sa svakim odabranim brojem, uvecavamo brojac za 1
			// uslovi za printanje 10 brojeva po liniji:
			if (count % 10 == 0) {
				System.out.println(num);
			} else {
				System.out.print(num + " ");
			}
		}
	}

	public static void main(String[] args) {
		// pozivamo void metodu printRandoms
		// metoda ne prima argumente
		printRandoms();

	}
}
