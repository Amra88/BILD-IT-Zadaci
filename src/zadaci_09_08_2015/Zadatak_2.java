package zadaci_09_08_2015;

public class Zadatak_2 {
	/*
	 * Dvodimenzionalni nizovi m1 i m2 su identicni ako su njihovi odgovarajuci
	 * elementi jednaki. Napisati metodu koja vraca true ako su m1 i m2
	 * identicni, koristeci sljedeci header public static boolean equals(int[][]
	 * m1, int[][] m2). Napisati program koji od korisnika trazi da unese dvije
	 * 3x3 matrice, te ispisuje da li su matrice identicne.
	 */
	// Metoda koja vrsi provjeru identicnosti dva dvodimenzionalna niza
	// kao argumente, metoda prima dva 2D niza
	public static boolean equals(int[][] m1, int[][] m2) {
		boolean isEqual = true;// boolean varijabla ima vrijednost true ako su
								// matrice identicne
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1.length; j++) {
				// poredimo odgovarajuce elemente jedne i druge matrice
				if (m1[i][j] != m2[i][j]) {
					isEqual = false;// ako naidjemo na elemente koji nisu
									// jednaki, metoda vraca false
					break;
				}
			}
		}
		return isEqual;// metoda vraca vrijednost true ili false
	}

	public static void main(String[] args) {
		// kreiramo dvije 3x3 matrice
		int[][] matrix1 = new int[3][3];
		int[][] matrix2 = new int[3][3];
		// korisnik unosi elemente prve i druge matrice
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Unesite " + matrix1.length + " reda i "
				+ matrix1[0].length + " kolone prve matrice: ");

		for (int row = 0; row < matrix1.length; row++) {
			for (int column = 0; column < matrix1[row].length; column++) {
				matrix1[row][column] = input.nextInt();
			}
		}
		System.out.println("Unesite " + matrix2.length + " reda i "
				+ matrix2[0].length + " kolone druge matrice: ");

		for (int row = 0; row < matrix2.length; row++) {
			for (int column = 0; column < matrix2[row].length; column++) {
				matrix2[row][column] = input.nextInt();
			}
		}
		// pozivamo metodu equals i poredimo dvije matrice
		// u zavisnosti od rezultata, ispisujemo poruku
		if (equals(matrix1, matrix2)) {
			System.out.println("\nMatrice su identicne!");
		} else {
			System.out.println("\nMatrice nisu identicne!");
		}
	}
}
