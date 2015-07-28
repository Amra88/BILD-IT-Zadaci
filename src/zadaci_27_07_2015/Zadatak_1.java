package zadaci_27_07_2015;

public class Zadatak_1 {
	/*
	 * Napisati program koji pita korisnika da unese cijeli broj za dana�nji dan
	 * u sedmici (0 za ponedjeljak, 1 za utorak...) i da unese broj dana nakon
	 * dana�njeg dana te mu ispi�e koji je to dan u budu�nosti. (Primjer: ako
	 * korisnik unese 1 kao dana�nji dan a 3 kao dan u budu�nosti program mu
	 * ispisuje da je danas utorak a dan u budu�nosti je petak.)
	 */
	// Metoda kao argumente prima danasnji dan i broj dana nakon danasnjeg dana
	public static void getDay(int today, int futureDay) {
		// array koji sadrzi nazive svih dana
		String[] days = { "ponedjeljak", "utorak", "srijeda", "cetvrtak",
				"petak", "subota", "nedjelja" };
		// formula kojom racunamo buduci dan
		int day = (today + futureDay) % 7;
		// u arrayu pronalazimo dan koji je trazen, koristeci se indeksima
		// ispisujemo rezultat
		System.out.println("Danas je " + days[today] + ", a za " + futureDay
				+ " dana bice " + days[day] + ".");

	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// Korisnik unosi broj danasnjeg dana, od 0 do 6
		System.out
				.println("Unesite danasnji dan (0 za ponedjeljak, 1 za utorak... ): ");
		int day = input.nextInt();
		// kao i broj dana do buduceg dana
		System.out.println("Unesite broj dana do buduceg dana: ");
		int fDay = input.nextInt();
		// pozivamo metodu i ispisujemo rezultat
		getDay(day, fDay);

	}
}
