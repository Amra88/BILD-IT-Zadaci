package zadaci_02_08_2015;

public class Zadatak_5 {
	/*
	 * Napisati program koji pita korisnika da unese cijeli broj te ispisuje
	 * piramidu svih brojeva do tog broja. (Na primjer, ukoliko korisnik unese 7
	 * vrh piramide je broj 1, red ispod vrha piramide je 2 1 2, red ispod je 3
	 * 2 1 2 3, red ispod 4 3 2 1 2 3 4 itd.)
	 */
	// Metoda za ispis piramide
	// metodi prosljedjujemo broj do kojeg ce se piramida printati
	public static void displayPyramid(int n) {

		for (int i = 1; i <= n; i++) {
			// petlja pomocu koje printamo lijevi dio piramide, od n do 1
			for (int j = n; j > 0; j--) {

				if (j <= i) {
					System.out.print(j + "  ");

				} else {
					System.out.print("   ");
				}

			}
			for (int k = 2; k <= n; k++) {
				// petlja pomocu koje printamo desni dio piramide, od 2 do n
				if (k <= i) {
					System.out.print(k + "  ");
				}
			}
			System.out.println();// prelazak u novi red
		}
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.println("Unesite cijeli broj: ");
		// korisnik unosi broj do kojeg cemo ispisivati piramidu
		int num = input.nextInt();
		displayPyramid(num);// pozivamo metodu i prosljedjujemo joj broj
	}

}
