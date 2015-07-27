package zadaci_26_07_2015;

public class Zadatak_2 {
	/*
	 * Napisati program koji pita korisnika da unese mjesec i godinu te mu
	 * ispiše broj dana u datom mjesecu. Na primjer, ukoliko korisnik unese kao
	 * godinu 2012 a kao mjesec 2, program treba ispisati da je Februar 2012
	 * imao 29 dana. Ukoliko korisnik unese kao godinu 2015 a kao mjesec 3,
	 * program treba ispisati da je Mart 2015 imao 31 dan.
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi godinu i mjesec
		System.out.println("Unesite godinu: ");
		int year = input.nextInt();
		System.out.println("Unesite mjesec (od 1 do 12): ");
		int month = input.nextInt();
		int days = 0;// broj dana u mjesecu
		String monthName = "";// naziv trazenog mjeseca
		// array koji sadrzi nazive svih mjeseci u godini
		String[] months = { "Januar", "Februar", "Mart", "April", "Maj",
				"Juni", "Juli", "August", "Septembar", "Oktobar", "Novembar",
				"Decembar" };
		for (int i = 0; i < months.length; i++) {
			monthName = months[month - 1];// nakon sto korisnik unese broj
											// mjeseca, u array-u trazimo naziv
											// mjeseca pod tim indeksom
		}
		// boolean vrijednost true ako je godina prestupna
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0)
				|| (year % 400 == 0);
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			// ako je uneseni broj mjeseca 4, 6, 9 ili 11
			// mjesec ima 30 dana
			days = 30;
		} else if (month == 2)
			// ako je broj mjeseca 2, provjeravamo da li je godina prestupna
			if (isLeapYear)
				days = 29;// ako jeste, mjesec ima 29 dana
			else
				days = 28;// u suprotnom 28

		else {
			// ostali mjeseci imaju po 31 dan
			days = 31;
		}
		// ispis rezultata
		System.out.println(monthName + " " + year + " imao je " + days
				+ " dan/a.");
	}
}
