package zadaci_10_08_2015;

public class Zadatak_4 {
	/*
	 * (Geometry: area of a triangle) Write a method that returns the area of a
	 * triangle using the following header: public static double
	 * getTriangleArea(double[][] points) The points are stored in a 3-by-2
	 * two-dimensional array points with points[0] [0] and points[0][1] for (x1,
	 * y1). The triangle area can be computed using the formula in Programming
	 * Exercise 2.19. The method returns 0 if the three points are on the same
	 * line. Write a program that prompts the user to enter three points of a
	 * triangle and displays the triangle's area.
	 */
	// Metoda za racunanje povrsine trougla
	// metodi prosljedjujemo dvodimenzionalni niz kao argument
	public static double getTriangleArea(double[][] points) {
		// racunamo stranice trougla, odnosno rastojanje izmedju tacaka,
		// koristeci se odgovarajucim formulama
		// koristimo metode sqrt i pow iz Math klase za korjenovanje, odnosno
		// stepenovanje brojeva
		double s1 = Math.sqrt(Math.pow((points[1][0] - points[0][0]), 2)
				+ Math.pow((points[1][1] - points[0][1]), 2));
		double s2 = Math.sqrt(Math.pow((points[2][0] - points[0][0]), 2)
				+ Math.pow((points[2][1] - points[0][1]), 2));
		double s3 = Math.sqrt(Math.pow((points[2][0] - points[1][0]), 2)
				+ Math.pow((points[2][1] - points[1][1]), 2));

		double s = (s1 + s2 + s3) / 2;
		// nakon sto smo dobili stranice, racunamo i povrsinu trougla
		double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
		return area;// metoda vraca izracunatu povrsinu trougla u ravni
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		double[][] a = new double[3][2];// kreiramo novu matricu koja ce
										// sadrzati koeficijente sistema
		System.out.println("Enter x1, y1, x2, y2, x3, y3: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				// korisnik unosi elemente (koordinate tjemena trougla) koje
				// spremamo u matricu
				a[i][j] = input.nextDouble();
			}
		}
		double solution = getTriangleArea(a);// pozivamo metodu i prosljedjujemo
												// joj matricu
		// ispisujemo rezultat
		System.out.println("The area of the triangle is " + solution);
	}
}
