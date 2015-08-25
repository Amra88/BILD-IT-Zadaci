package zadaci_22_23_08_2015;

public class Zadatak_3 {
	/**
	 * (Count words) Write a program that counts the number of words in
	 * President Abraham Lincoln’s Gettysburg address from
	 * http://cs.armstrong.edu/liang/data/ Lincoln.txt.
	 */
	public static void main(String[] args) {
		try {
			// za citanje podataka sa web-a, prvo kreiramo URL objekat za
			// odredjenu web adresu
			java.net.URL url = new java.net.URL(
					"http://cs.armstrong.edu/liang/data/Lincoln.txt");
			int count = 0;// brojac rijeci u tekstu

			// koristimo openStream() metodu iz URL klase za pristup ulaznom
			// toku i kreiranje Scanner objekta
			java.util.Scanner input = new java.util.Scanner(url.openStream());
			while (input.hasNext()) {
				// brojimo rijeci u tekstu
				String word = input.next();
				count++;
			}
			// ispisujemo rezultat
			System.out
					.println("The number of words in President Abraham Lincoln's Gettysburg address is "
							+ count);
		} catch (java.net.MalformedURLException ex) {
			// hvatamo MalformedURLException ukoliko URL ima sintaksnu gresku
			System.out.println("Invalid URL");
		} catch (java.io.IOException ex) {
			System.out.println("I/O Errors: no such file");
		}
	}
}
