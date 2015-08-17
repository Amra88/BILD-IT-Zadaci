package zadaci_14_08_2015;

import java.math.BigInteger;

public class Zadatak_4 {
	/*
	 * 10.19 (Mersenne prime) A prime number is called a Mersenne prime if it
	 * can be written in the form 2p - 1 for some positive integer p. Write a
	 * program that finds all Mersenne primes with p … 100 and displays the
	 * output as shown below. (Hint: You have to use BigInteger to store the
	 * number, because it is too big to be stored in long. Your program may take
	 * several hours to run.)
	 */
	public static void main(String[] args) {
		BigInteger two = new BigInteger("2");// instanca BigInteger klase; broj
												// 2 koji cemo stepenovati
		BigInteger p = new BigInteger("2");// p, prosti broj koji cemo
											// provjeravati

		System.out.println("p       2^p - 1\n");
		while (p.intValue() <= 100) {
			// pozivajuci metode iz BigInteger klase, provjeravamo da li je "p"
			// prost broj i da li je 2^p - 1 prost broj
			if (p.isProbablePrime(100)
					&& two.pow(p.intValue()).subtract(BigInteger.ONE)
							.isProbablePrime(100)) {
				// ako jeste, broj je Mersenne prime, ispisujemo broj p i 2^p -
				// 1
				System.out.println(p + "\t"
						+ two.pow(p.intValue()).subtract(BigInteger.ONE));

			}
			p = p.add(BigInteger.ONE);// provjeravani broj p uvecavamo za 1 i
										// nastavljamo provjeru, sve
										// dok njegova vrijednost ne bude 100
		}
	}
}
