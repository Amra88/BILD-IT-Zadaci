package zadaci_26_08_2015;

//klasa implementira Cloneable interface
public class Course implements Cloneable {
	// data fields
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	// konstruktor sa proslijedjenim nazivom kursa - courseName
	public Course(String courseName) {
		this.courseName = courseName;
	}

	// metoda za dodavanje novog studenta u niz studenata
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	// metoda koja vraca niz studenata
	public String[] getStudents() {
		return students;
	}

	// broj studenata
	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	// naziv kursa
	public String getCourseName() {
		return courseName;
	}

	// implementiramo metodu clone() definisanu u Object klasi
	// metoda vrsi kopiranje objekata
	@Override
	public Object clone() throws CloneNotSupportedException {
		Course cloned = (Course) super.clone();
		cloned.students = students.clone();
		// metoda vraca kopirani niz String objekata (niz students)
		return cloned;
	}

	// metoda za predstavljanje objekta u vidu stringa
	@Override
	public String toString() {
		return "Course: " + this.getCourseName() + "\nNumber of students: "
				+ this.getNumberOfStudents();
	}
}
