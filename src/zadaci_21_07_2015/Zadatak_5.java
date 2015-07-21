package zadaci_21_07_2015;

public class Zadatak_5 {
	/*
	 * Napisati metodu koja prima jedan argument te simulira bacanje novèiæa
	 * toliko puta. Nakon što se simulacija završi, program ispisuje koliko puta
	 * je novèiæ pokazao glavu a koliko puta pismo.
	 */
	// Metodi prosljedjujemo broj bacanja novcica
	public static void flipCoin(int flips) {
		// varijable koje oznacavaju strane novcica
		int head = 0;
		int tail = 0;
		// pomocu petlje "bacamo novcic"
		for (int i = 0; i < flips; i++) {
			// novcic se nasumicno okrece, 
			//tj. nasumicno dobijamo brojeve od 0 do 1
			double n = Math.random();

			if (n > 0.5) {
				// ako je nasumicni broj veci od 0.5, prikazuje se glava
				head++;
			} else {
				// u suprotnom, dobili smo pismo
				tail++;
			}
		}
		// Ispis rezultata
		System.out.println("Glava: " + head + " puta.\nPismo: " + tail
				+ " puta.");
	}

	public static void main(String[] args) {
		// korisnik unosi broj bacanja novcica
		System.out.println("Upisite broj bacanja novcica: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		int num = input.nextInt();
		// pozivamo metod flipCoin i prosljedjujemo mu broj bacanja
		flipCoin(num);
	}
}
