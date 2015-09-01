package zadaci_26_08_2015;

public abstract class GeometricObject  {
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

	// apstraktne metode za racunanje povrsine i obima
	public abstract double getArea();

	public abstract double getPerimeter();
	
}
