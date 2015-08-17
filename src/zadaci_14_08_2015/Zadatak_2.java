package zadaci_14_08_2015;

import java.math.BigInteger;

public class Zadatak_2 {
	/*
	 * 10.17 (Square numbers) Find the first ten square numbers that are greater
	 * than Long.MAX_VALUE. A square number is a number in the form of n2. For
	 * example, 4, 9, and 16 are square numbers. Find an efficient approach to
	 * run your program fast.
	 */

	public static void main(String[] args) {
		// kreiramo instancu BigInteger klase i dodjeljujemo joj maksimalnu Long
		// vrijednost
		BigInteger longMaxValue = new BigInteger(Long.MAX_VALUE + "");
		long startNum = (long) Math.sqrt(Long.MAX_VALUE);// vrsimo korjenovanje
															// max Long
															// vrijednosti i
															// dobijamo pocetnu
															// vrijednost
		BigInteger num = new BigInteger(startNum + "");// pocetnu vrijednost
														// dodjeljujemo novoj
														// instanci BigInteger
														// klase, broj za
														// provjeru
		int count = 0;// brojac isprintanih brojeva
		System.out
				.println("The first ten square numbers that are greater than Long.MAX_VALUE:\n");
		while (count < 10) {
			// provjeravamo da li je broj^2 veci od Long.MAX_VALUE
			BigInteger squared = num.pow(2);
			if (squared.compareTo(longMaxValue) > 0) {
				// ako jeste, printamo broj koji smo stepenovali i njegov square
				// broj
				System.out.println(num + " squared = " + squared);
				count++;// uvecavamo brojac za 1
			}
			num = num.add(BigInteger.ONE);// provjeravani broj uvecavamo za 1
											// i nastavljamo provjeru sve dok ne
											// ispisemo 10 square brojeva

		}
	}
}
