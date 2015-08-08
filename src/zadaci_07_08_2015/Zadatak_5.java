package zadaci_07_08_2015;

public class Zadatak_5 {
	/*
	 * Napisati metodu za sabiranje dvije matrice. Koristiti sljedeci method
	 * header public static double[][] addMatrix(double[][] a, double[][] b).
	 * Korisnik unosi dvije 3x3 matrice, program ispisuje njihovu sumu.
	 */
	// Metoda za sabiranje dvije matrice
	// metodi prosljedjujemo 2 matrice
	public static double[][] addMatrix(double[][] a, double[][] b) {
		// kreiramo novu matricu koja ce sadrzati zbir elemenata proslijedjenih
		// matrica
		double[][] c = new double[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				c[i][j] = a[i][j] + b[i][j];// sabiramo elemente matrica a i b,
											// a zbir spremamo u matricu c

			}
		}
		return c;// metoda vraca novu matricu
	}

	public static void main(String[] args) {
		// kreiramo dvije 3x3x matrice
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		// korisnik unosi elemente prve i druge matrice
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Unesite " + matrix1.length + " reda i "
				+ matrix1[0].length + " kolone prve matrice: ");

		for (int row = 0; row < matrix1.length; row++) {
			for (int column = 0; column < matrix1[row].length; column++) {
				matrix1[row][column] = input.nextInt();
			}
		}
		System.out.println("Unesite " + matrix2.length + " reda i "
				+ matrix2[0].length + " kolone druge matrice: ");

		for (int row = 0; row < matrix2.length; row++) {
			for (int column = 0; column < matrix2[row].length; column++) {
				matrix2[row][column] = input.nextInt();
			}
		}
		// pozivamo metodu addMatrix i ispisujemo novu matricu koja predstavlja
		// zbir proslijedjenih matrica
		System.out
				.println("\nZbir elemenata prve i druge matrice je matrica: ");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				double[][] c = addMatrix(matrix1, matrix2);
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}
}
