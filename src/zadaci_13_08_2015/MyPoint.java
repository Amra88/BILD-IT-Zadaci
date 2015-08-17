package zadaci_13_08_2015;

public class MyPoint {
	// definisemo data fields
	private double x = 0;
	private double y = 0;

	// no-arg konstruktor
	public MyPoint() {

	}

	// konstruktor kojem prosljedjujemo koordinate tacke
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// getteri za data fields
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	// metoda koja racuna rastojanje izmedju dvije tacke
	// kao argumente, metoda prima koordinate
	public double distance(double x, double y) {
		double d = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
		return d;
	}

	// metoda koja racuna rastojanje izmedju dvije tacke
	// kao argument, metodi prosljedjujemo novu instancu klase koja ima svoje
	// vrijednosti koordinata
	public double distance(MyPoint p) {
		double d = distance(p.getX(), p.getY());
		return d;
	}

	public double distance(MyPoint p, MyPoint p1) {
		double d = Math.sqrt(Math.pow((p1.getX() - p.getX()), 2)
				+ Math.pow((p1.getY() - p.getY()), 2));
		return d;
	}

}
