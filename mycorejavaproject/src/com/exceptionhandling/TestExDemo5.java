package com.exceptionhandling;

import java.util.Scanner;

public class TestExDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your age : ");
			int age = sc.nextInt();
			System.out.println("Your Entered age is : " + age);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println(e.toString());
		}

	}

}
