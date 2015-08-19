package zadaci_15_08_2015;

public class MyCharacter {
	// data fields
	private char ch;

	// konstruktor
	// kreira novi MyCharacter objekat za odredjeni karakter
	public MyCharacter(char ch) {
		this.ch = ch;
	}

	// metoda koja provjerava da li je karakter broj
	public static boolean isDigit(char ch) {
		return ch >= '0' && ch <= '9';
	}

	// metoda koja provjerava da li je karakter slovo
	public static boolean isLetter(char ch) {
		return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
	}

	// metoda koja provjerava da li su svi karakteri mala slova
	public static boolean isLowerCase(char ch) {

		return (ch >= 'a' && ch <= 'z');
	}

	// metoda koja provjerava da li su svi karakteri velika slova
	public static boolean isUpperCase(char ch) {
		return (ch >= 'A' && ch <= 'Z');
	}

	// getter karaktera
	public char getChar() {
		return ch;
	}

	// metoda koja provjerava da li su dva karaktera jednaka
	public boolean equals(MyCharacter ch) {
		return this.ch == ch.getChar();
	}
}
