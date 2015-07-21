package zadaci_20_07_2015;

public class Zadatak_5 {
	/*
	 * Napisati program koji uèitava niz brojeva, pronalazi najveæi broj te
	 * ispisuje koliko se puta taj broj ponavlja. Pretpostavimo da se unos
	 * brojeva završava sa nulom.
	 */
	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		// unos brojeva od strane korisnika
		System.out.println("Enter numbers: ");
		int nums = input.nextInt();
		int max = 1;// najveci broj
		int count = 0;// brojac ponavljanja najveceg broja
		do {
			// trazenje najveceg broja kroz petlju
			nums = input.nextInt();
			if (nums > max) {
				// ukoliko je neki uneseni broj veci od najveceg, taj br.
				// postaje najveci
				max = nums;
				count = 1;// pronadjen je jedan takav broj
			}

			else if (max == nums) {
				// ako je jos neki od unesenih brojeva=max, uvecavamo brojac za 1
				count++;
			}

		} while (nums != 0);// unos zavrsava nulom
		//Ispis rezultata
		System.out.println("The largest number is " + max + ".");
		System.out.println("The occurence count of the largest number is "
				+ count + ".");
	}
}
