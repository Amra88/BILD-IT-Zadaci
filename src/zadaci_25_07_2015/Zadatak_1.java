package zadaci_25_07_2015;

public class Zadatak_1 {
	/*
	 * Napisati program koji uèitava iznos investicije, godišnju interesnu stopu
	 * i broj godina te vraæa buduæu vrijednost investicije koristeæi se
	 * sljedeæom formulom: buducaVrijednostInvesticije = iznosInvesticije * (1 +
	 * mjesecnaInteresnaStopa)^brojGodina*12. Na primjer, ukoliko uneste kao
	 * iznos investicije 1000, 3.25 kao godišnju interesnu stopu i 1 kao broj
	 * godina program vam vraæa 1032.98 kao buducu vrijednost investicije.
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi iznos investicije, godisnju interesnu stopu, te broj
		// godina
		System.out.println("Unesite iznos investicije: ");
		double amount = input.nextInt();
		System.out.println("Unesite godisnju interesnu stopu u procentima: ");
		double annualRate = input.nextDouble();
		System.out.println("Unesite broj godina: ");
		int years = input.nextInt();
		// pozivamo metodu getInvestment i printamo rezultat
		System.out.printf("\nBuduca vrijednost investicije iznosi %5.2f KM",
				getInvestment(amount, annualRate, years));

	}

	// Metoda za racunanje buduce vrijednosti investicije
	// parametri: iznos investicije, godišnja interesna stopa i broj godina
	public static double getInvestment(double amount, double annualRate,
			int year) {
		double rate = annualRate / (100 * 12);// racunamo mjesecnu interesnu
		// stopu
		// formula za racunanje buduce vrijednosti investicije
		double futureInvestment = amount * Math.pow((1 + rate), (year * 12));
		return futureInvestment;// metoda vraca buducu vrijednost investicije
	}
}
