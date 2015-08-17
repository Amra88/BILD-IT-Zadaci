package zadaci_13_08_2015;

public class Zadatak_3 {
	/*
	 * 10.13 (Geometry: the MyRectangle2D class) Define the MyRectangle2D class
	 * that contains: 
	 * -- Two double data fields named x and y that specify the center of the 
	 * rectangle with getter and setter methods. (Assume that the
	 * rectangle sides are parallel to x- or y- axes.) 
	 * -- The data fields width and height with getter and setter methods. 
	 * -- A no-arg constructor that creates a default rectangle with (0, 0) for 
	 * (x, y) and 1 for both width and height. 
	 * -- A constructor that creates a rectangle with the specified x, y, width, 
	 * and height. 
	 * -- A method getArea() that returns the area of the rectangle. 
	 * -- A method getPerimeter() that returns the perimeter of the rectangle. 
	 * -- A method contains(double x, double y) that returns true
	 * if the specified point (x, y) is inside this rectangle. 
	 * -- A method contains(MyRectangle2D r) that returns true if the
	 * specified rectangle is inside this rectangle. 
	 * -- A method overlaps(MyRectangle2D r) that returns true if the specified
	 * rectangle overlaps with this rectangle. 
	 * Write a test program that creates a MyRectangle2D object r1 
	 * (new MyRectangle2D(2, 2, 5.5, 4.9)), displays its area and perimeter, 
	 * and displays the result of r1.contains(3, 3), r1.contains(new MyRectangle2D
	 * (4, 5, 10.5, 3.2)), and r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)).
	 */
	public static void main(String[] args) {
		// kreiramo novu instancu MyRectangle2D klase
		// konstruktoru proslijedjujemo vrijednosti data fields-a
		MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
		// pozivamo metode iz klase i ispisujemo rezultate
		System.out.println("The area of the rectangle: " + r1.getArea());
		System.out.println("The perimeter: " + r1.getPerimeter());
		System.out.println("The rectangle contains specified point (3,3): "
				+ r1.contains(3, 3));
		System.out.println("The rectangle contains another rectangle: "
				+ r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
		System.out.println("The rectangle overlaps another rectangle: "
				+ r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
	}
}
