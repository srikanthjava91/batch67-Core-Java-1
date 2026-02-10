package com.stringhandling;

public class TestStrDemo13 {

	public static void main(String[] args) {

		int a = 10;
		String s1 = String.valueOf(a);
		System.out.println(s1+ 20);

		String str1 = "Please enter a details here";
		System.out.println(str1.substring(7));
		System.out.println(str1.substring(7, 11));
		System.out.println(str1.subSequence(7, 11));

		String phone = "987654310";
		if (phone.matches("^[6-9][0-9]{9}$")) {
			System.out.println("Valid Phone Number");
		} else {
			System.out.println("Invalid Phone Number");
		}

		String aadhaar = "123456789012";
		if (aadhaar.matches("^[0-9]{12}$")) {
			System.out.println("Valid Aadhaar Number");
		} else {
			System.out.println("Invalid Aadhaar Number");
		}

		String pan = "ABCDE1234F";
		if (pan.matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}$")) {
			System.out.println("Valid PAN Number");
		} else {
			System.out.println("Invalid PAN Number");
		}
	}

}
