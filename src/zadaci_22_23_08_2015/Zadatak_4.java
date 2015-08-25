package zadaci_22_23_08_2015;

public class Zadatak_4 {
	/**
	 * (Process scores in a text file on the Web) Suppose that the text file on
	 * the Web http://cs.armstrong.edu/liang/data/Scores.txt contains an
	 * unspecified number of scores. Write a program that reads the scores from
	 * the file and displays their total and average. Scores are separated by
	 * blanks.
	 */
	public static void main(String[] args) {
		try {
			// kreiramo URL objekat za odredjenu web adresu
			java.net.URL url = new java.net.URL(
					"http://cs.armstrong.edu/liang/data/Scores.txt");
			double score;// skorovi koji se nalaze u fajlu
			double total = 0;// zbir svih skorova
			double average;// prosjek
			int count = 0;// ukupan broj skorova u fajlu
			// koristimo openStream() metodu iz URL klase za pristup ulaznom
			// toku i kreiranje Scanner objekta
			java.util.Scanner input = new java.util.Scanner(url.openStream());
			System.out.println("Scores:");
			while (input.hasNext()) {
				// citamo skorove iz fajla
				score = input.nextDouble();
				total += score; // sabiramo ih
				count++; // brojimo skorove u fajlu
				System.out.print(score + "  ");// ispisujemo sve skorove iz
												// fajla
			}
			average = total / count; // Racunanje prosjeka
			// Ispis rezultata:
			System.out.println("\n\nTotal sum: " + total);
			System.out.printf("Average: %2.2f", average);
		} catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (java.io.IOException ex) {
			System.out.println("I/O Errors: no such file");
		}
	}
}
