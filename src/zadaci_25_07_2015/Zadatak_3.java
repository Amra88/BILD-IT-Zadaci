package zadaci_25_07_2015;

public class Zadatak_3 {
	/*
	 * Napisati metode sa sljede�im headerima: public static int reverse(int
	 * number) i public static boolean isPalindrome(int number). Prva metoda
	 * prima cijeli broj kao argument i vra�a isti ispisan naopako. (npr.
	 * reverse(456) vra�a 654.) Druga metoda vra�a true ukoliko je broj
	 * palindrom a false ukoliko nije. Koristite reverse metodu da
	 * implementirate isPalindrome metodu. Napi�ite program koji pita korisnika
	 * da unese broj te mu vrati da li je broj palindrome ili ne.
	 */
	// Metoda koja ispisuje broj naopako, kao argument prima broj koji unosi
	// korisnik
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
		// korisnik unosi broj
		System.out.println("Unesite cijeli broj: ");
		int num = input.nextInt();
		// pozivamo metodu isPalindrome i ispisujemo rezultat
		System.out.println("\nBroj je palindrom: " + isPalindrome(num) + "!");
	}
}
