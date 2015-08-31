package zadaci_25_08_2015;

import java.util.*;

public class Zadatak_1 {
	/**
	 * (Display calendars) Rewrite the PrintCalendar class in Listing 6.12 to
	 * display a calendar for a specified month using the Calendar and
	 * GregorianCalendar classes. Your program receives the month and year from
	 * the command line. For example: java Exercise13_04 5 2016 You also can run
	 * the program without the year. In this case, the year is the current year.
	 * If you run the program without specifying a month and a year, the month
	 * is the current month.
	 */
	public static void main(String[] args) {
		// kreiramo novu instancu GregorianCalendar klase
		Calendar calendar = new GregorianCalendar();
		// mjesec u godini
		int month = 0;
		// godina
		int year = 0;
		// u slucaju da su proslijedjena vise od 2 argumenta, program zavrsava s
		// radom
		if (args.length > 2) {
			System.out
					.println("Invalid arguments!\nUsage: java Exercise13_04 5 2016");
			System.exit(1);
		}
		// ukoliko je proslijedjen jedan argument, provjeravamo da li je
		// proslijedjen ispravan broj mjeseca ili godine
		if (args.length == 1) {
			// koristimo parseInt() metodu za pretvaranje String-a (argumenti) u
			// int tip podataka
			if (Integer.parseInt(args[0]) > 0
					&& Integer.parseInt(args[0]) <= 12) {
				// ukoliko je proslijedjeni argument=mjesec, kao godinu uzimamo
				// trenutnu godinu
				month = Integer.parseInt(args[0]) - 1;
				year = calendar.get(Calendar.YEAR);
			} else if (Integer.parseInt(args[0]) > 1582) {
				// ukoliko je proslijedjeni argument=godina, kao mjesec uzimamo
				// trenutni mjesec
				month = calendar.get(Calendar.MONTH);
				year = Integer.parseInt(args[0]);
			} else {
				// ukoliko argument nije ispravan, program zavrsava s radom
				System.out
						.println("Invalid arguments!\nUsage: java Exercise13_04 5 2016");
				System.exit(1);
			}
		}
		// ukoliko su proslijedjena dva argumenta, provjeravamo da li su
		// proslijedjeni ispravan broj mjeseca i godine
		if (args.length == 2) {
			if (Integer.parseInt(args[0]) > 0
					&& Integer.parseInt(args[0]) <= 12
					&& Integer.parseInt(args[1]) > 1582) {
				month = Integer.parseInt(args[0]) - 1;
				year = Integer.parseInt(args[1]);
			} else {
				System.out
						.println("Invalid arguments!\nUsage: java Exercise13_04 5 2016");
				System.exit(1);
			}

		}

		// printamo trazeni mjesec u godini
		printMonth(month, year);
	}

	// Metoda za printanje mjeseca
	// kao argumente, metodi prosljedjujemo odredjeni mjesec i godinu
	public static void printMonth(int month, int year) {
		// kreiramo novu instancu GregorianCalendar klase
		Calendar calendar = new GregorianCalendar();

		// postavljamo datum za objekat
		// broj 1 predstavlja prvi dan u mjesecu
		calendar.set(year, month, 1);

		// dan u sedmici za prvi dan mjeseca
		int firstDayOfMonth = calendar.get(Calendar.DAY_OF_WEEK);

		// broj dana u mjesecu
		int numberOfDaysInMonth = calendar
				.getActualMaximum(Calendar.DAY_OF_MONTH);

		// niz koji sadrzi nazive svih mjeseci
		String[] months = { "January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October", "November",
				"December" };
		// printamo Month Title
		// naziv mjeseca i godinu
		System.out.println("\t" + months[month] + "  " + year + "\n");
		// dane u sedmici
		System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");
		// pozivamo metodu i printamo Month Body
		printMonthBody(numberOfDaysInMonth, firstDayOfMonth);
	}

	// Metoda za printanje kalendarskog mjeseca
	// kao argumente, metoda prima broj dana u mjesecu i prvi dan mjeseca
	private static void printMonthBody(int numberOfDaysInMonth,
			int firstDayOfMonth) {

		// brojac dana u sedmici
		int dayOfWeek = 0;

		// preskacemo dane prije prvog dana u mjesecu, ne printamo ih
		for (int i = 1; i < firstDayOfMonth; i++) {
			System.out.print("    ");
			dayOfWeek++;
		}

		// printamo ostale dane u mjesecu
		for (int j = 1; j <= numberOfDaysInMonth; j++) {
			System.out.printf("%2d", j);
			dayOfWeek++;

			// ukoliko je isprintano 7 dana u sedmici, prelazimo u novi red
			if (dayOfWeek % 7 == 0) {
				System.out.println();
			} else {
				// u suprotnom, printamo razmak
				System.out.print("  ");
			}
		}
	}
}
