package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to find Fibonacci series using for loop ?
//10 --> 0 1 1 2 3 5 8 13 21 34 
public class TestLPDmeo9 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int k = sc.nextInt();// 10

		int n1 = 0;
		int n2 = 1;

		int n3 = 0;
		System.out.print(n1 + " " + n2);// 0 1
		for (int i = 1; i <= k; i++) {
			n3 = n1 + n2;// 3
			System.out.print(" " + n3);// 1
			n1 = n2;
			n2 = n3;
		}
	}
}
