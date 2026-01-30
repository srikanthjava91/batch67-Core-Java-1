package com.arrays;

public class TestArrDemo11 {

	public static void main(String[] args) {

		int[][] n = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12, 13, 14 } };
		System.out.println(n);

		System.out.println(n.length);// 4
		System.out.println(n[0].length);
		System.out.println(n[1].length);
		System.out.println(n[2].length);
		System.out.println(n[3].length);

		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j] +" ");
			}
			System.out.println();
		}

//		for (int[] n1 : n) {
//			for (int n2 : n1) {
//				System.out.print(n2 + " ");
//			}
//			System.out.println();
//		}
	}
}
