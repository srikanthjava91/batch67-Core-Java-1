package com.javaintro;

public class TestDemo2 {

	static {
		System.out.println("Hello static Block1 ");
	}

	{
		System.out.println("Hello instance block1 ");
//		TestDemo2 t = new TestDemo2();
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		TestDemo2 t = new TestDemo2();
	}

}
