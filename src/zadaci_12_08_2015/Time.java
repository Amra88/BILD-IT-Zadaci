package zadaci_12_08_2015;

public class Time {
	// definisemo data fields
	private int hour;
	private int minute;
	private int second;

	// no-arg konstruktor, kreira objekat koji vraca trenutno vrijeme
	public Time() {
		setTime(System.currentTimeMillis());
	}

	// konstruktor koji kreira objekat za racunanje odredjenog vremena
	// prosljedjujemo odredjeno vrijeme proteklo od od 1.1.1970
	public Time(long elapsedTime) {
		setTime(elapsedTime);
	}

	// konstruktor koji kreira objekat Time klase sa odredjenim satima, minutama
	// i sekundama
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	// getteri za private data fields
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	// metoda za racunanje vremena, odnosno sati, minuta i sekundi
	// metodi prosljedjujemo odredjeno vrijeme u milisekundama
	public void setTime(long elapsedTime) {
		second = (int) (elapsedTime / 1000) % 60;
		minute = (int) (elapsedTime / 1000) / 60 % 60;
		hour = (int) (elapsedTime / 1000) / 60 / 60 % 24;
	}

}
