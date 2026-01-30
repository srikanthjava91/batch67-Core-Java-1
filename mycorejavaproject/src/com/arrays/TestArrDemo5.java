package com.arrays;

//WAP to print array in Reverse Order 
public class TestArrDemo5 {

	public static void main(String[] args) {
		System.out.println("main method strated ");
		int[] n = { 10, 20, 30, 40, 50, 60 };// 0 1 2 3 4 5
		for (int i = n.length - 1; i >= 0; i--) {
			System.out.print(n[i] + " ");
		}
	}
}
