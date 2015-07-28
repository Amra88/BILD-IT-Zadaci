package zadaci_27_07_2015;

public class Zadatak_2 {
	/*
	 * Great circle distance predstavlja udaljenost izmeðu dvije taèke na
	 * površine sfere. Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku
	 * širinu i dužinu dvije taèke. Great circle distance izmeðu ove dvije taèke
	 * može biti izraèunata koristeæi se sljedeæom formulom: d = radius * arccos
	 * (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)). Napisati program
	 * koij pita korisnika da unese geografsku širinu i dužinu u stepenima dvije
	 * taèke na površini zemlje te mu ispisuje great circle distance. Prosjeèni
	 * radius zemlje je 6.371.01 km. Stepene koje korisnik unese trebamo
	 * promijeniti u radianse koristeæi se Math.toRadians metodom jer Java
	 * trigonometrijske metode koriste radianse. Širina i dužina u ovoj formuli
	 * se odnose na zapad i sjever. Koristimo negativne vrijednosti da oznaèimo
	 * istok i jug.
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi geografsku sirinu i duzinu za dvije tacke
		System.out.println("Unesite geografsku sirinu prve tacke: ");
		double x1 = input.nextDouble();
		System.out.println("Unesite geografsku duzinu prve tacke: ");
		double y1 = input.nextDouble();
		System.out.println("Unesite geografsku sirinu druge tacke: ");
		double x2 = input.nextDouble();
		System.out.println("Unesite geografsku duzinu druge tacke: ");
		double y2 = input.nextDouble();
		double radius = 6371.01;// prosjecni poluprecnik Zemlje
		// formula za racunanje najmanje udaljenosti izmedju dvije tacke na
		// povrsini sfere
		double d = radius
				* Math.acos(Math.sin(Math.toRadians(-x1))
						* Math.sin(Math.toRadians(-x2))
						+ Math.cos(Math.toRadians(-x1))
						* Math.cos(Math.toRadians(-x2))
						* (Math.cos(Math.toRadians(-y1) - Math.toRadians(-y2))));
		// Printamo rezultat
		System.out.println("\nUdaljenost izmedju tacaka je " + d + " km.");
	}
}
