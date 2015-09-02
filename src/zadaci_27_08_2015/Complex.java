package zadaci_27_08_2015;

public class Complex implements Cloneable {

	// data fields
	private double a;
	private double b;

	// no-arg konstruktor, kreira objekat sa default vrijednostima
	public Complex() {
		this(0, 0);
	}

	// konstruktor sa odredjenom vrijednoscu polja a, b=0
	public Complex(double a) {
		this(a, 0);
	}

	// konstruktor sa odredjenim vrijednostima data fields-a
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}

	// metoda vraca realni dio kompleksnog broja
	public double getRealPart() {
		return a;
	}

	// metoda vraca imaginarni dio kompleksnog broja
	public double getImaginaryPart() {
		return b;
	}

	// metoda za sabiranje dva kompleksna broja
	// formula: a + bi + c + di = (a + c) + (b + d)i
	public Complex add(Complex newComplex) {
		return new Complex(this.a + newComplex.a, this.b + newComplex.b);
	}

	// metoda za oduzimanje kompleksnih brojeva
	// formula: a + bi - (c + di) = (a - c) + (b - d)i
	public Complex subtract(Complex newComplex) {
		return new Complex(this.a - newComplex.a, this.b - newComplex.b);
	}

	// metoda za mnozenje kompleksnih brojeva
	// (a + bi)*(c + di) = (ac - bd) + (bc + ad)i
	public Complex multiply(Complex newComplex) {
		return new Complex(this.a * newComplex.a - this.b * newComplex.b,
				(this.b * newComplex.a + this.a * newComplex.b));
	}

	// metoda za dijeljenje kompleksnih brojeva
	// (a + bi)/(c + di) = (ac + bd)/(c^2 + d^2) + (bc - ad)i/(c^2 + d^2)
	public Complex divide(Complex newComplex) {
		double d = Math.pow(newComplex.a, 2) + Math.pow(newComplex.b, 2);
		return new Complex((this.a * newComplex.a + this.b * newComplex.b) / d,
				(this.b * newComplex.a - this.a * newComplex.b) / d);
	}

	// metoda koja vraca apsolutnu vrijednost kompleksnog broja
	public double abs() {
		return Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));
	}

	@Override
	// Override clone() metode za kopiranje kompleksnog broja
	public Complex clone() throws CloneNotSupportedException {
		return (Complex) super.clone();
	}

	@Override
	// String reprezentacija kompleksnog broja
	public String toString() {
		if (this.b == 0) {
			return this.a + "";
		} else {
			return "(" + this.a + " + " + this.b + "i)";

		}
	}

}
