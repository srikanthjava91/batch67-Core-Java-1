package com.stringhandling;

public class TestStrDemo3 {

	public static void main(String[] args) {

		String str = "Sachin";
		str = str.concat("Tendulkar");// SachinTendulkar -> Heap
		System.out.println(str);// sachin

		String s1 = "Srikanth";
//		s1.concat("Java");
		System.out.println(s1.concat("Java"));
	}
}
