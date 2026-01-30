package com.langfundamentals;

//Test Variables Demo1 
public class Student1 {

	// instance + primitive variable
	int studentId;

	// instance + Object variable
	String studentName;

	// static + primitive variable
	static int ORGANIZATION_ID = 555;

	// static + Object variable
	static String ORGANIZATION_NAME = "Vcube Software solutions";

	static int id3 = 777;

	public static void main(String[] args) {
		System.out.println("main method started !");

		// Illegal modifier for parameter id3; only final is permitted
//		static int id3 = 888;
		int id3 = 888;
		System.out.println(id3);// 888
		System.out.println(Student1.id3);// 777

		// local + primitive
		int id1 = 0;
		// local + String
		String name1 = null;

		// Note : If we didn;t initialized the value for local variables JVM will not
		// provide default values.
//		Whenever we are trying to access local variables it must need to be initialized, 
//		if it is not initialized while accessing we will get below CE.
//		The local variable id1 may not have been initialized
//		The local variable name1 may not have been initialized
		System.out.println(id1);
		System.out.println(name1);

		Student1 s1 = new Student1();
		s1.studentId = 9;
		s1.studentName = "Yashwanth";

		Student1 s2 = null;
//		System.out.println(s2.studentId);
//		System.out.println(s2.studentName);
		System.out.println(s2.ORGANIZATION_ID);
		System.out.println(s2.ORGANIZATION_NAME);

		// static variables we can access directly or by using class name using
		// reference variables.
		System.out.println("Accessing static data ************");
		System.out.println(ORGANIZATION_ID);
		System.out.println(ORGANIZATION_NAME);
		System.out.println(Student1.ORGANIZATION_ID);
		System.out.println(Student1.ORGANIZATION_NAME);
		System.out.println(s1.ORGANIZATION_ID);
		System.out.println(s1.ORGANIZATION_NAME);

		// instance data we can only by using object reference variables
		System.out.println("Accessing instance data *************");
		System.out.println(s1.studentId);
		System.out.println(s1.studentName);

	}
}
