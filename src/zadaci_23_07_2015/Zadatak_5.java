package zadaci_23_07_2015;

import java.util.*;

public class Zadatak_5 {
	/*
	 * Napisati program koji uèitava neodreðeni broj cijelih brojeva (nula
	 * prekida unos) te ispisuje koliko je brojeva bilo iznad ili jednako
	 * prosjeku svih unešenih brojeva a koliko je bilo brojeva ispod prosjeka.
	 * Pretpostavimo da je maksimalan niz brojeva koje korisnik može unijeti
	 * 100.
	 */
	// Metoda za racunanje sume brojeva
	public static int getSum(ArrayList<Integer> list) {

		int sum = 0;// suma
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);// sabiramo sve brojeve iz liste
		}
		return sum;// metoda vraca sumu
	}

	// metoda za racunanje prosjeka brojeva
	public static double getAverage(ArrayList<Integer> list) {
		double s = getSum(list);// pozivamo metodu koja izracunava sumu
		double average = s / list.size();// sumu dijelimo sa brojem elemenata u
											// listi da dobijemo prosjek

		return average;// metoda vraca prosjek brojeva
	}

	// metoda za ispis brojeva ispod i iznad prosjeka
	public static void belowAndAboveAverage(ArrayList<Integer> list) {
		double b = getAverage(list);// dobijamo prosjek brojeva pozivajuci
									// metodu getAverage
		int below = 0;// brojevi ispod
		int above = 0;// brojevi iznad prosjeka
		for (int i = 0; i < list.size(); i++) {
			// ako je broj iz liste na indeksu "i" manji od prosjeka,
			if (list.get(i) < b) {
				below++;// uvecavamo brojac za brojeve ispod prosjeka
			} else {
				above++;// u suprotnom, uvecavamo brojac za brojeve iznad
						// prosjeka
			}
		}
		// ispis rezultata
		System.out.println("Ispod prosjeka je " + below
				+ " brojeva, a iznad prosjeka " + above + " brojeva.");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nums;// brojevi koje ce unositi korisnik
		int count = 0;// brojac unesenih brojeva
		ArrayList<Integer> list = new ArrayList<>();// kreiramo novu Array listu

		System.out.println("Unesite cijele brojeve, unos zavrsava nulom: ");
		do {
			// korisnik unosi brojeve
			nums = input.nextInt();
			list.add(nums);// brojeve dodajemo u Array listu
			count++;// uvecavamo brojac nakon svakog dodanog broja

		} while (nums != 0 && count <= 100);// uslov: korisnik unosi brojeve sve
											// dok ne unese 0; maksimalno
											// brojeva-100
		list.remove(list.size() - 1);// nakon sto je kreirana, iz liste
										// uklanjamo posljednji element, tj.0
		// Ispisujemo podatke
		System.out.println("\nUnijeli ste " + list.size() + " brojeva");
		System.out.println("Suma unesenih brojeva je " + getSum(list));
		System.out.println("Prosjek svih brojeva je " + getAverage(list));
		// pozivamo metodu koja ce ispisati koliko je brojeva ispod, a
		// koliko iznad prosjeka
		belowAndAboveAverage(list);
	}
}
