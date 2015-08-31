package zadaci_25_08_2015;

import java.util.ArrayList;

//klasa implementira Cloneable interface
public class MyStack implements Cloneable {
	// lista za spremanje objekata
	private ArrayList<Object> list = new ArrayList<>();

	// metoda koja vraca true ako je lista prazna
	public boolean isEmpty() {
		return list.isEmpty();
	}

	// metoda koja vraca broj elemenata u listi
	public int getSize() {
		return list.size();
	}

	// metoda koja vraca posljednji element iz liste
	public Object peek() {
		return list.get(getSize() - 1);
	}

	// metoda koja vraca posljednji element i uklanja ga iz liste
	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	// metoda za dodavanje novog objekta u listu
	public void push(Object o) {
		list.add(o);
	}

	// implementiramo metodu clone() definisanu u Object klasi
	@Override
	public Object clone() throws CloneNotSupportedException {
		MyStack cloned = (MyStack) super.clone();
		cloned.list = (ArrayList<Object>) (list.clone());
		// metoda vraca kopiranu listu objekata
		return cloned;
	}

	// prikaz liste
	@Override
	public String toString() {
		return list.toString();
	}
}
