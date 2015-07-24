package zadaci_23_07_2015;

import java.util.*;

public class Zadatak_2 {
	/*
	 * ISBN-10 (International Standard Book Number) se sadrži od 10 brojeva: d1
	 * d2 d3 d4 d5 d6 d7 d8 d9 d10. Posljednji broj, d10, služi kao checksum i
	 * njega izraèunavamo iz prvih devet brojeva koristeæi se sljedeæom
	 * formulom: (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 +
	 * d8 * 8 + d9 * 9) % 11. Ukoliko je checksum 10, zadnji broj oznaèavamo sa
	 * X u skladu sa ISBN-10 konvencijom. Napisati program koji pita korisnika
	 * da unese prvih 9 brojeva te ispiše desetocifreni ISBN-10 broj. (Primjer:
	 * ukoliko unesemo, kao prvih 9 brojeva, 013601267 program nam ispisuje
	 * 0136012671 kao ISBN-10 broj. Ukoliko unesemo 013031997 kao prvih 9
	 * brojeva, program nam ispisuje 013031997X kao ISBN-10 broj)
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();// kreiramo novu Array listu
		int nums;// brojevi koje ce unositi korisnik
		int count = 0;// brojac unesenih brojeva
		int checksum;// checksum, deseti broj
		int isbn;// ISBN-10 broj
		System.out.println("ISBN-10\nUnesite prvih devet brojeva: ");
		do {
			// korisnik unosi brojeve
			nums = input.nextInt();
			list.add(nums);// brojeve dodajemo u Array listu
			count++;// uvecavamo brojac nakon svakog dodanog broja
		} while (count < 9);// uslov za dodavanje 9 brojeva
		// formula za racunanje desetog broja
		// preko indeksa pristupamo brojevima u listi
		checksum = (list.get(0) * 1 + list.get(1) * 2 + list.get(2) * 3
				+ list.get(3) * 4 + list.get(4) * 5 + list.get(5) * 6
				+ list.get(6) * 7 + list.get(7) * 8 + list.get(8) * 9) % 11;
		System.out.print("\n\tISBN-10 broj je:  ");
		// ispisujemo broj koji je unio korisnik tj. sve brojeve iz liste
		for (Integer e : list) {
			System.out.print(e);
		}
		// tom broju pridruzujemo deseti broj-checksum
		// time dobijamo kompletan ISBN-10 broj
		if (checksum < 10) {
			System.out.print(checksum);
		} else if (checksum == 10) {
			System.out.print("X");
		} else {
			System.out.println("Doslo je do greske!");
		}
	}
}
