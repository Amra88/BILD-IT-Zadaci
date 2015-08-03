package zadaci_02_08_2015;

public class Zadatak_2 {
	/*
	 * Napisati program koji pita korisnika da unese neki string te mu ispisuje
	 * dužinu tog stringa kao i prvo slovo stringa.
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Unesite tekst:");
		// korisnik unosi string
		String str = input.nextLine();
		// za prikaz rezultata koristimo metodu .length() da dobijemo duzinu
		// stringa i ispisujemo karakter na nultom indeksu stringa
		System.out.println("\nDuzina unesenog teksta je " + str.length()
				+ " karaktera, a prvo slovo je \"" + str.charAt(0) + "\".");
	}
}
