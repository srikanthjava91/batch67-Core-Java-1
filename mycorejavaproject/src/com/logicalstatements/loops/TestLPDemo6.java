package com.logicalstatements.loops;

import java.util.Scanner;

//Q7) WAP to find the given number is Perfect or not ..? 
//perfect number means : The given number and sum of all the factors is same will consider as perfect.
//A perfect number is a positive integer that is equal to the 
//sum of its proper divisors, excluding itself. 
//For example, 6 is a perfect number because its divisors (1, 2, and 3) add 
//up to 6. 
//Another example is 28, where the sum of its divisors (1, 2, 4, 7, and 14) equals 28.
public class TestLPDemo6 {

	static boolean isPerfect(int n) {
		boolean status = false;
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}

		if (n == sum) {
			status = true;
		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method strated !");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = sc.nextInt();

		boolean isPerfact = isPerfect(n);

		if (isPerfact) {
			System.out.println("The given number is Perfect : ");
		} else {
			System.out.println("The Given number is not a perfect number ");
		}

	}
}
