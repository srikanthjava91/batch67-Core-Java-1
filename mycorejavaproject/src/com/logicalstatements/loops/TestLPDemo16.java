package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLPDemo16 {

	static boolean isPrime(int a) {
		boolean flag = true;

		if (a == 0 || a == 1) {
			return false;
		}

		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				flag = false;
				break;
			}
		}

		return flag;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to print prime numbers ");
		int n = sc.nextInt();

		boolean status = isPrime(n);
		
		if(status) {
			System.out.println("the given number is Prime ");
		}else {
			System.out.println("the given number is not a Prime ");
		}
	}

}
