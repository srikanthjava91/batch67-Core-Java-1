package com.logicalstatements.loops;

import java.util.Scanner;

// WAP to convert Decimal to Binary ..? 
public class TestLPDemo17 {

	// 25
	static void convertDecimalToBinary(int n) {
		int r = 0;
		String rstr = "";

		while (n != 0) {
			r = n % 2;// 25%2=1,12%2 =0,6%2=0,3%2=1,1%2=1
			n = n / 2;// 25/2=12,12/2=6,6/2=3,3/2=1,1/2 =0
			rstr = r + " " + rstr;
		}

		System.out.println(rstr);

	}

	public static void main(String[] args) {

		int x = 0b1100100;
		System.out.println(x);

		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to print prime numbers ");
		int n = sc.nextInt();
		convertDecimalToBinary(n);
	}

}
