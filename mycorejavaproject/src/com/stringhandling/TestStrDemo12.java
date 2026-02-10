package com.stringhandling;

public class TestStrDemo12 {

	public static void main(String[] args) {

		String str1 = "Java is simple ";
		str1 = str1.replace('a', 'E');
		System.out.println(str1);

		String str2 = "Welcome to String World String is simple ";
		str2 = str2.replace("String", "Java");
		System.out.println(str2);

		String str3 = "Cricket is simple to play its a simple sport";
		str3 = str3.replaceAll("simple", "easy");
		System.out.println(str3);

		String pan = "AMIBC12345A";
		pan = pan.replaceAll("\\d", "X");
		System.out.println(pan);

		String s1 = "            Hello       Good evening                ";
		System.out.println(s1);
		System.out.println(s1.trim());
		System.out.println(s1.replaceAll("\\s", ""));

	}
}
