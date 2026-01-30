package com.javaintro;

class Student4 {
	Student4 ref;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called ");
	}
}

public class Test5Demo {

	public static void main(String[] args) {

		System.out.println("main method started !");

		Student4 s1 = new Student4();
		Student4 s2 = new Student4();

		System.out.println(s1);
		System.out.println(s2);

		s1.ref = s2;
		s2.ref = s1;

		s1 = null;
		s2 = null;

		System.gc();

	}

}
