package zadaci_01_08_2015;

public class Zadatak_4 {
	/*
	 * Napisati metodu koja izraèunava zbir svih brojeva u cijelom broju.
	 * Koristite sljedeæi header: public static int sumDigits(long n). Na
	 * primjer, ako pozovemo metodu i proslijedimo joj broj 234 (sumDigits(234))
	 * metoda treba da vrati 9. (2 + 3 + 4 = 9)
	 */
	// Metoda za sabiranje cifara nekog broja
	// metodi prosljedjujemo broj kao argument
	public static long sumDigits(long n) {
		long sum = 0;// suma cifara
		long digit;// pojedinacne cifre
		// koristeci se ostatkom dijeljenja dobijamo pojedinacne cifre, te ih
		// sabiramo
		while (n != 0) {
			digit = n % 10;
			sum += digit;
			n /= 10;
		}
		return sum;// metoda vraca sumu cifara nekog broja
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Unesite broj cije cifre zelite sabrati: ");
		// korisnik unosi broj
		long num = input.nextLong();
		// pozivamo metodu sumDigits i ispisujemo rezultat
		System.out.println("Zbir cifara broja " + num + " je: "
				+ sumDigits(num));
	}

}
