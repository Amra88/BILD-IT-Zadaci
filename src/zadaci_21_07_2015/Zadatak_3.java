package zadaci_21_07_2015;

import java.io.*;
import java.util.Scanner;

public class Zadatak_3 {
	/*
	 * Napišite program koji æe brojati broj karaktera, rijeèi i linija teksta u
	 * nekom fileu. Rijeèi trebaju biti odvojene jednim spaceom. Ime file
	 * proslijediti kao argument u vaš program.
	 */
	public static void main(String[] args) throws Exception {

		Scanner userInput = new Scanner(System.in);
		// korisnik unosi ime fajla
		System.out.println("Enter a filename: ");
		// pozivamo metod numOfCharsWordsLines i prosljedjujemo mu ime fajla
		numOfCharsWordsLines(userInput.next());
	}

	public static void numOfCharsWordsLines(String fileName) throws Exception {
		int countChars = 0;// brojac karaktera
		int countWords = 0;// brojac rijeci
		int countLines = 0;// brojac linija
		// novi fajl sa imenom koje smo proslijedili
		File file = new File(fileName);
		Scanner input = new Scanner(file);
		// citanje iz fajla
		while (input.hasNextLine()) {
			// petlja radi dok u fajlu ima nova linija
			String line = input.nextLine();
			countChars += line.length();// sabiranje karaktera(sabiramo
										// karaktere iz svih linija)
			countWords += line.split(" ").length;// sabiranje rijeci(svaku
													// liniju iz fajla dijelimo
													// po space-u te sabiramo
													// razdvojene elemente)
			countLines++;// sabiranje linija
		}
		input.close();
		// ispis rezultata
		System.out.println("Number of characters: " + countChars
				+ "\nNumber of words: " + countWords + "\nNumber of lines: "
				+ countLines);
	}
}
