package com.oops3;

public class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("Cat can eat rat !!");
	}

	@Override
	public void sound() {
		System.out.println("Cat can sound  meow meow !!!");
	}

	@Override
	public void walk() {
		System.out.println("Cat can walk like a cat walk  !!");
	}

	@Override
	public void sleep() {
		System.out.println("Cat can sleep anytime !");
	}

//	@Override
//	public static void breath() {
//		System.out.println("Cat  breath style is different !!");
//	}

	@Override
	public void swim() {
		System.out.println("Cat cannot swim !!");
	}

}
