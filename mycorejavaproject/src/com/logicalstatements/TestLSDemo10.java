package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		float height = sc.nextFloat();

		// Cannot switch on a value of type float.
//		Only convertible int values, strings or enum variables are permitted
		switch ((int) height) {
			
		}
	}
}
