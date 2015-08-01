package zadaci_31_07_2015;

public class Zadatak_2 {
	/*
	 * Napišite metodu sa sljedeæim headerom koja vraæa naopako ispisan broj
	 * koji joj je proslijeðen kao argument: public static void reverse(int
	 * number). Na primjer, reverse(3456) treba da vrati 6543. Napisati program
	 * koji pita korisnika da unese neki cijeli broj te mu vrati isti ispisan
	 * naopako.
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi cijeli broj
		System.out.println("Unesite cijeli broj: ");
		int num = input.nextInt();
		reverse(num);// pozivamo metodu reverse i uneseni broj ispisujemo
						// naopako
	}

	// Metoda kojom proslijedjeni broj ispisujemo naopako
	public static void reverse(int number) {
		int remainder = 0;
		while (number != 0) {
			// koristeci se ostatkom dijeljenja, dobijamo broj ispisan naopako
			remainder = remainder * 10;
			remainder = number % 10 + remainder;
			number = number / 10;
		}
		// ispisujemo rezultat
		System.out.print("\nBroj naopako:\t" + remainder);
	}
}
