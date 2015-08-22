package zadaci_20_08_2015;

import java.util.InputMismatchException;

public class Zadatak_3 {
	/*
	 * (InputMismatchException) Write a program that prompts the user to read
	 * two integers and displays their sum. Your program should prompt the user
	 * to read the number again if the input is incorrect.
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		boolean cond = true;// uslov za izvrsavanje petlje
		do {
			// try blok naredbi se izvrsava u normalnim okolnostima
			// ukoliko dodje do InputMismatchException, try blok poziva catch
			// blok koji "hvata" i obradjuje exception
			try {
				System.out.println("Enter two integers: ");
				// korisnik unosi 2 broja
				int num1 = input.nextInt();
				int num2 = input.nextInt();
				int sum = num1 + num2;// racunamo njihovu sumu
				// ispisujemo rezultat
				System.out.println("The sum of entered numbers is: " + sum);
				cond = false;// uslov je false kada je unos ispravan; petlja
								// zavrsava sa radom
			} catch (InputMismatchException ex) {
				// ukoliko korisnik unese neispravnu (neocekivanu) vrijednost,
				// izvrsava se catch blok
				System.out.println("Incorrect input! Try again!");
				input.nextLine();// izjava kojom se odbacuje prethodni
									// (neispravan) unos
			}
		} while (cond);// petlja nastavlja s radom sve dok korisnik ne unese
						// ispravnu vrijednost, odnosno, dok je uslov true

	}
}
