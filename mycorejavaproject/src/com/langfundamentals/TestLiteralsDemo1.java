package com.langfundamentals;

public class TestLiteralsDemo1 {

	void main() {
		System.out.println("main method started !");

		TestLiteralsDemo1 t1 = new TestLiteralsDemo1();
		System.out.println(t1);// Address of the Object

		int t2 = 0x1dbd16a6;// Hexa-Decimal Literals
		System.out.println("t2 valu e: " + t2);
		System.out.println(t1.hashCode());

		// Decimal Literals: Base 10(0 to 9)
		int a1 = 123;
		int a2 = 100;
		int a3 = 789;

		// Any number starts with 0 will consider as Octal number
		// Octal Literals : Base 8 -> 0 to 7
		int a4 = 0123;
		// 1*8^2 +2*8^1 +3*8^0 = 64 + 16 + 3 = 83

		int a5 = 0345;// 229
		// 3*8^2 +4*8^1 +5*8^0 = 192 + 32 + 5 = 229

		int a6 = 0675;// 445
//		int a7 = 0876;//574//The literal 0876 of type int is out of range 

		// Hexa-Decimal Literal : Base 16 : 0 to 9 and a-f /A-F
		// Any number starts with 0x will be consider as Hexa-Decimal Number
//		a/A= 10, b/B=11...f/F=15
		int a8 = 0x123;
		int a9 = 0x456;// 1110
		int a10 = 0x789;// 1929
		int a11 = 0xDAD;// 3501
		int a12 = 0xBee;// 3054
		int a13 = 0Xbeaf;// 48815
//		int a14 = 0xbeer;//invalid//Syntax error on token "r", delete this token
		int a15 = 0x12F;// 4779

//		1*16^2 +2*16^1 +3*16^0 = 291

		System.out.println(a1);// 123
		System.out.println(a2);// 100
		System.out.println(a3);// 789
		System.out.println(a4);// 83
		System.out.println(a5);//
		System.out.println(a6);//
		System.out.println("Hexa Decimal values : *********");
		System.out.println(a8);//
		System.out.println(a9);
		System.out.println(a10);
		System.out.println(a11);
		System.out.println(a12);
		System.out.println(a13);
		System.out.println(a15);

	}
}
