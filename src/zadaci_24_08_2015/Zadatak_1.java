package zadaci_24_08_2015;

import java.util.ArrayList;

public class Zadatak_1 {
	/**
	 * (Process large dataset) A university posts its employees’ salaries at
	 * http:// cs.armstrong.edu/liang/data/Salary.txt. Each line in the file
	 * consists of a faculty member’s first name, last name, rank, and salary
	 * (see Programming Exercise 12.24). Write a program to display the total
	 * salary for assistant professors, associate professors, full professors,
	 * and all faculty, respectively, and display the average salary for
	 * assistant professors, associate professors, full professors, and all
	 * faculty, respectively.
	 */
	public static void main(String[] args) {
		// deklarisanje varijabli:
		// ukupna zarada za svaki rang
		double assistantSalary = 0.0;
		double associateSalary = 0.0;
		double fullSalary = 0.0;
		// broj profesora svakog ranga
		int countAssistant = 0;
		int countAssociate = 0;
		int countFull = 0;

		try {
			// kreiramo URL objekat za web adresu
			java.net.URL url = new java.net.URL(
					"http://cs.armstrong.edu/liang/data/Salary.txt");

			// koristimo openStream() metodu iz URL klase za pristup ulaznom
			// toku i kreiranje Scanner objekta
			java.util.Scanner input = new java.util.Scanner(url.openStream());
			// citamo podatke iz fajla
			while (input.hasNext()) {
				// podaci su uneseni u fajl sljedecim redom
				// ime_prezime_rang_zarada
				String name = input.next();
				String lastName = input.next();
				String rank = input.next();
				double salary = input.nextDouble();
				// za svaki rang racunamo ukupnu zaradu i racunamo broj
				// profesora svakog ranga
				if (rank.equals("assistant")) {
					assistantSalary += salary;
					countAssistant++;
				} else if (rank.equals("associate")) {
					associateSalary += salary;
					countAssociate++;
				} else if (rank.equals("full")) {
					fullSalary += salary;
					countFull++;
				}
			}
			// ukupna zarada profesora svih rangova
			double totalSalary = assistantSalary + associateSalary + fullSalary;
			// ukupan broj profesora svih rangova
			int countTotal = countAssistant + countAssociate + countFull;
			// Ispisujemo rezultate
			System.out.println("The total salary for assistant professors is "
					+ assistantSalary);
			System.out.println("The total salary for associate professors is "
					+ associateSalary);
			System.out.println("The total salary for full professors is "
					+ fullSalary);
			System.out.println("The total salary for full faculty is "
					+ totalSalary);
			System.out.printf(
					"The average salary for assistant professors is %.2f\n",
					assistantSalary / countAssistant);
			System.out.printf(
					"The average salary for associate professors is %.2f\n",
					associateSalary / countAssociate);
			System.out.printf(
					"The average salary for full professors is %.2f\n",
					fullSalary / countFull);
			System.out.printf("The average salary for full faculty is %.2f\n",
					totalSalary / countTotal);

		} catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (java.io.IOException ex) {
			System.out.println("I/O Errors: no such file");
		}
	}
}
