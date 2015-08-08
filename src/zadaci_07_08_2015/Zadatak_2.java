package zadaci_07_08_2015;

public class Zadatak_2 {
	/*
	 * Napisati metodu koja vraca nasumican broj izmedju 1 i 54, izuzimajuci
	 * brojeve proslijedjene kao argumente. Koristiti sljedeci method header
	 * public static int getRandom(int... numbers)
	 */
	// Metodi prosljedjujemo neodredjeni broj cijelih brojeva
	public static int getRandom(int... numbers) {
		boolean condition = true;// uslov
		int randomNum = 1;// generisani nasumicni broj
		while (condition) {
			// dok je uslov true generisemo nasumicne brojeve izmedju 1 i 54
			randomNum = (int) (Math.random() * 54) + 1;
			condition = false;// kada generisemo broj, uslov je false

			for (int e : numbers) {
				if (randomNum == e) {// ako je generisani broj jednak nekom od
										// proslijedjenih brojeva
					condition = true;// uslov je true, i petlja nastavlja da
										// radi
				}
			}
		}
		return randomNum;// metoda vraca nasumican broj koji nije jednak nekom
							// od proslijedjenih brojeva
	}

	public static void main(String[] args) {
		// pozivamo metodu, prosljedjujemo joj brojeve i ispisujemo rezultat
		System.out.println("Generisan je broj "
				+ getRandom(5, 9, 23, 45, 18, 11, 28, 51, 42, 49));
	}
}
