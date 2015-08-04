package zadaci_04_08_2015;

public class Zadatak_4 {
	/*
	 * Napisati metodu sa sljedeæim headerom: public static String format(int
	 * number, int width) koja vraæa string broja sa prefiksom od jedne ili više
	 * nula. Velièina stringa je width argument. Na primjer, ukoliko pozovemo
	 * metodu format(34, 4) metoda vraæa 0034, ukoliko pozovemo format(34, 5)
	 * metoda vraæa 00034. Ukoliko je uneseni broj veæi nego width argument,
	 * metoda vraæa samo string broja. Npr. ukoliko pozovemo format(34, 1)
	 * metoda vraæa 34.
	 */
	// metoda za formatiranje broja
	// metodi prosljedjujemo broj i ukupnu duzinu broja sa prefixom
	public static String format(int number, int width) {
		String formatedNum = "" + number;// string koji ce sadrzati prefix i
											// proslijedjeni broj
		if (formatedNum.length() >= width) {
			// ukoliko je duzina proslijedjenog broja veca od trazene duzine,
			// vracamo samo string broja 
			formatedNum = "" + number;
		} else {
			// u suprotnom, racunamo duzinu prefixa
			int prefix = width - formatedNum.length();
			for (int i = 0; i < prefix; i++) {
				// stringu broja dodajemo prefix (odredjeni broj nula)
				formatedNum = "0" + formatedNum;
			}
		}
		return formatedNum;// metoda vraca dobijeni string broja
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi broj i velicinu stringa
		System.out.println("Unesite broj:");
		int num = input.nextInt();
		System.out.println("Unesite ukupnu duzinu stringa(prefix+broj):");
		int length = input.nextInt();
		// pozivamo metodu format i ispisujemo dobijeni string
		System.out.println("\nString broja s prefiksom >>>\t"
				+ format(num, length));

	}
}
