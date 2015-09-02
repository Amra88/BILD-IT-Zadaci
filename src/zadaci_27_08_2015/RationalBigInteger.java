package zadaci_27_08_2015;

import java.math.BigInteger;

public class RationalBigInteger extends Number implements
		Comparable<RationalBigInteger> {

	// Data fields for numerator and denominator
	private BigInteger numerator = BigInteger.ZERO;
	private BigInteger denominator = BigInteger.ONE;

	/** Construct a rational with default properties */
	public RationalBigInteger() {
		this(BigInteger.ZERO, BigInteger.ONE);
	}

	/** Construct a rational with specified numerator and denominator */
	public RationalBigInteger(BigInteger numerator, BigInteger denominator) {
		BigInteger gcd = gcd(numerator, denominator);
		this.numerator = ((denominator.compareTo(BigInteger.ZERO) > 0) ? BigInteger.ONE
				: BigInteger.ONE.negate()).multiply(numerator.divide(gcd));
		this.denominator = denominator.abs().divide(gcd);
	}

	/** Find GCD of two numbers */
	private static BigInteger gcd(BigInteger n, BigInteger d) {
		BigInteger n1 = n.abs();
		BigInteger n2 = d.abs();
		BigInteger gcd = BigInteger.ONE;

		for (BigInteger k = BigInteger.ONE; k.compareTo(n1) <= 0
				&& k.compareTo(n2) <= 0; k = k.add(BigInteger.ONE)) {
			if (n1.remainder(k).equals(BigInteger.ZERO)
					&& n2.remainder(k).equals(BigInteger.ZERO))
				gcd = k;
		}

		return gcd;
	}

	/** Return numerator */
	public BigInteger getNumerator() {
		return numerator;
	}

	/** Return denominator */
	public BigInteger getDenominator() {
		return denominator;
	}

	/** Add a rational number to this rational */
	public RationalBigInteger add(RationalBigInteger secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator()).add(
				denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new RationalBigInteger(n, d);
	}

	/** Subtract a rational number from this rational */
	public RationalBigInteger subtract(RationalBigInteger secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator())
				.subtract(denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new RationalBigInteger(n, d);
	}

	/** Mulitply a rational number by this rational */
	public RationalBigInteger multiply(RationalBigInteger secondRational) {
		BigInteger n = numerator.multiply(secondRational.getNumerator());
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new RationalBigInteger(n, d);
	}

	/** Divide a rational number by this rational */
	public RationalBigInteger divide(RationalBigInteger secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator());
		BigInteger d = denominator.multiply(secondRational.getNumerator());
		return new RationalBigInteger(n, d);
	}

	@Override
	public String toString() {
		if (denominator.equals(BigInteger.ONE))
			return numerator + "";
		else
			return numerator + "/" + denominator;
	}

	@Override
	// Override the equals method in the Object class
	public boolean equals(Object other) {
		if ((this.subtract((RationalBigInteger) (other))).getNumerator()
				.equals(BigInteger.ZERO))
			return true;
		else
			return false;
	}

	@Override
	// Implement the abstract intValue method in Number
	public int intValue() {
		return (int) doubleValue();
	}

	@Override
	// Implement the abstract floatValue method in Number
	public float floatValue() {
		return (float) doubleValue();
	}

	@Override
	// Implement the doubleValue method in Number
	public double doubleValue() {
		return numerator.doubleValue() / denominator.doubleValue();
	}

	@Override
	// Implement the abstract longValue method in Number
	public long longValue() {
		return (long) doubleValue();
	}

	@Override
	// Implement the compareTo method in Comparable
	public int compareTo(RationalBigInteger o) {
		if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) > 0)
			return 1;
		else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) < 0)
			return -1;
		else
			return 0;
	}
}
