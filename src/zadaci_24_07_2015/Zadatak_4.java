package zadaci_24_07_2015;

public class Zadatak_4 {
	/*
	 * Napisati program koji prima 10 cijelih brojeva te ih ispisuje u obrnutom
	 * redosljedu.
	 */
	// Metoda kao argument prima niz brojeva
	public static void reverseArray(int[] arr) {
		System.out.println("\nBrojevi u obrnutom redoslijedu: ");
		for (int i = arr.length - 1; i >= 0; i--) {
			// koristeci for petlju, brojeve printamo od posljednjeg do prvog u
			// nizu
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// kreiramo niz od 10 elemenata(10 brojeva)
		int[] arr = new int[10];
		// korisnik unosi brojeve
		System.out.println("Unesite deset brojeva: ");
		for (int i = 0; i < 10; i++) {
			// brojeve spremamo u niz
			arr[i] = input.nextInt();
		}
		// pozivamo metodu i prosljedjujemo joj niz
		// metoda ispisuje brojeve u obrnutom redoslijedu
		reverseArray(arr);
	}
}
