package zadaci_17_08_2015;

import java.util.*;

public class Zadatak_4 {
	/*
	 * (Use ArrayList) Write a program that creates an ArrayList and adds a Loan
	 * object, a Date object, a string, and a Circle object to the list, and use
	 * a loop to display all the elements in the list by invoking the object’s
	 * toString() method.
	 */
	public static void main(String[] args) {
		// kreiramo novu array listu objekata
		ArrayList<Object> list = new ArrayList<>();
		// u listu dodajemo nove instance postojecih klasa(objekte)
		list.add(new Triangle(4, 8, 12));
		list.add(new Person("Somebody"));
		list.add("Some String");
		list.add(new Date());

		for (int i = 0; i < list.size(); i++) {
			// pomocu for petlje i toString() metoda iz klasa kreiranih
			// objekata, ispisujemo sve elemente iz liste
			System.out.println(list.get(i).toString() + "\n");
		}
	}
}
