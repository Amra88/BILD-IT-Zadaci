package zadaci_24_07_2015;

public class Zadatak_1 {
	/*
	 * Pretpostavimo da uplatimo $100 svaki mjesec na štedni raèun koji ima
	 * godišnju interesnu stopu od 5%. Mjeseèna interesna stopa je stoga 0.05 /
	 * 12 = 0.00417. Nakon prvog mjeseca vrijednost na raèunu postaje 100 * (1 +
	 * 0.00417) = 100.417. Nakon drugog mjeseca, vrijednost na raèunu postaje
	 * (100 + 100.417) * (1 + 0.00417) = 201.252. Nakon treæeg mjeseca,
	 * vrijednost na raèunu postaje (100 + 201.252) * (1 + 0.00417) = 302.507 i
	 * tako dalje. Napisati program koji pita korisnika da unese mjeseèni iznos
	 * štednje te broj mjeseci nakon kojeg bi želio znati stanje raèuna.
	 */

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		// korisnik unosi iznos, interesnu stopu, te broj mjeseci za koje zeli
		// znati stanje na racunu
		System.out.println("Unesite mjesecni iznos stednje: ");
		double monthAmount = input.nextInt();
		System.out.println("Unesite godisnju interesnu stopu u procentima: ");
		double annualRate = input.nextDouble();
		System.out.println("Unesite broj mjeseci: ");
		int month = input.nextInt();
		// pozivamo metodu getAmount i prosljedjujemo joj argumente
		double total = getAmount(monthAmount, annualRate, month);
		// ispisujemo rezultat
		System.out.printf("\nZa " + month
				+ " mjeseci, iznos na Vasem racunu ce biti %5.2f KM.", total);
	}

	// Metoda za racunanje konacnog iznosa na racunu nakon odredjenog broja
	// mjeseci
	// parametri: mjesecni iznos stednje, godisnja interesna stopa i broj
	// mjeseci
	public static double getAmount(double deposit, double annualRate, int months) {

		double totalAmount = 0;// ukupan iznos na racunu
		double rate = annualRate / (100 * 12);// racunamo mjesecnu interesnu
												// stopu

		for (int i = 1; i <= months; i++) {
			// ukupan iznos za odredjeni broj mjeseci
			totalAmount = (deposit + totalAmount) * (1 + rate);
		}
		return totalAmount;// metoda vraca trazeni iznos na racunu
	}
}
