package zadaci_26_08_2015;

public class Zadatak_3 {
	/**
	 * (The Octagon class) Write a class named Octagon that extends
	 * GeometricObject and implements the Comparable and Cloneable interfaces.
	 * Assume that all eight sides of the octagon are of equal length. The area
	 * can be computed using the following formula: area = (2 + 4/22)* side *
	 * side. Write a test program that creates an Octagon object with side value
	 * 5 and displays its area and perimeter. Create a new object using the
	 * clone method and compare the two objects using the compareTo method.
	 * 
	 * @throws CloneNotSupportedException
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// kreiramo instancu Octagon klase i konstruktoru prosljedjujemo
		// vrijednost
		Octagon octagon1 = new Octagon(5);
		// kopiramo octagon1 objekat koristeci clone() metodu
		Octagon octagon2 = (Octagon) octagon1.clone();
		// poredimo dva objekta i rezultat spremamo u varijablu result
		int result = octagon1.compareTo(octagon2);
		// ispisujemo rezultate
		System.out.println("Octagon1\n" + octagon1.toString());
		System.out.println("\nCloning Octagon1...\n\nComparing octagons...");
		if (result == 1) {
			System.out.println("\nOctagon1 is larger than its clone.");
		} else if (result == -1) {
			System.out.println("\nOctagon1 is smaller than its clone.");
		} else {
			System.out.println("\nOctagon1 and its clone are equal.");
		}
		System.out.println("\nCloned octagon\n" + octagon2.toString());
	}
}
