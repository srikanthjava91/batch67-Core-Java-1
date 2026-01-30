package com.exceptionhandling;

//finally block will execute always except System.exit(0);
public class TestExDemo8 {

	void hello() {
		return;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		try {
			System.out.println("in try");
			System.exit(10);
			return;
		} catch (Exception e) {
			System.out.println("in catch");
		} finally {
			System.out.println("in finally");
		}

		// Syntax error on token "finally", delete this token
//		 finally {
//				System.out.println("in finally");
//			}

		System.out.println("main method ended ");
	}
}
