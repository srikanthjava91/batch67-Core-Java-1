package com.arrays;

import java.util.Scanner;

public class TestArrDemo8 {

	public static void main(String[] args) {

		String[] names = new String[3];// 0 1 2
		Scanner sc = new Scanner(System.in);

		// Reading the elements from Scanner
		System.out.println("Enter the values based on the size : ");
		for (int i = 0; i < names.length; i++) {
			names[i] = sc.nextLine();
		}

		System.out.println("Representing an array !");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " ");
		}

	}

}
