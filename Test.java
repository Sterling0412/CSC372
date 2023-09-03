/**Create class Test*/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**Create new instance of BankAccount
		 * Set first name, last name, and account ID for bankAccount
		 * Deposit 
		 * Withdraw
		 * Call the accountSummary method for bankAccount
		 * Print out information
		 */
		BankAccount bankAccount = new BankAccount();
		bankAccount.setFirstName("Greg");
		bankAccount.setLastName("McDonald");
		bankAccount.setAccountID(239405930);
		bankAccount.deposit(2500);
		bankAccount.withdrawal(250.5);
		bankAccount.accountSummary();
		System.out.println();
		
		/**Create new instance of CheckingAccount 
		 * Set first name, last name and account ID
		 * Deposit
		 * Withdraw
		 * Call processWithdrawal method
		 * Set interest rate
		 * Call the display Account method
		 */
		CheckingAccount checkingAccount = new CheckingAccount();
		checkingAccount.setFirstName("Judy");
		checkingAccount.setLastName("Waters");
		checkingAccount.setAccountID(2039758394);
		checkingAccount.deposit(3350.40);
		checkingAccount.withdrawal(2500);
		checkingAccount.processWithdrawal();
		checkingAccount.setInterestRate(3.5);
		checkingAccount.displayAccount();
		
	}

}
