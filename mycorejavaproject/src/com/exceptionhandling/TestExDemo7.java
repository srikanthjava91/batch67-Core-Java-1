package com.exceptionhandling;

import java.util.Scanner;

public class TestExDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		try {
			System.out.println("in try ");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number : ");
			int n = sc.nextInt();
			int a = 10 / n;
			System.out.println("A value : " + a);
			String s = "Srikanth";
			System.out.println(s.charAt(a));
		} catch (NullPointerException e) {
			System.err.println("In catch of NP");
			e.printStackTrace();
		}  catch (RuntimeException e) {
			System.err.println("in ctach REx");
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println("in ctach Ex");
			System.err.println(e.getMessage());
		}

		System.out.println("main method ended ");

	}

}
