package zadaci_03_08_2015;

public class Zadatak_1 {
	/*
	 * Napisati program koji pita korisnika da unese neki string te mu vraæa taj
	 * isti string naopako.
	 */
	// Metoda za preokretanje stringa
	public static String reverseString(String s) {
		String reversed = "";// kreiramo novi String
		for (int i = s.length() - 1; i >= 0; i--) {
			// pomocu petlje karaktere iz proslijedjenog smjestamo u novi
			// string, od posljednjeg do prvog
			reversed += s.charAt(i);
		}
		return reversed;// metoda vraca preokrenuti string
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Unesite String: ");
		// korisnik unosi string
		String str = input.nextLine();
		// pozivamo metodu reverseString i ispisujemo rezultat
		System.out.println("\nString ispisan naopako:\t" + reverseString(str));
	}
}
