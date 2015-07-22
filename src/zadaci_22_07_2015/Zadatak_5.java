package zadaci_22_07_2015;

public class Zadatak_5 {
	/*
	 * Implementirati sljedeæu metodu da sortira redove u 2D nizu. public static
	 * double[ ][ ] sortRows(double[ ][ ] array) Napisati testni program koji
	 * pita korisnika da unese 3x3 matricu (ili da pita korisnika koliku matricu
	 * želi unijeti) te mu ispisuje na konzoli matricu sa sortiranim redovima -
	 * od najmanjeg broja do najveæeg.
	 */
	// Metoda kao parametar prima 2D array
	public static double[][] sortRows(double[][] array) {
		// koristeci for petlju i metodu .sort iz Arrays klase, sortiramo sve
		// redove u 2D array-u
		for (int i = 0; i < array.length; i++) {
			java.util.Arrays.sort(array[i]);
		}
		return array;// metoda vraca sortirani 2D array
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi 2D array
		System.out
				.println("Enter the number of rows and columns of the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();
		// kreiramo 2D array; korisnik unosi elemente
		double[][] matrix = new double[rows][columns];
		System.out.println("Enter the array: ");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[0].length; column++) {
				matrix[row][column] = input.nextInt();

			}
		}
		// kreiramo novi array u koji cemo smjestiti sortirani 2D array, nakon
		// sto pozovemo metodu
		double[][] sorted = new double[rows][columns];
		// pozivamo metodu sortRows i prosljedjujemo joj 2D array koji je unio
		// korisnik
		sorted = sortRows(matrix);
		// Printamo sortirani 2D array
		System.out.println("\nThe row-sorted array is: ");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[0].length; column++) {
				System.out.print(sorted[row][column] + " ");

			}
			System.out.println();
		}
	}
}
