package zadaci_17_08_2015;

public class Zadatak_2_PersonClass {
	/*
	 * (The Person, Student, Employee, Faculty, and Staff classes) Design a
	 * class named Person and its two subclasses named Student and Employee.
	 * Make Faculty and Staff subclasses of Employee. A person has a name,
	 * address, phone number, and email address. A student has a class status
	 * (freshman, sophomore, junior, or senior). Define the status as a
	 * constant. An employee has an office, salary, and date hired. A faculty
	 * member has office hours and a rank. A staff member has a title. Override
	 * the toString method in each class to display the class name and the
	 * person’s name. Write a test program that creates a Person, Student,
	 * Employee, Faculty, and Staff, and invokes their toString() methods.
	 */
	public static void main(String[] args) {
		// kreiramo instancu svake od kreiranih klasa i konstruktoru
		// prosljedjujemo String (data field "name")
		Person person = new Person("Sanja is person!");
		Student student = new Student("Ivana is student!");
		Employee employee = new Employee("Dino is employee!");
		Faculty faculty = new Faculty("Igor is at faculty!");
		Staff staff = new Staff("Maja is staff!");
		// nad objektima pozivamo njihovu metodu toString()
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());

	}

}
