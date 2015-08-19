package zadaci_17_08_2015;

public class Student extends Person {
	// klasa Student extenduje klasu Person
	
	// data fields, konstante
	public String status;
	private final String FRESHMAN = "Freshman";
	private final String SOPHOMORE = "Sophomore";
	private final String JUNIOR = "Junior";
	private final String SENIOR = "Senior";

	// konstruktori kreiraju objekat koristeci naslijedjene osobine iz
	// superklase
	public Student(String name) {
		super(name);
	}

	// drugom konstruktoru prosljedjujemo i status
	public Student(String name, String status) {
		super(name);
		this.status = status;
	}
	// override-ovana metoda za predstavljanje objekta
	@Override
	public String toString() {
		return "Class: " + this.getClass().getName() + "\tName: " + getName();
	}
}
