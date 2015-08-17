package zadaci_14_08_2015;

import java.math.BigInteger;

public class Zadatak_1 {
	/*
	 * 10.16 (Divisible by 2 or 3) Find the first ten numbers with 50 decimal
	 * digits that are divisible by 2 or 3.
	 */
	public static void main(String[] args) {
		// kreiramo novu instancu BigInteger klase i dodjeljujemo joj vrijednost
		// najmanjeg broja od 50 cifara
		BigInteger num = new BigInteger(
				"10000000000000000000000000000000000000000000000000");
		int count = 0;// brojac isprintanih brojeva
		System.out
				.println("The first ten numbers with 50 decimal digits that are divisible by 2 or 3:\n");
		do {
			// ako je ostatak dijeljenja broja sa 2 ili sa 3, jednak 0
			if (num.remainder(new BigInteger("2")).equals(BigInteger.ZERO)
					|| num.remainder(new BigInteger("3")).equals(
							BigInteger.ZERO)) {
				System.out.println(num);// ispisujemo broj
				count++;// brojac uvecavamo za 1
			}
			num = num.add(BigInteger.ONE);// pri svakoj novoj iteraciji,
											// uvecavamo broj koji provjeravamo
											// za 1
		} while (count < 10);// ispisujemo 10 brojeva djeljivih sa 2 ili sa 3
	}
}
