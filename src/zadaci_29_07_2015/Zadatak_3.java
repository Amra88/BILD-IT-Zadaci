package zadaci_29_07_2015;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Zadatak_3 {
	/*
	 * Ako pozovemo metodu System.currentTimeMillis() dobijemo broj milisekundi
	 * od 1. januara 1970 do trenutka pozivanja metode. Napisati program koji
	 * ispisuje trenutaèni datum i vrijeme u formatu
	 * "Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"
	 */

	public static void main(String[] args) {

		long millis = System.currentTimeMillis();// dobijamo trenutno
													// milisekundi
		Date date = new Date(millis);// kreiramo novi datum iz Date klase
		// kreiramo novu instancu klase SimpleDateFormat kako bismo formatirali
		// datum i vrijeme onako kako zelimo
		SimpleDateFormat formatDate = new SimpleDateFormat(
				"dd. MMM, yyyy HH:mm:ss");
		// ispisujemo rezultat
		System.out
				.print("Trenutni datum i vrijeme:\t" + formatDate.format(date));
	}
}
