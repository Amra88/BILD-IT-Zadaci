package zadaci_25_07_2015;

public class Zadatak_2 {
	/*
	 * Napisati program koji ispisuje sve prijestupne godine, 10 po liniji, u
	 * rasponu godina koje korisnik unese. Program pita korisnika da unese
	 * poèetnu godinu, krajnju godinu te ispisuje sve godine u tom rasponu.
	 * Razmak izmeðu godina treba biti jedan space.
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi pocetnu i krajnju godinu
		System.out.println("Unesite pocetnu godinu: ");
		int startYear = input.nextInt();
		System.out.println("Unesite krajnju godinu: ");
		int endYear = input.nextInt();
		// pozivamo metodu i ispisujemo rezultat
		getLeapYear(startYear, endYear);
	}

	// Metoda racuna i prikazuje sve prestupne godine u rasponu godina koje
	// korisnik unese
	// parametri: pocetna i krajnja godina
	public static void getLeapYear(int start, int end) {
		int count = 0;// brojac prestupnih godina
		System.out.println("Prestupne godine:");
		// pomocu petlje provjeravamo godine, od pocetne do krajnje
		for (int i = start; i <= end; i++) {
			// uslov: godina je prestupna ako je djeljiva sa 4 i 100, ili ako je
			// djeljiva sa 400
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
				// ako je godina prestupna, brojac uvecavamo za 1
				count++;
				// i ispisujemo godinu
				System.out.print(i + " ");
				if (count % 10 == 0) {
					// kada ispisemo 10 godina, prelazimo u novi red
					System.out.println();
				}
			}
		}
		// prikaz broja prestupnih godina
		System.out.println("\n\nUkupno prestupnih godina: " + count);
	}
}
