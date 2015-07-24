package zadaci_23_07_2015;

import java.util.*;

public class Zadatak_3 {
	/*
	 * Napisati metodu sa sljedeæim headerom koja ispisuje tri broja u rastuæem
	 * redosljedu: public static void displaySortedNumbers(double num1, double
	 * num2, double num3). Napisati program koji pita korisnika da unese tri
	 * broja te ispiše ta tri broja u rastuæem redosljedu.
	 */
	// Metodi prosljedjujemo 3 broja koja treba sortirati
	public static void displaySortedNumbers(double num1, double num2,
			double num3) {
		// kreiramo niz u koji smijestamo brojeve
		double numbers[] = { num1, num2, num3 };
		// iz Arrays klase pozivamo metodu .sort koja sortira brojeve u rastucem
		// redoslijedu
		Arrays.sort(numbers);
		System.out.println("Brojevi u rastucem redoslijedu su: ");
		// Printamo sve brojeve iz sortiranog niza
		for (double e : numbers) {
			System.out.print(e + " ");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// korisnik unosi 3 broja
		System.out.println("Unesite broj 1: ");
		double n1 = input.nextDouble();
		System.out.println("Unesite broj 2: ");
		double n2 = input.nextDouble();
		System.out.println("Unesite broj 3: ");
		double n3 = input.nextDouble();
		// pozivamo metodu i prosljedjujemo joj brojeve koje je unio korisnik
		displaySortedNumbers(n1, n2, n3);
	}
}
