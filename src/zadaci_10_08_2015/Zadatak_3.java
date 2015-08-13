package zadaci_10_08_2015;

public class Zadatak_3 {
	/*
	 * Write a method that returns the intersecting point of two lines. The
	 * intersecting point of the two lines can be found by using the formula
	 * shown in Programming Exercise 3.25. Assume that (x1, y1) and (x2, y2) are
	 * the two points on line 1 and (x3, y3) and (x4, y4) are on line 2. The
	 * method header is public static double[] getIntersectingPoint(double[][]
	 * points) The points are stored in a 4-by-2 two-dimensional array points
	 * with (points[0][0], points[0][1]) for (x1, y1). The method returns the
	 * intersecting point or null if the two lines are parallel. Write a program
	 * that prompts the user to enter four points and displays the intersecting
	 * point.
	 */
	// Metoda za racunanje tacke presjeka dvije prave u ravni
	public static double[] getIntersectingPoint(double[][] points) {
		double[] result = new double[2];// kreiramo novi niz koji ce sadrzati
										// rezultat, odnosno koordinate u ravni
		// racunamo determinate
		double a = points[0][1] - points[1][1];
		double b = points[0][0] - points[1][0];
		double c = points[2][1] - points[3][1];
		double d = points[2][0] - points[3][0];
		double e = (a * points[0][0]) - (b * points[0][1]);
		double f = (c * points[2][0]) - (d * points[2][1]);

		double k = a * d - b * c;
		if (k == 0) {
			// ako je k jednako 0, prave su paralelne, odnosno, ne presijecaju
			// se
			// ispisujemo poruku i program zavrsava s radom
			System.out.println("The two lines are parallel.");
			System.exit(0);
		}
		// pomocu sistema jednacina racunamo nepoznate x i y, koordinate tacke
		// presjeka dvije prave u ravni
		double x = (e * d - b * f) / k;
		double y = (a * f - e * c) / k;
		// rezultat spremamo u niz
		result[0] = x;
		result[1] = y;

		return result;// metoda vraca niz koji sadrzi rjesenje, x i y
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		double[][] a = new double[4][2];// kreiramo matricu koja ce sadrzati
										// koeficijente sistema
		// korisnik unosi elemente matrice
		System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = input.nextDouble();// elemente spremamo u matricu
			}
		}
		double[] solution = new double[2];// kreiramo niz u koji spremamo
											// rjesenje
		solution = getIntersectingPoint(a);// pozivamo metodu i prosljedjujemo
											// joj matricu kao argument
		// ispisujemo rezultat
		System.out.println("The intersecting point is at ( " + solution[0]
				+ ", " + solution[1] + " )");
	}
}
