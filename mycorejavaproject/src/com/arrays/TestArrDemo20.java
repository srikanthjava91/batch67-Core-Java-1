package com.arrays;

public class TestArrDemo20 {

	public static void main(String[] args) {

		int[][][] numbers = new int[3][3][3];

		numbers[0][0][0] = 100;
		numbers[1][1][1] = 200;
		numbers[2][2][2] = 300;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				for (int k = 0; k < numbers[i][j].length; k++) {
					System.out.print(numbers[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();

		}

//		for(int[][] numbers2:numbers) {
//			for(int[] numbers1:numbers2) {
//				for(int n:numbers1) {
//					System.out.print(n + " ");
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}

	}

}
