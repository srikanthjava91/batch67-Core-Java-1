package com.stringhandling;

import java.util.Scanner;

//input : abbccc 
//output : c 

//Q) WAP to find max occurrences from a Given String ..?
public class TestStrDemo16 {

	public static void main(String[] args) {

		System.out.println("main method stratd ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first String  :");
		String str = sc.nextLine();// abbccc
		// 0 1 2 3 4 ..... 97 98 99 100.... 126
		// 0 0 0 0 0 ....... 2 3 4 0......0
		int[] arr = new int[127];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}

		int max = -1;
		char ch = ' ';

		for (int i = 0; i < str.length(); i++) {
			if (arr[str.charAt(i)] > max) {
				max = arr[str.charAt(i)];
				ch = str.charAt(i);
			}
		}

		System.out.println("Max reapeted char is : " + ch);

	}

}
