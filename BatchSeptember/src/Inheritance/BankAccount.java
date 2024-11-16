package Inheritance;

public class BankAccount {
	
	int account_balance = 20000;
	
	void deposit(int deposit_amount) {
		account_balance = account_balance+deposit_amount;
		System.out.println(account_balance);
		
	}
	void withdraw(int withdraw_amount) {
		account_balance = account_balance-withdraw_amount;
		System.out.println(account_balance);
	}

}
