package com.oops3;

public class TestAnimal {

	public static void main(String[] args) {

		System.out.println("main method started ");
		// Cannot instantiate the type Animal
//		Animal a = new Animal();

		System.out.println("cat information ***********");
		Animal c = new Cat();
		c.eat();
		c.sleep();
		c.sound();
		c.walk();
		c.run();
		c.swim();
//		Cat.breath();
		
		//This static method of interface Animal can only be accessed as Animal.breath
//		c.breath();
		Animal.breath();

		System.out.println();
		System.out.println("Dog information ***********");
		Animal d = new Dog();
		d.eat();
		d.sleep();
		d.sound();
		d.walk();
		d.run();
		d.swim();
		Animal.breath();
		
		System.out.println();
		System.out.println("Monkey information ***********");
		Animal m = new Monkey();
		m.eat();
		m.sleep();
		m.sound();
		m.walk();
		m.run();
		m.swim();
		Animal.breath();

		System.out.println("main method ended ");
	}
}
