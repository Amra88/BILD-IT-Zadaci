package zadaci_08_08_2015;

public class Zadatak_3 {
	/*
	 * Napisite program koji nasumicno dodjeljuje vrijednosti 0 ili 1 u 4x4
	 * matricu, printa matricu, te pronalazi prvi red i kolonu sa najvecim
	 * brojem jedinica.
	 */
	public static void main(String[] args) {
		// kreiramo novu matricu velicine 4x4
		int[][] matrix = new int[4][4];
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[0].length; column++) {
				// koristeci metodu random iz Math klase, nasumicno dodjeljujemo
				// vrijednosti 0 ili 1 elementima matrice
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
		int[] rows = new int[4];// niz koji sadrzi broj jedinica u svakom redu
								// matrice
		int[] columns = new int[4];// niz koji sadrzi broj jedinica u svakoj
									// koloni matrice
		for (int row = 0; row < matrix.length; row++) {
			// prilikom svake nove iteracije, brojaci su postavljeni na 0
			countRows = 0;
			countColumns = 0;
			for (int column = 0; column < matrix.length; column++) {
				// brojimo jedinice u redovima
				if (matrix[row][column] == 1) {
					// ako je neki element u redu =1
					countRows++;// uvecavamo brojac
					rows[row] = countRows;// vrijednost brojaca spremamo u niz i
											// prelazimo u sljedeci red

				}
				// brojimo jedinice u kolonama
				if (matrix[column][row] == 1) {
					// ako je neki element u koloni =1
					countColumns++;// uvecavamo brojac
					columns[row] = countColumns;// vrijednost brojaca spremamo u
												// niz i prelazimo u sljedecu
												// kolonu
				}
			}
		}
		int maxRow = 0;// indeks reda s najvecim brojem jedinica
		int maxColumn = 0;// indeks kolone s najvecim brojem jedinica

		for (int i = 0; i < 4; i++) {
			// u nizu koji sadrzi broj jedinica za svaki red, trazimo red sa
			// najvecim brojem jedinica
			if (rows[maxRow] < rows[i]) {
				maxRow = i;
			}
			// u nizu koji sadrzi broj jedinica za svaku kolonu, trazimo kolonu
			// sa najvecim brojem jedinica
			if (columns[maxColumn] < columns[i]) {
				maxColumn = i;
			}
		}
		// ispisujemo rezultat
		System.out
				.println("\nRed sa najvecim brojem jedinica je red sa indeksom " + maxRow);
		System.out.println("Kolona sa najvecim brojem jedinica je kolona sa indeksom "
				+ maxColumn);
	}
}
