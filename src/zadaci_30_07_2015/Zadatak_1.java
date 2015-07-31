package zadaci_30_07_2015;

public class Zadatak_1 {
	/*
	 * Pretpostavimo da se registarska tablica za auto sastoji od tri uppercase
	 * karaktera i 4 broja u sljedeæem formatu AAA-1234. Napisati program koji
	 * nasumièno generiše tablicu.
	 */
	public static void main(String[] args) {
		String letters = "";// varijabla koja sadrzi tri uppercase karaktera
		String numbers = "";// varijabla koja sadrzi 4 broja
		String plate = "";// varijabla koja predstavlja kompletnu tablicu
		// nasumicno biramo 3 uppercase karaktera
		for (int i = 0; i < 3; i++) {
			char ch = (char) (Math.random() * 26 + 'A');
			letters += ch;
		}
		// nasumicno biramo 4 broja od 0 do 9
		for (int i = 0; i < 4; i++) {
			int n = (int) (Math.random() * 9);
			numbers += n;
		}
		// formiramo tablicu
		plate = letters + "-" + numbers;
		// printamo generisanu tablicu
		System.out.println("Generisana je tablica:\t" + plate);
	}
}
