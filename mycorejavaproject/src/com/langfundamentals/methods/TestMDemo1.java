package com.langfundamentals.methods;

//1) No return type + no arguments 
public class TestMDemo1 {

	// main method is a entry point of any java program.
	public static void main(String[] args) {
		System.out.println("main method started !");

		// static methods we can call directly or by using class name or by using object ref var
		welcome();
		TestMDemo1.welcome();

		TestMDemo1 t1 = new TestMDemo1();
		// calling the method
		t1.hello();
		t1.welcome();

	}

	// Return type for the method is missing
//	hello(){
//		
//	}

	// void means nothing or no return type
	// instance method
	void hello() {
		System.out.println("Hello guys, Good morning Have a nice day !");
	}

	// static method
	static void welcome() {
		System.out.println("Welcome to Java world !!");
	}
}
