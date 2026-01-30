package com.exceptionhandling;

import java.util.Scanner;

public class TestExDemo15 {

	public static void main(String[] args) throws ChanduException {

		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age : ");

		int age = sc.nextInt();

		if (age < 18) {
			throw new ChanduException("Babu niku inka time undi ra !");
		} else {
			System.out.println("You are eligible for voting or driving !!");
		}

	}

}
