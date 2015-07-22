package zadaci_22_07_2015;

public class Zadatak_1 {
	/*
	 * Napisati metodu koja prima 2 argumenta: poèetni broj i krajnji broj te
	 * printa sve proste brojeve u zadanom rangu. BONUS: metoda može primati i
	 * treæi argument, broj brojeva za isprintati po liniji.
	 */
	// Metoda prima 3 argumenta: poèetni broj, krajnji broj i broj brojeva za
	// isprintati po liniji
	public static void primeNumbers(int startNum, int endNum, int numsPerLine) {

		int count = 0;// brojac prostih br.

		System.out.println("Prime numbers are: \n");
		// pomocu prve petlje provjeravamo sve brojeve, od pocetnog do krajnjeg
		for (int i = startNum; i <= endNum; i++) {
			boolean isPrime = true;// boolean vrijednost koja oznacava da je
									// broj prost
			for (int j = 2; j < i; j++) {
				// provjeravamo da li je broj djeljiv sa nekim drugim manjim
				// brojem, osim sa sobom i 1
				if (i % j == 0) {// ako jeste
					isPrime = false;// broj nije prost
					break;// vracamo se u prvu petlju
				}
			}

			if (isPrime && i != 1) {// ako je broj prost i nije broj 1
				count++;// brojac povecavamo za 1
				if (count % numsPerLine == 0) {// provjeravamo da li je brojac
												// dostigao trazeni broj brojeva
												// za printanje po liniji
					System.out.println(i);// ako jeste, printamo prosti broj i
											// prelazimo u novi red
				} else {
					System.out.print(i + " ");// ako nije, nastavljamo printanje
												// u istom redu

				}
			}
		}
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi pocetni i krajnji broj, te broj brojeva za isprintati
		// po liniji
		System.out.println("Enter the start number: ");
		int start = input.nextInt();
		System.out.println("Enter the end number: ");
		int end = input.nextInt();
		System.out.println("Enter the number of primes per line: ");
		int nums = input.nextInt();
		System.out.println();
		// pozivamo metodu primeNumbers i prosljedjujemo joj argumente
		primeNumbers(start, end, nums);

	}
}
