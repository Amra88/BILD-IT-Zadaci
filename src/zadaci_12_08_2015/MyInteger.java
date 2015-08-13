package zadaci_12_08_2015;

public class MyInteger {
	// definisemo data field
	private int value;

	// konstruktor koji kreira objekat sa specificnom (proslijedjenom)
	// vrijednosti
	public MyInteger(int value) {
		this.value = value;
	}

	// getter data field-a
	public int getValue() {
		return value;
	}

	// metoda koja provjerava da li je broj paran
	public boolean isEven() {
		if (this.value % 2 != 0) {
			return false;
		}
		return true;
	}

	// metoda koja provjerava da li je broj neparan
	public boolean isOdd() {
		if (this.value % 2 == 0) {
			return false;
		}
		return true;
	}

	// metoda koja provjerava da li je broj prost
	public boolean isPrime() {
		for (int i = 2; i < this.value; i++) {
			// broj dijelimo sa brojevima od 2 pa do samog broja
			if (this.value % i == 0) {
				return false;
				// ako je broj djeljiv s nekim brojem osim sa sobom i 1, nije
				// prost
			}
		}
		return true;// metoda vraca boolean vrijednost true ili false
	}

	// naredne metode rade isto sto i prethodne 3, s tim sto im prosljedjujemo
	// novu vrijednost nad kojom ce vrsiti obradu
	public static boolean isEven(int value) {
		if (value % 2 != 0) {
			return false;
		}
		return true;
	}

	public static boolean isOdd(int value) {
		if (value % 2 == 0) {
			return false;
		}
		return true;
	}

	public static boolean isPrime(int value) {
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	// u naredna 3 slucaja, metodama prosljedjujemo novu instancu klase koja ima
	// svoju vrijednost
	public static boolean isEven(MyInteger v) {
		if (v.getValue() % 2 != 0) {
			return false;
		}
		return true;
	}

	public static boolean isOdd(MyInteger v) {
		if (v.getValue() % 2 == 0) {
			return false;
		}
		return true;
	}

	public static boolean isPrime(MyInteger v) {
		for (int i = 2; i < v.getValue(); i++) {
			if (v.getValue() % i == 0) {
				return false;
			}
		}
		return true;
	}

	// metoda koja provjerava da li je vrijednost objekta jednaka novoj
	// proslijedjenoj vrijednosti
	public boolean equals(int v) {
		if (this.value == v) {
			return true;
		}
		return false;
	}

	// metoda radi isto sto i prethodna, s tim sto joj prosljedjujemo novi
	// objekat koji ima svoju vrijednost
	public boolean equals(MyInteger v) {
		if (this.value == v.getValue()) {
			return true;
		}
		return false;
	}

	// metoda koja pretvara niz numerickih karaktera u int vrijednost (cijeli
	// broj)
	public static int parseInt(char[] number) {
		String n = "";
		for (int i = 0; i < number.length; i++) {
			n += number[i];
		}
		int num = Integer.valueOf(n);
		return num;
	}

	// metoda koja pretvara String brojeva u cijeli broj
	public static int parseInt(String n) {
		int num = Integer.valueOf(n);
		return num;
	}
}
