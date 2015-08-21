package zadaci_18_08_2015;

import java.util.ArrayList;

public class Zadatak_1 {
	/*
	 * (Largest rows and columns) Write a program that randomly fills in 0s and
	 * 1s into an n-by-n matrix, prints the matrix, and finds the rows and
	 * columns with the most 1s.(Hint: Use two ArrayLists to store the row and
	 * column indices with the most 1s.)
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter the array size n:");
		// korisnik unosi velicinu matrice
		int n = input.nextInt();
		// kreiramo novu matricu
		int[][] matrix = new int[n][n];
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				// koristeci metodu random iz Math klase, nasumicno dodjeljujemo
				// vrijednosti 0 ili 1 elementima matrice
				matrix[row][column] = (int) (Math.random() * 2);
			}
		}
		// printamo generisanu matricu
		System.out.println("The random array is:\n");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.printf("%3s", matrix[row][column]);
			}
			System.out.println();
		}
		int countRows = 0;// brojac jedinica u redovima
		int maxRow = 0;// red sa najvecim brojem jedinica
		ArrayList<Integer> rowList = new ArrayList<>();// lista u koju spremamo
														// indekse redova sa
														// najvecim brojem
														// jedinica
	// trazimo red, odnosno redove sa najvecim
	//brojem jedinica
		for (int i = 0; i < matrix.length; i++) {
			// prilikom svake iteracije, brojac jedinica postavljamo na 0
			countRows = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				// brojimo jedinice u redovima
				if (matrix[i][j] == 1) {
					// ako je neki element u redu =1
					countRows++;// uvecavamo brojac
				}
			}
			// provjeravamo da li u nekom redu ima vise jedinica u odnosu na
			// trenutno spremljenu najvecu vrijednost (maxRow)
			if (maxRow < countRows) {
				maxRow = countRows;
				// ukoliko naidjemo na takav red, spremljene vrijednosti brisemo
				// iz liste
				rowList.clear();
				rowList.add(i);// u listu spremamo trenutnu najvecu vrijednost,
								// odnosno indeks reda sa najvecim brojem
								// jedinica
			} else if (maxRow == countRows) {
				rowList.add(i);// ako postoji vise redova sa istim brojem
								// jedinica, koji je ujedno i najveci broj
								// jedinica, u listu dodajemo i indekse ostalih
								// redova
			}
		}
		int countColumns = 0;// brojac jedinica u kolonama
		int maxColumn = 0;// kolona s najvecim brojem jedinica
		ArrayList<Integer> columnList = new ArrayList<>();// lista u koju
															// spremamo indekse
															// kolona sa
															// najvecim brojem
															// jedinica
		// trazimo kolonu, odnosno, kolone sa najvecim
		// brojem jedinica
		// koristimo isti postupak kao i kod trazenja redova, s tim sto sada
		// provjeravamo kolone
		for (int j = 0; j < matrix[0].length; j++) {
			countColumns = 0;
			for (int i = 0; i < matrix.length; i++) {

				if (matrix[i][j] == 1) {
					countColumns++;
				}
			}
			if (maxColumn < countColumns) {
				maxColumn = countColumns;
				columnList.clear();
				columnList.add(j);
			} else if (maxColumn == countColumns) {
				columnList.add(j);
			}
		}
		// ispisujemo rezultat; indekse redova i kolona sa najvecim brojem
		// jedinica koji su spremljeni u array liste
		System.out.println("\nThe largest row index: " + rowList);
		System.out.println("The largest column index: " + columnList);
	}
}
