package zadaci_27_08_2015;

import java.math.BigInteger;

public class Zadatak_5 {
	/**
	 * (Convert decimals to fractions) Write a program that prompts the user to
	 * enter a decimal number and displays the number in a fraction. Hint: read
	 * the decimal number as a string, extract the integer part and fractional
	 * part from the string, and use the BigInteger implementation of the
	 * Rational class in Programming Exercise 13.15 to obtain a rational number
	 * for the decimal number.
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi decimalni broj
		System.out.println("Enter a decimal number: ");
		// unos spremamo u String varijablu
		String decimal = input.next();
		// splitamo uneseni String na decimalnom mjestu, i dva elementa spremamo
		// u niz
		String[] splited = decimal.split("[.]");
		// kreiramo novi RationalBigInteger objekat koji sadrzi cijeli dio
		// decimalnog broja
		RationalBigInteger r1 = new RationalBigInteger(new BigInteger(
				splited[0]), BigInteger.ONE);
		// drugi RationalBigInteger objekat sadrzi razlomacki dio decimalnog
		// broja
		String d = String.valueOf((int) Math.pow(10, splited[1].length()));
		RationalBigInteger r2 = new RationalBigInteger(new BigInteger(
				splited[1]), new BigInteger(d));

		// Ispisujemo decimalni broj u obliku razlomka
		if (splited[0].charAt(0) == '-') {
			System.out.println("The fraction number is " + r1.subtract(r2));
		} else {
			System.out.println("The fraction number is " + r1.add(r2));
		}
	}
}
