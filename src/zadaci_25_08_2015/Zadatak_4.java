package zadaci_25_08_2015;

public class Zadatak_4 {
	/**
	 * (The Colorable interface) Design an interface named Colorable with a void
	 * method named howToColor(). Every class of a colorable object must
	 * implement the Colorable interface. Design a class named Square that
	 * extends GeometricObject and implements Colorable. Implement howToColor to
	 * display the message Color all four sides. Draw a UML diagram that
	 * involves Colorable, Square, and GeometricObject. Write a test program
	 * that creates an array of five GeometricObjects. For each object in the
	 * array, display its area and invoke its howToColor method if it is
	 * colorable.
	 */
	public static void main(String[] args) {
		// kreiramo 5 instanci Square klase
		Square s1 = new Square(4, true);
		Square s2 = new Square(12, false);
		Square s3 = new Square(8.1, true);
		Square s4 = new Square(6, false);
		Square s5 = new Square(11, true);
		// objekte (instance) spremamo u niz
		Square[] array = { s1, s2, s3, s4, s5 };
		// prikazujemo svaki objekat iz niza
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].toString());
			array[i].howToColor();
			System.out.println();
		}
	}
}

// definisemo interface
interface Colorable {
	public abstract void howToColor();
}

// klasa Square je subklasa GeometricObject klase
// implementira interface Colorable
class Square extends GeometricObject implements Colorable {
	// data fields
	double a;
	boolean isColorable;

	// no-arg konstruktor
	public Square() {
		a = 1;
		isColorable = false;
	}

	// konstruktor sa odredjenim vrijednostima data fields-a
	public Square(double a, boolean isColorable) {
		this.a = a;
		this.isColorable = isColorable;
	}

	// implementiramo apstraktnu metodu definisanu u interface-u
	@Override
	public void howToColor() {
		if (this.isColorable) {
			System.out.println("Color all four sides.");
		}
	}

	// implementiramo apstrakne metode iz superklase
	@Override
	// povrsina kvadrata
	public double getArea() {
		return Math.pow(a, 2);
	}

	// obim kvadrata
	public double getPerimeter() {
		return 4 * a;
	}

	// metoda toString za prikaz objekta
	@Override
	public String toString() {
		return "The area of the square is " + getArea();
	}

}