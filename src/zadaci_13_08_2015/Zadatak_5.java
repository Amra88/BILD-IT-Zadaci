package zadaci_13_08_2015;

public class Zadatak_5 {
	/*
	 * 10.15 (Geometry: the bounding rectangle) A bounding rectangle is the
	 * minimum rectangle that encloses a set of points in a two-dimensional
	 * plane, as shown in Figure 10.24d. Write a method that returns a bounding
	 * rectangle for a set of points in a two-dimensional plane, as follows:
	 * public static MyRectangle2D getRectangle(double[][] points) The
	 * Rectangle2D class is defined in Programming Exercise 10.13. Write a test
	 * program that prompts the user to enter five points and displays the
	 * bounding rectangle’s center, width, and height.
	 */
	// metoda koja vraca najmanji pravougaonik koji obuhvata skup tacaka koje
	// prosljedjujemo kao argument
	// tacke su spremljene u dvodimenzionalnom nizu
	// metoda vraca instancu MyRectangle2D klase sa izracunatim vrijednostima
	// koordinata centra pravougaonika, sirine i visine pravougaonika
	public static MyRectangle2D getRectangle(double[][] points) {
		double maxX = points[0][0];
		double minX = points[0][0];
		double maxY = points[0][1];
		double minY = points[0][1];
		for (int i = 1; i < points.length; i++) {
			if (points[i][0] > maxX) {
				maxX = points[i][0];
			}
			if (points[i][0] < minX) {
				minX = points[i][0];
			}
			if (points[i][1] > maxY) {
				maxY = points[i][1];
			}
			if (points[i][1] < minY) {
				minY = points[i][1];
			}
		}
		return new MyRectangle2D((maxX + minX) / 2, (maxY + minY) / 2, maxX
				- minX, maxY - minY);

	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi koordinate 5 tacaka
		System.out.println("Enter five points: ");
		double[][] points = new double[5][2];// kreiramo novi 2D niz
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				// vrijednosti koje korisnik unosi spremamo u 2D niz
				points[i][j] = input.nextDouble();
			}
		}
		// kreiramo novu instancu MyRectangle2D klase
		MyRectangle2D r1 = new MyRectangle2D();
		r1 = getRectangle(points);// pozivamo metodu getRectangle nad kreiranim
									// objektom
		// ispisujemo koordinate centra, kao i sirinu i visinu pravougaonika
		System.out.println("The bounding rectangle's center (" + r1.getX()
				+ ", " + r1.getY() + "), width " + r1.getWidth() + ", height "
				+ r1.getHeight());
	}

}
