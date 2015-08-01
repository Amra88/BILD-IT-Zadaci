package zadaci_31_07_2015;

public class Zadatak_5 {
	/*
	 * Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva razlièita
	 * pakovanja. Želimo napisati program koji uporeðuje cijene ta dva
	 * pakovanja. Program pita korisnika da unese težinu i cijenu oba pakovanja
	 * te ispisuje koje pakovanje ima bolju cijenu.
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi tezinu i cijenu proizvoda
		System.out
				.println("Unesite tezinu u gramima i cijenu prvog proizvoda: ");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		System.out
				.println("Unesite tezinu u gramima i cijenu drugog proizvoda: ");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		// uporedjujemo odnos tezine i cijene prvog i drugog proizvoda, dobijamo
		// cijenu proizvoda po jedinici mjere, te na
		// osnovu toga ispisujemo rezultat
		if (price1 / weight1 < price2 / weight2) {
			System.out
					.println("Bolju cijenu ima prvi proizvod. Cijena prvog proizvoda je "
							+ (price1 / weight1)
							+ ", dok je cijena drugog proizvoda "
							+ (price2 / weight2) + " po gramu.");
		} else {
			System.out
					.println("Bolju cijenu ima drugi proizvod. Cijena drugog proizvoda je "
							+ (price2 / weight2)
							+ ", dok je cijena prvog proizvoda "
							+ (price1 / weight1) + " po gramu.");
		}
	}
}
