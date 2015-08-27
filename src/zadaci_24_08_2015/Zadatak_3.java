package zadaci_24_08_2015;

import java.io.*;
import java.util.*;

public class Zadatak_3 {
	/**
	 * (Baby name popularity ranking) The popularity ranking of baby names from
	 * years 2001 to 2010 is downloaded from www.ssa.gov/oact/babynames and
	 * stored in files named babynameranking2001.txt, babynameranking2002.txt, .
	 * . . , babynameranking2010.txt. Each file contains one thousand lines.
	 * Each line contains a ranking, a boy’s name, number for the boy’s name, a
	 * girl’s name, and number for the girl’s name. For example, the first two
	 * lines in the file babynameranking2010.txt are as follows: 1 Jacob 21,875
	 * Isabella 22,731 2 Ethan 17,866 Sophia 20,477 So, the boy’s name Jacob and
	 * girl’s name Isabella are ranked #1 and the boy’s name Ethan and girl’s
	 * name Sophia are ranked #2. 21,875 boys are named Jacob and 22,731 girls
	 * are named Isabella. Write a program that prompts the user to enter the
	 * year, gender, and followed by a name, and displays the ranking of the
	 * name for the year.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// korisnik unosi godinu, pol i ime
		System.out.print("Enter the year: ");
		String year = input.next();

		System.out.print("Enter the gender (M or F): ");
		String gender = input.next();

		System.out.print("Enter the name: ");
		String name = input.next();
		// kreiramo novi File objekat
		// nazivu fajla dodajemo godinu koju unosi korisnik
		File file = new File("babynamesranking" + year + ".txt");
		boolean cond = false;// uslov

		try {
			// citamo podatke iz fajla
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				// podatke citamo redom kojim su uneseni u fajl
				int rank = scanner.nextInt();
				String nameM = scanner.next();
				scanner.nextInt();
				String nameF = scanner.next();
				scanner.nextInt();
				// slucaj kada trazimo musko ime
				if (gender.equalsIgnoreCase("M")
						&& name.equalsIgnoreCase(nameM)) {
					// ukoliko pronadjemo trazeno ime
					// ispisujemo na kojem se mjestu ime nalazilo u datoj godini
					System.out.println(name + " is ranked #" + rank
							+ " in year " + year);
					cond = true;// ime je pronadjeno, uslov postavljamo na true
								// i izlazimo iz petlje
					break;
					// slucaj kada trazimo zensko ime
				} else if (gender.equalsIgnoreCase("F")
						&& name.equalsIgnoreCase(nameF)) {
					System.out.println(name + " is ranked #" + rank
							+ " in year " + year);
					cond = true;
					break;
				}

			}
			// zatvaramo Scanner
			scanner.close();
			// ispisujemo poruku ako ime nije pronadjeno
			if (!cond) {
				System.out.println("The name " + name
						+ " is not ranked in year " + year);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
