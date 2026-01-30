package com.logicalstatements;

import java.util.Scanner;

//WAP to print Cricketer Name base don his jersey number..? 
public class TestLSDemo7 {

	public static void main(String[] args) {
		System.out.println("main method strated !!");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Jersey number : ");
		int jno = sc.nextInt();

		switch (jno) {
		case 7:
			System.out.println("MSD Thala for a Reason !!");
			break;
		case 18:
			System.out.println("Virat Kohli !!");
			break;
		case 45:
			System.out.println("Rohit Sharma !!");
			break;
		case 1:
			System.out.println("K L rahul");
			break;
		case 77:
			System.out.println("Shubman Gill");
			break;
		case 33:
			System.out.println("Hardhik Pandya ");
			break;
		default:
			System.out.println("This Jersey number is not in my list !");
		}
	}
}
