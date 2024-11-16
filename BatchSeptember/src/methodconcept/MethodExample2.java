package methodconcept;

import java.util.Scanner;

public class MethodExample2 {
	int account_balance = 20000;
	void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your amount to withdraw:");
		
		int withdraw_amount = sc.nextInt();
		if(withdraw_amount<=20000) {
			account_balance  = account_balance - withdraw_amount;
		System.out.println(account_balance +"is the remaining balance in your account");
		}
		else {
			System.out.println("insufficient balance");
		}
		
	}
	
	public static void main(String[] args) {
		MethodExample2 obj = new MethodExample2();
		obj.withdraw();

	}

}
