package zadaci_25_08_2015;

//klasa implementira Comparable interfejs koji omogucava poredjenje objekata
public abstract class GeometricObject implements Comparable<GeometricObject> {
	// data fields
	private String color = "white";
	private boolean filled;

	// no-arg konstruktor, kreira objekat sa default vrijednostima
	protected GeometricObject() {

	}

	// konstruktor sa odredjenim vrijednostima data fields-a
	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;

	}

	// getteri i setteri data fields-a
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean filled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	// Override-ovana metoda za poredjenje objekata
	@Override
	public int compareTo(GeometricObject object) {
		if (this.getArea() < object.getArea()) {
			return -1;
		} else if (this.getArea() > object.getArea()) {
			return 1;
		} else {
			return 0;
		}
	}

	// metoda koja vraca veci od dva objekta koja poredimo
	public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
		if (o1.compareTo(o2) == 1) {
			return o1;
		} else if (o1.compareTo(o2) == -1) {
			return o2;
		} else {
			System.out.println("\nThe objects are equal.");
			return null;
		}

	}

	// apstraktne metode za racunanje povrsine i obima
	public abstract double getArea();

	public abstract double getPerimeter();
}
