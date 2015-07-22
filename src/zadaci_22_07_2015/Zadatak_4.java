package zadaci_22_07_2015;

public class Zadatak_4 {
	/*
	 * Napisati metodu koja vraæa lokaciju najveæeg elementa u 2D nizu. Metoda
	 * treba da koristi sljedeæi header: public static int[ ]
	 * locateLargest(double[ ][ ] a) Napisati test program koji pita korisnika
	 * da unese 2D niz te mu ispisuje lokaciju najveæeg elementa u nizu.
	 */

	// Metodi kao argument prosljedjujemo 2D niz
	public static int[] locateLargest(double[][] a) {
		double max = a[0][0];// varijabla koja ce sadrzati najveci broj
		int[] largest = new int[2];// array koji ce sadrzati indeks najveceg
									// broja u 2D nizu
		// pomocu nested for petlje provjeravamo sve elemente matrice
		for (int i = 0; i < a.length; i++) {
			// pomocu "i" pristupamo redovima
			for (int j = 0; j < a[i].length; j++) {
				// a pomocu "j" kolonama
				if (max < a[i][j]) {// ukoliko pronadjemo broj koji je veci od
									// trenutnog maksimalnog
					max = a[i][j];// taj broj postaje max
					largest[0] = i;// u niz smijestamo indekse max broja
					largest[1] = j;
				}
			}
		}
		return largest;// kao rezultat vracamo niz koji sadrzi lokaciju max
						// broja
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi 2D niz
		System.out
				.println("Enter the number of rows and columns of the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();

		double[][] matrix = new double[rows][columns];
		System.out.println("Enter the array: ");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[0].length; column++) {
				matrix[row][column] = input.nextInt();
			}
		}
		// pozivamo metodu i rezultat smijestamo u varijablu "location"
		int[] location = locateLargest(matrix);
		// ispisujemo rezultat
		System.out.println("\nThe location of the largest element is at ("
				+ location[0] + ", " + location[1] + ").");
	}
}
