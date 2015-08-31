package zadaci_25_08_2015;

public class Zadatak_5 {
	/**
	 * (Revise the MyStack class) Rewrite the MyStack class in Listing 11.10 to
	 * perform a deep copy of the list field.
	 * 
	 * @throws CloneNotSupportedException
	 */

	public static void main(String[] args) throws CloneNotSupportedException {
		// kreiramo dvije instance MyStack klase
		MyStack stack1 = new MyStack();
		MyStack stack2 = new MyStack();
		// prvoj dodajemo nove elemente (Integer objekte)
		stack1.push(new Integer(1));
		stack1.push(new Integer(2));
		stack1.push(new Integer(3));
		stack1.push(new Integer(4));
		stack1.push(new Integer(5));
		// kopiramo objekte iz stack1 i spremamo ih u stack2 instancu
		stack2 = (MyStack) stack1.clone();
		// ispisujemo rezultat
		System.out.println("Stack1: " + stack1.toString());
		System.out.println("Stack2: " + stack2.toString());
	}
}
