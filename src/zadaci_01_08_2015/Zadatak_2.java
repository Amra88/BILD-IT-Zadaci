package zadaci_01_08_2015;

public class Zadatak_2 {
	/*
	 * Napisati program koji igra sa protivnikom rock-paper-scissors.
	 * (papir-bunar-makaze ili tako nekako po naški) Program nasumièno generiše
	 * brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze. Program pita
	 * korisnika da unese 0, 1 ili 2 te mu ispisuje poruku da li je korisnik
	 * pobijedio, da li je raèunar pobijedio ili je bilo neriješeno.
	 */
	public static void main(String[] args) {
		// Ispis nasumicnog broja 0, 1 ili 2
		int randomNumber = (int) (Math.random() * 3);

		java.util.Scanner input = new java.util.Scanner(System.in);
		// pitamo korisnika da unese broj
		System.out.print("Unesite broj 0, 1 ili 2: ");
		// Unos broja 0, 1 ili 2
		int usersChoice = input.nextInt();

		// kombinacije brojeva 0, 1, i 2 gdje su makaze=0, kamen=1 i papir=2
		// u zavisnosti od dobijene kombinacije, ispisujemo poruku
		if (randomNumber == 0 && usersChoice == 0) {
			System.out
					.print("Kompjuter je dobio makaze, vi ste dobili makaze: \nRezultat je nerijesen! ");
		}

		if (randomNumber == 0 && usersChoice == 1) {
			System.out
					.print("Kompjuter je dobio makaze, vi ste dobili kamen: \nVi ste pobijednik! ");
		}

		if (randomNumber == 0 && usersChoice == 2) {
			System.out
					.print("Kompjuter je dobio makaze, vi ste dobili papir: \nKompjuter je pobjednik! ");
		}

		if (randomNumber == 1 && usersChoice == 0) {
			System.out
					.print("Kompjuter je dobio kamen, vi ste dobili makaze: \nKompjuter je pobjednik! ");
		}
		if (randomNumber == 1 && usersChoice == 1) {
			System.out
					.print("Kompjuter je dobio kamen, vi ste dobili kamen: \nRezultat je nerijesen! ");
		}
		if (randomNumber == 1 && usersChoice == 2) {
			System.out
					.print("Kompjuter je dobio kamen, vi ste dobili papir: \nVi ste pobjednik! ");
		}
		if (randomNumber == 2 && usersChoice == 0) {
			System.out
					.print("Kompjuter je dobio papir, vi ste dobili makaze: \nVi ste pobjednik! ");
		}
		if (randomNumber == 2 && usersChoice == 1) {
			System.out
					.print("Kompjuter je dobio papir, vi ste dobili kamen: \nKompjuter je pobjednik! ");
		}
		if (randomNumber == 2 && usersChoice == 2) {
			System.out
					.print("Kompjuter je dobio papir, vi ste dobili papir: \nRezultat je nerijesen! ");
		}

	}
}
