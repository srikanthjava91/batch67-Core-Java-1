package com.arrays;

public class TestArrDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		// The literal 2147483648 of type int is out of range
//		int[] numbers = new int[2147483648];
//		the maximum size of an array is : Integer maximum size which is 
//		2147483647

		int[] numbers = new int[5];// 0 1 2 3 4

		numbers[0] = 101;
		numbers[1] = 102;
		numbers[2] = 103;
		numbers[3] = 104;
		numbers[4] = 105;

//		for (int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i]+ " ");
//		}

		//for each loop or enhanced for loop 
		for (int n : numbers) {
			System.out.print(n + " ");
		}

	}
}
