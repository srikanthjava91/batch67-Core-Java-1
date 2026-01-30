package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to find factors of a given number ..? 
//input : number 	--> argument 
//output : factors  --> void 
public class TestLPDemo5 {
	
	{
		System.out.println("Hello");
	}

	void findfactors(int n) {
		int count =0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println(n);
		System.out.println(count);
	}

	void main() {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();// 6

		// Calling a method
		findfactors(num);

		System.out.println("main method ended !!");
	}

}
