package zadaci_22_23_08_2015;

import java.io.*;

public class Zadatak_5 {
	/**
	 * (Create large dataset) Create a data file with 1,000 lines. Each line in
	 * the file consists of a faculty member’s first name, last name, rank, and
	 * salary. The faculty member’s first name and last name for the ith line
	 * are FirstNamei and LastNamei. The rank is randomly generated as
	 * assistant, associate, and full. The salary is randomly generated as a
	 * number with two digits after the decimal point. The salary for an
	 * assistant professor should be in the range from 50,000 to 80,000, for
	 * associate professor from 60,000 to 110,000, and for full professor from
	 * 75,000 to 130,000. Save the file in Salary.txt. Here are some sample
	 * data: FirstName1 LastName1 assistant 60055.95 FirstName2 LastName2
	 * associate 81112.45 . . . FirstName1000 LastName1000 full 92255.21
	 */
	public static void main(String[] args) {
		// kreiramo novi fajl
		File file = new File("Salary.txt");

		// ukolik fajl sa trazenim nazivom vec postoji, program zavrsava s radom
		if (file.exists()) {
			System.out.println("File already exists!");
			System.exit(0);
		}// u suprotnom, kreiramo novi fajl

		// deklarisemo varijable
		double salary;// zarada
		String rank = "";// zvanje
		String[] ranks = { "assistant", "associate", "full" };// moguca zvanja,
																// rangovi

		// za ucitavanje u fajl koristimo PrintWriter objekat
		PrintWriter output;
		try {
			output = new PrintWriter(file);
			// u fajl upisujemo 1000 linija
			// svaka linija sadrzi ime, prezime, rang i zaradu zaposlenog
			for (int i = 1; i <= 1000; i++) {
				// rang generisemo nasumicno iz ranije kreiranog niza
				rank = ranks[(int) (Math.random() * ranks.length)];
				// pozivamo metodu getSalary() i kao argument joj prosljedjujemo
				// generisani rang
				salary = getSalary(rank);
				// upisujemo podatke u fajl
				output.print("FirstName" + i + " LastName" + i);
				output.printf(" " + rank + " %.2f\n", salary);
				output.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	// metoda koja vraca nasumicno generisan broj u odredjenom rasponu
	public static double getSalary(String rank) {
		double salary = 1.0;
		// metodi prosljedjujemo dobijeni rang, te na osnovu toga nasumicno
		// generisemo zaradu u odredjenom rasponu
		if (rank.equals("assistant")) {
			salary = (double) (Math.random() * 30001) + 50000;
		} else if (rank.equals("associate")) {
			salary = (double) (Math.random() * 50001) + 60000;
		} else {
			salary = (double) (Math.random() * 55001) + 75000;
		}
		return salary;
	}
}
