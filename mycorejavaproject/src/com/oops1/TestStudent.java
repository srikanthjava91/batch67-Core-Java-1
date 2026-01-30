package com.oops1;

public class TestStudent {

	public static void main(String[] args) {

		Student s1 = new Student();

		// Modifying the data
		s1.setSid(18);
		s1.setSname("Virat");
		s1.setSage(37);

		// reading the data
		System.out.println(s1.getSid());
		System.out.println(s1.getSname());
		System.out.println(s1.getSage());

		Student s2 = new Student();

		s2.setSid(45);
		s2.setSname("Rohit");
		s2.setSage(36);

		System.out.println(s2.getSid());
		System.out.println(s2.getSname());
		System.out.println(s2.getSage());

//		Stopping the direct access from outside of the classes we us private is the keyword
//		s1.sid = 2;
//		s1.sname = "Virat";
//		s1.sage = 37;

		// Accessing the data directly
//		System.out.println(s1.sid);
//		System.out.println(s1.sname);
//		System.out.println(s1.sage);

	}

}
