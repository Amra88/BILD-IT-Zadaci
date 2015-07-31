package zadaci_30_07_2015;

import java.util.Scanner;

public class Zadatak_2 {
	/*
	 * Napisati program koji pita korisnika da unese dva cijela, pozitivna broja
	 * te ispisuje najveæi i najmanji zajednièki djelilac za ta dva broja.
	 */
	// Metoda za pronalazenje najveceg zajednickog djelioca za dva broja
	public static int getGcd(int n1, int n2) {
		int gcd = 1;// varijabla koja sadrzi najveci zajednicki djelilac
		int m = 2;// broj kojim cemo dijeliti
		// postavljamo uslove
		while (m <= n1 && m <= n2) {
			if (n1 % m == 0 && n2 % m == 0) {// provjeravamo da li su oba broja
												// djeljiva sa istim djeliocem
				gcd = m;// posljednji pronadjeni je i najveci zajednicki
						// djelilac
			}
			m++;
		}
		return gcd;// metoda vraca najveci zajednicki djelilac
	}

	// metoda za pronalazenje najmanjeg zajednickog djelioca za dva broja
	public static int getMcd(int n1, int n2) {
		int mcd = 1;// varijabla koja sadrzi najmanji zajednicki djelilac
		int m = 2;// broj kojim cemo dijeliti
		// postavljamo uslove
		while (m <= n1 && m <= n2) {
			if (n1 % m == 0 && n2 % m == 0) {
				mcd = m;// ukoliko je pronadjen zajednicki djelilac za dva
						// broja, petlja zavrsava s radom
				break;
			}
			m++;
		}
		return mcd;// metoda vraca najmanji zajednicki djelilac
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// korisnik unosi dva broja
		System.out
				.println("Unesite dva cijela pozitivna broja.\nUnesite prvi broj: ");
		int n1 = input.nextInt();
		System.out.println("Unesite drugi broj: ");
		int n2 = input.nextInt();
		// pozivamo metode i ispisujemo najveci i najmanji zajednicki djelilac
		// za dva broja
		System.out.println("Najveci zajednicki djelilac za brojeve " + n1
				+ " i " + n2 + " je broj " + getGcd(n1, n2) + ".");
		System.out.println("Najmanji zajednicki djelilac za brojeve " + n1
				+ " i " + n2 + " je broj " + getMcd(n1, n2) + ".");
	}
}
