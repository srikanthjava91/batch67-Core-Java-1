package com.javaintro;

public class TestDemo1 {

	public static void main(String[] args) throws ClassNotFoundException {

		Class.forName("java.lang.String");
		
		System.out.println("Loading the Driver ");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded successfully");
		
		System.out.println("Welcome to Vcube!!");
		System.out.println("Java is simple in Vcube !!");
	}
}
