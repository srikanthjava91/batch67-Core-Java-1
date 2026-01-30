package com.exceptionhandling;

public class TestExDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		int[] arr = new int[3];// 0 1 2

		try {
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			arr[3] = 40;

		} catch (IndexOutOfBoundsException ar) {
			ar.printStackTrace();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("main method ended !!");
	}

}
