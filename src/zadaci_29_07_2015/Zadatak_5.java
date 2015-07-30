package zadaci_29_07_2015;

public class Zadatak_5 {
	/*
	 * Napisati program koji uèitava neodreðen broj cijelih brojeva, odreðuje
	 * koliko je pozitivnih brojeva korisnik unio, koliko negativnih te
	 * izraèunava ukupnu sumu i prosjek svih unesenih brojeva. (Korisnik prekida
	 * unos tako što unese nulu). Na primjer, ukoliko korisnik unese 1 2 -1 3 0
	 * program treba da ispiše da je broj pozitivnih brojeva 3, negativnih
	 * brojeva 1, suma ili zbir su 5.0 a prosjek svih brojeva je 1.25.
	 */
	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out
				.println("Unesite cijele brojeve, pozitivne ili negativne (unos zavrsava 0):");
		int num = 1;// brojevi koje ce unositi korisnik
		int positive = 0;// brojac pozitivnih brojeva
		int negative = 0;// brojac negativnih brojeva
		int sum = 0;// suma svih brojeva

		while (num != 0) {
			// korisnik unosi brojeve sve dok ne unese 0
			num = input.nextInt();
			sum += num; // svaki uneseni broj dodajemo sumi
			// brojimo koliko je pozitivnih i negativnih brojeva uneseno:
			if (num > 0) {
				positive++;
			} else if (num < 0) {
				negative++;
			} else {
				// racunamo prosjek svih brojeva
				double average = sum * 1.0 / (positive + negative);
				// ispisujemo rezultat
				System.out.println("\nPozitivnih brojeva je " + positive
						+ ", a negativnih " + negative
						+ "\nZbir/razlika svih brojeva je " + sum
						+ "\nProsjeèna vrijednost brojeva je " + average);
			}
		}
	}
}
