package zadaci_20_08_2015;

public class Zadatak_4 {
	/*
	 * (ArrayIndexOutOfBoundsException) Write a program that meets the following
	 * requirements: Creates an array with 100 randomly chosen integers. Prompts
	 * the user to enter the index of the array, then displays the corresponding
	 * element value. If the specified index is out of bounds, display the
	 * message Out of Bounds.
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		boolean cond = true;// uslov za izvrsavanje petlje
		int[] arr = new int[100];// kreiramo novi niz koji sadrzi 100 elemenata
		for (int i = 0; i < 100; i++) {
			// elementima niza dodjeljujemo nasumicnu vrijednost cijelog broja
			// od 0 do 100
			arr[i] = (int) (Math.random() * 100);
		}
		do {
			System.out.println("Enter the index of the array: ");
			// izvrsava se try blok
			try {
				// korisnik unosi index niza
				int index = input.nextInt();
				// prikazujemo vrijednost elementa na trazenom indeksu niza
				System.out.println("\nThe element value at index " + index
						+ " is " + arr[index]);
				cond = false;// uslov je false kada je unos ispravan; petlja
								// zavrsava sa radom
			} catch (ArrayIndexOutOfBoundsException ex) {
				// ukoliko je uneseni index niza neispravan (manji, veci ili
				// jednak velicini niza), catch blok hvata exception i izvrsava
				// svoje naredbe
				System.out.println("\nOut of Bounds!");
				input.nextLine();// izjava kojom se odbacuje prethodni
									// (neispravan) unos
			}
		} while (cond);// petlja nastavlja sa radom sve dok je uslov=true
	}
}
