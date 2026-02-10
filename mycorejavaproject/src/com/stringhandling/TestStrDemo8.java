package com.stringhandling;

public class TestStrDemo8 {

	public static void main(String[] args) {

		TestStrDemo8 t1 = new TestStrDemo8();
		TestStrDemo8 t2 = new TestStrDemo8();
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t1 == t2);
		System.out.println(t1.equals(t2));

//		String s1 = "Java";
//		String s2 = "Java";

		String s1 = new String("Java");
		String s2 = new String("Java");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

		if (s1 == s2) {
			System.out.println("Both are same !!");
		} else {
			System.out.println("Both are not same !!");
		}

		if (s1.equals(s2)) {
			System.out.println("Both are same !!");
		} else {
			System.out.println("Both are not same !!");
		}

	}

}
