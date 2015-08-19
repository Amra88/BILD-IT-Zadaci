package zadaci_15_08_2015;

public class MyString1 {
	// data fields
	char[] chars;

	// konstruktor
	// kreira MyString1 objekat za proslijedjeni niz karaktera
	public MyString1(char[] chars) {
		this.chars = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			this.chars[i] = chars[i];
		}
	}

	// metoda koja vraca karakter na odredjenom indeksu niza
	public char charAt(int index) {

		return this.chars[index];
	}

	// metoda koja vraca duzinu niza
	public int length() {
		return this.chars.length;
	}

	// metoda koja vraca substring stringa, sa odredjenim indeksima pocetka i
	// kraja substringa
	public MyString1 substring(int begin, int end) {
		char[] str = new char[end - begin];
		for (int i = begin; i < end; i++) {
			str[i - begin] = this.chars[i];

		}
		return new MyString1(str);
	}

	// metoda koja vraca novi MyString1 objekat sa karakterima postavljenim na
	// mala slova
	public MyString1 toLowerCase() {
		char[] lowerCase = new char[this.chars.length];
		for (int i = 0; i < this.chars.length; i++) {
			lowerCase[i] = Character.toLowerCase(this.chars[i]);
		}
		return new MyString1(lowerCase);
	}

	// boolean metoda koja provjerava da li su postojeci i proslijedjeni objekat
	// jednaki
	public boolean equals(MyString1 s) {
		if (s.length() != this.chars.length) {
			return false;
		} else {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != this.chars[i]) {
					return false;
				}
			}
			return true;
		}
	}

	// metoda koja vraca novi MyString1 objekat koji sadrzi vrijednost
	// proslijedjenog broja
	public static MyString1 valueOf(int i) {
		int length = 0;
		int n = i;
		while (n > 0) {
			n /= 10;
			length++;
		}
		char[] number = new char[length];
		for (int j = number.length - 1; j >= 0; j--) {
			number[j] = (char) ('0' + (i % 10));
			i /= 10;
		}
		return new MyString1(number);
	}

	// metoda za ispis stringa (niz karaktera dodajemo u string)
	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < this.chars.length; i++) {
			str += this.chars[i];
		}
		return str;
	}
}
