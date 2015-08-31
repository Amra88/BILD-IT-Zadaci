package zadaci_25_08_2015;

//subklasa GeometricObject klase
public class RectangleFromGeometricObject extends GeometricObject {
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
	public double getPerimeter() {
		return 2 * (width + height);
	}

	// metoda za predstavljanje objekta u vidu stringa
	@Override
	public String toString() {
		return "Width: " + getWidth() + "\nHeight: " + getHeight() + "\nArea: "
				+ getArea() + "\nPerimeter: " + getPerimeter();
	}

}
