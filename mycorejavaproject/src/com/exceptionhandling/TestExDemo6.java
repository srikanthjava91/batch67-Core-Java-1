package com.exceptionhandling;

//try with multi catch blocks
public class TestExDemo6 {

	public static void main(String[] args) {
		System.out.println("main  method started ");

		try {
			System.out.println("In try !");
			System.out.println(10 / 2);
			System.out.println(0 / 0);//AE
//			System.out.println(0.0 / 0.0);//NAN
			System.out.println(10.5 / 0);// Infinity
			System.out.println(10.5 / 0.0);

		} catch (Exception e) {
			System.err.println("in ctach Ex");
			System.err.println(e.getMessage());
		}

		//Unreachable catch block for ArithmeticException.
//		It is already handled by the catch block for Exception
//		catch (ArithmeticException ar) {
//			System.err.println("In catch of AR");
//			System.err.println(ar.getMessage());
//		} catch (NullPointerException np) {
//			System.err.println("In cath of NE");
//			System.err.println(np.getMessage());
//		} 

		System.out.println("main  method ended ");
	}

}
