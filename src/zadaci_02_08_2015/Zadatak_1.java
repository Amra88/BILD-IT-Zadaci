package zadaci_02_08_2015;

public class Zadatak_1 {
	/*
	 * Napisati program koji pita korisnika da unese cijeli trocifreni broj te
	 * provjerava da li je unijeti broj palindrom. Broj je palindrom ukoliko se
	 * èita isto i sa lijeva na desno i sa desna na lijevo npr. 121, 131, itd.
	 */
	// Metoda koja proslijedjeni broj ispisuje naopako
	public static int reverse(int number) {
		int remainder = 0;
		while (number != 0) {
			// koristeci se ostatkom dijeljenja, dobijamo broj ispisan naopako
			remainder = remainder * 10;
			remainder = number % 10 + remainder;
			number = number / 10;
		}

		return remainder;// metoda vraca broj ispisan naopako
	}

	// Metoda koja provjerava da li je broj palindrom
	// poredi broj i isti broj ispisan naopako
	// kao rezultat, vraca boolean vrijednost true ili false
	public static boolean isPalindrome(int number) {
		return number == reverse(number);
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Unesite cijeli trocifreni broj: ");
		// korisnik unosi broj
		int num = input.nextInt();
		if (num > 99 && num < 1000) {
			// pozivajuci metodu isPalindrome provjeravamo da li je broj
			// palindrom i ispisujemo rezultat
			if (isPalindrome(num)) {
				System.out.println("Broj " + num + " je palindrom!");
			} else {
				System.out.println("Broj " + num + " nije palindrom!");
			}

		} else {
			System.out.println("Pogresan unos! Unesite trocifren cijeli broj!");
		}
	}
}
