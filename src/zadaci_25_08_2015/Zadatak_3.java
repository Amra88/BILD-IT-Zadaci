package zadaci_25_08_2015;

public class Zadatak_3 {
	/**
	 * (The ComparableCircle class) Define a class named ComparableCircle that
	 * extends Circle and implements Comparable. Draw the UML diagram and
	 * implement the compareTo method to compare the circles on the basis of
	 * area. Write a test class to find the larger of two instances of
	 * ComparableCircle objects.
	 */

	public static void main(String[] args) {
		// kreiramo dvije instance ComparableCircle klase i konstruktoru
		// prosljedjujemo vrijednosti data fields-a (poluprecnik kruga)
		ComparableCircle circle1 = new ComparableCircle(22);
		ComparableCircle circle2 = new ComparableCircle(35);
		// varijabla result sprema rezultat poredjenja dva objekta
		int result = circle1.compareTo(circle2);
		// ispisujemo rezultat
		if (result > 0) {
			System.out.println("The larger circle is circle1.");
		} else if (result < 0) {
			System.out.println("The larger circle is circle2.");
		} else {
			System.out.println("The circles are equal.");
		}

	}
}
