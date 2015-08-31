package zadaci_25_08_2015;

public class Circle {
	// data fields
	double radius;

	// no-arg konstruktor
	Circle() {

		radius = 1;

	}

	// konstruktor sa odredjenim vrijednostima data fields-a
	Circle(double radius) {
		this.radius = radius;

	}

	// getteri i setteri data fields-a
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius >= 0) {
			this.radius = radius;
		}
	}

	// metoda za racunanje povrsine kruga
	double getArea() {
		return radius * radius * Math.PI;
	}
}
