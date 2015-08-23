package zadaci_21_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadatak_3 {
	/**
	 * (Remove text) Write a program that removes all the occurrences of a
	 * specified string from a text file. For example, invoking java
	 * Exercise12_11 John filename removes the string John from the specified
	 * file. Your program should get the arguments from the command line.
	 */
	public static void main(String[] args) {
		// provjeravamo da li su proslijedjeni argumenti validni
		if (args.length != 2) {
			// ukoliko nisu, ispisujemo poruku i program zavrsava sa radom
			System.out.println("Invalid arguments.");
			System.out.println("Enter: \"wordToRemove _ fileName\"");
			System.exit(1);
		}

		// provjeravamo da li fajl sa trazenim nazivom postoji
		File file = new File(args[1]);
		if (!file.exists()) {
			// ukoliko ne postoji, ispisujemo poruku korisniku i izlazimo iz
			// programa
			System.out.println(args[1] + " does not exist.");
			System.exit(0);
		}

		// koristeci Scanner, citamo iz fajla
		String s = "";
		try {
			Scanner input = new Scanner(file);
			while (input.hasNext()) {
				s += input.nextLine();
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		// koristimo metodu replaceAll da uklonimo zeljenu rijec iz fajla,
		// odnosno zamijenimo je sa ""
		// rijec je proslijedjena programu kao prvi argument
		s = s.replaceAll(args[0], "");
		try {
			// nakon sto smo uklonili odredjenu rijec iz fajla, izmijenjeni
			// tekst ucitavamo u fajl
			// za ucitavanje u fajl, koristimo PrintWriter
			PrintWriter output = new PrintWriter(file);
			System.out.println(s);// ispisujemo izmijenjeni tekst
			output.write(s);
			output.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
