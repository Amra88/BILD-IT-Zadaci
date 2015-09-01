package zadaci_26_08_2015;

public class Zadatak_4 {
	/**
	 * (Sum the areas of geometric objects) Write a method that sums the areas
	 * of all the geometric objects in an array. The method signature is: public
	 * static double sumArea(GeometricObject[] a). Write a test program that
	 * creates an array of four objects (two circles and two rectangles) and
	 * computes their total area using the sumArea method.
	 */
	// Metoda koja vraca sumu povrsina svih objekata proslijedjenih u nizu
	public static double sumArea(GeometricObject[] a) {
		// ukupna povrsina svih objekata
		double totalArea = 0;
		// racunamo povrsinu svakog objekta u nizu i dodajemo je ukupnoj
		// povrsini
		for (int i = 0; i < a.length; i++) {
			totalArea += a[i].getArea();
		}
		// metoda vraca ukupnu povrsinu
		return totalArea;
	}

	public static void main(String[] args) {
		// kreiramo niz objekata GeometricObject tipa
		GeometricObject[] arr = { new CircleFromGeometricObject(6),
				new CircleFromGeometricObject(4),
				new RectangleFromGeometricObject(4, 2),
				new RectangleFromGeometricObject(6, 1) };
		// metodi sumArea() prosljedjujemo kreirani niz i ispisujemo rezultat
		System.out
				.println("The total area of all the geometric objects in an array is "
						+ sumArea(arr));
	}
}
