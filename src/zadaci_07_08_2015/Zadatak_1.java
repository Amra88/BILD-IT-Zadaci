package zadaci_07_08_2015;

public class Zadatak_1 {
	/*
	 * Napisati program koji generise 100 nasumicnih cijelih brojeva izmedju 0 i
	 * 9 i prikazuje koliko se puta koji broj ponovio.
	 */
	public static void main(String[] args) {
		// kreiramo novi niz velicine 10
		int[] counts = new int[10];// niz ima indekse od 0 do 9
		for (int i = 0; i < 100; i++) {
			// generisemo 100 nasumicnih brojeva od 0 do 9
			// za svaki generisani broj uvecavamo brojac sa tim brojem (indeks
			// niza)
			counts[(int) (Math.random() * 10)]++;

		}
		// ispisujemo rezultat
		for (int i = 0; i < counts.length; i++) {
			System.out.println("Broj " + i + " se ponovio " + counts[i]
					+ " puta.");
		}
	}
}
