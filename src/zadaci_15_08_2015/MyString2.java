package zadaci_15_08_2015;

public class MyString2 {
	// data fields
	String s;

	// konstruktor
	// kreira novi MyString2 objekat za odredjeni string
	public MyString2(String s) {
		this.s = s;
	}

	// metoda za poredjenje dva stringa
	// metoda vraca broj 1 ukoliko je postojeci (this) string veci od
	// proslijedjenog
	// 0 ako su stringovi jednaki ili
	// -1 ako je proslijedjeni string veci od postojeceg
	public int compare(String s) {
		int result = 0;
		if (this.s.length() < s.length()) {
			result = -1;
		} else if (s.length() < this.s.length()) {
			result = 1;
		} else {
			for (int i = 0; i < this.s.length(); i++) {
				if (this.s.charAt(i) < s.charAt(i)) {
					result = -1;
				}
				if (this.s.charAt(i) > s.charAt(i)) {
					result = 1;
				}
			}
		}
		return result;
	}

	// metoda vraca novi MyString2 objekat koji je substring (this) stringa
	// metodi prosljedjujemo broj koji je pocetni indeks substringa
	public MyString2 substring(int begin) {
		String sub = "";
		for (int i = begin, j = 0; i < s.length(); i++, j++) {
			sub += this.s.charAt(i);
		}
		return new MyString2(sub);
	}

	// metoda vraca novi MyString2 objekat sa svim karakterima stringa
	// postavljenim na velika slova
	public MyString2 toUpperCase() {
		String upperC = "";
		for (int i = 0; i < this.s.length(); i++) {
			upperC += this.s.toUpperCase().charAt(i);
		}
		return new MyString2(upperC);
	}

	// metoda koja vraca string kao niz karaktera
	public char[] toChars() {
		char[] chars = new char[this.s.length()];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = this.s.charAt(i);
		}
		return chars;
	}

	// metoda vraca boolean vrijednost MyString2 objekta
	public static MyString2 valueOf(boolean b) {
		if (b == true) {
			return new MyString2("true");
		} else {
			return new MyString2("false");
		}
	}

	// metoda za ispis stringa
	@Override
	public String toString() {
		return this.s;
	}

}
