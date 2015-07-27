package zadaci_26_07_2015;

import java.util.InputMismatchException;

public class Zadatak_3 {
	/*
	 * Napisati program koji pita korisnika da unese godinu i prva tri slova
	 * imena mjeseca (prvo slovo uppercase) te mu ispiše broj dana u tom
	 * mjesecu. Na primjer, ukoliko korisnik kao godinu unese 2001 a kao mjesec
	 * Jan program mu ispisuje da Jan 2011 ima 31 dan.
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi godinu i mjesec(prva tri slova)

		System.out.println("Unesite godinu: ");
		int year = input.nextInt();
		System.out.println("Unesite mjesec (npr. Jan): ");
		String month = input.next();
		int days = 0;// broj dana u mjesecu

		// array koji sadrzi nazive svih mjeseci u godini
		String[] months = { "Januar", "Februar", "Mart", "April", "Maj",
				"Juni", "Juli", "August", "Septembar", "Oktobar", "Novembar",
				"Decembar" };
		for (int i = 0; i < months.length; i++) {
			// provjeravamo da li se unos podudara sa prva tri slova nekog od
			// mjeseci u array-u
			if (month.equals(months[i].substring(0, 3))) {
				month = months[i];// na ovaj nacin, iz array-a uzimamo puni
									// naziv mjeseca
			}
		}
		// boolean vrijednost true ako je godina prestupna
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0)
				|| (year % 400 == 0);
		// ako je uneseni mjesec neki od sljedecih:
		if (month == "April" || month == "Juni" || month == "Septembar"
				|| month == "Novembar") {

			days = 30;// broj dana je 30
			// ako je uneseni mjesec Februar, provjeravamo da li je godina
			// prestupna
		} else if (month == "Februar") {

			if (isLeapYear) {
				days = 29;

			} else {
				days = 28;
			}
			// ako je uneseni mjesec neki od sljedecih:
		} else if (month == "Januar" || month == "Mart" || month == "Maj"
				|| month == "Juli" || month == "August" || month == "Oktobar"
				|| month == "Decembar") {

			days = 31;// broj dana je 31
		} else {
			// u slucaju da se korisnikov unos ne podudara ni sa jednim Stringom
			// u array-u, ispisujemo poruku
			System.out.println("\nNeispravan unos!");
			System.exit(0);
		}
		// ispis rezultata
		System.out.println("\n" + month + " " + year + " imao je " + days
				+ " dan/a.");
	}
}
