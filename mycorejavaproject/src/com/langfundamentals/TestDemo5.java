package com.langfundamentals;

class Student {
	int id ;
	String name;
	int age;
	long phone;
	Address address = new Address();
}

class Address {
	String flat;
	String plot;
	String street;
	String city;
	String state;
	long pincode;

}

public class TestDemo5 {
	Student s = new Student();

	public static void main(String[] args) {
		

	}

}
