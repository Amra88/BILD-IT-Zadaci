package zadaci_26_08_2015;

//subklasa GeometricObject klase, implementira Comparable interface
public class RectangleFromGeometricObject extends GeometricObject implements
		Comparable<RectangleFromGeometricObject> {
	// data fields
	private double width;
	private double height;

	// no-arg konstruktor, kreira objekat sa default vrijednostima
	public RectangleFromGeometricObject() {
		width = 1;
		height = 1;
	}

	// konstruktor sa odredjenim vrijednostima data fields-a
	public RectangleFromGeometricObject(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// getteri i setteri data fields-a
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// implementacija naslijedjenih apstraktnih metoda iz superklase
	@Override
	// povrsina pravougaonika
	public double getArea() {
		return width * height;
	}

	// obim pravougaonika
	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}

	// implementacija metode za poredjenje objekata (pravougaonika)
	// poredjenje vrsimo na osnovu povrsine pravougaonika
	@Override
	public int compareTo(RectangleFromGeometricObject rectangle) {
		if (this.getArea() < rectangle.getArea()) {
			return -1;
		} else if (this.getArea() > rectangle.getArea()) {
			return 1;
		} else {
			return 0;
		}
	}

	// Override-amo metodu equals() iz Object klase
	// metoda vraca true ako su poredjeni objekti jednaki
	@Override
	public boolean equals(Object rectangle) {
		return this.compareTo((RectangleFromGeometricObject) rectangle) == 0;
	}

	// metoda za predstavljanje objekta u vidu stringa
	@Override
	public String toString() {
		return "Width: " + getWidth() + "\nHeight: " + getHeight() + "\nArea: "
				+ getArea() + "\nPerimeter: " + getPerimeter();
	}

}
