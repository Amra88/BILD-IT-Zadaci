package zadaci_03_08_2015;

public class Zadatak_5 {
	/*
	 * Pretpostavimo da školarina za godinu dana na fakultetu košta 10.000 i da
	 * se poveæava za 5% svake godine. Godinu dana od danas, školarina æe
	 * iznositi 10.500. Napisati program koji izraèunava koliko æe školarina za
	 * godinu dana iznositi kroz 10 godina.
	 */
	public static void main(String[] args) {
		double tuition = 10000;// iznos skolarine
		double percent = 5;// procenat za koji se povecava skolarina
		int year = 10;// broj godina za koje zelimo izracunati skolarinu
		for (int i = 1; i <= year; i++) {
			// formula za racunanje ukupne skolarine za odredjeni broj godina
			tuition += tuition * percent / 100;
		}
		// ispisujemo rezultat
		System.out.printf("Za " + year
				+ " godina, skolarina ce iznositi %5.2f KM.", tuition);

	}
}
