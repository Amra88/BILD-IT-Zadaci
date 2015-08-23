package zadaci_21_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak_4 {
	/**
	 * (Count characters, words, and lines in a file) Write a program that will
	 * count the number of characters, words, and lines in a file. Words are
	 * separated by whitespace characters. The file name should be passed as a
	 * command-line argument.
	 */
	public static void main(String[] args) {
		// provjeravamo da li je proslijedjen jedan argument (fileNmae)
		if (args.length != 1) {
			// ukoliko nije, ispisujemo poruku i program zavrsava sa radom
			System.out.println("Invalid arguments.");
			System.out.println("Enter: \"fileName\"");
			System.exit(1);
		}

		// provjeravamo da li fajl sa trazenim nazivom postoji
		File file = new File(args[0]);
		if (!file.exists()) {
			// ukoliko ne postoji, ispisujemo poruku korisniku i izlazimo iz
			// programa
			System.out.println(args[0] + " does not exist.");
			System.exit(0);
		}
		int countChars = 0;// brojac karaktera
		int countWords = 0;// brojac rijeci
		int countLines = 0;// brojac linija u fajlu
		String s = "";// linija u fajlu
		try {
			// koristeci Scanner, citamo linije iz fajla
			Scanner input = new Scanner(file);
			while (input.hasNext()) {
				s = input.nextLine();
				// pri svakoj novoj iteraciji, uvecava se brojac linija u fajlu
				countLines++;
				// sabiramo karaktere iz svake linije fajla
				countChars += s.length();
				// kreiramo novi niz u koji spremamo rijeci iz svake linije
				// fajla
				// liniju fajla splitamo po space-u kako bismo dobili rijeci
				String[] splitWords = s.split(" ");
				for (int i = 0; i < splitWords.length; i++) {
					// brojimo rijeci spremljene u nizu
					countWords++;
				}

			}
		} catch (FileNotFoundException ex) {
			// catch blok hvata FileNotFoundException, ukoliko fajl nije
			// pronadjen
			// metoda printStackTrace() prikazuje exception kao i gdje se u kodu
			// pojavio
			ex.printStackTrace();
		}
		// ispisujemo rezultate
		System.out.println("Number of characters: " + countChars);
		System.out.println("Number of words: " + countWords);
		System.out.println("Number of lines: " + countLines);
	}
}
