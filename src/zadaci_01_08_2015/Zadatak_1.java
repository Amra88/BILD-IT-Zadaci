package zadaci_01_08_2015;

public class Zadatak_1 {
	/*
	 * Napisati program koji nasumièno generiše cijeli broj izmeðu 1 i 12 te
	 * ispisuje ime mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)
	 */
	public static void main(String[] args) {
		int month = 1;// varijabla koja sadrzi broj odabranog mjeseca
		// array sadrzi nazive svih mjeseci
		String[] months = { "Januar", "Februar", "Mart", "April", "Maj",
				"Juni", "Juli", "August", "Septembar", "Oktobar", "Novembar",
				"Decembar" };
		// nasumicno generisemo broj od 0 do 12(broj mjeseca)
		month = (int) (Math.random() * 12);
		// Ispisujemo rezultat
		System.out.println("Generisan je " + (month + 1) + ". mjesec, odnosno "
				+ months[month] + ".");
	}
}
