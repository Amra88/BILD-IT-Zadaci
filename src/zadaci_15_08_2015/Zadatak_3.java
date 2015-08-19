package zadaci_15_08_2015;

public class Zadatak_3 {
	/*
	 * (Implement the Character class) The Character class is provided in the
	 * Java library. Provide your own implementation for this class. Name the
	 * new class MyCharacter.
	 */
	public static void main(String[] args) {
		// kreiramo novu instancu MyCharacter klase za testiranje
		MyCharacter ch = new MyCharacter('L');
		// nad objektom pozivamo metode iz klase i ispisujemo rezultate
		System.out.println("MyCharacter methods:\n");
		System.out.println("GetChar >> " + ch.getChar());
		System.out.println("IsLetter >> " + ch.isLetter('L'));
		System.out.println("IsDigit >> " + ch.isDigit('L'));
		System.out.println("IsLowerCase >> " + ch.isLowerCase('T'));
		System.out.println("IsUpperCase >> " + ch.isUpperCase('T'));
		System.out.println("Equals >> " + ch.equals(new MyCharacter('L')));
	}
}
