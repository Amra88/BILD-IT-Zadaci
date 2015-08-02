package zadaci_01_08_2015;

public class Zadatak_3 {
	/*
	 * Napisati program koji sabira sljedeæu seriju 1/3 + 3/5 + 5/7 + 7/9 + 9/11
	 * + 11/13 ..... + 95/97 + 97/99.
	 */
	public static void main(String[] args) {
		double sum = 0;// ukupna suma
		for (int i = 1; i < 98; i += 2) {
			// sabiramo seriju brojeva
			sum += i / (i + 2.0);
		}
		// printamo sumu
		System.out.println("Ukupna suma: " + sum);
	}
}
