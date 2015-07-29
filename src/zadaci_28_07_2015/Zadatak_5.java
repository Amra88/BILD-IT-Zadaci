package zadaci_28_07_2015;

public class Zadatak_5 {
	/*
	 * Napisati program koji pita korisnika da unese dva stringa te provjerava i
	 * ispisuje da li je drugi string substring prvog stringa. Na primjer,
	 * ukoliko korisnik unese ABCD kao prvi string a BC kao drugi string program
	 * mu ispisuje da je BC substring ABCD stringa.
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi 2 stringa
		System.out.println("Unesite prvi string: ");
		String s1 = input.nextLine();
		System.out.println("Unesite drugi string: ");
		String s2 = input.nextLine();
		// provjeravamo da li prvi string sadrzi drugi, tj. da li je s2
		// substring stringa s1
		if (s1.contains(s2)) {
			System.out.println(s2 + " je substring stringa: " + s1);// ispisujemo
																	// rezultat
		} else {
			System.out.println(s2 + " nije substring stringa: " + s1);
		}

	}
}
