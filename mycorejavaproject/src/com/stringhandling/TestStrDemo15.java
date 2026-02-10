package com.stringhandling;

import java.util.Arrays;
import java.util.Scanner;

//Q) WAP the Given String is Anagram or not ..? 
public class TestStrDemo15 {

	public static void main(String[] args) {

		System.out.println("main method stratd ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first String  :");
		String str1 = sc.nextLine();

		System.out.println("Enter a second String  :");
		String str2 = sc.nextLine();

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() != str2.length()) {
			System.out.println("The given String is Not Anagram  ");
			return;
		}

		char[] ach1 = str1.toCharArray();// c a t
		char[] ach2 = str2.toCharArray();// a c t

		Arrays.sort(ach1);// act
		Arrays.sort(ach2);// act

		if (Arrays.equals(ach1, ach2)) {
			System.out.println("The Given String is Anagram !!");
		} else {
			System.out.println("The Given String is not Anagram !!");
		}
	}
}
