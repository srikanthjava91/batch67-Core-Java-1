package com.javaintro;

public class Cricketer1 {
	int jno;
	String name;

	static int cid = 91;
	static String cname = "India";

	// instance method
	void display() {
		System.out.println("Country ID  : " + cid);
		System.out.println("Country Name : " + cname);
		System.out.println("JNO : " + jno);
		System.out.println("Crick Name : " + name);
	}

	public static void main(String[] args) {

		System.out.println("main method started ");

		Cricketer1 c1 = new Cricketer1();
		c1.jno = 77;
		c1.name = "Gill";

		// method calling
		c1.display();

		System.out.println("2nd object  info ************");
		Cricketer1 vc = new Cricketer1();
		vc.jno = 63;
		vc.name = "SKY";
		vc.display();

		System.out.println("3rd object  info ************");
		Cricketer1 op = new Cricketer1();
		op.jno = 4;
		op.name = "Abhishek";
		op.display();

		System.out.println("4th object  info ************");
		Cricketer1 op1 = new Cricketer1();
		cid = 92;
		cname = "Bharath";
		op1.jno = 9;
		op1.name = "Samson";
		op1.display();

		System.out.println("5th object  info ************");
		Cricketer1 bow1 = new Cricketer1();
		bow1.jno = 73;
		bow1.name = "Siraj";
		bow1.display();

	}

}
