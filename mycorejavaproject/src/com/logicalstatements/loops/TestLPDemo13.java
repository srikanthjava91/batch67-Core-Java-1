package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to find the given number is Armstrong or not ..? 
//Armstrong number means 
//ex: 153,  370, 371 

//1^3 + 5^3 + 3^3 = 153 --> 1+ 125+ 27 = 153 
//3^3 + 7^3 + 0^3 = 27 + 343 + 0 = 370 
//3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371
//1634 
//1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634

public class TestLPDemo13 {

	static boolean findArmStrng(int n) {
		boolean status = false;
		
		int r = 0;
		int sumP = 0;
		int temp = n;

		while (n != 0) {
			r = n % 10;
			n = n / 10;
			sumP = sumP + r * r * r;
		}

		if (temp == sumP) {
			status = true;
		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number  : ");
		int n = sc.nextInt();

		boolean flag = findArmStrng(n);

		if (flag) {
			System.out.println("The given number isArmstrong number : ");
		} else {
			System.out.println("The given number s not armstrong numbe r: ");
		}

	}

}
