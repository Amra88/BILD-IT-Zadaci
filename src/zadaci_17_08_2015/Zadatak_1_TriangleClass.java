package zadaci_17_08_2015;

public class Zadatak_1_TriangleClass {
	/*
	 * (The Triangle class) Design a class named Triangle that extends
	 * GeometricObject. The class contains: 
	 * Three double data fields named side1, side2, and side3 with default 
	 * values 1.0 to denote three sides of the triangle. 
	 * A no-arg constructor that creates a default triangle. 
	 * A constructor that creates a triangle with the specified side1, side2, and
	 * side3. 
	 * The accessor methods for all three data fields.
	 * A method named getArea() that returns the area of this triangle.
	 * A method named getPerimeter() that returns the perimeter of this triangle.  
	 * A method named toString() that returns a string description for the triangle. 
	 * The toString() method is implemented as follows: return "Triangle: side1 = "
	 *  + side1 + " side2 = " + side2 + " side3 = " + side3;
	 * Write a test program that prompts the user to enter three sides of the 
	 * triangle, a color, and a Boolean value to indicate whether the triangle is 
	 * filled. The program should create a Triangle object with these sides and 
	 * set the color and filled properties using the input. The program should 
	 * display the area, perimeter, color, and true or false to indicate whether 
	 * it is filled or not.
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// kreiramo novu instancu Triangle klase
		Triangle t1 = new Triangle();
		System.out.println("Enter three sides of the triangle: ");
		// korisnik unosi tri vrijednosti za stranice trougla, koje dodjeljujemo
		// objektu koristeci settere
		t1.setSide1(input.nextDouble());
		t1.setSide2(input.nextDouble());
		t1.setSide3(input.nextDouble());
		// korisnik unosi i ostale vrijednosti za data fields
		// setteri se nalaze u extendovanoj klasi GeometricObject
		System.out.println("Enter a color of the triangle: ");
		t1.setColor(input.next());

		System.out.println("Is the triangle filled (true or false): ");
		t1.setFilled(input.nextBoolean());
		// pozivamo metode iz Triangle klase i GeometricObject klase nad
		// kreiranim objektom
		System.out.println(t1.toString());
		System.out.println("The area of a triangle is: " + t1.getArea());
		System.out.println("The perimeter of a triangle is: "
				+ t1.getPerimeter());
		System.out.println("The color of a triangle is: " + t1.getColor());
		System.out.println("The triangle is filled: " + t1.isFilled());

	}
}
