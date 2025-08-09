/*In this class I want to focus on the 
 *manipulation of variables. That is why
 *I decided to use an example of money
 *spending in bank account. Because
 *what is the reason for creating variables
 *if you can't do anything with them?*/


public class BankTransactions {

	public static void main(String[] args) {
		// Current balance on the bank account
		double balance = 10000.00;
		// The user uses ATM to withdraw the funds
		double amountToWithdraw = 300.00;
		// After this, the balance is updated
		double updatedBalanceAfterWithdrawal = balance - amountToWithdraw;
		// We can also deposit money
		double amountToDeposit = 500.00;
		// Another balance update
		double updatedBalanceAfterDeposit = balance + amountToDeposit;
		
		// The result of those 2 actions
		System.out.println(updatedBalanceAfterWithdrawal);
		System.out.println(updatedBalanceAfterDeposit);

	}

}
