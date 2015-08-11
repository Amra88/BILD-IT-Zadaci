package zadaci_09_08_2015;

public class Zadatak_1 {
	/*
	 * Implementirati metodu za sortiranje redova u dvodimenzionalnom nizu sa
	 * sljedecim headerom public static double[][] sortRows(double[][] m).
	 * Napisati program koji trazi od korisnika da unese 3x3 matricu sa double
	 * vrijednostima i prikazuje sortiranu matricu.
	 */
	// Metoda za sortiranje redova u dvodimenzionalnom nizu
	// metodi prosljedjujemo 2D niz
	public static double[][] sortRows(double[][] m) {
		for (int i = 0; i < m.length; i++) {
			// koristeci metodu sort iz Arrays klase sortiramo sve redove iz 2D
			// niza u rastucem redoslijedu
			java.util.Arrays.sort(m[i]);
		}
		return m;// metoda vraca sortirani 2D niz
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi velicinu 2D niza
		System.out
				.println("Enter the number of rows and columns of the array: ");
		int rows = input.nextInt();// broj redova
		int columns = input.nextInt();// broj kolona
		// kreiramo novi 2D niz (matricu)
		double[][] matrix = new double[rows][columns];
		// korisnik unosi elemente matrice
		System.out.println("Enter the array: ");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[0].length; column++) {
				matrix[row][column] = input.nextDouble();

			}
		}
		// kreiramo novu matricu u koju spremamo sortiranu matricu nakon
		// pozivanja metode sortRows
		double[][] sorted = new double[rows][columns];
		sorted = sortRows(matrix);
		// ispisujemo sortiranu matricu
		System.out.println("\nThe row-sorted array is: ");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[0].length; column++) {
				System.out.printf("%7.3f", sorted[row][column]);

			}
			System.out.println();
		}
	}
}
