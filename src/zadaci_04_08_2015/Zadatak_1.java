package zadaci_04_08_2015;

public class Zadatak_1 {
	/*
	 * Napisati program koji prima ASCII kod (cijeli broj izmeðu 0 i 127) te
	 * ispisuje koji je to karakter. Na primjer, ukoliko korisnik unese 69 kao
	 * ASCII kod, program mu ispisuje da je karakter sa tim brojem karakter E
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Unesite ASCII kod (cijeli broj izmeðu 0 i 127): ");
		// korisnik unosi broj
		// ascii kod-numericki prikaz karaktera
		int ascii = input.nextInt();
		char ch = (char) ascii;// typecasting unesenog broja; dobijamo karakter
								// za uneseni broj
		// Ispisujemo rezultat
		System.out.println("\nKarakter sa brojem " + ascii + " je: " + ch);
	}
}
