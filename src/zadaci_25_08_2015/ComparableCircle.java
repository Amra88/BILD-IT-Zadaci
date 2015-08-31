package zadaci_25_08_2015;

//klasa implementira Comparable interfejs koji omogucava poredjenje objekata
public class ComparableCircle extends Circle implements
		Comparable<ComparableCircle> {

	double radius;

	// no-arg konstruktor
	// nasljedjuje vrijednosti od superklase
	public ComparableCircle() {
		super(1);
	}

	// konstruktor sa odredjenim vrijednostima data fields-a
	public ComparableCircle(double radius) {
		super(radius);
	}

	// Override-ovana metoda za poredjenje objekata
	// poredi objekte na osnovu povrsine
	@Override
	public int compareTo(ComparableCircle c) {
		if (this.getArea() < c.getArea()) {
			return -1;
		} else if (this.getArea() > c.getArea()) {
			return 1;
		} else {
			return 0;
		}
	}
}
