package zadaci_31_07_2015;

public class Zadatak_4 {
	/*
	 * Palindrome prime je prosti broj koji je takoðer i palindrom. Na primjer,
	 * 131 je palindrome prime, kao i brojevi 313 i 757. Napisati program koji
	 * ispisuje prvih 100 palindrome prime brojeva, 10 brojeva po liniji.
	 */
	// Metoda koja provjerava da li je broj prost
	public static boolean isPrime(int n) {
		boolean prime = true;// boolean vrijednost ako je broj prost
		for (int i = 2; i < n; i++) {
			// broj dijelimo sa brojevima od 2 pa do samog broja
			if (n % i == 0) {
				prime = false;
				// ako je broj djeljiv s nekim brojem osim sa sobom i 1, nije
				// prost
			}
		}
		return prime;// metoda vraca boolean vrijednost true ili false
	}

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

		int count = 0;// brojac isprintanih brojeva
		int number = 10;// broj koji cemo prosljedjivati metodama
		System.out.println("Prvih 100 Palindrome prime brojeva:\n");
		while (count < 100) {// ispisujemo sto brojeva
			if (isPrime(number) && isPalindrome(number)) {
				// pozivajuci metode isPrime i isPalindrome, provjeravamo da li
				// je broj prost i da li je palindrom
				// ako je broj prost, i takodje je i palindrom, printamo broj
				System.out.print(number + " ");
				count++;// nakon svakog isprintanog, brojac se uvecava
				if (count % 10 == 0) {// nakon 10 isprintanih, prelazi u
										// novi red
					System.out.println();

				}
			}
			number++;// broj uvecavamo dok ne ispisemo 100 palindrome prime
						// brojeva
		}
	}
}
