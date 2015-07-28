package zadaci_27_07_2015;

public class Zadatak_2 {
	/*
	 * Great circle distance predstavlja udaljenost izme�u dvije ta�ke na
	 * povr�ine sfere. Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku
	 * �irinu i du�inu dvije ta�ke. Great circle distance izme�u ove dvije ta�ke
	 * mo�e biti izra�unata koriste�i se sljede�om formulom: d = radius * arccos
	 * (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)). Napisati program
	 * koij pita korisnika da unese geografsku �irinu i du�inu u stepenima dvije
	 * ta�ke na povr�ini zemlje te mu ispisuje great circle distance. Prosje�ni
	 * radius zemlje je 6.371.01 km. Stepene koje korisnik unese trebamo
	 * promijeniti u radianse koriste�i se Math.toRadians metodom jer Java
	 * trigonometrijske metode koriste radianse. �irina i du�ina u ovoj formuli
	 * se odnose na zapad i sjever. Koristimo negativne vrijednosti da ozna�imo
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
