package zadaci_09_08_2015;

public class StopWatch {
	private long startTime;// pocetno vrijeme
	private long endTime;// krajnje vrijeme

	// no-arg konstruktor
	public StopWatch() {
		// inicijaliziramo pocetno vrijeme u milisekundama (jednako je trenutnom
		// vremenu)
		startTime = System.currentTimeMillis();

	}

	// metoda koja resetuje pocetno vrijeme na trenutno
	public void start() {
		startTime = System.currentTimeMillis();
	}

	// metoda koja postavlja krajnje vrijeme na trenutno vrijeme
	public void stop() {
		endTime = System.currentTimeMillis();
	}

	// getter pocetnog vremena
	public long getStartTime() {
		return startTime;
	}

	// getter krajnjeg vremena
	public long getEndTime() {
		return endTime;
	}

	// metoda koja racuna vrijeme proteklo izmedju pocetnog i krajnjeg vremena
	public long getElapsedTime() {
		long elapsedTime = endTime - startTime;
		return elapsedTime;
	}
}
