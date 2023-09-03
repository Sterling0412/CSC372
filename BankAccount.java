/** Create a class named BankAccount */
class BankAccount {
	/**
	 * Create private Strings for firstName and lastName, private int for accountID,
	 * and private double for balance
	 */
	private String firstName;
	private String lastName;
	private int accountID;
	private double balance;

	/** Create default constructor BankAccount */
	public BankAccount() {
		this.balance = 0.0;
	}

	/** Create deposit method */
	public void deposit(double value) {
		balance += value;
	}

	/** Create withdraw method */
	public void withdrawal(double value) {
		balance -= value;
	}

	/** Create method getFirstName */
	public String getFirstName() {
		return firstName;
	}

	/** Create method setFirstName */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/** Create method getLastName */
	public String getLastName() {
		return lastName;
	}

	/** Create method setLastName */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/** Create method getAccountID */
	public int getAccountID() {
		return accountID;
	}

	/** Create method setAccountID */
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	/** Create method getBalance */
	public double getBalance() {
		return balance;
	}

	/**
	 * Create method accountSummary Print Account ID Print Name Print balance
	 */
	public void accountSummary() {
		System.out.println("Account ID: " + accountID);
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Balance: " + balance);
	}

}
