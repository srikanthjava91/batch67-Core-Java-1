package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo5 {

	public static void main(String[] args) {

		Collection<String> fruits = new ArrayList<>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Pineapple");

		Collection<String> vegetables = new ArrayList<>();

		vegetables.add("Potato");
		vegetables.add("Tomato");
		vegetables.add("Onion");
		vegetables.add("Carrot");
		vegetables.add("Cabbage");
		vegetables.add("Cauliflower");
		vegetables.add("Spinach");
		vegetables.add("Banana");

		fruits.retainAll(vegetables);
		System.out.println(fruits);

		System.out.println(vegetables.size());// length vs length() vs size()

		Object[] objs = vegetables.toArray();
		for (Object obj : objs) {
			System.err.println(obj);
		}

	}

}
