package zadaci_15_08_2015;

public class MyStringBuilder1 {
	// data fields
	String s;

	// konstruktor
	// kreira novi MyStringBuilder1 objekat za odredjeni string
	public MyStringBuilder1(String s) {
		this.s = s;
	}

	// metoda koja dodaje vrijednost MyStringBuilder1 objekta postojecem (this)
	// objektu
	// vraca novi MyStringBuilder1 objekat koji predstavlja spoj pomenuta dva
	public MyStringBuilder1 append(MyStringBuilder1 s) {
		return new MyStringBuilder1(this.s + s);
	}

	// metoda koja dodaje broj proslijedjen kao argument, postojecem (this)
	// objektu
	// vraca novi MyStringBuilder1 objekat koji predstavlja spoj objekta i
	// cijelog broja
	public MyStringBuilder1 append(int i) {
		return new MyStringBuilder1(this.s + i);
	}

	// metoda koja vraca duzinu stringa
	public int length() {
		return this.s.length();
	}

	// metoda koja vraca karakter na odredjenom indeksu stringa
	public char charAt(int index) {
		return this.s.charAt(index);
	}

	// metoda vraca novi MyStringBuilder1 objekat sa svim karakterima stringa
	// postavljenim na mala slova
	public MyStringBuilder1 toLowerCase() {
		return new MyStringBuilder1(this.s.toLowerCase());
	}

	// metoda koja vraca substring stringa, sa odredjenim indeksima pocetka i
	// kraja substringa
	public MyStringBuilder1 substring(int begin, int end) {
		return new MyStringBuilder1(this.s.substring(begin, end));
	}

	// metoda za ispis stringa
	public String toString() {
		return this.s;
	}
}
