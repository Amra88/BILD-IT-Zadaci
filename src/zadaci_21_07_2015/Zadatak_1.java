package zadaci_21_07_2015;

public class Zadatak_1 {
	/*
	 * Napisati program koji ispisuje sve prestupne godine, 10 po liniji, od
	 * godine 101 do 2100, odvojene jednim spaceom. Takoðer ispisati i ukupan
	 * broj prijestupnih godina u ovom vremenskom periodu.
	 */
	public static void main(String[] args) {

		int count = 0;// brojac prestupnih godina
		System.out.println("Prestupne godine:");
		// pomocu petlje provjeravamo godine, od 101. do 2100.
		for (int i = 101; i <= 2100; i++) {
			// uslov: godina je prestupna ako je djeljiva sa 4 i 100, ili ako je
			// djeljiva sa 400
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
				// ako je godina prestupna, brojac uvecavamo za 1
				count++;
				// i ispisujemo godinu
				System.out.print(i + " ");
				if (count % 10 == 0) {
					// kada ispisemo 10 godina, prelazimo u novi red
					System.out.println();
				}
			}
		}
		// prikaz broja prestupnih godina
		System.out.println("\n\nUkupno prestupnih godina: " + count);
	}

}
