package com.exceptionhandling;

public class TestExDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		try {
			System.out.println("in try1 !!");
			try {
				System.out.println("In try2 ");
				System.out.println(10 / 0);

			} catch (Exception e) {
				System.out.println("in catch2");
			} finally {
				System.out.println("in finally 2");
			}
			System.out.println(10 / 0);
			System.out.println("Hello guys, Good morning !!");
		} catch (Exception e) {
			System.err.println("in catch1 !!");

			try {
				System.out.println("in try3");
			} catch (Exception e1) {
				System.err.println("in catch 3");
			} finally {
				System.out.println("in finally3 !");
			}

		} finally {
			System.out.println("in finally1 !");
			try {
				System.out.println("in try4");
			} catch (Exception e1) {
				System.err.println("in catch 4");
			} finally {
				System.out.println("in finally4 !");
			}
		}

		System.out.println("main method ended !");
	}
}
