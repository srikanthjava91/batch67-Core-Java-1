package com.oops3;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Dog can eat anything !");
	}

	@Override
	public void sound() {
		System.out.println("Dog sounds like Bow Bow !!");
	}

	@Override
	public void walk() {
		System.out.println("Dog walks slowly but runs fastly ! ");

	}

	@Override
	public void sleep() {
		System.out.println("Dog can sleep morining time !!");
	}

}
