package zadaci_27_08_2015;

public class Zadatak_3 {
	/**
	 * (Create a rational-number calculator) Write a program similar to Listing
	 * 7.9, Calculator.java. Instead of using integers, use rationals, as shown
	 * in Figure 13.10a. You will need to use the split method in the String
	 * class, introduced in Section 10.10.3, Replacing and Splitting Strings, to
	 * retrieve the numerator string and denominator string, and convert strings
	 * into integers using the Integer.parseInt method.
	 */
	/** Main method */
	public static void main(String[] args) {
		// argumente prosljedjujemo u vidu jednog stringa
		// provjeravamo da li je proslijedjen jedan argument (String)
		if (args.length != 1) {
			System.out
					.println("Usage: java Exercise_13_16 String \" 1/1 + 1/1\"");
			System.exit(0);
		}

		// String koji sadrzi proslijedjeni argument
		String arguments = args[0];

		// splitamo String kako bismo dobili numerator i denominator
		// smjestamo elemente u niz
		String[] str = (args[0].replaceAll(" ", "/")).split("/");
		try {
			// kreiramo dvije instance Rational klase
			Rational r1 = new Rational(Integer.parseInt(str[0]),
					Integer.parseInt(str[1]));

			Rational r2 = new Rational(Integer.parseInt(str[3]),
					Integer.parseInt(str[4]));

			// provjeravamo koji operand je proslijedjen i vrsimo odredjenu
			// operaciju
			// operand je u nizu smjesten na indeksu 2
			if (str[2].equals("+")) {
				arguments += " = " + r1.add(r2);
			} else if (str[2].equals("-")) {
				arguments += " = " + r1.subtract(r2);
			} else if (str[2].equals("*")) {
				arguments += " = " + r1.multiply(r2);
			} else if (str[2].equals("/")) {
				arguments += " = " + r1.divide(r2);
			} else {
				System.out
						.println("Invalid operand. Enter one of the following: + - * /");
				System.exit(0);
			}
		} catch (NumberFormatException e) {
			System.out
					.println("Usage: java Exercise_13_16 String \"1/1 + 1/1\"\nYour input: ");
		}
		// Ispisujemo rezultat
		System.out.println(arguments);
	}

}
