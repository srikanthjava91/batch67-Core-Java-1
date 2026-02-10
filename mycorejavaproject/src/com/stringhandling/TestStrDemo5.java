package com.stringhandling;

public class TestStrDemo5 {

	public static void main(String[] args) {

		String str = "Java is simple";
		System.out.println(str.codePointAt(0));// 74
		System.out.println(str.codePointBefore(1));// 74
		System.out.println(str.codePointCount(0, 4));// 4

		String s1 = "Advaith";// 100
		String s2 = "Abhigna";// 98
		System.out.println(s1.compareTo(s2));// 2

		String str1 = "A";// 65
		String str2 = "a";// 97
		System.out.println(str1.compareTo(str2));// -32

		String s3 = "Abhiram";
		String s4 = "abhiram";
		System.out.println(s3.compareTo(s4));// -32

		String s5 = "Sairam";
		String s6 = "sairam";
		System.out.println(s5.compareToIgnoreCase(s6));//0

	}

}
