package zadaci_20_07_2015;

public class Zadatak_3 {
	/*
	 * Napisati metodu koja prima dva cijela broja kao argumente te vraæa
	 * najveæi zajednièki djelilac za ta dva broja.
	 */

	// Metodi prosljedjujemo 2 broja (n1 i n2)
	public static int getGcd(int n1, int n2) {
		int gcd = 1;// najveci zajednicki djelilac
		int m = 2;// privremena varijabla
		// trazenje najveceg zajednickog djelioca kroz petlju:
		while (m <= n1 && m <= n2) {
			if (n1 % m == 0 && n2 % m == 0) {
				gcd = m;
			}
			m++;
		}
		return gcd;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi brojeve
		System.out.println("Enter first number: ");
		int n1 = input.nextInt();
		System.out.println("Enter second number: ");
		int n2 = input.nextInt();
		// pozivamo metod getGcd i prikazujemo najveci zajednicki djelilac
		System.out.println("The greatest common divisor for numbers " + n1
				+ " and " + n2 + " is number " + getGcd(n1, n2) + ".");

	}

}
