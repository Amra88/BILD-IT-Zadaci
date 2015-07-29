package zadaci_28_07_2015;

public class Zadatak_3 {
	/*
	 * Napisati program koji ispisuje sve moguæe kombinacije za biranje dva
	 * broja u rasponu od 1 do 7. Takoðer, program ispisuje broj svih moguæih
	 * kombinacija. Dakle, program treba da ispiše sve moguæe parove brojeva u
	 * datom rasponu, krenuvši sa 1 2, 1 3, 1 4, itd. Broj moguæih kombinacija
	 * je 21.
	 */
	public static void main(String[] args) {
		int count = 0;// broj mogucih kombinacija
		System.out.println("Moguce kombinacije brojeva u rasponu od 1 do 7:\n");
		for (int i = 1; i < 7; i++) {
			// provjeravamo sve brojeve od 1 do 7
			for (int j = i + 1; j <= 7; j++) {
				// printamo sve moguce kombinacije razlicitih brojeva
				System.out.print(i + " " + j + "; ");
				count++;// nakon svake isprintane brojac se uvecava
				// ispisujemo 7 kombinacija u jednom redu
				if (count % 7 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("\nUkupan broj mogucih kombinacija je " + count
				+ ".");

	}

}
