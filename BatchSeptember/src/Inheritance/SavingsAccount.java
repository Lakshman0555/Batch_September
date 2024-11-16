package Inheritance;

public class SavingsAccount extends BankAccount{
                 int account_balance = 200;
	void withdraw(int withdraw_amount) {
		if(account_balance<100) {
			System.out.println("your are not eligible to do withdraw transaction");
		}
		else {
			account_balance = account_balance-withdraw_amount;
			System.out.println(account_balance);
		}
	}
	public static void main(String[] args) {
		SavingsAccount obj = new SavingsAccount();
		obj.withdraw(150);
		obj.withdraw(100);

	}

}
