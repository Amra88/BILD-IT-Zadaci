package zadaci_31_07_2015;

public class Zadatak_1 {
	/*
	 * (Izra�unavanje napojnice) Napisati program koji u�itava ukupan iznos
	 * ra�una koji treba uplatiti kao i procenat tog ra�una kojeg �elimo platiti
	 * kao napojnicu te izra�unava ukupan ra�un i napojnicu. Na primjer, ukoliko
	 * korisnik unese 10 kao ra�un i 15 % kao procenat za napojnicu program
	 * treba da ispi�e da je ukupan ra�un za uplatiti 11.5 a napojnica 1.5.
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// ucitavamo iznos racuna i napojnicu u procentima
		System.out.println("Iznos racuna: ");
		double bill = input.nextDouble();
		System.out.println("Napojnica (u procentima): ");
		double percent = input.nextDouble();

		double tip = bill * percent / 100;// racunamo iznos napojnice
		double totalBill = bill + tip;// ukupan racun
		// ispisujemo rezultat
		System.out.println("\nUkupan racun za uplatiti iznosi " + totalBill
				+ " KM, od cega je napojnica " + tip + " KM.");
	}
}
