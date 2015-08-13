package zadaci_10_08_2015;

public class Zadatak_5 {
	/*
	 * (Latin square) A Latin square is an n-by-n array filled with n different
	 * Latin letters, each occurring exactly once in each row and once in each
	 * column. Write a program that prompts the user to enter the number n and
	 * the array of characters, as shown in the sample output, and checks if the
	 * input array is a Latin square. The characters are the first n characters
	 * starting from A.
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi broj n - velicinu matrice
		System.out.println("Enter number n:");
		int n = input.nextInt();
		char[][] square = new char[n][n];// kreiramo novi 2D niz tipa char
		System.out.println("Enter " + n
				+ " rows of letters separated by spaces:");
		// korisnik unosi elemente niza, karaktere
		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square[i].length; j++) {
				// sve karaktere prebacujemo na upperCase i spremamo ih u
				// matricu
				square[i][j] = input.next().toUpperCase().charAt(0);
			}
		}
		// pozivamo metodu i prosljedjujemo joj 2D niz za provjeru
		// u zavisnosti od rezultata ispisujemo poruku
		if (checkLatinSquare(square)) {
			System.out.println("The input array is a Latin square.");
		} else {
			System.out.println("The input array is not a Latin square.");
		}
	}

	// Metoda koja provjerava da li je proslijedjeni 2D niz LatinSquare
	public static boolean checkLatinSquare(char[][] s) {
		boolean isLatin = true;// boolean varijabla koja ima vrijednost true ako
								// je 2D niz LatinSquare
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				// provjeravamo da li su karakteri u odredjenom rasponu
				if (s[i][j] < 'A' || s[i][j] >= 'A' + s.length) {
					isLatin = false;// ako nisu, 2D niz nije Latin square
					// ispisujemo poruku i izlazimo iz petlje
					System.out
							.println("Wrong input: the letters must be from A to "
									+ (char) ('A' + s.length - 1));
					break;
				}
			}
		}
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				for (int k = 0; k < s[i].length; k++) {
					// provjeravamo da li se karakteri ponavljaju u redovima i
					// kolonama
					if (j != k) {// preskacemo poredjenje karaktera sa samim
									// sobom
						if (s[i][j] == s[i][k] || s[j][i] == s[k][i]) {
							isLatin = false;// ako se neki karakter ponovi u
											// istom redu ili koloni, 2D niz
											// nije Latin square
							break;// izlazimo iz petlje
						}
					}
				}
			}
		}

		return isLatin;// metoda vraca vrijednost true ili false, odnosno da li
						// je 2D niz LatinSquare ili nije
	}
}
