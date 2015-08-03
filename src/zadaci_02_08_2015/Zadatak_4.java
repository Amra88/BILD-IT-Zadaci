package zadaci_02_08_2015;

public class Zadatak_4 {
	/* Napisati metodu koja vraæa datum i trenutaèno vrijeme. */

	public static void main(String[] args) {
		// za prikaz datuma i vremena pravimo instancu Date klase iz java.util
		// paketa
		java.util.Date date = new java.util.Date();
		System.out.println("Datum i vrijeme: \n" + date);
	}
}
