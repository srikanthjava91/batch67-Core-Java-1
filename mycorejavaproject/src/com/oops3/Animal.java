package com.oops3;

public interface Animal {

	public static final String orgName = "VSS";

	public abstract void eat();

	public abstract void sound();

	void walk();

	void sleep();

	public static void main(String[] args) {
		System.out.println("mian method started !");
		breath();
	}

//	 private methods introduced to provide re-usability of the code for default methods and avoiding duplicate code
//	private methods we can access within the class or interface only bit not outside.
	private void hello() {
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	}

//	default methods introduced "to achieve Backward compatibility"
//	Backward compatibility means, if something has been changed in interface,
//	all the classes who implemented that interface will be effected. 

//	It requires lot of changes with classes and it would be Tightly coupled.
//	 We can write any number of default methods in interfaces.
//	 And also we can override default methods.
	default void run() {
		System.out.println("most of the animal's can run !");
		hello();
	}

	default void swim() {
		System.out.println("Some of the animal's can swim !");
		hello();

	}

//	static methods also introduced "to achieve Backward compatibility" 
//	static methods we cannot override, static methods are loading at class time only and 
//	we cannot call by using object reference variables. We must need to call by using interface Name.
	static void breath() {
		System.out.println("Every animal should breath to survival !!");
	}

	static void welcome() {
		System.out.println("Hello method called !");
	}

}
