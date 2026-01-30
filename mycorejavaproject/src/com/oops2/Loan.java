package com.oops2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Loan implements LoanIn {

	static Scanner sc = new Scanner(System.in);

	String hello() {
		return "Java is simple";
	}

	@Override
	public String getAddressInfo() {
		String address = "";
		System.out.println("Enter flat number ");
		String flat = sc.next();

		System.out.println("Enter plot number ");
		String plot = sc.next();

		System.out.println("Enter street name ");
		String street = sc.next();

		System.out.println("Enter City  name ");
		String city = sc.next();

		System.out.println("Enter PINcode  ");
		long pin = sc.nextLong();

		address = "Flat No : " + flat + " ,Plot Details : " + plot + " ,Street : " + street + " ,City : " + city
				+ " ,PIN : " + pin;

		return address;
	}

	// ================= Aadhaar Validation =================
	public boolean validateAadhaar() {
		System.out.println("Enter Aadhaar Number : ");
		String aadhaar = sc.next();

		String aadhaarRegex = "^[2-9][0-9]{11}$";
		return Pattern.matches(aadhaarRegex, aadhaar);
	}

	// ================= PAN Validation =================
	public boolean validatePAN() {
		System.out.println("Enter PAN Number : ");
		String pan = sc.next();
//AMIPC1234G
		String panRegex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
		return Pattern.matches(panRegex, pan);
	}

//	================= Mobile Validation =================
	public boolean validateMobile() {
		System.out.println("Enter Mobile number : ");
		String mobile = sc.next();

		String mobileRegex = "[6-9][0-9]{9}";
		return Pattern.matches(mobileRegex, mobile);
	}

//	================= Age Validation =================
	public int getCustomerAge() {
		System.out.println("Entr age : ");
		int age = sc.nextInt();
		return age;
	}

//	================= Loan ROI Info  =================
	public Double getLoanROI() {
		return 10.5;
	}

	private Object welcome() {
		return "Welcome from Parent";
	}

//	================= Cibil score Validation =================
	public int getCibilScore() {
		System.out.println("enter Cibi score");
		int cibil = sc.nextInt();
		return cibil;
	}

//	================= Salary Validation =================
	public double getSalaryInfo() {
		System.out.println("Enter your Salary info : ");
		double salary = sc.nextDouble();
		return salary;
	}

}
