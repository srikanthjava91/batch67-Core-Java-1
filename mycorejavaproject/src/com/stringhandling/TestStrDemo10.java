package com.stringhandling;

public class TestStrDemo10 {

	public static void main(String[] args) {
		
		String s2 = "";
		String s3 = " ";
		String s4 = null;
		
		System.out.println(s2.isEmpty());//true
		System.out.println(s2.isBlank());//true

		System.out.println(s3.isEmpty());//false
		System.out.println(s3.isBlank());//true
		
//		System.out.println(s4.isBlank());
		System.out.println(s4.isEmpty());
		
		String s = "Srikanth";// SCP
		String s1 = new String("Srikanth");// Heap
		s1 = s1.intern();
		System.out.println(s == s1);

		String str1 = "Java is simple in vcube in JNTU";
		System.out.println(str1.indexOf('a'));//
		System.out.println(str1.indexOf('a', str1.indexOf('a') + 1));
//		System.out.println(str1.indexOf('a', str1.indexOf('a', str1.indexOf('a') + 1) + 1));

		System.out.println(str1.indexOf("in", str1.indexOf("in") + 1));
		System.out.println(str1.lastIndexOf('a'));
		String str = "Good evening have a nice day ";
		char[] ach = new char[10];
		str.getChars(5, 12, ach, 0);
		for (char c : ach) {
			System.out.print(c);
		}
	}
}
