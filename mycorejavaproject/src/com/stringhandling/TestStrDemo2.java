package com.stringhandling;

public class TestStrDemo2 {

	public static void main(String[] args) {

		String s = "kohli";// SCP --> 1 object
		String s1 = "kohli";// SCP --> 0 objects

		String s2 = new String("Rohit");// Heap -> 2 object 1 is in SCP + 1 is in heap
		String s3 = new String("Rohit");// Heap --> 1 Object is in Heap

		String s4 = "Rohit";// 0 objects
		String s5 = new String("Kohli");// 1 object in Heap
		String s6 = "Kohli";// 0 objects

		s1 = "virat";

		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s);
		System.out.println(s6);
	}

}
