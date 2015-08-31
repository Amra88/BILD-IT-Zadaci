package zadaci_25_08_2015;

//subklasa GeometricObject klase
public class CircleFromGeomtricObject extends GeometricObject {

	// data fields
	private double radius;

	// no-arg konstruktor, kreira objekat sa default vrijednostima
	public CircleFromGeomtricObject() {
		radius = 1;
	}

	// konstruktor sa odredjenim vrijednostima data fields-a
	public CircleFromGeomtricObject(double radius) {
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

	// obim kruga
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	// Override-ovana metoda za predstavljanje objekta u vidu stringa
	@Override
	public String toString() {
		return "Radius: " + getRadius() + "\nArea: " + getArea()
				+ "\nPerimeter: " + getPerimeter();
	}
}
