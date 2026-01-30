package com.oops2;

import java.lang.classfile.Superclass;

//Implicit Single Inheritance 
class Animal {

	String name = "Puppy";
	int age = 12;

	void animalInfo() {
		System.out.println("Every animal can run and also walk !");
	}

	void sound() {
		System.out.println("Every animal can sound !!");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Animal!!");
	}

}

//Single Inheritance 
class Dog extends Animal {

	String name = "chinnu";
	int age = 10;

	void show() {
		System.out.println(this.name);
		System.out.println(this.age);
	}

	@Override
	void sound() {
		System.out.println("Bow Bow !!");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Dog!!");
	}

}

class BabyDog extends Dog {

}

//Driver class 
public class TestInhDemo1 {

	public static void main(String[] args) {

		BabyDog d = new BabyDog();
		d.sound();
		d.animalInfo();
		d.show();

//		System.out.println(d.name);
//		System.out.println(d.age);

	}

}
