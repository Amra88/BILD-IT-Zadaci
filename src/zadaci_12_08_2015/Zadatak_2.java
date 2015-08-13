package zadaci_12_08_2015;

public class Zadatak_2 {
	/*
	 * (The MyInteger class) Design a class named MyInteger. The class contains:
	 * -- An int data field named value that stores the int value represented by
	 * this object. -- A constructor that creates a MyInteger object for the
	 * specified int value. -- A getter method that returns the int value. --
	 * The methods isEven(), isOdd(), and isPrime() that return true if the
	 * value in this object is even, odd, or prime, respectively. -- The static
	 * methods isEven(int), isOdd(int), and isPrime(int) that return true if the
	 * specified value is even, odd, or prime, respectively. -- The static
	 * methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that
	 * return true if the specified value is even, odd, or prime, respectively.
	 * -- The methods equals(int) and equals(MyInteger) that return true if the
	 * value in this object is equal to the specified value. -- A static method
	 * parseInt(char[]) that converts an array of numeric characters to an int
	 * value. -- A static method parseInt(String) that converts a string into an
	 * int value. Draw the UML diagram for the class and then implement the
	 * class. Write a client program that tests all methods in the class.
	 */
	public static void main(String[] args) {
		MyInteger m = new MyInteger(1234);// kreiramo novu instancu MyInteger
											// klase
		char[] ch = { '1', '2', '3' };// niz karaktera nad kojim pozivamo metodu
		String str = "4567";// String nad kojim pozivamo metodu
		// pozivamo sve metode i ispisujemo rezultate
		System.out.println("Is even: " + m.isEven());
		System.out.println("Is odd: " + m.isOdd());
		System.out.println("Is prime: " + m.isPrime());
		System.out.println("Is even MyInteger: " + MyInteger.isEven(m));
		System.out.println("Is odd MyInteger: " + MyInteger.isOdd(m));
		System.out.println("Is prime MyInteger: " + MyInteger.isPrime(m));
		System.out.println("Equals: " + m.equals(12));
		System.out.println("Equals MyInteger: " + m.equals(m));
		System.out.println("ParseInt char: " + MyInteger.parseInt(ch));
		System.out.println("ParseInt String: " + MyInteger.parseInt(str));

	}
}
