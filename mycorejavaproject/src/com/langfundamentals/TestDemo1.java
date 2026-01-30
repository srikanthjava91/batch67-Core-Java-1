package com.langfundamentals;

//byte --> short --> int -->long -->  float --> double 
public class TestDemo1 {

	// By default any number from RHS is consider as int only.
	// 1byte = 8 bits = -128 to 127
	// -128 -127 -126 -125 -124 --------- 0 1 2 3 4 ------- 125 126 127
	// If we give more than byte value, we will get below Error.
	// CE : Type mismatch: cannot convert from int to byte
//	Type Casting : Converting the data from one data type to another data type is called TC.
	byte b = 127;
	byte b1 = (byte) 257;// Explicit Type casting : int to byte

	// 2 byte = 16 bits = 2^15 = -32768 to 32767
	// Type mismatch: cannot convert from int to short
	short s = 32767;
	short s2 = (short) 32768;// Explicit Type casting : int to short

	int i6 = (int) 10.5;// Narrowing
	double d2 = i6;// Widening

	// 4 byte = 32 bits = 2^31 = 2147483647
	// if we give more than int value then we will get below CE.
	// CE : The literal 2147483648 of type int is out of range
	int i = 2147483647;

	// Explicit Type casting : long to int
	int i1 = (int) 2147483648L;// Type mismatch: cannot convert from long to int

	// 8 byte = 64 bits = 2^63 = -9223372036854775808 to 9223372036854775807
	long l = 0L;
	long l1 = 2147483647;// int to long --> Implicit Type casting
	long l2 = 2147483648L;
	long l3 = 9223372036854775807l;

	// By default any floating point number from RHS is consider as double only.
	// 4 bytes
	// 3.4e38 (3.4*10^(38))
	float f = 5.97465345687979856545354467878F;
	float f1 = 100;// int to float --> Implicit Type casting
	float f2 = 9223372036854775807L;// --> Implicit Type casting

	// 8 bytes
	double d = 5.974653456879798565454354467878d;

	// 2 bytes = 32767 + 32768 = 65535
	char c = 'A';// single character in single quotes
	// A=65,B =66 ..... Z =90
	// a=97, b=98 ..... z=122
	char c1 = 122;// ASCII code //int to char to int --> Implicit type casting
	char c2 = '\u0040';// unicode character
	char c3 = 65535;

	int i5 = 'A';

	boolean boo = true;
//	boolean boo1 = 1;
//	boolean boo2 = 0;

//	boolean boo3 = "false";
//	boolean boo4 = "true";

//	boolean boo5 = TRUE;
//	boolean boo6 = FALSE;

	String s1;

	void main() {
		System.out.println("main method strated !!");

		TestDemo1 t1 = new TestDemo1();
		System.out.println("byte value : " + t1.b);
		System.out.println("byte value : " + t1.b1);

		System.out.println("short value : " + t1.s);
		System.out.println("short value : " + t1.s2);

		System.out.println("int value : " + t1.i);
		System.out.println("int5 value : " + t1.i5);
		System.out.println("long value : " + t1.l);
		System.out.println("long value : " + t1.l1);
		System.out.println("long value : " + t1.l2);
		System.out.println("long value : " + t1.l3);

		System.out.println("float value : " + t1.f);
		System.out.println("float value : " + t1.f1);
		System.out.println("float value : " + t1.f2);
		System.out.println("double value  : " + t1.d);
		System.out.println("char value : " + t1.c);
		System.out.println("char value : " + t1.c1);
		System.out.println("char value : " + t1.c2);
		System.out.println("char value : " + t1.c3);

		System.out.println("boolean valu : " + t1.boo);
		System.out.println("String value : " + t1.s1);

	}
}
