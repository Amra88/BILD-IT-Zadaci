package zadaci_08_08_2015;

public class Zadatak_5 {
	/*
	 * Napisati program koji generise 6x6 matricu, popunjava je vrijednostima 0
	 * i 1, prikazuje matricu, te provjerava da li svaki red i kolona imaju isti
	 * broj jedinica.
	 */
	public static void main(String[] args) {
		// kreiramo novu matricu velicine 6x6
		int[][] matrix = new int[6][6];
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				// nasumicno dodjeljujemo vrijednosti 0 ili 1 elementima matrice
				matrix[row][column] = (int) (Math.random() * 2);
			}
		}
		// printamo generisanu matricu
		System.out.println("Generisana matrica:\n");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.printf("%3s", matrix[row][column]);
			}
			System.out.println();
		}
		int countRows = 0;// brojac jedinica u redovima
		int countColumns = 0;// brojac jedinica u kolonama
		int[] rows = new int[6];// niz koji sadrzi broj jedinica u svakom redu
								// matrice
		int[] columns = new int[6];// niz koji sadrzi broj jedinica u svakoj
									// koloni matrice
		for (int i = 0; i < matrix.length; i++) {
			// prilikom svake nove iteracije, brojaci su postavljeni na 0
			countRows = 0;
			countColumns = 0;
			for (int j = 0; j < matrix.length; j++) {
				// brojimo jedinice u redovima
				if (matrix[i][j] == 1) {
					// ako je neki element u redu =1
					countRows++;// uvecavamo brojac
					rows[i] = countRows;// vrijednost brojaca spremamo u niz i
										// prelazimo u sljedeci red
				}
				// brojimo jedinice u kolonama
				if (matrix[j][i] == 1) {
					// ako je neki element u koloni =1
					countColumns++;// uvecavamo brojac
					columns[i] = countColumns;// vrijednost brojaca spremamo u
												// niz i prelazimo u sljedecu
												// kolonu
				}
			}
		}
		boolean isEven = true;// boolean vrijednost true ako je broj jedinica
								// jednak
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 6; j++) {
				// provjeravamo da li je broj jedinica u svakom redu i koloni
				// isti
				if (rows[i] != rows[j] && columns[i] != columns[j]) {
					isEven = false;
				}
			}
		}
		// u zavisnosti od rezultata prethodne provjere, ispisujemo rezultat
		if (isEven) {
			System.out
					.println("\nSvi redovi i kolone imaju jednak broj jedinica.");
		} else {
			System.out
					.println("\nSvi redovi i kolone nemaju jednak broj jedinica.");
		}
	}
}
