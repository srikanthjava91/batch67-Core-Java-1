package com.exceptionhandling;

import java.util.Scanner;

//throw is the keyword to throw the exceptions explicitly.
public class TestExDemo11 {

	public static void main(String[] args) {

		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a = sc.nextInt();

		System.out.println("Enter b value : ");
		int b = sc.nextInt();

		if (b != 0) {
			System.out.println(a / b);
		} else {
			throw new ArithmeticException("Babu chitti don't send zeros !!");
		}

		System.out.println("main method ended ");
	}

}
