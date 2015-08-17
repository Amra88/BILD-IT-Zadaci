package zadaci_13_08_2015;

//definisemo data fields
public class Circle2D {
	// koordinate centra kruga
	private double x;
	private double y;
	private double radius;// poluprecnik kruga

	// no-arg konstruktor sa default vrijednostima
	public Circle2D() {
		x = 0;
		y = 0;
		radius = 1;
	}

	// konstruktor sa odredjenim vrijednostima
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	// getteri data fields-a
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getRadius() {
		return radius;
	}

	// metoda za racunanje povrsine kruga
	public double getArea() {
		return radius * radius * Math.PI;
	}

	// metoda za racunanje obima kruga
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	// metoda koja provjerava da li krug sadrzi tacku sa koordinatama koje
	// prosljedjujemo kao argumente
	public boolean contains(double x, double y) {
		if (Math.pow((x - this.getX()), 2) + Math.pow((y - this.getY()), 2) > radius
				* radius) {
			return false;
		}
		return true;
	}

	// metoda koja provjerava da li krug sadrzi drugi krug koji smo proslijedili
	// kao argument
	public boolean contains(Circle2D circle) {
		double distance = Math.sqrt(Math.pow(circle.getY() - this.getY(), 2)
				+ Math.pow(circle.getX() - this.getX(), 2));
		if (distance < this.radius - circle.getRadius()) {
			return true;
		}
		return false;
	}

	// metoda koja provjerava da li se krug preklapa sa drugim krugom
	public boolean overlaps(Circle2D circle) {
		double distance = Math.sqrt(Math.pow(circle.getY() - this.getY(), 2)
				+ Math.pow(circle.getX() - this.getX(), 2));
		if ((distance > this.radius - circle.getRadius())
				&& (distance < this.radius + circle.getRadius())) {
			return true;
		}
		return false;
	}

}
