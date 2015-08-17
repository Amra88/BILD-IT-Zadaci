package zadaci_13_08_2015;

public class MyRectangle2D {
	// definisemo data fields
	// x i y - koordinate centra pravougaonika
	private double x;
	private double y;
	private double width;
	private double height;

	// no-arg konstruktor sa default vrijednostima
	public MyRectangle2D() {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.height = 1;
	}

	// konstruktor sa proslijedjenim vrijednostima
	public MyRectangle2D(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	// getteri i setteri data fields-a
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// metoda za racunanje povrsine pravougaonika
	public double getArea() {
		double area = width * height;
		return area;
	}

	// metoda za racunanje obima pravougaonika
	public double getPerimeter() {
		double perimeter = 2 * (width + height);
		return perimeter;
	}

	// metoda koja provjerava da li se odredjena tacka nalazi u pravougaoniku
	public boolean contains(double x, double y) {
		if (x < (this.x + (this.width)) && x > (this.x - (this.width))
				&& y < (this.y + (this.height)) && y > (this.y - (this.height))) {
			return true;
		} else {
			return false;
		}
	}

	// metoda koja provjerava da li se pravougaonik "r", kojeg prosljedjujemo
	// kao
	// argument, nalazi unutar postojeceg pravougaonika
	public boolean contains(MyRectangle2D r) {
		if (contains(r.getX(), r.getY())) {
			return true;
		} else {
			return false;
		}
	}

	// metoda koja provjerava da li se proslijedjeni pravougaonik "r" preklapa
	// sa
	// postojecim pravougaonikom
	public boolean overlaps(MyRectangle2D r) {
		if ((this.x < r.getX() + r.getWidth())
				&& (this.x + this.width > r.getX())
				&& (this.y < r.getY() + r.getHeight())
				&& (this.y + this.height > r.getY())) {
			return true;
		} else {
			return false;
		}
	}
}
