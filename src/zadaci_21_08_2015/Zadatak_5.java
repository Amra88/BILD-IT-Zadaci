package zadaci_21_08_2015;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Zadatak_5 {
	/**
	 * (Process scores in a text file) Suppose that a text file contains an
	 * unspecified number of scores separated by blanks. Write a program that
	 * prompts the user to enter the file, reads the scores from the file, and
	 * displays their total and average.
	 */
	public static void main(String[] args) throws IOException {
		java.io.File file = new java.io.File("scores.txt");
		java.util.Scanner input = new java.util.Scanner(file);

		// Deklarisanje varijabli:
		double score;// brojevi koje unosi korisnik
		double total = 0;// zbir unesenih brojeva
		double average;// prosjek unesenih brojeva
		int count = 0;// brojac unesenih brojeva

		// Unos podataka od strane korisnika
		System.out.println("Enter numbers separated by space: ");
		java.util.Scanner userInput = new java.util.Scanner(System.in);
		// Upisivanje podataka u fajl
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		// u fajl upisujemo podatke koje unosi korisnik
		output.print(userInput.nextLine());

		output.close();

		// Ispis podataka iz fajla
		System.out.print("\nScores: ");
		while (input.hasNext()) {
			score = input.nextDouble();
			total += score; // Sabiranje unesenih brojeva
			count++; // Brojac unesenih brojeva
			System.out.print(score + "  ");// ispisujemo sve skorove iz fajla
		}
		input.close();
		average = total / count; // Racunanje prosjeka brojeva
		// Ispis rezultata:
		System.out.println("\nTotal sum: " + total);
		System.out.printf("Average: %2.2f", average);

	}

}
