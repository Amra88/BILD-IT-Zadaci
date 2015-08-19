package zadaci_15_08_2015;

public class Zadatak_5 {
	/*
	 * (Implement the StringBuilder class) The StringBuilder class is provided
	 * in the Java library. Provide your own implementation for the following
	 * methods (name the new class MyStringBuilder1): 
	 * public MyStringBuilder1(String s); 
	 * public MyStringBuilder1 append(MyStringBuilder1 s); 
	 * public MyStringBuilder1 append(int i); 
	 * public int length(); 
	 * public char charAt(int index);
	 * public MyStringBuilder1 toLowerCase(); 
	 * public MyStringBuilder1 substring(int begin, int end);
	 * public String toString();
	 */
	public static void main(String[] args) {
		// kreiramo dva MyStringBuilder1 objekta koja cemo testirati
		MyStringBuilder1 sb1 = new MyStringBuilder1("Zadaci ");
		MyStringBuilder1 sb2 = new MyStringBuilder1("15./16.8.");
		// pozivamo metode iz MyStringBuilder1 klase nad objektima i ispisujemo
		// rezultate
		System.out.println("MyStringBuilder2 methods:\n");
		System.out.println("Append (MyStringBuilder1 s) >> " + sb1.append(sb2));
		System.out.println("Append(int i) >> " + sb2.append(2015));
		System.out.println("Length() >> " + sb1.length());
		System.out.println("CharAt(int index) >> " + sb1.charAt(2));
		System.out.println("ToLowerCase() >> " + sb1.toLowerCase());
		System.out.println("Substring(int begin, int end) >> "
				+ sb1.substring(1, 4));
	}
}
