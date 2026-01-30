package com.operators;

public class TestOpDemo13 {

	public static void main(String[] args) {

		String s1 = "Srikanth";
		String s2 = "Java";
		String bigStr = "";
		bigStr = (s1.length() > s2.length()) ? s1 : s2;
		System.out.println("BIg String from Given String : " + bigStr);

		int i = 100;
		String msg = (i > 50) ? "Yes" : "No";
		System.out.println(msg);

		System.out.println("***************");
		int a = 10;
		int b = 20;
		int max = 0;
		max = (a > b) ? a : b;
		System.out.println("Max value : " + max);

		System.out.println("***************");

		int x = 30;
		int y = 40;
		int z = 50;
		int max1 = 0;

		max1 = (x > y) ? (x > z ? x : z) : (y > z ? y : z);

		System.out.println("Max1 value : " + max1);

	}
}
