package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("Are you Indian ..?");
		boolean statusCheck = sc.nextBoolean();//

		if (age >= 18 && statusCheck) {
			System.out.println("Congrtulations !!");
			System.out.println("You are eligible for voting & Driving ");
		} else {
			System.out.println("badluck ");
			System.out.println("Niku inka time undi ra !");
		}

		sc.close();
	}
}
