package com.arrays;

import java.util.Arrays;

public class TestArrDemo16 {

	public static void main(String[] args) {
		int[] arr = { 7, 8, 1, 2, 4 };
		Arrays.sort(arr);
		for (int s : arr) {
			System.out.print(s + " ");
		}
	}
}
