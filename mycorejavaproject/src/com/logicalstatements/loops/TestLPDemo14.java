package com.logicalstatements.loops;

//153 = 1^3 + 5^3 + 3^3 = 153 
//370 = 3^3 + 7^3 + 0^3 = 370
//371 = 3^3 + 7^3 + 1^3 = 371

//1634 = 1^4 + 6^4 + 3^4 + 4^4 = 1634 

import java.util.Scanner;

public class TestLPDemo14 {

	// 1234
	static boolean isArmStringNumberOrNot(int n) {
		boolean flag = false;

		int r = 0;
		int sumP = 0;
		int temp = n;

		String str = Integer.toString(n);// 1234
		int digitCount = str.length(); // 4

		// 456
		while (n != 0) {
			r = n % 10;// 6 5 4 = 216 + 125 + 64 = 405
			n = n / 10;// 45 4 0
			sumP = (int) (sumP + Math.pow(r, digitCount));
		}

		if (sumP == temp) {
			flag = true;
		}

		return flag;
	}

	public static void main(String[] args) {
		System.out.println("main method strated ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		boolean status = isArmStringNumberOrNot(n);

		if (status) {
			System.out.println("The given number is Armstrong !");
		} else {
			System.out.println("The given number is not an armstrong number ");
		}

		System.out.println("main method ended ");
	}

}
