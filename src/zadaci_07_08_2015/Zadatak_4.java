package zadaci_07_08_2015;

public class Zadatak_4 {
	/*
	 * Napisati metodu koja vraca sumu svih elemenata odredjene kolone u
	 * matrici. Koristiti sljedeci method header public static double
	 * sumColumn(double[][] m, int columnIndex). Napisati test program koji
	 * ucitava 3x4 matricu i prikazuje sumu za svaku kolonu
	 */
	// Metoda koja vraca sumu odredjene kolone u matrici
	// kao argumente prima matricu i broj kolone za koju cemo racunati sumu
	public static double sumColumn(double[][] m, int columnIndex) {
		double columnSum = 0;// suma elemenata neke kolone
		for (int i = 0; i < m.length; i++) {
			// sabiramo elemente odredjene kolone
			columnSum += m[i][columnIndex];
		}
		return columnSum;// metoda vraca sumu elemenata kolone
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi elemente matrice
		System.out.println("Unesite 3x4 matricu: ");
		double[][] matrix = new double[3][4];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		for (int i = 0; i < 4; i++) {
			// pozivamo metodu i ispisujemo sumu elemenata za sve 4 kolone
			System.out.print("\nSuma elemenata kolone " + i + " je: "
					+ sumColumn(matrix, i));
		}
	}
}
