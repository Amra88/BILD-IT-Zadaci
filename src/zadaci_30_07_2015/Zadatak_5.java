package zadaci_30_07_2015;

public class Zadatak_5 {
	/*
	 * Napisati program koji uèitava cijele brojeve u rasponu od 1 do 100 te
	 * broji i ispisuje koliko je koji broj puta unijet. Pretpostavimo da nula
	 * prekida unos brojeva. Ukoliko unesemo sljedeæi niz brojeva 2 5 6 23 42 58
	 * 2 6 0 program nam ispisuje da se broj 2 ponavlja 2 puta, broj 5 jednom,
	 * broj 6 2 puta, broj 23 jednom, itd.
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[] arr = new int[101];// kreiramo novi niz koji sadrzi brojeve od 0
									// do 100
		int number = 1;// broj koji unosi korisnik
		System.out
				.println("Unesite cijele brojeve od 1 do 100 (0 prekida unos):");

		do {
			number = input.nextInt();// korisnik unosi brojeve
			arr[number]++;// broj na indeksu niza koji je jednak unesenom broju
							// uvecavamo kada korisnik unese odredjeni broj
		} while (number != 0);// unos zavrsava nula

		for (int j = 1; j < arr.length; j++) {
			if (arr[j] != 0) {
				// Printamo svaki broj koji se pojavio bar jednom, kao i koliko
				// puta se ponovio
				System.out.println("Broj " + j + " se ponovio " + arr[j]
						+ " puta.");
			}
		}
	}
}
