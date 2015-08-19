package zadaci_17_08_2015;

public class Person {
	// data fields
	private String name;
	private String adress;
	private int phoneNumber;
	private String email;

	// no-arg konstruktor
	public Person() {

	}

	// konstruktor koji kreira objekat koristeci data field "name"
	public Person(String name) {
		this.name = name;
	}

	// getteri i setteri data fielda
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;

	}

	// override-ovana metoda za predstavljanje objekta
	@Override
	public String toString() {
		return "Class: " + this.getClass().getName() + "\t\tName: " + getName();
	}
}
