package com.langfundamentals.methods;

import java.util.Scanner;

public class TestMDemo6 {
	static Scanner sc = new Scanner(System.in);

	void main(String[] args) {
		System.out.println("main method started ");
		int add = addition();// 1400
		double sub = subtraction();// -50.0

		System.out.println("Addition of two values : " + add);
		System.out.println("Subtraction of two values : " + sub);

		System.out.println("Multiplication add & sub is : " + (add * sub));

		System.out.println("main method ended ");
	}

	double subtraction() {
		System.out.println("Enter a number ");
		int a = sc.nextInt();

		System.out.println("Enter b number ");
		int b = sc.nextInt();
		int diff = b - a;
		return diff;

	}

	int addition() {
		System.out.println("Enter a number ");
		int a = sc.nextInt();

		System.out.println("Enter b number ");
		int b = sc.nextInt();
		int sum = a + b;
		return sum;
	}

}
