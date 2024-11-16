package operators;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		String s1 = "divisible by 7 & 11";
		String s2 = "not divisible by 7 & 11";
		int n =77;
		System.out.println((n%7==0 && n%11==0)? s1 : s2);

	}

}
