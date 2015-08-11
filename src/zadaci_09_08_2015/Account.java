package zadaci_09_08_2015;

public class Account {
	// definisemo data fields
	private int id = 0;// id korisnika
	private double balance = 0;// stanje na racunu
	private double annualInterestRate = 0;// godisnja kamatna stopa
	private java.util.Date dateCreated = new java.util.Date();// datum kreiranja
																// accounta

	// no-arg konstruktor

	public Account() {
	}

	// konstruktor kojem prosljedjujemo id i balance
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	// generisemo gettere i settere za private data fields
	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id < 1) {// provjeravamo da li je uneseni id pozitivan broj
			System.out.println("ID korisnika moze biti samo pozitivan!");
		} else {
			this.id = id;
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate / 100.0;
	}

	// metoda vraca datum kreiranja accounta
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	// metoda vraca mjesecnu kamatnu stopu
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12.0;
	}

	// metoda vraca mjesecnu kamatu
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	// metoda koja prikazuje podizanje novca s racuna
	// metodi prosljedjujemo iznos za koji treba umanjiti racun
	public void withdraw(double amount) {
		if (balance < amount) {
			System.out
					.println("Nemate dovoljno na racunu! Iznos na racunu je: "
							+ balance);
		} else {
			// ako je stanje na racunu vece od proslijedjenog iznosa, racun
			// umanjujemo za taj iznos
			balance -= amount;
			System.out.println("Vas racun je umanjen za " + amount
					+ " KM.\nTrenutno stanje na Vasem racunu je " + balance
					+ "\n");
		}
	}

	// metoda koja prikazuje uplatu novca na racun
	public void deposit(double amount) {
		balance += amount;// stanje racuna uvecavamo za iznos koji je
							// proslijedjen
		System.out.println("Vas racun je uvecan za " + amount
				+ " KM.\nTrenutno stanje na Vasem racunu je " + balance + "\n");
	}

	// ispisujemo podatke
	@Override
	public String toString() {
		return "Korisnik: " + id + "\nStanje na racunu je: " + balance
				+ "\nKorisnik je od: " + dateCreated + "\nDansasnji datum je: "
				+ new java.util.Date() + "\n";
	}
}
