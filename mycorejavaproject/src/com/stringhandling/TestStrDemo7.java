package com.stringhandling;

import java.util.Scanner;

public class TestStrDemo7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username  :");
		String uname = sc.next();

		sc.nextLine();
		System.out.println("Enter password : ");
		String pass = sc.nextLine();

		if (uname.equalsIgnoreCase("Admin123") && pass.equals("Admin#$123")) {
			System.out.println("Succesfully LoggedIn !! Welcome to Home Page: " + uname);
		} else {
			System.err.println("Invalid user crdentials !! ");
		}

	}

}
