package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class TestArrDemo19 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 2, 3, 1, 1, 2, 3 };

		Set<Integer> s = new HashSet<>();
		for (int a : arr) {
			if (!s.add(a)) {
				System.out.println(a);
			}
		}

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					System.out.print(arr[i] + " ");
//				}
//			}
//		}

	}

}
