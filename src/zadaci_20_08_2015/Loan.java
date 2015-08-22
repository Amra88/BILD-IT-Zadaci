package zadaci_20_08_2015;

public class Loan {

	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	/** Default constructor */
	public Loan() {
		this(2.5, 1, 1000);
	}

	/**
	 * Construct a loan with specified annual interest rate, number of years,
	 * and loan amount
	 */
	// Ukoliko neki od argumenata koji su proslijedjeni konstruktoru nije
	// validan, konstruktor izbacuje exception.
	// Koristeci izjavu throw, poziva catch blok kojem prosljedjuje exception.
	// Catch blok preuzima i nastavlja izvrsavanje programa.
	// Definisemo vrijednosti koje nisu validne i poruke koje
	// ce biti ispisane, za argumente koje prosljedjujemo konstruktoru, kao i za
	// argumente koje prosljedjujemo setterima.

	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		if (annualInterestRate <= 0) {
			throw new IllegalArgumentException(
					"AnnualInterestRate must be greater than 0.");
		}
		if (numberOfYears <= 0) {
			throw new IllegalArgumentException(
					"NumberOfYears must be greater than 0.");
		}
		if (loanAmount <= 0) {
			throw new IllegalArgumentException(
					"LoanAmount must be greater than 0.");
		}

		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}

	/** Return annualInterestRate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/** Set a new annualInterestRate */
	public void setAnnualInterestRate(double annualInterestRate) {
		if (annualInterestRate <= 0) {
			throw new IllegalArgumentException(
					"AnnualInterestRate must be greater than 0.");
		}
		this.annualInterestRate = annualInterestRate;
	}

	/** Return numberOfYears */
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/** Set a new numberOfYears */
	public void setNumberOfYears(int numberOfYears) {
		if (numberOfYears <= 0) {
			throw new IllegalArgumentException(
					"NumberOfYears must be greater than 0.");
		}
		this.numberOfYears = numberOfYears;
	}

	/** Return loanAmount */
	public double getLoanAmount() {
		return loanAmount;
	}

	/** Set a new loanAmount */
	public void setLoanAmount(double loanAmount) {
		if (loanAmount <= 0) {
			throw new IllegalArgumentException(
					"LoanAmount must be greater than 0.");
		}
		this.loanAmount = loanAmount;
	}

	/** Find monthly payment */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount
				* monthlyInterestRate
				/ (1 - (1 / Math.pow(1 + monthlyInterestRate,
						numberOfYears * 12)));
		return monthlyPayment;
	}

	/** Find total payment */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}

	/** Return loan date */
	public java.util.Date getLoanDate() {
		return loanDate;
	}
}
