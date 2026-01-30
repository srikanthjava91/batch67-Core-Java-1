package com.arrays;

public class TestArrDemo10 {

	public static void main(String[] args) {

		int[][] numbers = new int[3][4];// 0 1 2 ---------0 1 2 3

		System.out.println(numbers.length);// 3
//		System.out.println(numbers[0].length);//4
//		System.out.println(numbers[1].length);//4
//		System.out.println(numbers[2].length);//4

		numbers[0][0] = 100;
		numbers[1][1] = 200;
		numbers[2][2] = 300;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}

//		for (int[] n1 : numbers) {
//			for (int n : n1) {
//				System.out.print(n + " ");
//			}
//			System.out.println();
//		}

	}
}
