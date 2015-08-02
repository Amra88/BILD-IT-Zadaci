package zadaci_01_08_2015;

public class Zadatak_5 {
	/*
	 * Napisati metodu koja ispisuje n x n matricu koristeæi se sljedeæim
	 * headerom: public static void printMatrix(int n). Svaki element u matrici
	 * je ili 0 ili 1, nasumièno generisana. Napisati test program koji pita
	 * korisnika da unese broj n te mu ispiše n x n matricu u konzoli.
	 */
	// Metoda za ispis n x n matrice
	public static void printMatrix(int n) {
		int[][] matrix = new int[n][n];// kreiramo novi 2D array sa brojem
										// redova i kolona koje metodi
										// prosljedjujemo kao argument
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// nasumicno generisemo elemente matrice, brojeve 0 ili 1
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// printamo generisanu matricu
				System.out.print(matrix[i][j] + " ");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Unesite broj n (broj redova i kolona u matrici): ");
		int n = input.nextInt();// korisnik unosi broj
		// pozivamo metodu printMatrix, prosljedjujemo joj broj koji unosi
		// korisnik i printamo matricu
		printMatrix(n);
	}

}
