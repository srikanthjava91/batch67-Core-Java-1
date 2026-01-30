package com.arrays;

//Jagged array 
public class TestArrDemo12 {

	public static void main(String[] args) {

		System.out.println("main method strated ");

		int[][] n = new int[2][];// valid 0 1

		n[0] = new int[3];// 0 1 2
		n[1] = new int[3];// 0 1 2

		for (int[] n1 : n) {
			for (int number : n1) {
				System.out.print(number + " ");
			}
			System.out.println();
		}

	}
}
