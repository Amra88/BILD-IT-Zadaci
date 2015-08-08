package zadaci_07_08_2015;

public class Zadatak_3 {
	/*
	 * Napisati metodu sa sljedecim headerom public static boolean
	 * isConsecutiveFour(int[] values). Metoda provjerava da li niz ima 4
	 * uzastopna broja iste vrijednosti. Korisnik unosi velicinu niza, kao i
	 * elemente niza.
	 */
	// Metoda koja provjerava da li proslijedjeni niz ima jednaka 4 uzastopna
	// broja
	public static boolean isConsecutiveFour(int[] values) {
		boolean isConsecutive = false;// uslov
		int count = 1;// brojac
		for (int i = 0; i < values.length - 1; i++) {
			// kroz petlju provjeravamo cijeli niz
			if (values[i] == values[i + 1]) {// ako je broj jednak svom
												// prethodniku
				count++;// brojac uvecavamo
			} else {
				count = 1;// u suprotnom, brojac ostaje 1
			}
			if (count == 4) {// ukoliko postoje bar 4 ista uzastopna broja
				isConsecutive = true;// metoda ce vratiti true
				break;
			} else {
				isConsecutive = false;// u suprotnom, metoda vraca false, nisu
										// pronadjena 4 ista uzastopna broja
			}
		}
		return isConsecutive;// metoda vraca boolean vrijednost true ili false
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// Korisnik unosi velicinu i elemente niza
		System.out.println("Unesite velicinu niza: ");
		int length = input.nextInt();
		int[] arr = new int[length];
		System.out.println("Unesite elemente niza: ");
		for (int i = 0; i < length; i++) {
			arr[i] = input.nextInt();
		}
		// pozivamo metodu i ispisujemo rezultat
		if (isConsecutiveFour(arr)) {
			System.out.println("Niz ima cetiri ista uzastopna broja!");
		} else {
			System.out.println("Niz nema cetiri ista uzastopna broja!");
		}
	}
}
