package zadaci_21_08_2015;

public class Zadatak_2 {
	/**
	 * (OutOfMemoryError) Write a program that causes the JVM to throw an
	 * OutOfMemoryError and catches and handles this error.
	 */
	public static void main(String[] args) {
		// izvrsava se try blok
		try {
			// String objekat stavljamo u beskonacnu petlju, sto prouzrokuje
			// OutOfMemoryError
			// OutOfMemoryError baca JVM kada ponestane memorije za alociranje
			// novih objekata
			String s = "A";
			while (true) {
				s += s;
			}
		} catch (OutOfMemoryError er) {
			// catch blok hvata OutOfMemoryError i izvrsava svoje naredbe,
			// odnosno, ispisuje poruku
			System.out.println("\n\t\tOut of Memory!!!");
		}
	}
}
