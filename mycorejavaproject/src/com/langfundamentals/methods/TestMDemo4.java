package com.langfundamentals.methods;

import java.util.Scanner;//Fully Qualified name of the class

// No return type + with arguments
//byte short int long float double  

//Note : java.lang is the default package in java,SO those classes you no need to import.
//But, if we are using any other classes we must need to import those classes.
public class TestMDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		String s = new String();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter x value : ");
		int x = sc.nextInt();
		System.out.println("Enter y value : ");
		int y = sc.nextInt();

		TestMDemo4 t = new TestMDemo4();
		// calling a method without values
		t.addition();

		// Call by value
		t.addition(x, y);

		System.out.println("main method ended ");

	}

	void addition() {
		System.out.println("in additon no args:");
	}

	void addition(double a, double b) {
		System.out.println("in additon with args :" + (a + b));
	}

}
