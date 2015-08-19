package zadaci_17_08_2015;

//Triangle klasa extenduje GeometricObject klasu,
//nasljedjuje osobine i metode iz GeometricObject klase
public class Triangle extends GeometricObject {
	// data fields
	double side1;
	double side2;
	double side3;

	// no-arg konstruktor
	// kreira novi Triangle objekat sa default vrijednostima
	Triangle() {
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}

	// konstruktor
	// kreira novi Triangle objekat sa odredjenim vrijednostima stranica trougla
	Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// getteri i setteri data fields-a
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	// metoda za racunanje povrsine trougla
	public double getArea() {
		double s = getPerimeter() / 2;
		double area = Math.sqrt(s * (s - this.side1) * (s - this.side2)
				* (s - this.side3));
		return area;
	}

	// metoda za racunanje obima trougla
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	// metoda vraca String koji predstavlja objekat
	@Override
	public String toString() {
		return "\nTriangle: side1 = " + side1 + " side2 = " + side2
				+ " side3 = " + side3;
	}

}
