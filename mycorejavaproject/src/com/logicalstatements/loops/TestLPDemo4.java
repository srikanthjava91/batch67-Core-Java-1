package com.logicalstatements.loops;

import java.util.Scanner;

/// WAP to print factors of a given numbers ..? 
///input 6 
/////output : 1 2 3 6 
///
///input : 9 
///output : 1 3 9 
///
///input 28 : 
///output : 1 2 4 7 14 28 
///

public class TestLPDemo4 {

	public static void main(String[] args) {
		System.out.println("main methgod started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();// 10

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(n);

	}

}
