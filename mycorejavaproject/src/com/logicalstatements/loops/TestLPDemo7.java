package com.logicalstatements.loops;

import java.util.Scanner;

//A factorial is a mathematical function that multiplies a number 
//by every whole number below it down to 1. 
//It is denoted by the symbol "!" (e.g., 3! = 3 × 2 × 1 = 6). 
//Factorial are used in various mathematical concepts, 
//including permutations and combinations, 
//to determine the number of ways to arrange items. 
//For example, the factorial of 5 (5!) equals 120, 
//as it is calculated as 5 × 4 × 3 × 2 × 1. 

//WAP to find factorial of a given number using for loop..? 
//input : number 
//output : number 
public class TestLPDemo7 {

	static long findFactorial(int n) {
		long fact = 1;

//		for (int i = 1; i <= n; i++) {
//			fact = fact * i;// 1*2*3*4*5
//		}

		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}

		return fact;
	}

	public static void main(String[] args) {
		System.out.println("main method strated !");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		long fact = findFactorial(n);
		System.out.println("Factorial of a given number is : " + fact);
	}
}
