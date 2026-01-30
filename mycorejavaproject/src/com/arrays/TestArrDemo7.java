package com.arrays;

import java.util.Scanner;

//Q) WAP to read the elements from a console using Scanner for an array...? 
public class TestArrDemo7 {

	public static void main(String[] args) {
		System.out.println("main method strated ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Can you please enter the size !! ");
		int size = sc.nextInt();

		int[] numbers = new int[size];// 5

		// Reading the elements from Scanner
		System.out.println("Enter the values based on the size : " + size);
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}

		System.out.println("Representing an array !");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
