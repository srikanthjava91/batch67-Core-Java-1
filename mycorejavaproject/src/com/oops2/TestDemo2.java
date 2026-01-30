package com.oops2;

abstract class TestA {
	abstract void method1();

}

class TestB extends TestA {

	@Override
	void method1() {

	}

}


abstract class TestC extends TestB{
	
	@Override
	abstract void method1();
	
}

public class TestDemo2 {

	public static void main(String[] args) {

	}

}
