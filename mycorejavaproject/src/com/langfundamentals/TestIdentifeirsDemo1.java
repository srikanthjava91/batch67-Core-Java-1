package com.langfundamentals;

import java.util.Scanner;

public class TestIdentifeirsDemo1 {

	protected int id_1 = 4;
	protected String name$ = "Abhishek";

	void hello_123() {
		System.out.println("Hello 123 method called !!");
	}

	public static void main(String[] args) {
		System.out.println("main method started !");

		int a = 10;
		var a1 = 100;
		String name = "Srikath";
		var name1 = "Srikanth";

		Scanner sc = new Scanner(System.in);

		String s = new String();

		TestIdentifeirsDemo1 t1 = new TestIdentifeirsDemo1();
		System.out.println(t1.id_1);
		System.out.println(t1.name$);
		t1.hello_123();

		System.out.println("main method ended !");

	}

}
