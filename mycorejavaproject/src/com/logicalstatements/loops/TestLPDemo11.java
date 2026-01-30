package com.logicalstatements.loops;

import java.util.Scanner;

///Q12) WAP to find the sum of given number using while ..? 
public class TestLPDemo11 {

	static int findSum(int n) {
		int sum = 0;
		int r = 0;

		// 123
		while (n != 0) {
			r = n % 10;// 123%10 --> 3, 12%10 --> 2, 1%10 -> 1
			n = n / 10;// 123/10 --> 12, 12/10 --> 1,1/10 -> 0
			sum = sum + r;// 3 +2+1 = 6
		}

		return sum;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number  : ");
		int n = sc.nextInt();

		int sum = findSum(n);
		System.out.println("SUm of the gIven  number is : " + sum);

		System.out.println("main method ended ");
	}
}
