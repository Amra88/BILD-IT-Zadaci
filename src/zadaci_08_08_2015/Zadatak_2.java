package zadaci_08_08_2015;

public class Zadatak_2 {
	/*
	 * Napisati metodu za mnozenje dvije matrice. Koristiti method header public
	 * static double[][] multiplyMatrix(double[][] a, double[][] b). Napisati
	 * program koji trazi od korisnika da unese dvije 3x3 matrice te prikazuje
	 * njihov proizvod.
	 */
	// metoda za mnozenje dvije matrice
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		// kreiramo novu matricu koja ce sadrzati proizvod elemenata
		// proslijedjenih
		// matrica
		double[][] c = new double[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int k = 0; k < a.length; k++) {
					c[i][j] += a[i][k] * b[k][j];// mnozimo elemente matrice,
				}

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
				matrix1[row][column] = input.nextDouble();
			}
		}
		System.out.println("Unesite " + matrix2.length + " reda i "
				+ matrix2[0].length + " kolone druge matrice: ");

		for (int row = 0; row < matrix2.length; row++) {
			for (int column = 0; column < matrix2[row].length; column++) {
				matrix2[row][column] = input.nextDouble();
			}
		}
		// pozivamo metodu multiplyMatrix i ispisujemo novu matricu koja
		// predstavlja
		// proizvod proslijedjenih matrica
		System.out
				.println("\nProizvod elemenata prve i druge matrice je matrica: ");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				double[][] c = multiplyMatrix(matrix1, matrix2);
				System.out.printf("%5.1f", c[i][j]);
			}
			System.out.println();
		}

	}
}
