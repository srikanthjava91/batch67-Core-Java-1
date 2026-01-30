package com.javaintro;

public class Student1 {

	void singing() {
		System.out.println("singing method called ");
		System.out.println("sing : " + Thread.currentThread());
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("main pri******: " + Thread.currentThread().getPriority());
		read();
		write();

		Student1 s1 = new Student1();
		s1.singing();

		System.out.println("main method ended ");
	}

	static void read() {
		System.out.println("read method called ");
		System.out.println("read : " + Thread.currentThread());
	}

	static void write() {
		System.out.println("write method called ");
		System.out.println("write : " + Thread.currentThread());
	}

}
