package zadaci_24_07_2015;

public class Zadatak_2 {
	/*
	 * Napisati program koji simulira nasumièno izvlaèenje karte iz špila od 52
	 * karte. Program treba ispisati koja karta je izvuèena (A, 2, 3, 4, 5, 6,
	 * 7, 8, 9, 10, J, Q ili K) te znak u kojem je data karta (Srce, Pik,
	 * Djetelina, Kocka). Primjer: Karta koju ste izvukli je 10 u znaku kocke.
	 */

	public static void main(String[] args) {
		int[] deck = new int[52];// kreiramo niz koji sadrzi 52 elementa-52
									// karte
		String[] symbols = { "Srce", "Pik", "Djetelina", "Kocka" };// kreiramo
																	// array sa
																	// znakovima
		String[] cards = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K" };// kreiramo array sa vrijednostima karata
		String symbol = " ";// varijabla koja ce sadrzati znak odabrane karte
		String card = " ";// varijabla koja ce sadrzati vrijednost odabrane
							// karte

		for (int i = 0; i < deck.length; i++) {
			// pomocu petlje inicijaliziramo sve karte, vrijednostima od 0 do 51
			deck[i] = i;
		}
		for (int i = 0; i < deck.length; i++) {
			// nasumicno biramo kartu
			int random = (int) (Math.random() * deck.length);
			deck[i] = deck[random];

			symbol = symbols[deck[i] / 13];// pronalazimo znak za izvucenu kartu
			card = cards[deck[i] % 13];// kao i vrijednost karte

		}
		// Ispis rezultata
		System.out.println("\n\t\tKarta koju ste izvukli je " + card
				+ " u znaku " + symbol + ".");

	}
}
