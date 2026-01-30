package com.logicalstatements;

import java.util.Scanner;

//WAP get T-Shirt Description based on  based the size..? 
public class TestLSDemo8 {

	public static void main(String[] args) {

		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		switch (size) {
		case 34 ->
		{
			System.out.println("Xtra Small");
			System.out.println("Price: 600");
		}
		
		case 36 -> System.out.println("Small");
		case 38 -> System.out.println("Medium");
		case 40 -> System.out.println("Large");
		case 42 -> System.out.println("Xtra-Large");
		case 44 -> System.out.println("X-Xtra-Large");
		default -> System.out.println("size unknown !");
		}

	}
}
