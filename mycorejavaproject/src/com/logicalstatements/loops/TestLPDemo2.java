package com.logicalstatements.loops;

///Q3) WAP to print 0 to 100 even numbers ..? 
public class TestLPDemo2 {

	public static void main(String[] args) {

		System.out.println("Even numbers  ");
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0 && i != 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
		System.out.println("odd numbers  ");
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 1 && i != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
