package zadaci_14_08_2015;

import java.math.BigInteger;

public class Zadatak_5 {
	/*
	 * (Divisible by 5 or 6) Find the first ten numbers greater than
	 * Long.MAX_VALUE that are divisible by 5 or 6.
	 */
	public static void main(String[] args) {
		// kreiramo instancu BigInteger klase i dodjeljujemo joj maksimalnu Long
		// vrijednost
		BigInteger num = new BigInteger(Long.MAX_VALUE + "");

		int count = 0;// brojac isprintanih brojeva
		System.out
				.println("The first ten numbers greater than Long.MAX_VALUE that are divisible by 5 or 6:\n");
		do {
			// pozivajuci metode iz BigInteger klase, provjeravamo da li je
			// ostatak dijeljenja broja sa 5 ili sa 6, jednak 0
			if (num.remainder(new BigInteger("5")).equals(BigInteger.ZERO)
					|| num.remainder(new BigInteger("6")).equals(
							BigInteger.ZERO)) {
				System.out.println(num);// ako jeste, printamo broj
				count++;// uvecavamo brojac za 1
			}
			num = num.add(BigInteger.ONE);// kao i provjeravani broj
		} while (count < 10);// ispisujemo 10 brojeva djeljivih sa 5 ili sa 6
	}
}
