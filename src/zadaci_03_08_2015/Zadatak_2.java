package zadaci_03_08_2015;

public class Zadatak_2 {
	/*
	 * Napisati program koji pita korisnika da unese neki string te mu vraæa
	 * broj uppercase karaktera u unijetom stringu. Na primjer, ukoliko korisnik
	 * unese string "Dobrodošli u Dubai" program mu vraæa da je broj uppercase
	 * karaktera 2.
	 */
	// Metoda koja broji upperCase karaktere u stringu
	public static int countUppercase(String s) {
		int count = 0;// brojac upperCase karaktera
		for (int i = 0; i < s.length(); i++) {
			// provjeravamo da li je neki od karaktera u stringu veliko slovo
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				count++;// ako pronadjemo takav karakter, uvecavamo brojac
			}
		}
		return count;// metoda vraca broj upperCase karaktera u stringu
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Unesite String: ");
		// korisnik unosi string
		String str = input.nextLine();
		// pozivamo metodu i ispisujemo rezultat
		System.out.println("\nBroj upperCase karaktera u stringu je "
				+ countUppercase(str) + ".");
	}
}
