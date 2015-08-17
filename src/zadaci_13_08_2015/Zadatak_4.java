package zadaci_13_08_2015;

public class Zadatak_4 {
	/*
	 * 10.14 (The MyDate class) Design a class named MyDate. The class contains:
	 * -- The data fields year, month, and day that represent a date. month is
	 * 0-based, i.e., 0 is for January. 
	 * -- A no-arg constructor that creates a MyDate object for the current date. 
	 * -- A constructor that constructs a MyDate object with a specified elapsed 
	 * time since midnight, January 1, 1970, in milliseconds. 
	 * -- A constructor that constructs a MyDate object with the specified year, 
	 * month, and day. 
	 * -- Three getter methods for the data fields year, month, and day, respectively. 
	 * -- A method named setDate(long elapsedTime) that sets a new date for the 
	 * object using the elapsed time. 
	 * Write a test program that creates two MyDate objects (using new MyDate() and 
	 * new MyDate(34355555133101L)) and displays their year, month, and day. 
	 * (Hint: The first two constructors will extract the year, month,
	 * and day from the elapsed time. For example, if the elapsed time is
	 * 561555550000 milliseconds, the year is 1987, the month is 9, and the day
	 * is 18.
	 */
	public static void main(String[] args) {
		// kreiramo dvije instance MyDate klase
		MyDate d1 = new MyDate();// konstruktoru ne prosljedjujemo argumente
		MyDate d2 = new MyDate(34355555133101L);// prosljedjujemo odredjeno
												// vrijeme u milisekundama
		// ispisujemo godinu, mjesec i dan za kreirane objekte
		System.out.println("The current date: " + d1.getDay() + "."
				+ d1.getMonth() + "." + d1.getYear());
		System.out.println("The date with a specified elapsed time: "
				+ d2.getDay() + "." + d2.getMonth() + "." + d2.getYear());
	}
}
