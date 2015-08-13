package zadaci_10_08_2015;

import java.util.*;

public class Zadatak_1 {
	/*
	 * (Identical arrays) The two-dimensional arrays m1 and m2 are identical if
	 * they have the same contents. Write a method that returns true if m1 and
	 * m2 are identical, using the following header: public static boolean
	 * equals(int[][] m1, int[][] m2) Write a test program that prompts the user
	 * to enter two 3 * 3 arrays of integers and displays whether the two are
	 * identical.
	 */
	// Metoda koja vrsi provjeru jednakosti dva dvodimenzionalna niza
	// kao argumente, metoda prima dva 2D niza
	public static boolean equals(int[][] m1, int[][] m2) {
		boolean isEqual = true;// boolean varijabla ima vrijednost true ako su
								// matrice jednake, odnosno imaju iste elemente
		// kreiramo dvije array liste integera u koje cemo spremiti brojeve iz
		// matrica
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				// brojeve iz matrica spremamo u kreirane liste
				list1.add(m1[i][j]);
				list2.add(m2[i][j]);
			}
		}
		// sortiramo obe liste u rastucem redoslijedu
		Collections.sort(list1);
		Collections.sort(list2);

		for (int k = 0; k < list1.size(); k++) {
			if (!list1.get(k).equals(list2.get(k))) {
				// u sortiranim listama provjeravamo da li su elementi na istim
				// indeksima jednaki
				isEqual = false;// ako elementi nisu jednaki, varijabla ima
								// vrijednost false
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
			System.out.println("\nMatrice imaju isti sadrzaj!");
		} else {
			System.out.println("\nMatrice nemaju isti sadrzaj!");
		}
	}
}
