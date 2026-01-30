package com.arrays;

public class TestArrDemo1 {

	public static void main(String[] args) {
//		Step1 : 
//			Declaration : LHS 
		int[] numbers;

//		Step2 :	
//			Creation 
		numbers = new int[5];// 0 1 2 3 4

//		Step3 :	
//			Initialization 
		numbers[0] = 101;
		numbers[1] = 102;
		numbers[2] = 103;
		numbers[3] = 104;
		numbers[4] = 105;

//		Step4 : 	
//			Representation 

		// System.out.println(numbers[0]);
		// System.out.println(numbers[1]);
		// System.out.println(numbers[2]);
		// System.out.println(numbers[3]);
		// System.out.println(numbers[4]);

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.print(numbers[i] + " ");
			}
		}

	}

}
