package com.stringhandling;

public class TestStrDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		String str = String.join(":", "Hello", "good morning", "good day", "hi");
		System.out.println(str);
		System.out.println("**********************");

		String str1 = "Java is simple in vcube at JNTU hyderabad";
		String[] words = str1.split("\\s", 4);
		int count = 0;
		for (String word : words) {
			System.out.println(word);
			count++;
		}

		System.out.println("count is : " + count);
	}
}
