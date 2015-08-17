package zadaci_13_08_2015;

public class Zadatak_1 {
	/*
	 * (Geometry: the Circle2D class) Define the Circle2D class that contains: 
	 * - Two double data fields named x and y that specify the center of the
	 * circle with getter methods. 
	 * - A data field radius with a getter method. -
	 * - A no-arg constructor that creates a default circle with (0, 0) for (x, y)
	 * and 1 for radius. 
	 * - A constructor that creates a circle with the specified x, y, and radius. 
	 * - A method getArea() that returns the area of the circle. 
	 * - A method getPerimeter() that returns the perimeter of the circle. 
	 * - A method contains(double x, double y) that returns true if the
	 * specified point (x, y) is inside this circle. 
	 * - A method contains(Circle2D circle) that returns true if the specified
	 * circle is inside this circle. 
	 * - A method overlaps(Circle2D circle) that returns true if the specified circle
	 * overlaps with this circle. 
	 * Write a test program that creates a Circle2D object c1 (new Circle2D(2, 2, 5.5)),
	 *  displays its area and perimeter, and
	 * displays the result of c1.contains(3, 3), c1.contains(new Circle2D(4, 5, 10.5)), 
	 * and c1.overlaps(new Circle2D(3, 5, 2.3)).
	 */
	public static void main(String[] args) {
		// kreiramo novu instancu klase Circle2D
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		// pozivamo metode iz klase i ispisujemo:
		// povrsinu i obim kruga
		System.out.println("\nThe area of the circle c1 is " + c1.getArea()
				+ ", and the perimeter is " + c1.getPerimeter());
		// da li krug sadrzi tacku
		System.out.println("Circle c1 contains point (3, 3): "
				+ c1.contains(3, 3));
		// da li krug sadrzi drugi krug
		System.out.println("Circle c1 contains new Circle2D: "
				+ c1.contains(new Circle2D(4, 5, 10.5)));
		// da li se krugovi preklapaju
		System.out.println("Circle c1 overlaps new Circle2D: "
				+ c1.overlaps(new Circle2D(3, 5, 2.3)));
	}
}
