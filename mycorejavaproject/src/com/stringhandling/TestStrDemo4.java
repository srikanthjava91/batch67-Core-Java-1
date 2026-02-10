package com.stringhandling;

import java.util.Scanner;

//WAP to print Reverse of the Given String ..? 
//WAP to print the Given String Palindrome or not ..? 
public class TestStrDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String str = sc.next();// Java --> 0 1 2 3
		String rev = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);// J a v a
			rev = c + rev;// avaJ
		}

		System.out.println("Reverse String of Given String   : " + rev);

		if (rev.equalsIgnoreCase(str)) {
			System.out.println("The Given String is Palindrome : ");
		} else {
			System.out.println("The Given String is not Palindrome : ");
		}
	}
}
