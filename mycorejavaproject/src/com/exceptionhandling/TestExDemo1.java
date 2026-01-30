package com.exceptionhandling;

import java.util.Scanner;

public class TestExDemo1 {

	public static void main(String[] args) {
		System.out.println("main method strated ");
		Scanner sc = new Scanner(System.in);

		System.out.println("To enter a Value : ");
		int a = sc.nextInt();

		System.out.println("To  enter b value ");
		int b = sc.nextInt();

		try {
			System.out.println("in try ");
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.err.println("in catch !!");
//			e.printStackTrace();
			System.err.println(e.toString());
		}

		// No exception of type Object can be thrown;
//		an exception type must be a subclass of Throwable

		System.out.println("main method ended !");
		System.out.println("main method ended !");
		System.out.println("main method ended !");
		System.out.println("main method ended !");

	}

}
