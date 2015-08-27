package zadaci_24_08_2015;

import java.io.File;
import java.util.Scanner;

public class Zadatak_2 {
	/**
	 * (Occurrences of each letter) Write a program that prompts the user to
	 * enter a file name and displays the occurrences of each letter in the
	 * file. Letters are case-insensitive.
	 */

	public static void main(String[] args) throws Exception {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a filename: ");
		// kreiramo novi File objekat
		// naziv fajla unosi korisnik
		File file = new File(userInput.next());
		// kreiramo niz karaktera koji sadrzi sva mala slova
		char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
				'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
				'x', 'y', 'z' };
		// kreiramo niz od 26 brojeva koji ce biti brojaci karaktera
		int[] occurence = new int[26];

		Scanner input = new Scanner(file);
		// koristeci Scanner citamo podatke iz fajla
		while (input.hasNext()) {
			// sva slova u tekstu postavljamo na mala
			String line = input.nextLine().toLowerCase();
			// uporedjujemo karaktere iz linije teksta sa karakterima u
			// kreiranom nizu
			for (int i = 0; i < line.length(); i++) {
				for (int j = 0; j < chars.length; j++) {
					// ukoliko je karakter iz fajla jednak slovu u nizu
					if (line.charAt(i) == chars[j]) {
						// u int nizu uvecavamo indeks jednak onom na kojem se
						// slovo nalazi
						// na taj nacin brojimo koliko se puta koje slovo
						// ponovilo u fajlu
						occurence[j]++;

					}
				}
			}
		}
		// zatvaramo Scanner
		input.close();
		// Ispisujemo rezultat
		for (int i = 0; i < occurence.length; i++) {
			System.out.println("Number of " + chars[i] + "'s :" + occurence[i]);
		}

	}
}
