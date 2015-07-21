package zadaci_21_07_2015;

public class Zadatak_4 {
	/*
	 * Napisati metodu koja ispisuje n x n matricu korsiteæi sljedeæi header:
	 * public static void printMatrix(int n) Svaki element u matrici je ili 0
	 * ili 1, generisan nasumièno. Napisati test program koji pita korisnika da
	 * unese n te ispisuje n x n matricu.
	 */

	// Metodi prosljedjujemo broj redova i kolona(n x n matrica)
	public static void printMatrix(int n) {
		int[][] matrix = new int[n][n];// kreiramo matricu sa brojem redova i
										// kolona koje je unio korisnik
		// pomocu duple for petlje popunjavamo sva mjesta u matrici(redove i
		// kolone)
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// matrica sadrzi nasumicno generisane elemente(0 ili 1)
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}
		// printanje matrice
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// unos velicine matrice(broja redova i kolona) od strane korisnika
		System.out.println("Enter n: ");
		int n = input.nextInt();
		// pozivanje metoda printMatrix kojem prosljedjujemo broj n
		printMatrix(n);
	}

}
