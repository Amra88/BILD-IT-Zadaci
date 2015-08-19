package zadaci_17_08_2015;

import java.util.Date;

public class Employee extends Person {
	// klasa Employee extenduje klasu Person

	// data fields
	private String office;
	private double salary;
	private java.util.Date dateHired;

	// konstruktor za kreiranje instance sa default vrijednostima
	public Employee(String name) {
		this(name, "00", 0, new java.util.Date());
	}

	// konstruktor koji kreira objekat sa odredjenim vrijednostima
	// polje "name" nasljedjuje iz superklase
	public Employee(String name, String office, double salary, Date dateHired) {
		super(name);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}

	// getteri i setteri data fields-a
	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public java.util.Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(java.util.Date dateHired) {
		this.dateHired = dateHired;
	}

	// override-ovana metoda za predstavljanje objekta
	@Override
	public String toString() {
		return "Class: " + this.getClass().getName() + "\tName: " + getName();
	}

}
