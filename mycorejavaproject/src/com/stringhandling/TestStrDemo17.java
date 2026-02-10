package com.stringhandling;

public class TestStrDemo17 {

	public static void main(String[] args) {
		System.out.println("main method started ");

//		Type mismatch: cannot convert from String to StringBuffer
//		StringBuffer sb = "Srikanth"; CE
//		System.out.println(sb);

		// String is a Immutable Objects
		String s1 = "Srikanth";
		s1.concat("Java");
		System.out.println(s1);// Srikanth

		// StringBuffer is a mutable Objects
		StringBuffer sb1 = new StringBuffer("Srikanth");
		sb1.append("Java");
		System.out.println(sb1);// SrikanthJava

	}
}
