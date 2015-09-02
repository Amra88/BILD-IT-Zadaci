package zadaci_27_08_2015;

public class Zadatak_4 {
	/**
	 * (Math: The Complex class) A complex number is a number in the form a +
	 * bi, where a and b are real numbers and i is 2-1. The numbers a and b are
	 * known as the real part and imaginary part of the complex number,
	 * respectively. You can perform addition, subtraction, multiplication, and
	 * division for complex numbers using the formulas. (A complex number can be
	 * interpreted as a point on a plane by identifying the (a,b) values as the
	 * coordinates of the point. The absolute value of the complex number
	 * corresponds to the distance of the point to the origin, as shown in
	 * Figure 13.10b.) Design a class named Complex for representing complex
	 * numbers and the methods add, subtract, multiply, divide, and abs for
	 * performing complexnumber operations, and override toString method for
	 * returning a string representation for a complex number. The toString
	 * method returns (a + bi) as a string. If b is 0, it simply returns a. Your
	 * Complex class should also implement the Cloneable interface. Provide
	 * three constructors Complex(a, b), Complex(a), and Complex(). Complex()
	 * creates a Complex object for number 0 and Complex(a) creates a Complex
	 * object with 0 for b. Also provide the getRealPart() and
	 * getImaginaryPart() methods for returning the real and imaginary part of
	 * the complex number, respectively. Write a test program that prompts the
	 * user to enter two complex numbers and displays the result of their
	 * addition, subtraction, multiplication, division, and absolute value.
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi dva kompleksna broja
		System.out.println("Enter the first complex number:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		System.out.println("Enter the second complex number:");
		double c = input.nextDouble();
		double d = input.nextDouble();
		// kreiramo dvije instance Complex klase i konstruktoru prosljedjujemo
		// unesene vrijednosti
		Complex complex1 = new Complex(a, b);
		Complex complex2 = new Complex(c, d);
		// Ispisujemo rezultate sabiranja, oduzimanja, mnozenja i dijeljenja dva
		// kompleksna broja, kao i apsolutnu vrijednost prvog kompleksnog broja
		System.out.println(complex1 + " + " + complex2 + " = "
				+ complex1.add(complex2));
		System.out.println(complex1 + " - " + complex2 + " = "
				+ complex1.subtract(complex2));
		System.out.println(complex1 + " * " + complex2 + " = "
				+ complex1.multiply(complex2));
		System.out.println(complex1 + " / " + complex2 + " = "
				+ complex1.divide(complex2));
		System.out.println("|" + complex1 + "|" + " = " + complex1.abs());
	}

}
