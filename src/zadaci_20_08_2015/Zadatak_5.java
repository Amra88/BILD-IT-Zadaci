package zadaci_20_08_2015;

public class Zadatak_5 {
	/*
	 * (IllegalArgumentException) Modify the Loan class in Listing 10.2 to throw
	 * IllegalArgumentException if the loan amount, interest rate, or number of
	 * years is less than or equal to zero.
	 */
	public static void main(String[] args) {
		// izvrsava se try blok
		try {
			// kreiramo objekat Loan klase
			// konstruktoru prosljedjujemo vrijednosti argumenata
			Loan loan = new Loan(3.3, 4, -7);
		} catch (IllegalArgumentException ex) {
			// ukoliko su proslijedjeni neispravni argumenti, catch blok
			// preuzima izvrsavanje programa
			// catch blok hvata IllegalArgumentException, ispisuje poruku, te
			// program zavrsava s radom
			System.out.println("IllegalArgumentException: " + ex.getMessage());
		}
	}
}
