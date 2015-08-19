package zadaci_17_08_2015;

public class Staff extends Employee {
	// klasa Staff extenduje klasu Employee

	// data fields
	private String title;

	// konstruktor koji kreira objekat sa default vrijednostima
	public Staff(String name) {
		this(name, "menager");
	}

	// konstruktor koji kreira objekat sa odredjenim vrijednostima
	// data field "name" nasljedjuje iz superklase
	public Staff(String name, String title) {
		super(name);
		this.title = title;
	}

	// getter i setter polja "title"
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// override-ovana metoda za predstavljanje objekta
	@Override
	public String toString() {
		return "Class: " + this.getClass().getName() + "\t\tName: " + getName();
	}
}
