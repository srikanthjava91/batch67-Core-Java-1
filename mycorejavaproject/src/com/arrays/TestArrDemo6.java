package com.arrays;

//Q) WAP to find min and max from a Given Array ..? 
public class TestArrDemo6 {

	public static void main(String[] args) {
		System.out.println("main method strated ");

		int[] numbers = { 10, 15, 36, 45, -10, -60 };

		int min = numbers[0];// 10 -10 -60
		int max = numbers[0];// 10

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] < min) {
				min = numbers[i];
			} else if (numbers[i] > max) {
				max = numbers[i];
			}

		}

//		for (int n : numbers) {
//			if (n < min) {
//				min = n;
//			} else if (n > max) {
//				max = n;
//			}
//		}

		System.out.println("minimum number from given array : " + min);
		System.out.println("Maximum number from given array is : " + max);

	}

}
