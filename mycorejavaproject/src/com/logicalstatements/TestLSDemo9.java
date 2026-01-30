package com.logicalstatements;

import java.util.Scanner;

//WAP to calculate addition subtraction multiplication division Modulus based on the symbol ..? 
public class TestLSDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a = sc.nextInt();

		System.out.println("Enter bnumber ");
		int b = sc.nextInt();

		System.out.println("Enter a symbol to proceed like + - * / %");
		String symb = sc.next();

		int result = 0;

		switch (symb) {

		case "+" -> result = a + b;
		case "-" -> result = a - b;
		case "*" -> result = a * b;
		case "/" -> result = a / b;
		case "%" -> result = a % b;
		default -> System.out.println("unknow symbol to proceed !!");
		}
		System.out.println("Resulted value: : " + result);

	}

}
