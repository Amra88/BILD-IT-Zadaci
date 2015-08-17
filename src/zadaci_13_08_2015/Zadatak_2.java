package zadaci_13_08_2015;

public class Zadatak_2 {
	/*
	 * (Geometry: the Triangle2D class) Define the Triangle2D class that
	 * contains:
	 * -- Three points named p1, p2, and p3 of the type MyPoint with
	 * getter and setter methods. 
	 * -- A no-arg constructor that creates a default triangle with the
	 * points (0, 0), (1, 1), and (2, 5). 
	 * -- A constructor that creates a triangle with the specified points. 
	 * -- A method getArea() that returns the area of the triangle. 
	 * -- A method getPerimeter() that returns the perimeter of the triangle. 
	 * -- A method contains(MyPoint p) that returns true if the specified 
	 * point p is inside this triangle. 
	 * -- A method contains(Triangle2D t) that returns true if the specified 
	 * triangle is inside this triangle. 
	 * -- A method overlaps(Triangle2D t) that returns true if the specified 
	 * triangle overlaps with this.
	 * Write a test program that creates a Triangle2D objects t1 using the 
	 * constructor new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), 
	 * new MyPoint(5, 3.5)), displays its area and perimeter, and displays 
	 * the result of t1.contains(3, 3), r1.contains(new Triangle2D
	 * (new MyPoint(2.9, 2), new MyPoint(4, 1), MyPoint(1, 3.4))), and 
	 * t1. overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), 
	 * MyPoint(2, 6.5))).
	 */
	public static void main(String[] args) {
		// kreiramo novu instancu Triangle2D klase
		// konstruktoru prosljedjujemo odredjene vrijednosti tacaka (tjemena)
		// trougla)
		Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2),
				new MyPoint(4.2, 3), new MyPoint(5, 3.5));
		MyPoint p = new MyPoint(3, 3);// tacka "p", instanca MyPoint klase
		// pozivamo metode iz klase i ispisujemo rezultate za proslijedjene
		// argumente
		System.out.println("The area of the triangle: " + t1.getArea());
		System.out.println("The perimeter of the triangle: "
				+ t1.getPerimeter());
		System.out.println("This triangle contains the new point (3,3): "
				+ t1.contains(p));
		System.out.println("This triangle contains another triangle: "
				+ t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(
						4.0, 1), new MyPoint(1, 3.4))));
		System.out.println("This triangle overlaps another triangle: "
				+ t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(
						4, -3), new MyPoint(2, 6.5))));
	}
}
