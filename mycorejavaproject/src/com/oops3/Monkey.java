package com.oops3;

public class Monkey implements Animal {

	@Override
	public void eat() {
		System.out.println("Monkey mostly eat Banana's");

	}

	@Override
	public void sound() {
		System.out.println("kich kich kich !!");
	}

	@Override
	public void walk() {
		System.out.println("monky walks slowly ");
	}

	@Override
	public void sleep() {
		System.out.println("Can sleep anytime !");
	}

//	 Default methods are allowed only in interfaces.
//	public default void run() { --> invalid 
	@Override
	public void run() {
		System.out.println("Mokey can also run and also jumps like anything ! ");
	}

}
