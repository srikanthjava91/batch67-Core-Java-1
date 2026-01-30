package com.arrays;

public class TestArrDemo21 {

	public static void main(String[] args) {
		System.out.println("main method started !");
		int[][][] n = {{{10,20,30,40},{50,60,70},{80,1,2},{3,4,5}},
						{{1,2,3},{4,5,6},{7,8,9}},
						{{1,2},{3,4},{5,6}},
						{{6,7},{8,9},{10,11}}};
		
		
		for(int[][] n2:n) {
			for(int[] n1:n2) {
				for(int num: n1) {
					System.out.print(num + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println(n);
	}

}
