package zadaci_25_08_2015;

public class Zadatak_2 {
	/**
	 * (Enable GeometricObject comparable) Modify the GeometricObject class to
	 * implement the Comparable interface, and define a static max method in the
	 * GeometricObject class for finding the larger of two GeometricObject
	 * objects. Draw the UML diagram and implement the new GeometricObject
	 * class. Write a test program that uses the max method to find the larger
	 * of two circles and the larger of two rectangles.
	 */
	public static void main(String[] args) {
		// kreiramo dvije instance CircleFromGeomtricObject klase i konstruktoru
		// prosljedjujemo vrijednosti data fields-a (poluprecnik kruga)
		GeometricObject circle1 = new CircleFromGeomtricObject(5);
		GeometricObject circle2 = new CircleFromGeomtricObject(7);
		// treci objekat je tipa GeometricObject - superklasa u kojoj se nalazi
		// metoda max, koja vraca veci od dva objekta koja proslijedimo
		GeometricObject circle = GeometricObject.max(circle1, circle2);
		// ispisujemo rezultat
		System.out.println("The larger circle is circle with: \n"
				+ circle.toString());
		// kreiramo dvije instance RectangleFromGeomtricObject klase i
		// konstruktoru prosljedjujemo vrijednosti data fields-a
		GeometricObject rectangle1 = new RectangleFromGeometricObject(5, 3);
		GeometricObject rectangle2 = new RectangleFromGeometricObject(4, 2);
		// treca instanca sadrzi objekat koji vraca metoda max, nakon sto joj
		// proslijedimo dva objekta za poredjenje
		GeometricObject rectangle = GeometricObject.max(rectangle1, rectangle2);
		// ispisujemo rezultat
		System.out.println("\nThe larger rectangle is rectangle with: \n"
				+ rectangle.toString());
	}

}
