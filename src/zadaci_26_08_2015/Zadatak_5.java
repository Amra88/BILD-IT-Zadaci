package zadaci_26_08_2015;

public class Zadatak_5 {
	/**
	 * (Enable the Course class cloneable) Rewrite the Course class in Listing
	 * 10.6 to add a clone method to perform a deep copy on the students field.
	 * 
	 * @throws CloneNotSupportedException
	 */

	public static void main(String[] args) throws CloneNotSupportedException {
		// kreiramo instancu Course klase
		Course course = new Course("Java Programming");
		// dodajemo studente u niz
		course.addStudent("Marina");
		course.addStudent("Goran");
		course.addStudent("Ognjen");
		course.addStudent("Nikola");
		course.addStudent("Novo");
		// ispisujemo naziv kursa, broj studenata i studente
		System.out.println(course.toString());
		System.out.print("Students: ");
		for (int i = 0; i < course.getNumberOfStudents(); i++) {
			System.out.print(course.getStudents()[i] + ", ");
		}
		System.out.println("\n\nCloning Course Object...\n");
		// kopiramo course objekat
		Course clonedCourse = (Course) course.clone();
		// ispisujemo naziv kursa, broj studenata i studente kopiranog objekta
		System.out.println(clonedCourse.toString());
		System.out.print("Students: ");
		for (int i = 0; i < clonedCourse.getNumberOfStudents(); i++) {
			System.out.print(clonedCourse.getStudents()[i] + ", ");
		}
	}
}
