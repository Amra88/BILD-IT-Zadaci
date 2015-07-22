package zadaci_22_07_2015;

public class Zadatak_2 {
	/*
	 * Napisati metodu koja nalazi najmanji element u nizu decimalnih
	 * vrijednosti koristeæi se sljedeæim headerom: public static double
	 * min(double[ ] array) Napišite potom test program koji pita korisnika da
	 * unese deset brojeva te poziva ovu metodu da vrati najmanji element u
	 * nizu.
	 */
	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi 10 brojeva
		System.out.println("Enter ten numbers: ");
		double[] arr = new double[10];// kreiramo novi array koji sadrzi 10
										// elemenata
		for (int i = 0; i < 10; i++) {
			// pomocu petlje u array dodajemo brojeve koje korisnik unosi
			arr[i] = input.nextDouble();
		}
		// pozivamo metodu min i prosljedjujemo joj array, te ispisujemo rezultat
		System.out.println("\nThe smallest number in the array is number "
				+ min(arr) + ".");
	}

	// Metoda min
	public static double min(double[] array) {
		// minNum, varijabla koja ce sadrzati najmanji broj u array-u
		double minNum = array[0];// deklaracija i inicijalizacija
		// kroz petlju trazimo najmanji broj u nizu
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minNum) {
				// ukoliko je neki broj u array-u manji od prethodnog najmanjeg,
				// taj broj postaje najmanji
				minNum = array[i];
			}
		}
		return minNum;// vracamo konacni najmanji broj
	}
}
