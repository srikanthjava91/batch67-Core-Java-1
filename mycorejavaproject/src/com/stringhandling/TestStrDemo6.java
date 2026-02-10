package com.stringhandling;

public class TestStrDemo6 {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };
		System.out.println(numbers);// Address of the object

		char[] ch = { 'a', 'p', 'p' };
		System.out.println(ch);// app
		
		System.out.println(String.copyValueOf(ch));

		String str1 = "Java";
		String str2 = "Srikanth";
		System.out.println(str1.concat(str2));
		System.out.println(str1 + str2);
		System.out.println(str1 + 123);

		String[] names = { "Abhishek", "Sky", "Tilak", "Sanju", "Ishan", "Hardhik" };
		for (String name : names) {
			if (name.toLowerCase().contains("sh")) {
				System.out.println(name);
			}
		}

		CharSequence cs = "Java";
		System.out.println(str1.contentEquals(cs));
	}
}
