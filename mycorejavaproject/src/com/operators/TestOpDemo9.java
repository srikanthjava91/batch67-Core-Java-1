package com.operators;

public class TestOpDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int x = 5;
		System.out.println(++x + --x + ++x + x++);
		System.out.println("xa value : " + x);

		int i = 0;
		// 1 2 2
		// 0 + 2 + 2 + 2
		System.out.println(i++ + ++i + i + i++);
		System.out.println("i value : " + i);
	}
}
