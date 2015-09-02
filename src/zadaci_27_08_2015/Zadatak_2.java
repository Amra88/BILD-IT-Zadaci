package zadaci_27_08_2015;

import java.math.BigInteger;

public class Zadatak_2 {
	/**
	 * (Use BigInteger for the Rational class) Redesign and implement the
	 * Rational class in Listing 13.13 using BigInteger for the numerator and
	 * denominator.
	 */
	public static void main(String[] args) {
		// Create and initialize two rational numbers r1 and r2
		RationalBigInteger r1 = new RationalBigInteger(new BigInteger("4"),
				new BigInteger("2"));
		RationalBigInteger r2 = new RationalBigInteger(new BigInteger("2"),
				new BigInteger("3"));

		// Display results
		System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
		System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
		System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
		System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
		System.out.println(r2 + " is " + r2.doubleValue());
	}
}
