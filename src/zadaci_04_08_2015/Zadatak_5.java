package zadaci_04_08_2015;

public class Zadatak_5 {
	/*
	 * Napisati program koji uèitava 10 brojeva te ispisuje koliko je
	 * jedinstvenih brojeva unijeto te sve jedinstvene brojeve koji su unijeti,
	 * razmaknute jednim spaceom. Ukoliko se neki broj pojavljuje više puta,
	 * broj treba ispisati samo jednom.
	 */
	// Metoda za printanje jedinstvenih brojeva
	// metodi prosljedjujemo niz brojeva
	public static void printDistinctNumbers(int[] numbers) {
		int count = 0;// brojac jedinstvenih brojeva
		System.out.print("\nJedinstveni brojevi: ");
		for (int i = 0; i < numbers.length; i++) {
			boolean isDistinct = true;// boolean vrijednost ako je broj
										// jedinstven
			for (int j = 0; j < i; j++) {
				// koristeci se nested for petljom provjeravamo da li se neki
				// broj ponavlja
				if (numbers[i] == numbers[j]) {
					// ukoliko u array-u pronadjemo broj jednak onom koji
					// provjeravamo
					isDistinct = false;// taj broj nije jedinstven
					break;// vracamo se u spoljasnju petlju 
				}

			}
			if (isDistinct) {
				// ukoliko je broj jedinstven
				count++;// uvecavamo brojac
				System.out.print(numbers[i] + " ");// printamo jedinstvene
													// brojeve

			}

		}
		// ispisujemo ukupan broj jedinstvenih brojeva
		System.out.println("\nUnijeto je " + count + " jedinstvenih brojeva.");
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[] arr = new int[10];// kreiramo novi niz
		System.out.println("Unesite deset brojeva:");
		for (int i = 0; i < arr.length; i++) {
			// korisnik unosi 10 brojeva koje spremamo u niz
			arr[i] = input.nextInt();
		}
		printDistinctNumbers(arr);// pozivamo metodu i printamo jedinstvene
									// brojeve
	}
}
