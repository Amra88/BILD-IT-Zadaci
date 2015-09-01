package zadaci_26_08_2015;

public class Zadatak_1 {
	/**
	 * (Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to
	 * extend GeometricObject and implement the Comparable interface. Override
	 * the equals method in the Object class. Two Circle objects are equal if
	 * their radii are the same.
	 */
	public static void main(String[] args) {
		// kreiramo tri instance CircleFromGeometricObject klase i
		// prosljedjujemo vrijednost poluprecnika konstruktoru
		CircleFromGeometricObject circle1 = new CircleFromGeometricObject(6);
		CircleFromGeometricObject circle2 = new CircleFromGeometricObject(8);
		CircleFromGeometricObject circle3 = new CircleFromGeometricObject(6);
		// pozivamo metodu equals () nad objektima, i ispisujemo rezultat,
		// odnosno, da li su objekti jednaki
		System.out.println("Circle1 and Circle2 objects are equal >> "
				+ circle1.equals(circle2));
		System.out.println("Circle1 and Circle3 objects are equal >> "
				+ circle1.equals(circle3));
		System.out.println("Circle2 and Circle3 objects are equal >> "
				+ circle2.equals(circle3));

	}
}
