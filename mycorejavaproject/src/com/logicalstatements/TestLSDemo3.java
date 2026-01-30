package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo3 {

	public static void main(String[] args) {

		System.out.println("main method strated ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your marks Percentage");
		double marksP = sc.nextDouble();// 85

		if (marksP > 75.0)
			System.out.println("Welcome to TCS");
		else
			System.out.println("Better luck next time !!");
		System.out.println("All the best !!");
		System.out.println("main method ended ");

	}

}
