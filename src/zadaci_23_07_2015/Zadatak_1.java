package zadaci_23_07_2015;

import java.util.*;

public class Zadatak_1 {
	/*
	 * Napisati program koji pita korisnika da unese neki cijeli broj te
	 * ispisuje njegove najmanje faktore u rastuæem redosljedu. Na primjer,
	 * ukoliko korisnik unese 120 program treba da ispiše 2, 2, 2, 3, 5. (2 * 2
	 * * 2 * 3 * 5 = 120)
	 */
	// Metodi prosljedjujemo broj koji unosi korisnik
	public static ArrayList<Integer> getFactors(int number) {
		// kreiramo novu array listu
		ArrayList<Integer> list = new ArrayList<>();
		// trazenje faktora
		while (number > 1) {
			for (int i = 2; i <= number; i++) {
				// pomocu petlje broj dijelimo sa brojevima od 2 pa do samog
				// broja
				// "i" je djelilac
				if (number % i == 0) {// ako nema ostatka pri dijeljenju
					list.add(i);// djelilac dodajemo u listu
					number = number / i; // zatim broj podijelimo sa tim
											// djeliocem
					break;// vracamo se u petlju
				}
			}
		}
		// dobijenu listu sortiramo pozivajuci .sort metodu iz Collections klase
		Collections.sort(list);
		return list;// metoda vraca sortiranu listu najmanjih faktora nekog
					// broja
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// korisnik unosi broj
		System.out.println("Unesite cijeli broj: ");
		int num = input.nextInt();
		// pozivamo metodu getFactors i ispisujemo rezultat
		System.out.println("\nNajmanji faktori broja " + num + " su:\t"
				+ getFactors(num));
	}
}
