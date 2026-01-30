package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print math table using for loop ..? 

//input : 9 & 10  
//output : 
//9 X 1 = 9
//9 X 2 = 18
//9 X 3 = 27
//9 X 4 = 36
//9 X 5 = 45
//9 X 6 = 54
//9 X 7 = 63
//9 X 8 = 72
//9 X 9 = 81
//9 X 10 = 90

public class TestLPDemo3 {

	public static void main(String[] args) {
		System.out.println("mian method started !!");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to proceed ");
		int n = sc.nextInt();// 9

		System.out.println("Enter a number for n time representation : ");
		int r = sc.nextInt();// 10

		for (int i = 1; i <= r; i++) {
			System.out.println(n + " X " + i + " = " + n * i);
		}
	}

}
