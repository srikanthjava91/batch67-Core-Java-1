package com.starpatterns;

public class TestPatternDemo7 {

	public static void main(String[] args) {

//		 //1
		// 22
		// 333
		// 4444
		// 55555
		// 666666
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
