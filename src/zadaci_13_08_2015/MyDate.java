package zadaci_13_08_2015;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
	// definisemo data fields
	private int year;
	private int month;
	private int day;

	// no-arg konstruktor, kreira instancu klase sa trenutnim datumom
	public MyDate() {
		// kreiramo instancu klase GregorianCalendar za ispis datuma
		Calendar date = new GregorianCalendar();
		this.year = date.get(Calendar.YEAR);
		this.month = date.get(Calendar.MONTH);
		this.day = date.get(Calendar.DAY_OF_MONTH);
	}

	// konstruktor koji kreira datum za vrijeme proslijedjeno u milisekundama
	public MyDate(long elapsedTime) {
		this.setDate(elapsedTime);
	}

	// konstruktor koji kreira datum za proslijedjenu godinu, mjesec i dan
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	// getteri data fields-a
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month + 1;
	}

	public int getDay() {
		return day;
	}

	// metoda koja postavlja datum za vrijeme proslijedjeno u milisekundama
	public void setDate(long elapsedTime) {
		Calendar date = new GregorianCalendar();
		date.setTimeInMillis(elapsedTime);
		this.year = date.get(Calendar.YEAR);
		this.month = date.get(Calendar.MONTH);
		this.day = date.get(Calendar.DAY_OF_MONTH);
	}
}
