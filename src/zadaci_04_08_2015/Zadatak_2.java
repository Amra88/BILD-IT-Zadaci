package zadaci_04_08_2015;

public class Zadatak_2 {
	/*
	 * Napisati program koji prima karakter te vraæa njegov Unicode. Primjer:
	 * ukoliko korisnik unese karakter E program mu vraæa 69 kao unicode za taj
	 * karakter.
	 */
	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Unesite karakter: ");
		// korisnik unosi karakter 
		char ch = input.next().charAt(0);
		int unicode = (int) ch;// vrsimo typecasting karaktera u broj
		// Ispisujemo rezultat
		System.out.println("\nUnicode za karakter " + ch + " je: " + unicode);
	}
}