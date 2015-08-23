package zadaci_21_08_2015;

public class Zadatak_1 {
	/**
	 * 12.7 (NumberFormatException) Write the bin2Dec(String binaryString)
	 * method to convert a binary string into a decimal number. Implement the
	 * bin2Dec method to throw a NumberFormatException if the string is not a
	 * binary string.
	 */

	public static void main(String[] args) {
		// izvrsava se try blok
		try {
			// pozivamo metodu bin2Dec, prosljedjujemo joj string i ispisujemo
			// rezultat
			System.out.println("The entered String is decimal number "
					+ bin2Dec("0000101") + ".\n");

			System.out.println(bin2Dec("12345"));
		} catch (NumberFormatException ex) {
			// ukoliko argument nije validan i metoda baci exception
			// (NumberFormatException), izvrsava se catch blok
			// ispisujemo poruku i program zavrsava s radom
			System.out.println(ex.getMessage());
		}
	}

	// Metoda pretvara binarni broj proslijedjen u vidu stringa u decimalni broj
	public static int bin2Dec(String binary) {
		// pozivamo metodu isBinary i provjeravamo da li je proslijedjeni string
		// binarni
		if (!isBinary(binary)) {
			// ukoliko nije, metoda baca exception, izvrsavanje programa se
			// nastavlja u catch bloku
			throw new NumberFormatException(binary + " is not a binary String.");
		} else {
			// ako je string binarni, pretvaramo ga u decimalni broj
			int pow = 0;// indeks binarnog broja (stepen)
			int num = 0;// decimalni broj
			for (int i = binary.length() - 1; i >= 0; i--) {
				// prolazimo kroz string od posljednjeg karaktera do prvog
				if (binary.charAt(i) == '1') {
					// binarni broj pretvaramo u decimalni tako sto stepenujemo
					// broj 2 na indeks na kojem se jedinica nalazi, pocevsi od
					// 0, te dobijenu vrijednost dodajemo decimalnom broju
					num += Math.pow(2, pow);
				}
				pow++;// uvecavamo indeks binarnog broja(stringa)
			}
			return num;// metoda vraca decimalni broj
		}
	}

	// Metoda koja provjerava da li je broj binarni
	// broj prosljedjujemo metodi u obliku stringa
	public static boolean isBinary(String binary) {
		// provjeravamo da li su svi karakteri u stringu "0" ili "1"
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) != '1' && binary.charAt(i) != '0') {
				// ako karakter nije ni 0 ni 1, metoda vraca false
				return false;
			}
		}
		return true;// u suprotnom, vraca true
	}
}
