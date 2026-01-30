package com.oops2;

public class PersonalLoan extends Loan {

	void getPersonalLoanDocInfo() {
		System.out.println("Personal Loan documents are submitted successfully !!");
	}

	@Override
	String hello() {
		return "Java is very very very very simple";
	}

	@Override
	public Double getLoanROI() {
		return 9.5;
	}

	private String welcome() {
		return "welcome";
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Personal Loan banking !!");

		// CASE 1: By using Child Object & child reference
		// we can call both parent & child class functionalities.
		PersonalLoan pl = new PersonalLoan();

		System.out.println("Loan : " + pl.getLoanROI());
		System.out.println(pl.welcome());

		// CASE 2: By using Parent Object & Parent reference
		// We can call only parent class functionalities
		Loan l1 = new Loan();

		// CASE 3: By using Child Object & Parent reference
		// We can call only Parent class functionalities then we need to do this ..?
		// "Dynamic Method DIspatching"

		// IMP NOTE:If any method override from Parent to child
//		then by using parent reference child object we can call all parent class functionalities 
//		but also we can call overridden child class functionalities. 

		// Can we store Child Object into Parent reference ..? YES
		// And this process will consider as UP-Casting by using thisa we can achieve
		// Dynamic method dispatching & Abstraction with interfaces.
		Loan l2 = new PersonalLoan();
		System.out.println(l2.hello());

		// By using Parent Object & child reference
		// we can call ..?
		// Can we store Parent object into Child reference ..? NO
		// Java does not support, Down-casting.
		// Namesake we can Type cast with child class but
//		if we access any methods we will get Runtime Exception saying 
//		ClassCastException.
//		PersonalLoan pl2 = (PersonalLoan) new Loan();
//		pl2.hello();

		if (pl.validateAadhaar() && pl.validateMobile() && pl.validatePAN()) {

			double salary = pl.getSalaryInfo();
			int age = pl.getCustomerAge();
			int cibil = pl.getCibilScore();

			if (salary > 1500000.00 && age >= 22 && cibil >= 750) {
				System.out.println("Congrtulations !!  Your loan got approved !!");
				System.out.println("Your Loan ROI is : " + pl.getLoanROI());
				System.out.println("Enter your address details :");

				String address = pl.getAddressInfo();
				System.out.println("Verify Address again : ");
				System.out.println(address);
				pl.getPersonalLoanDocInfo();

			} else {
				System.out.println("Sorry !! Your loan got rejected !!");
			}
		} else {
			System.out.println("You data is inccorect it's not matching with any profile, Provide proper details !");
		}

	}
}
