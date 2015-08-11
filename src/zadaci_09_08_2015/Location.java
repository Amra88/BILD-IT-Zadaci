package zadaci_09_08_2015;

public class Location {
	// definisemo data fields
	public int row = 0;// red matrice
	public int column = 0;// kolona matrice
	public double maxValue = 1.0;// najveca vrijednost u matrici

	// no-arg konstruktor

	public Location() {
	}

	// metoda koja pronalazi lokaciju najveceg elementa u matrici
	// metodi prosljedjujemo matricu
	public static Location locateLargest(double[][] a) {

		Location location = new Location();// kreiramo instancu klase
		// trazimo najvecu vrijednost u matrici
		location.maxValue = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (location.maxValue < a[i][j]) {
					location.maxValue = a[i][j];
					// nakon sto pronadjemo najvecu vrijednost, spremamo
					// lokaciju najveceg elementa u varijable row i column
					location.row = i;
					location.column = j;
				}
			}

		}
		return location;// metoda vraca instancu Location klase
	}
}
