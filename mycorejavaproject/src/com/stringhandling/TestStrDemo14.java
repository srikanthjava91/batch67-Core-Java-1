package com.stringhandling;

import java.util.Scanner;

//Q) WAP to find digits count & Characters count 
//which includes vowels count + consonants count..?
public class TestStrDemo14 {

	public static void main(String[] args) {
		System.out.println("main method stratd ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String  :");
		String str = sc.nextLine();

		str = str.toLowerCase();
		int charCount = 0;
		int vowCount = 0;
		int consCount = 0;
		int misCount = 0;
		int digitCount = 0;
		int spaceCount = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isAlphabetic(ch)) {
				charCount++;
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowCount++;
				} else {
					consCount++;
				}

			} else if (Character.isDigit(ch)) {
				digitCount++;

			} else if (Character.isSpaceChar(ch)) {

				spaceCount++;
			} else {
				misCount++;
			}

		}

//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//
//			if (ch >= 'a' && ch <= 'z') {
//				charCount++;
//
//				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//					vowCount++;
//				} else {
//					consCount++;
//				}
//
//			} else {
//				nonCharCount++;
//
//			}
//
//		}

		System.out.println("Char count : " + charCount);
		System.out.println("Vowels count : " + vowCount);
		System.out.println("Consonants count : " + consCount);
		System.out.println("Digit Count  : " + digitCount);
		System.out.println("Space Count : " + spaceCount);

	}

}
