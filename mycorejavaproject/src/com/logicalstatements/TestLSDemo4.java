package com.logicalstatements;

//WAP to get a job in next 4 to 5 months IT job What are eligibility check..? 
//8 8 8 
import java.util.Scanner;

public class TestLSDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you Regular for classes & daily assignments ..? ");
		boolean areYouRegular = sc.nextBoolean();

		System.out.println("Are you practicing daily 6hrs + ");
		boolean areYouPracticing = sc.nextBoolean();

		System.out.println("Are you attending Weekly test and Reviewing the same ..?");
		boolean areYouAttendingWeeklyTest = sc.nextBoolean();

		System.out.println("Are you attending the Mock Interviews ..? ");
		boolean areYouattendingTheMocks = sc.nextBoolean();

		if (areYouRegular && areYouPracticing && areYouAttendingWeeklyTest && areYouattendingTheMocks) {
			System.out.println(
					"My name is srikanth !! Remember my name !! you will get a job in 5 to 6 months without a doubt ");
		} else {
			System.out.println("Sorry guys, You will get job next 2027 !!");
		}

		System.out.println("main method ended !");
	}

}
