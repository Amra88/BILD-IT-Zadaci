package zadaci_04_08_2015;

public class Zadatak_3 {
	/*
	 * U javi, short vrijednost se sprema u samo 16 bita. Napisati program koji
	 * pita korisnika da unese short broj te mu ispiše svih 16 bita za dati
	 * cijeli broj. Na primjer, ukoliko korisnik unese broj 5 - program mu
	 * ispisuje 0000000000000101
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Unesite broj: ");
		// korisnik unosi broj(short data type)
		short number = input.nextShort();
		String binary = "";// binarni ekvivalent broja spremamo u String

		while (number > 0) {
			// dekadni broj postepeno dijelimo sa 2 a ostatak nakon svakog
			// dijeljenja dodajemo, te na taj nacin dobijamo binarni
			// ekvivalent dekadnog broja
			binary = (short) (number % 2) + binary;
			number /= 2;
		}
		int length = 16 - binary.length();// duzina koju cemo dodati stringu
											// kako bismo dobili 16 bita
		for (int i = 0; i < length; i++) {
			binary = "0" + binary;// binarnom broju dodajemo nule
		}
		// ispisujemo rezultat
		System.out.println("\n16-o bitni broj  ==>\t" + binary);
	}
}
