package zadaci_24_07_2015;

public class Zadatak_3 {
	/*
	 * Napisati program koji pita korisnika da unese 2 stringa te ispisuje
	 * najveæi zajednièki prefix za ta dva stringa, ukoliko isti postoji. Na
	 * primjer, ukoliko korisnik unese sljedeæa dva stringa "Dobrodošli u Dubai"
	 * i "Dobrodošli u Vankuver" program treba da ispiše: Najveæi zajednièki
	 * prefix za dva stringa je "Dobrodošli u".
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi dva stringa
		System.out.println("Unesite prvi string: ");
		String s1 = input.nextLine();
		System.out.println("Unesite drugi string: ");
		String s2 = input.nextLine();
		// pozivamo metodu i ispisujemo rezultat
		getEqualPrefix(s1, s2);

	}

	// Metodi prosljedjujemo 2 stringa koja unosi korisnik
	public static void getEqualPrefix(String s1, String s2) {
		int max = 0;// varijabla koja ce sadrzati index za najveci zajednicki
					// prefix
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				// koristeci petlje provjeravamo karaktere u oba stringa
				if (s1.substring(0, i).equals(s2.substring(0, j))) {
					// ako je dio stringa od indeksa 0 do indeksa "i" jednak u
					// oba stringa
					if (i > max) {
						max = i;// uzimamo indeks posljednjeg jednakog
								// karaktera(najveci indeks)
					}
				}
			}
		}
		if (max > 0) {
			// ako postoje zajednicki karakteri, odnosno zajednicki prefix
			// printamo prefix
			System.out
					.println("\nNajveci zajednicki prefiks za dva stringa je:  \""
							+ s1.substring(0, max) + "\"");
		} else {
			System.out.println("\nStringovi nemaju zajednicki prefiks.");
		}
	}
}
