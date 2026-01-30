package com.logicalstatements.loops;

//WAP to find factorial of a given number using Recursion..?
import java.util.Scanner;

public class TestLPDemo8 {

	static int findFact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}

		// 5 * findFact(4) = 5 * 24 = 120
		// 4 * findFact(3) = 4 * 6 = 24
		// 3 * findFact(2) -> 3*2 = 6
		// 2 * findFact(1) --> 1 =2

		return n * findFact(n - 1);
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();// 5

		int fact = findFact(n);

		System.out.println("Factorial of a Given numbers: " + fact);
	}

}
