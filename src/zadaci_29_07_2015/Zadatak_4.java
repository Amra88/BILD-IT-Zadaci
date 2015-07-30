package zadaci_29_07_2015;

public class Zadatak_4 {
	/*
	 * Napisati program koji pita korisnika da unese broj minuta (npr. 1
	 * milijardu) te ispiše korisniku koliko je to u godinama i danima. Zbog
	 * jednostavnosti, pretpostavimo da godina ima 365 dana.
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi broj minuta
		System.out.println("Unesite broj minuta:");
		long min = input.nextLong();
		// godine dobijamo tako sto dijelimo minute sa brojem minuta u satu,
		// brojem sati u danu i brojem dana u godini
		int years = (int) (min / (60 * 24 * 365));
		// dane dobijamo tako sto ostatak prethodnog dijeljenja podijelimo sa
		// brojem minuta u satu i brojem sati u danu
		int days = (int) (min % (60 * 24 * 365)) / (60 * 24);
		// ispisujemo rezultat
		System.out.println("\n\t" + min + " minuta je " + years + " godina i "
				+ days + " dana.");
	}
}
