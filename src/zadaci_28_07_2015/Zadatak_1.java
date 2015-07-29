package zadaci_28_07_2015;

public class Zadatak_1 {
	/*
	 * Napisati metodu koja vraæa broj dana u godini. Metoda koristi sljedeæi
	 * header: public static int numberOfDayInAYear(int year). Napisati program
	 * koji pita korisnika da unese poèetnu godinu, krajnju godinu te ispisuje
	 * broj dana za svaku godinu u rasponu.
	 */
	// Metoda kao argument prima godinu
	public static int numberOfDayInAYear(int year) {
		int numOfDays;// broj dana u godini
		// provjeravamo da li je godina prestupna
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0)
				|| (year % 400 == 0);
		// u zavisnosti od toga dobijamo broj dana
		if (isLeapYear) {
			numOfDays = 366;
		} else {
			numOfDays = 365;
		}
		return numOfDays;// metoda vraca broj dana u godini
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi pocetnu i krajnju godinu
		System.out.println("Unesite pocetnu godinu:");
		int startYear = input.nextInt();
		System.out.println("Unesite krajnju godinu:");
		int endYear = input.nextInt();
		// ispisujemo broj dana za svaku godinu u tom rasponu
		for (int i = startYear; i <= endYear; i++) {
			System.out.println(i + ". godina: " + numberOfDayInAYear(i)
					+ " dana");
		}
	}
}
