package zadaci_15_08_2015;

public class Zadatak_2 {
	/*
	 * 10.23 (Implement the String class) The String class is provided in the
	 * Java library. Provide your own implementation for the following methods
	 * (name the new class MyString2): 
	 * public MyString2(String s); 
	 * public int compare(String s); 
	 * public MyString2 substring(int begin); 
	 * public MyString2 toUpperCase(); 
	 * public char[] toChars(); 
	 * public static MyString2 valueOf(boolean b);
	 */
	public static void main(String[] args) {
		// kreiramo dva MyString2 objekta koja cemo testirati
		MyString2 str1 = new MyString2("Amra Alic");
		MyString2 str2 = new MyString2("Zadaca");
		// pozivamo metode iz MyString2 klase nad objektima i ispisujemo
		// rezultate
		System.out.println("MyString2 methods:\n");
		System.out.println("Compare >> " + str1.compare("Zadaci 15./16.08."));
		System.out.println("Compare >> " + str1.compare("Amra Alic"));
		System.out.println("Substring >> " + str1.substring(5));
		System.out.println("ToUpperCase >> " + str2.toUpperCase());
		System.out.println("ValueOf >> " + str2.valueOf(true));

		// System.out.println("ToChars >> " + str2.toChars().toString());

	}
}
