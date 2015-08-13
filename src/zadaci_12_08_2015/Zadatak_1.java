package zadaci_12_08_2015;

public class Zadatak_1 {
	/*
	 * (The Time class) Design a class named Time. The class contains: -- The
	 * data fields hour, minute, and second that represent a time. -- A no-arg
	 * constructor that creates a Time object for the current time. (The values
	 * of the data fields will represent the current time.) -- A constructor
	 * that constructs a Time object with a specified elapsed time since
	 * midnight, January 1, 1970, in milliseconds. (The values of the data
	 * fields will represent this time.) -- A constructor that constructs a Time
	 * object with the specified hour, minute, and second. -- Three getter
	 * methods for the data fields hour, minute, and second, respectively. -- A
	 * method named setTime(long elapseTime) that sets a new time for the object
	 * using the elapsed time. For example, if the elapsed time is 555550000
	 * milliseconds, the hour is 10, the minute is 19, and the second is 10.
	 * Draw the UML diagram for the class and then implement the class. Write a
	 * test program that creates two Time objects (using new Time() and new
	 * Time(555550000)) and displays their hour, minute, and second in the
	 * format hour:minute:second.
	 */
	public static void main(String[] args) {
		// kreiramo dvije instance Time klase
		Time t1 = new Time();// no-arg konstruktor
		Time t2 = new Time(555550000);// kao argument, konstruktoru
										// prosljedjujemo proteklo vrijeme
		// pozivajuci getter metode nad kreiranim instancama, ispisujemo
		// rezultat
		System.out.println("Current time: " + t1.getHour() + ":"
				+ t1.getMinute() + ":" + t1.getSecond());
		System.out.println("Specified time: " + t2.getHour() + ":"
				+ t2.getMinute() + ":" + t2.getSecond());
	}
}
