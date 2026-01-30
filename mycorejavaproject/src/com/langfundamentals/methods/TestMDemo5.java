package com.langfundamentals.methods;

//No return type + with arguments  
import java.util.Scanner;

//Q) WAP to get the Student details using methods..?  
//Read all the elements from a console using Scanner,
//pass to the methods as arguments and represents the same.

//getPhone
//getHeight
//getWeight 
//GetMarriageStatus 
//GetGender --> M or F 
public class TestMDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your ID ");
		int studentId = sc.nextInt();

		System.out.println("Enter your First name: ");
		sc.nextLine();
		String fname = sc.nextLine();
		System.out.println("Enter your Last name: ");
		String lname = sc.next();

		System.out.println("Enter Your Gender Info ");
		char c = sc.next().charAt(0);// Male

		// Creating an Object
		TestMDemo5 t6 = new TestMDemo5();

		// Calling the methods by values with reference variable
		t6.getStudentIdInfo(studentId);
		t6.getFullName(fname, lname);
		t6.getGenderInfo(c);
		sc.close();
	}

	void getGenderInfo(char c) {
		System.out.println("Gender is  :" + c);
	}

	void getFullName(String firstName, String lastName) {
		System.out.println("Your Full Name is : " + lastName + " " + firstName);
	}

	void getStudentIdInfo(int id) {
		System.out.println("Welcome to Vcube and your ID is : " + id);
	}

}
