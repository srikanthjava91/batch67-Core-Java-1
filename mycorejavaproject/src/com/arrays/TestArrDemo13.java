package com.arrays;

public class TestArrDemo13 {

	public static void main(String[] args) {
		System.out.println("main method straed ");

		String[][] names = { { "Kohli", "Rohit", "KL", "Jaiswal" }, { "Gaikwad", "Washington", "Jadeja" },
				{ "Harshit rana", "Arshdeep", "Kuldeep", "Prashid" } };

		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.print(names[i][j] + " ");
			}
			System.out.println();
		}

//		for (String[] names1 : names) {
//			for (String s : names1) {
//				System.out.print(s + " | ");
//			}
//			System.out.println();
//		}
	}
}
