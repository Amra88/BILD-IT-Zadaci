package zadaci_08_08_2015;

public class Zadatak_4 {
	/*
	 * Napisati metodu za sortiranje dvodimenzionalnog niza koristeci sljedeci
	 * method header public static void sort(int m[][]). Metoda vrsi primarno
	 * sortiranje nad redovima, a sekundarno nad kolonama.
	 */
	// metoda za sortiranje redova i kolona
	public static void sort(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length - 1; j++) {
				// poredimo vrijednosti prvih elemenata u redovima; ukoliko je
				// prvi element u nekom redu manji od prethodnog, redovima
				// mijenjamo mjesta
				if (m[j][0] > m[j + 1][0]) {
					int temp = m[j][0];
					int temp1 = m[j][1];
					m[j][0] = m[j + 1][0];
					m[j][1] = m[j + 1][1];
					m[j + 1][0] = temp;
					m[j + 1][1] = temp1;
				}
				// ukoliko su prvi elementi u redovima jednaki, poredimo druge
				// elemente u redovima, te na osnovu toga sortiramo redove
				if (m[j][0] == m[j + 1][0]) {
					if (m[j][1] > m[j + 1][1]) {
						int temp3 = m[j][1];
						m[j][1] = m[j + 1][1];
						m[j + 1][1] = temp3;
					}
				}

			}
		}
		// printamo sortiranu matricu
		System.out.println("Sortirana matrica:\n");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// kreiramo matricu velicine 6x2
		int[][] matrix = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 },
				{ 4, 1 } };
		sort(matrix);// pozivamo metodu sort i prikazujemo sortiranu matricu
	}
}
