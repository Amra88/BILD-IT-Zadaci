package zadaci_10_08_2015;

public class Zadatak_2 {
	/*
	 * (Algebra: solve linear equations) Write a method that solves the
	 * following 2 * 2 system of linear equations: a00x + a01y = b0 a10x + a11y
	 * = b1 x = b0a11 - b1a01/a00a11 - a01a10 y =b1a00 - b0a10/a00a11 - a01a10
	 * The method header is public static double[] linearEquation(double[][] a,
	 * double[] b) The method returns null if a00a11 - a01a10 is 0. Write a test
	 * program that prompts the user to enter a00, a01, a10, a11, b0, and b1,
	 * and displays the result. If a00a11 - a01a10 is 0, report that “The
	 * equation has no solution.”
	 */
	// Metoda za rjesavanje sistema linearnih jednacina
	public static double[] linearEquation(double[][] a, double[] b) {
		double[] result = new double[2];// kreiramo niz u koji cemo spremiti
										// rjesenje
		double k = a[0][0] * a[1][1] - a[0][1] * a[1][0];// racunamo
															// determinantu
		if (k == 0) {
			// ukoliko je determinanta jednaka 0, jednacina nema rjesenja
			// ispisujemo poruku i program zavrsava s radom
			System.out.println("The equation has no solution.");
			System.exit(0);
		}
		// racunamo x i y, dvije nepoznate u sistemu linearnih jednacina
		double x = (b[0] * a[1][1] - b[1] * a[0][1]) / k;
		double y = (b[1] * a[0][0] - b[0] * a[1][0]) / k;
		// rezultat spremamo u niz
		result[0] = x;
		result[1] = y;
		return result;// metoda vraca niz koji sadrzi rjesenje sistema linearnih
						// jednacina

	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// kreiramo matricu koja ce sadrzati koeficijente sistema linearnih
		// jednacina sa dvije nepoznate
		double[][] a = new double[2][2];
		// kao i niz koji ce sadrzati slobodne clanove sistema
		double[] b = new double[2];
		// korisnik unosi koeficijente sistema, koje spremamo
		// u matricu
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter a[" + i + "]" + "[" + j + "]");
				a[i][j] = input.nextDouble();
			}
		}
		// zatim unosi slobodne clanove sistema koje spremamo u niz
		for (int k = 0; k < b.length; k++) {
			System.out.println("Enter b[" + k + "]");
			b[k] = input.nextDouble();
		}

		double[] solution = new double[2];// kreiramo novi niz u koji cemo
											// spremiti rjesenje
		solution = linearEquation(a, b);// pozivamo metodu i prosljedjujemo joj
										// argumente
		// ispisujemo rezultat, rjesenje sistema linearnih jednacina
		System.out.println("\nX = " + solution[0] + "\nY = " + solution[1]);

	}
}
