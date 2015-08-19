package zadaci_15_08_2015;

public class Zadatak_1 {
	/*
	 * (Implement the String class) The String class is provided in the Java
	 * library. Provide your own implementation for the following methods (name
	 * the new class MyString1): 
	 * public MyString1(char[] chars); 
	 * public char charAt(int index); 
	 * public int length(); 
	 * public MyString1 substring(int begin, int end); 
	 * public MyString1 toLowerCase(); 
	 * public boolean equals(MyString1 s); 
	 * public static MyString1 valueOf(int i);
	 */
	public static void main(String[] args) {
		// kreiramo dva niza karaktera
		char[] ch1 = { 'A', 'm', 'r', 'a', 'A', 'l', 'i', 'c' };
		char[] ch2 = { '1', '5', '2', '3', '0', '7', '1', '1' };
		// kao i dvije instance MyString1 klase koje cemo testirati
		MyString1 s1 = new MyString1(ch1);
		MyString1 s2 = new MyString1(ch2);
		// nad kreiranim objektima pozivamo metode iz MyString1 klase i
		// ispisujemo rezultate
		System.out.println("MyString1 methods:\n");
		System.out.println("CharAt - s1.charAt(6) >> " + s1.charAt(6));
		System.out.println("Length - s1.length() >> " + s1.length());
		System.out.println("Substring - s1.substring(1, 4) >> "
				+ s1.substring(1, 4));
		System.out.println("ToLowerCase - s1.toLowerCase() >> "
				+ s1.toLowerCase());
		System.out.println("Equals - s1.equals(s2) >> " + s1.equals(s2));
		System.out.println("Value of - s1.valueOf(12345) >> "
				+ s1.valueOf(12345));
	}
}
