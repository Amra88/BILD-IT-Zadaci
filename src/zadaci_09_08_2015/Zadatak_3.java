package zadaci_09_08_2015;

public class Zadatak_3 {
	/*
	 * (Stopwatch) Design a class named StopWatch. The class contains: 1.
	 * Private data fields startTime and endTime with getter methods. 2. A
	 * no-arg constructor that initializes startTime with the current time. 3. A
	 * method named start() that resets the startTime to the current time. 4. A
	 * method named stop() that sets the endTime to the current time. 5. A
	 * method named getElapsedTime() that returns the elapsed time for the
	 * stopwatch in milliseconds. Draw the UML diagram for the class and then
	 * implement the class. Write a test program that measures the execution
	 * time of sorting 100,000 numbers using selection sort.
	 */
	// Metoda za sortiranje niza prema selection sort algoritmu
	// metodi prosljedjujemo niz kao argument
	public static int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {

			int minPos = i;// indeks najmanje vrijednosti u nizu
			for (int j = i + 1; j < array.length; j++) {
				// provjeravamo da li je neki broj u nizu manji od svog
				// prethodnika
				if (array[j] < array[minPos]) {
					minPos = j;// ako jeste, mijenjamo im mjesta
				}
			}
			int temp = array[minPos];
			array[minPos] = array[i];
			array[i] = temp;
		}
		return array;// metoda vraca niz, sortiran u rastucem redoslijedu
	}

	public static void main(String[] args) {
		StopWatch watch = new StopWatch();// kreiramo novu instancu klase
		int arr[] = new int[100000];// kreiramo novi niz koji sadrzi 100000
									// cijelih brojeva
		for (int i = 0; i < arr.length; i++) {
			// nasumicno generisemo elemente niza
			arr[i] = (int) Math.random() * 1000;
		}
		watch.start();// stoperica pocinje da odbrojava
		int[] sorted = selectionSort(arr);// pozivamo metodu i sortiramo
											// generisani niz
		watch.stop();// stoperica se zaustavlja kada je sortiranje zavrseno
		// ispisujemo vrijeme proteklo izmedju pocetka i zavrsetka rada
		// stoperice
		System.out.println("Vrijeme potrebno za sortiranje 100 000 brojeva je "
				+ watch.getElapsedTime() + " milisekundi.");
	}
}
