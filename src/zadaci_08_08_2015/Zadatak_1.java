package zadaci_08_08_2015;

public class Zadatak_1 {
	/*
	 * Pretpostavimo da su radni sati za sve zaposlene spremljeni u
	 * dvodimenzionalni niz. Svaki red u kolonama sadrzi radne sate za sedam
	 * dana. Napisati program koji prikazuje zaposlene i njihov ukupan broj
	 * radnih sati u opadajucem redoslijedu u odnosu na ukupan broj sati.
	 */
	public static void main(String[] args) {
		// kreiramo 2D niz koji sadrzi radne sate za sve radnike
		// niz je velicine [8][7]
		int[][] hours = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 },
				{ 3, 3, 4, 3, 3, 2, 2 }, { 9, 3, 4, 7, 3, 4, 1 },
				{ 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 },
				{ 3, 7, 4, 8, 3, 8, 4 }, { 6, 3, 5, 9, 2, 7, 9 } };
		// pozivamo metodu i prosljedjujemo joj 2D niz; metoda printa sve
		// radnike i njihove radne sate
		printWeeklyHours(hours);
		// kreiramo novi niz u koji spremamo sortirani niz(metoda sortRows)
		// niz koji sortiramo su ukupni radni sati za svakog radnika(metoda
		// getTotalHours)
		int[] arr = sortRows(getTotalHours(hours));
		// printamo sortirani niz
		System.out.println("\nRadni sati radnika u rastucem redoslijedu: ");
		for (int i = 0; i < hours.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// metoda za printanje matrice(2D niza)
	public static void printWeeklyHours(int[][] matrix) {
		// printamo tabelu-matricu koja sadrzi sve zaposlene i njihove radne
		// sate za svaki dan u sedmici
		System.out.println("              Su  M   T   W   Th  F  Sa\n");

		for (int i = 0; i < matrix.length; i++) {
			System.out.print("Employee " + i + " ");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf(" %3s", matrix[i][j]);
			}
			System.out.println();
		}
	}

	// metoda za racunanje ukupnih radnih sati za svakog radnika
	public static int[] getTotalHours(int[][] matrix) {
		int[] totalHours = new int[8];// niz koji sadrzi ukupan broj radnih sati
										// za sve radnike
		for (int i = 0; i < matrix.length; i++) {
			int total = 0;// ukupno radnih sati za jednog radnika, pri svakoj
							// novoj iteraciji setovan je na 0
			for (int j = 0; j < matrix[0].length; j++) {
				total += matrix[i][j];// sabiramo sve sate za jednog
										// radnika(jedan red matrice)
			}
			totalHours[i] = total;// ukupan broj sati za jednog radnika dodajemo
									// u niz
		}
		return totalHours;// metoda vraca niz koji sadrzi ukupan broj radnih
							// sati za svakog radnika
	}

	// metoda za sortiranje niza
	public static int[] sortRows(int[] row) {
		// pozivamo metodu sort i sortiramo niz brojeva
		java.util.Arrays.sort(row);

		return row;// metoda vraca niz sortiran u RASTUCEM redoslijedu
	}

}
