package com.arrays;

public class TestArrDemo17 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		int[] arr = { 50, 40, 10, 20, 2, 30 };
		int temp = 0;

		System.out.println("Before : ");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			int min = i;// 0 1 2 4

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}

		System.out.println();
		System.out.println("After : ");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		System.out.println("main method ended !");
	}
}
