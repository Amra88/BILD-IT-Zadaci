package zadaci_22_23_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_1 {
	/**
	 * 12.12 (Reformat Java source code) Write a program that converts the Java
	 * source code from the next-line brace style to the end-of-line brace
	 * style. For example, the following Java source in (a) uses the next-line
	 * brace style. Your program converts it to the end-of-line brace style in
	 * (b). Your program can be invoked from the command line with the Java
	 * sourcecode file as the argument. It converts the Java source code to a
	 * new format.For example, the following command converts the Java
	 * source-code file Test.java to the end-of-line brace style. java
	 * Exercise12_12 Test.java
	 *
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// kao argument prosljedjujemo ime fajla
		// provjeravamo da li je proslijedjeni argument validan
		if (args.length != 1) {
			// ukoliko nije, ispisujemo poruku i program zavrsava sa radom
			System.out.println("Invalid arguments.");
			System.out
					.println("Usage: java zadaci_22_23_08_2015.Zadatak_1 Test.java");
			System.exit(1);
		}
		// kreiramo novi File objekat
		File file = new File(args[0]);
		// provjeravamo da li fajl sa trazenim nazivom postoji
		if (!file.exists()) {
			// ukoliko ne postoji, ispisujemo poruku korisniku i izlazimo iz
			// programa
			System.out.println(args[0] + " does not exist.");
			System.exit(0);
		}
		// kreiramo novu ArrayListu
		ArrayList<String> list = new ArrayList<>();
		// varijable za cuvanje teksta iz fajla
		String str1 = "";
		String str2 = "";

		// citamo tekst iz fajla
		// za citanje iz fajla koristimo Scanner objekat
		Scanner input = null;
		try {
			input = new Scanner(file);
			str1 = input.nextLine();
			while (input.hasNext()) {
				str2 = input.nextLine();
				// provjeravamo da li je posljednji karakter svakog stringa = {
				if (str2.length() > 0 && str2.charAt(str2.length() - 1) == '{') {
					// ako jeste, liniji teksta pridruzujemo zagradu "{" i takav
					// string dodajemo u listu
					list.add(str1.concat(" {"));
					str1 = input.nextLine();
				} else {
					// u suprotnom, u listu dodajemo nepromijenjen string iz
					// fajla
					list.add(str1);
					str1 = str2;
				}
			}
			list.add(str1);
		} finally {
			input.close();
		}
		// upisujemo stringove iz liste u fajl
		// za ucitavanje u fajl koristimo PrintWriter objekat
		PrintWriter output = null;
		try {
			output = new PrintWriter(file);

			for (int i = 0; i < list.size(); i++) {
				output.println(list.get(i));
			}
		} finally {
			output.close();
		}
		// ispisujemo tekst iz fajla, u "end-of-line brace" stilu
		Scanner input1 = new Scanner(file);
		while (input1.hasNext()) {
			String str = input1.nextLine();
			System.out.println(str);
		}

	}
}