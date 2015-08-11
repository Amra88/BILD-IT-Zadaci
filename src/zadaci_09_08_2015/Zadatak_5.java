package zadaci_09_08_2015;

public class Zadatak_5 {
	/*
	 * (The Location class) Design a class named Location for locating a maximal
	 * value and its location in a two-dimensional array. The class contains
	 * public data fields row, column, and maxValue that store the maximal value
	 * and its indices in a two-dimensional array with row and column as int
	 * types and maxValue as a double type. Write the following method that
	 * returns the location of the largest element in a two-dimensional array:
	 * public static Location locateLargest(double[][] a).The return value is an
	 * instance of Location. Write a test program that prompts the user to enter
	 * a two-dimensional array and displays the location of the largest element
	 * in the array.
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi velicinu niza
		System.out
				.println("Enter the number of rows and columns in the array: ");
		int rows = input.nextInt();// broj redova
		int columns = input.nextInt();// broj kolona

		double[][] matrix = new double[rows][columns];// kreiramo novi niz
		// korisnik unosi elemente niza
		System.out.println("Enter the array: ");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[0].length; column++) {
				matrix[row][column] = input.nextDouble();

			}

		}
		// pozivamo metodu locateLargest i prosljedjujemo joj matricu
		Location location = Location.locateLargest(matrix);
		// ispisujemo rezultat
		System.out.println("\nThe largest element is " + location.maxValue
				+ ".\nThe location of the largest element is at: row "
				+ location.row + ", column " + location.column + ".");

	}

}
