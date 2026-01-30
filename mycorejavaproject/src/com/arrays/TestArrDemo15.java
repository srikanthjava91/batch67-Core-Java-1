package com.arrays;

//Bubble Sort
public class TestArrDemo15 {

	public static void main(String[] args) {

		System.out.println("main method started !");
		int[] arr = { 7, 8, 9, 2, 3, 6 };

		int temp = 0;
		System.out.println("Before Sorting ");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}

			}
			count++;
			if (!flag) {
				break;
			}

		}

		System.out.println();
		System.out.println("After Sorting ");
		System.out.println(count);

		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("main method ended !");
	}
}
