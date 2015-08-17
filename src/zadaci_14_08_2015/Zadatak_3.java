package zadaci_14_08_2015;

import java.math.BigInteger;

public class Zadatak_3 {
	/*
	 * (Large prime numbers) Write a program that finds five prime numbers
	 * larger than Long.MAX_VALUE.
	 */
	public static void main(String[] args) {
		// kreiramo instancu BigInteger klase i dodjeljujemo joj maksimalnu Long
		// vrijednost
		BigInteger num = new BigInteger(Long.MAX_VALUE + "");
		int count = 0;// brojac isprintanih brojeva
		System.out
				.println("The first five prime numbers larger than Long.MAX_VALUE:\n");
		while (count < 5) {
			// pozivamo metodu isProbablePrime i provjeravamo da li je broj
			// prost
			if (num.isProbablePrime(100)) {
				System.out.println(num);// ako jeste, printamo broj
				count++;// uvecavamo brojac za 1
			}
			num = num.add(BigInteger.ONE);// kao i provjeravani broj
		}// ispisujemo 5 prostih brojeva vecih od Long.MAX_VALUE
	}
}
