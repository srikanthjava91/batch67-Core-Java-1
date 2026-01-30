package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLPDemo15 {

	static boolean isPrime(int a) {
		boolean flag = true;

		if (a == 0 || a == 1) {
			return false;
		}

		for (int i = 2; i <= a/2; i++) {
			if (a % i == 0) {
				flag = false;
				break;
			}
		}

		return flag;
	}

	static void primeNumbers(int n) {
		for (int i = 0; i < n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to print prime numbers ");
		int n = sc.nextInt();
		primeNumbers(n);// 10
	}
}
