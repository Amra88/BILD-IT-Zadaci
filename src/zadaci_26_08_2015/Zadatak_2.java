package zadaci_26_08_2015;

public class Zadatak_2 {
	/**
	 * (Enable Rectangle comparable) Rewrite the Rectangle class in Listing 13.3
	 * to extend GeometricObject and implement the Comparable interface.
	 * Override the equals method in the Object class. Two Rectangle objects are
	 * equal if their areas are the same.
	 */
	public static void main(String[] args) {
		// kreiramo tri instance RectangleFromGeometricObject klase i
		// prosljedjujemo vrijednosti data fields-a konstruktoru
		RectangleFromGeometricObject rectangle1 = new RectangleFromGeometricObject(
				8, 4);
		RectangleFromGeometricObject rectangle2 = new RectangleFromGeometricObject(
				6, 2);
		RectangleFromGeometricObject rectangle3 = new RectangleFromGeometricObject(
				8, 4);
		// pozivamo metodu equals () nad objektima, i ispisujemo rezultat,
		// odnosno, da li su objekti jednaki
		System.out.println("Rectangle1 and Rectangle2 objects are equal >> "
				+ rectangle1.equals(rectangle2));
		System.out.println("Rectangle1 and Rectangle3 objects are equal >> "
				+ rectangle1.equals(rectangle3));
		System.out.println("Rectangle2 and Rectangle3 objects are equal >> "
				+ rectangle2.equals(rectangle3));
	}
}
