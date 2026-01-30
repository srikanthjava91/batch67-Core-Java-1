package com.operators;

import java.util.Scanner;

//Arithmetic Operators --> + - * / % 
public class TestOpDemo1 {

	public static void main(String[] args) {
		System.out.println("main method staretd ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a = sc.nextInt();// 100
		System.out.println("Enter b value : ");
		int b = sc.nextInt();// 10

		// BODMAS
		System.out.println("Addition :" + a + b);// 10010
		System.out.println("Addition :" + (a + b));// 110

		// The operator - is undefined for the argument type(s) String, int
//		System.out.println("Subtraction : " + a-b);//
		System.out.println("Subtraction : " + (a - b));// 90

		System.out.println("Multiplication : " + a * b);// 1000

		System.out.println("Division -> Quotient: " + a / b);// 10
		System.out.println("Modulus -> Reminder : " + a % b);// 0
	}
}
