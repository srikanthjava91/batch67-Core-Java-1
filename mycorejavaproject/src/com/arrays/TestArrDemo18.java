package com.arrays;

import java.util.Scanner;

public class TestArrDemo18 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many time you want to Rotate : ");

		int r = sc.nextInt();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		rotateArray(arr, r);

		for (int a : arr) {
			System.out.print(a + " ");
		}

		System.out.println();
		System.out.println("main method ended !!");
	}

	static void rotateArray(int[] arr, int r) {

		int start = 0;
		int end = arr.length - 1;

		if (r <= arr.length && r >= 0) {
//			Step1 : Reverse the Give array.
			reverseArray(arr, start, end);

//			Step2 : Reverse 1st half based on the R value 
			reverseArray(arr, start, r - 1);

//			Step3 : Reverse 2nd half based on the R value 
			reverseArray(arr, r, end);
		} else {
			System.out.println("invalid Rotation occured ");
		}

	}

	static void reverseArray(int[] arr, int start, int end) {
		int temp = 0;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}
}
