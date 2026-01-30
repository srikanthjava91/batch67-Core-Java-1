package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLPDemo19 {

	public static void main(String[] args) {

//		int[] numbers = { 10, 20, 30, 40 };
//		for (int n : numbers) {
//			System.out.println(n);
//		}

		Scanner sc = new Scanner(System.in);
		String yn = "";

		do {
			System.out.println("Enter a number : ");
			int a = sc.nextInt();

			System.out.println("Enter b number : ");
			int b = sc.nextInt();

			System.out.println("Enter a symbol to calculate the numbers like + - * % / .... ");
			String sym = sc.next();

			switch (sym) {
			case "+" -> System.out.println("Addition : " + (a + b));
			case "-" -> System.out.println("Subtraction : " + (a - b));
			case "*" -> System.out.println("Multiplication : " + a * b);
			case "%" -> System.out.println("Modulus : " + a % b);
			case "/" -> System.out.println("Division : " + a / b);
			default -> System.out.println("Invalid symbol to proceed : ");
			}

			System.out.println("Do we want to Proceed furthur ..? Then Click Y for Yes or N for NO ");
			yn = sc.next();// Y
		} while (yn.equalsIgnoreCase("y"));

	}

}
