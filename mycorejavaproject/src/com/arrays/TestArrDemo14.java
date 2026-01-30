package com.arrays;

import java.util.Scanner;

public class TestArrDemo14 {

	public static void main(String[] args) {
		System.out.println("main method strated ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size : ");
		int size = sc.nextInt();
		int[] numbers = new int[size];// 5

		System.out.println("Enter values for an array with size of : " + size);
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();// 1 2 3 4 5 6 7 8 9 10
		}

		System.out.println("**********Array representation*****");
		for (int i = 0; i < size; i++) {
			boolean flag = true;

			if (numbers[i] == 0 || numbers[i] == 1) {
				flag = false;
			}

			for (int j = 2; j < numbers[i]; j++) {
				if (numbers[i] % j == 0) {
					flag = false;
					break;
				}
			}

			if (flag) {
				System.out.print(numbers[i] + " ");
			}

		}

	}

}
