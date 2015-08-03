package zadaci_03_08_2015;

public class Zadatak_4 {
	/*
	 * Napišite program koji pita korisnika da unese cijeli broj i ispiše njegov
	 * ekvivalent u binarnom kodu. Za ovaj program NE smijemo koristiti
	 * Integer.toBinaryString(int) metodu.
	 */

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Unesite cijeli broj: ");
		// koroisnik unosi broj(dekadni sistem)
		int decimal = input.nextInt();
		int binary = 0;// binarni ekvivalent broja
		System.out.print("\nEkvivalent broja " + decimal
				+ " u binarnom kodu je:\t");
		while (decimal > 0) {
			// dekadni broj postepeno dijelimo sa 2 a ostatak nakon svakog
			// dijeljenja ispisujemo, te na taj nacin dobijamo binarni
			// ekvivalent dekadnog broja
			binary = decimal % 2;
			System.out.print(binary);
			decimal /= 2;
		}

	}
}
