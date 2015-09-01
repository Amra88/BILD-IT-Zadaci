package zadaci_26_08_2015;

//subklasa GeometricObject klase, implementira Comparable interface
public class CircleFromGeometricObject extends GeometricObject implements
		Comparable<CircleFromGeometricObject> {

	// data fields
	private double radius;

	// no-arg konstruktor, kreira objekat sa default vrijednostima
	public CircleFromGeometricObject() {
		radius = 1;
	}

	// konstruktor sa odredjenim vrijednostima data fields-a
	public CircleFromGeometricObject(double radius) {
		this.radius = radius;
	}

	// getteri i setteri data fields-a
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// implementacija naslijedjenih apstraktnih metoda iz superklase
	@Override
	// povrsina kruga
	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	// obim kruga
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	// Override-ovana metoda za poredjenje dva objekta (kruga)
	// poredjenje vrsimo na osnovu poluprecnika
	@Override
	public int compareTo(CircleFromGeometricObject object) {
		if (this.getRadius() < object.getRadius()) {
			return -1;
		} else if (this.getRadius() > object.getRadius()) {
			return 1;
		} else {
			return 0;
		}
	}

	// Override-amo metodu equals() iz Object klase
	// metoda vraca true ako su poredjeni objekti jednaki
	@Override
	public boolean equals(Object circle) {
		return this.compareTo((CircleFromGeometricObject) circle) == 0;
	}

	// metoda za predstavljanje objekta u vidu stringa
	@Override
	public String toString() {
		return "Radius: " + getRadius() + "\nArea: " + getArea()
				+ "\nPerimeter: " + getPerimeter();
	}

}
