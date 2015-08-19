package zadaci_17_08_2015;

public class Faculty extends Employee {
	// klasa Faculty extenduje klasu Employee
	
	// data fields
	private int officeHours;
	private String rank;

	// konstruktor koji kreira objekat sa default vrijednostima
	public Faculty(String name) {
		this(name, 0, "Employee");
	}

	// konstruktor koji kreira objekat sa odredjenim vrijednostima
	// data field "name" nasljedjuje iz superklase
	public Faculty(String name, int officeHours, String rank) {
		super(name);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	// getteri i setteri data fields-a
	public int getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	// override-ovana metoda za predstavljanje objekta
	@Override
	public String toString() {
		return "Class: " + this.getClass().getName() + "\tName: " + getName();
	}
}
