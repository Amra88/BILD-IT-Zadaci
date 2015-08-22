package zadaci_20_08_2015;

import java.util.ArrayList;

public class Zadatak_2 {
	/*
	 * (Algebra: perfect square) Write a program that prompts the user to enter
	 * an integer m and find the smallest integer n such that m * n is a perfect
	 * square. (Hint: Store all smallest factors of m into an array list. n is
	 * the product of the factors that appear an odd number of times in the
	 * array list. For example, consider m = 90, store the factors 2, 3, 3, 5 in
	 * an array list. 2 and 5 appear an odd number of times in the array list.
	 * So, n is 10.)
	 */

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter an integer m: ");
		// korisnik unosi cijeli broj "m"
		int m = input.nextInt();
		// kreiramo novu Arraylistu u koju spremamo najmanje faktore unesenog
		// broja
		// faktore dobijamo pozivajuci metodu getFactors
		ArrayList<Integer> factors = new ArrayList<>(getFactors(m));
		// kreiramo novu matricu sa 2 kolone i onoliko redova koliko ima faktora
		// u listi
		int[][] temp = new int[factors.size()][2];
		// faktore iz liste kopiramo u prvu kolonu matrice
		for (int i = 0; i < temp.length; i++) {
			temp[i][0] = factors.get(i);
		}
		// uporedjujemo prvu kolonu matrice sa brojevima iz liste i brojimo
		// koliko se puta koji broj ponovio
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < factors.size(); j++) {
				if (temp[i][0] == factors.get(j)) {
					// vrijednost brojaca (broj ponavljanja) za svaki broj u
					// matrici spremamo u drugu kolonu
					temp[i][1]++;
				}
			}
		}
		// kreiramo novu ArrayListu
		ArrayList<Integer> counts = new ArrayList<>();
		// za svaki broj (faktor) u matrici, provjeravamo da li je njegov broj
		// ponavljanja paran ili neparan broj
		for (int i = 0; i < temp.length; i++) {
			if (temp[i][1] % 2 != 0) {
				// ukoliko je brojac nekog broja (faktora) neparan, taj faktor
				// dodajemo u kreiranu listu
				counts.add(temp[i][0]);
			}
		}
		// kreiramo novu ArrayListu u koju kopiramo elemente iz prethodne liste,
		// s tim sto uklanjamo duplikate
		// lista oddCounts je i konacna lista koja sadrzi faktore broja "m" koji
		// se ponavljaju neparno puta
		ArrayList<Integer> oddFactors = new ArrayList<>();

		for (int i = 0; i < counts.size(); i++) {
			// ako se u novoj listi ne nalazi faktor iz prethodne liste koji
			// provjeravamo
			// faktor dodajemo u novu listu
			if (!oddFactors.contains(counts.get(i))) {
				oddFactors.add(counts.get(i));
			}
		}
		int smallestN = 1;// broj "n"
		for (int i : oddFactors) {
			// broj "n" dobijamo tako sto mnozimo sve faktore broja "m" koji se
			// ponavljaju neparno puta
			smallestN *= i;
		}
		// ispisujemo rezultat, odnosno broj "n" i perfect square broj (m*n)
		System.out
				.println("\nThe smallest number n such that m * n is a perfect square is number "
						+ smallestN);
		System.out.println("\t\tm * n = " + (m * smallestN));
	}

	// metoda koja pronalazi najmanje faktore nekog broja koji prosljedjujemo
	// metodi kao argument
	public static ArrayList<Integer> getFactors(int m) {
		// kreiramo novu ArrayListu u koju spremamo faktore
		ArrayList<Integer> factors = new ArrayList<>();
		int divisor = 2;// djelilac broja
		// djelilac moze imati vrijednost od 2 pa do samog broja
		while (divisor <= m) {
			// broj dijelimo sa djeliocem
			if (m % divisor == 0) {
				// ukoliko nema ostatka pri dijeljenju, djelilac, odnosno faktor
				// broja, dodajemo u listu
				factors.add(divisor);
				m /= divisor;// broj dijelimo djeliocem i vracamo se u petlju
			} else {
				// ako pri dijeljenju ima ostatka, uvecavamo djelilac i
				// nastavljamo trazenje faktora
				divisor++;
			}
		}
		return factors;// metoda vraca listu najmanjih faktora nekog broja
	}
}
