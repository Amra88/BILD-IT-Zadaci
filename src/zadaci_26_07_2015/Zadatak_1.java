package zadaci_26_07_2015;

public class Zadatak_1 {
	/*
	 * Napisati program koji ispisuje tri nasumièna cijela broja te pita
	 * korisnika da unese njihov zbir. Ukoliko korisnik pogriješi, program
	 * ispisuje pitanje ponovo sve sa porukom da pokuša ponovo. Ukoliko korisnik
	 * unese taèan odgovor, program mu èestita i završava sa radom.
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// biramo tri nasumicna cijela broja od 0 do 9
		int num1 = (int) (Math.random() * 10);
		int num2 = (int) (Math.random() * 10);
		int num3 = (int) (Math.random() * 10);
		boolean condition = true;// uslov za izvrsavanje petlje
		do {
			// postavljamo pitanje korisniku
			System.out.println("Koliko je " + num1 + " + " + num2 + " + "
					+ num3 + "?");
			int answer = input.nextInt();// korisnik unosi odgovor
			if (answer != (num1 + num2 + num3)) {// ako odgovor nije tacan zbiru
													// brojeva
				System.out.println("\t\tOdgovor nije tacan! Pokusajte ponovo!");
				condition = false;// uslov nije ispunjen
			} else {
				// u suprotnom, ispisujemo poruku i program zavrsava s radom
				System.out.println("\n\t\tOdgovor je tacan! Cestitamo!");
				condition = true;
			}
		} while (!condition);// pitanje postavljamo ponovo sve dok uslov ne bude
								// ispunjen

	}
}
