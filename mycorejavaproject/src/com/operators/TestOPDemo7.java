package com.operators;

import java.util.Scanner;

public class TestOPDemo7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("Enter your Nationality : ");
		String nationality = sc.next();

//		/Driving License
		if (age > 18 && nationality.equalsIgnoreCase("India")) {
			System.out.println("Approve Driving License ");
		} else {
			System.out.println("Rejected !");
		}

	}

}
