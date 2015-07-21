package zadaci_20_07_2015;

public class Zadatak_2 {
	/*
	 * Pretpostavimo da su slova A, E, I, O i U samoglasnici. Napisati program
	 * koji pita korisnika da unese string te mu ispište broj samoglasnika i
	 * suglasnika u datom stringu.
	 */
	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		// unos stringa od strane korisnika
		System.out.println("Enter the word or sentence: ");
		String word = input.nextLine();
		// deklaracija i inicijalizacija varijabli:
		char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
		char consonants[] = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
				'n', 'p', 'q', 'r', 's', 't', 'v', 'x', 'z' };
		int countVow = 0;// brojac samoglasnika
		int countCons = 0;// brojac suglasnika
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (word.charAt(i) == vowels[j]) {
					// provjerava ima li samoglasnika u stringu i sabira ih
					countVow++;
				}
			}
			for (int k = 0; k < consonants.length; k++) {
				if (word.charAt(i) == consonants[k]) {
					// provjerava ima li suglasnika u stringu i sabira ih
					countCons++;
				}
			}
		}
		// Prikaz rezultata
		System.out.println("\nNumber of vowels is " + countVow
				+ ",\nand the number of consonants is " + countCons + ".");
	}
}