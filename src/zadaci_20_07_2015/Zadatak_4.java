package zadaci_20_07_2015;

public class Zadatak_4 {
	/*
	 * Napišite program koji generiše 100 nasumiènih cijelih brojeva izmeðu 0 i
	 * 9 te ispisuje koliko se puta koji broj ponovio.
	 */

	public static int[] countRandomNumbers() {
		// Deklaracija i odredjivanje duzine niza
		int[] array = new int[10];
		// biljezimo pojavljivanje nasumicnih brojeva:
		for (int i = 0; i < 100; i++) {
			int n = (int) (Math.random() * 10);
			array[n]++;
			// Kada se broj generise (od 0 do 9) uvecava se vrijednost elementa
			// niza za jedan
		}
		return array;// prebrojani niz
	}

	// Main metod
	public static void main(String[] args) {
		int[] arr = countRandomNumbers();// pozivanje metoda countRandomNumbers
		for (int i = 0; i < arr.length; i++) {
			// prikaz dobijenih brojeva
			System.out
					.println("Broj " + i + " se ponovio " + arr[i] + " puta.");
		}
	}
}
