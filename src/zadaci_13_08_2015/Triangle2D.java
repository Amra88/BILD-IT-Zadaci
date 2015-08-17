package zadaci_13_08_2015;

public class Triangle2D {
	// definisemo data fields
	// p1, p2, p3 su instance MyPoint klase, tacke koje predstavljaju tjemena
	// trougla
	private MyPoint p1 = new MyPoint();
	private MyPoint p2 = new MyPoint();
	private MyPoint p3 = new MyPoint();

	// no-arg konstruktor sa default vrijednostima
	public Triangle2D() {
		this.p1 = new MyPoint(0, 0);
		this.p2 = new MyPoint(1, 1);
		this.p3 = new MyPoint(2, 5);
	}

	// konstruktor sa proslijedjenim vrijednostima za tri tacke
	public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	// getteri i setteri data fields-a
	public MyPoint getP1() {
		return p1;
	}

	public void setP1(MyPoint p1) {
		this.p1 = p1;
	}

	public MyPoint getP2() {
		return p2;
	}

	public void setP2(MyPoint p2) {
		this.p2 = p2;
	}

	public MyPoint getP3() {
		return p3;
	}

	public void setP3(MyPoint p3) {
		this.p3 = p3;
	}

	// metoda za racunanje povrsine trougla
	public double getArea() {
		// metoda distance nalazi se u MyPoint klasi, racuna udaljenost izmedju
		// dvije tacke
		// a, b, c - stranice trougla
		// s - poluobim trougla
		double a = p1.distance(p2);
		double b = p2.distance(p3);
		double c = p3.distance(p1);
		double s = (a + b + c) / 2;
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		return area;
	}

	// metoda za racunanje obima trougla
	public double getPerimeter() {
		double a = p1.distance(p2);
		double b = p2.distance(p3);
		double c = p3.distance(p1);
		double perimeter = a + b + c;
		return perimeter;
	}

	// metoda koja provjerava da li se odredjena tacka nalazi u trouglu
	// tacku prosljedjujemo kao argument
	public boolean contains(MyPoint p) {
		// ako je tacka "p" u trouglu, zbir povrsina trouglova PAB, PBC i PCA ce
		// biti jednaka povrsini trougla ABC
		double side1, side2, side3, s, areaPAB, areaPBC, areaPCA, areaABC;

		// racunamo povrsinu PAB
		side1 = p1.distance(p);
		side2 = p1.distance(p2);
		side3 = p2.distance(p);
		s = (side1 + side2 + side3) / 2;
		areaPAB = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

		// racunamo povrsinu PBC
		side1 = p2.distance(p);
		side2 = p2.distance(p3);
		side3 = p3.distance(p);
		s = (side1 + side2 + side3) / 2;
		areaPBC = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

		// racunamo povrsinu PCA
		side1 = p1.distance(p);
		side2 = p1.distance(p3);
		side3 = p3.distance(p);
		s = (side1 + side2 + side3) / 2;
		areaPCA = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

		// racunamo povrsinu ABC
		side1 = p1.distance(p2);
		side2 = p2.distance(p3);
		side3 = p3.distance(p1);
		s = (side1 + side2 + side3) / 2;
		areaABC = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

		if (Math.abs((areaPAB + areaPBC + areaPCA) - areaABC) <= 0.5) {
			return true;
		} else {
			return false;
		}
	}

	// metoda koja provjerava da li se trougao "t", kojeg prosljedjujemo kao
	// argument, nalazi unutar postojeceg trougla
	public boolean contains(Triangle2D t) {
		// pozivajuci metodu contains(MyPoint p) provjeravamo da li se sve tacke
		// proslijedjenog trougla nalaze u postojecem
		// metoda vraca true ili false
		return (contains(t.getP1()) && contains(t.getP2()) && contains(t
				.getP3()));
	}

	// metoda koja provjerava da li se proslijedjeni trougao "t" preklapa sa
	// postojecim trouglom
	public boolean overlaps(Triangle2D t) {
		// pozivajuci metodu contains(MyPoint p) provjeravamo da li se ijedna
		// tacka proslijedjenog trougla nalazi unutar postojeceg
		return contains(t.getP1()) || contains(t.getP2())
				|| contains(t.getP3());
	}
}
