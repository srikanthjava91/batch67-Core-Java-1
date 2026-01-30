package com.operators;

public class TestOpDemo10 {

	public static void main(String[] args) {
		int a = 9;
		// 9 + 11 +11 +11+12+11+11
		System.out.println(a++ + ++a + a++ + --a + ++a + --a + a);
	}
}
