package com.javaintro;

public class Cricketer {

//	 Declaration
//	 instance variables
	int jerseyNo;
	String name;

//	 static variables
	static int countryId = 91;
	static String countryName = "India";

	public static void main(String[] args) {
		System.out.println("main method strated ");
		System.out.println("Welcome to Indian Cricket team !!!!");

		System.out.println("Object1 info****************");
		// Creating an Object
		Cricketer dh = new Cricketer();
		// Initialization or assigning the data
		dh.jerseyNo = 7;
		dh.name = "Mahendra Singh Dhoni";

//		 Accessing the static data
		System.out.println("Country ID : " + countryId);
		System.out.println("Country Name : " + countryName);
//		Accessing the instance data by using Object reference variable.
		System.out.println("jersey Number : " + dh.jerseyNo);// 0
		System.out.println("Name of the Cricketer  : " + dh.name);// null

		System.out.println("Object2 info****************");
		Cricketer vk = new Cricketer();
		vk.jerseyNo = 18;
		vk.name = "Virat Kohli";
		System.out.println("Country ID : " + countryId);
		System.out.println("Country Name : " + countryName);
		System.out.println("jersey Number : " + vk.jerseyNo);
		System.out.println("Name of the Cricketer  : " + vk.name);

		System.out.println("Object3 info****************");
		Cricketer rh = new Cricketer();
		rh.jerseyNo = 45;
		rh.name = "Rohit Sharma";
		System.out.println("Country ID : " + countryId);
		System.out.println("Country Name : " + countryName);
		System.out.println("jersey Number : " + rh.jerseyNo);
		System.out.println("Name of the Cricketer  : " + rh.name);

		System.out.println("Object4 info****************");
		Cricketer jaddu = new Cricketer();
		countryId = 92;
		countryName = "Bharath";

		jaddu.jerseyNo = 8;
		jaddu.name = "Ravindra Jadeja";

		System.out.println("Country ID : " + countryId);
		System.out.println("Country Name : " + countryName);
		System.out.println("jersey Number : " + jaddu.jerseyNo);
		System.out.println("Name of the Cricketer  : " + jaddu.name);

		System.out.println("Object5 info****************");
		Cricketer kl = new Cricketer();
		kl.jerseyNo = 1;
		kl.name = "Konneru Lokesh Rahul";
		System.out.println("Country ID : " + countryId);
		System.out.println("Country Name : " + countryName);
		System.out.println("jersey Number : " + kl.jerseyNo);
		System.out.println("Name of the Cricketer  : " + kl.name);

	}
}
