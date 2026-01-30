package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo12 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a day !");
		int day = sc.nextInt();

		System.out.println("Day Description  : " + getDayDescription(day));
		sc.close();

	}

	static String getDayDescription(int day) {

		return switch (day) {
		case 1 -> "Sundays are always Holiday !!";
		case 2 -> "Mondays are always Lazy day !!";
		case 3, 4, 5 -> "Tuesday WednesDay Thursday are Boring days !!";
		case 6 -> "Fridays always Funday !";
		case 7 -> "Saturdays are always Happy Day !!";
		default -> "not a valid day ";
		};

	}

}
