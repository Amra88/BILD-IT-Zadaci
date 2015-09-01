package zadaci_26_08_2015;

//subklasa GeometricObject klase, implementira Cloneable i Comparable interface
public class Octagon extends GeometricObject implements Cloneable,
		Comparable<Octagon> {
	// data fields
	private double side;

	// no-arg konstruktor, kreira objekat sa default vrijednostima
	public Octagon() {
		this.side = 1;
	}

	// konstruktor sa odredjenim vrijednostima data fields-a
	public Octagon(double side) {
		this.side = side;
	}

	// getteri i setteri data fields-a
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	// implementacija naslijedjenih apstraktnih metoda iz superklase
	@Override
	// povrsina
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}

	@Override
	// obim
	public double getPerimeter() {
		return side * 8;
	}

	// Override-ovana metoda za poredjenje dva objekta
	// poredjenje vrsimo na osnovu povrsine
	@Override
	public int compareTo(Octagon o) {
		if (this.getArea() < o.getArea()) {
			return -1;
		} else if (this.getArea() > o.getArea()) {
			return 1;
		} else {
			return 0;
		}
	}

	// implementiramo metodu clone() definisanu u Object klasi
	// metoda vraca kopiju objekta
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	// metoda za predstavljanje objekta u vidu stringa
	@Override
	public String toString() {
		return "Area: " + getArea() + "\nPerimeter: " + getPerimeter();
	}
}
