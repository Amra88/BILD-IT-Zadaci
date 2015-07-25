package zadaci_25_07_2015;

public class Zadatak_5 {
	/*
	 * Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijeæe v, možemo
	 * izraèunati minimalnu dužinu piste potrebne da avion uzleti koristeæi se
	 * sljedeæom formulom: dužina = v * v / 2a. Napisati program koji pita
	 * korisnika da unese v u m/s i a u m/s te ispisuje korisniku minimalnu
	 * dužinu piste. (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje
	 * dužina piste je 514.286)
	 */
	// Metoda za racunanje minimalne duzine piste potrebne za uzlijetanje
	// parametri: brzina i ubrzanje
	public static double getRunwayLength(double v, double a) {
		double length = (v * v) / (2 * a);// formula za racunanje duzine
		return length;// metoda vraca duzinu piste
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi brzinu i ubrzanje
		System.out.println("Unesite brzinu aviona u m/s: ");
		double v = input.nextDouble();
		System.out.println("Unesite ubrzanje aviona u m/s^2: ");
		double a = input.nextDouble();
		// pozivamo metodu i ispisujemo rezultat
		System.out
				.printf("\nMinimalna duzina piste potrebna da avion uzleti je %5.3f m.",
						getRunwayLength(v, a));
	}
}
