/** Create class named CheckingAccount that extends BankAccount */
class CheckingAccount extends BankAccount {
	/** Create private double interestRate */
	private double interestRate;

	/**
	 * Create a default constructor CheckingAccount Make constructor superclass
	 * Initialize interestRate to 0.0
	 */
	public CheckingAccount() {
		super();
		this.interestRate = 0.0;
	}

	/**
	 * Create method getInterestRate return interestRate
	 * 
	 * @return
	 */
	public double getInterestRate() {
		return interestRate;
	}

	/**
	 * Create method setInterestRate
	 * 
	 * @param interestRate
	 */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	/**
	 * Create method processWithdrawal create double totalAmount and call getBalance
	 * from superclass If totalAmount is greater than or equal to O, print Checking
	 * Account Info Else Print Insufficient funds, overdraft fee, and balance
	 */

	public void processWithdrawal() {
		double totalAmount = getBalance();
		if (totalAmount >= 0) {
			System.out.println("Checking Account Info");

		} else {
			System.out.println("Insufficient funds");
			System.out.println("Overdraft fee: $30");
			System.out.println("Balance: " + totalAmount);
		}

	}

	/**
	 * Create displayAccount method call accountSummary method from superclass print
	 * interest rate
	 */
	public void displayAccount() {
		accountSummary();
		System.out.println("Interest Rate: " + interestRate + "%");
	}

}
