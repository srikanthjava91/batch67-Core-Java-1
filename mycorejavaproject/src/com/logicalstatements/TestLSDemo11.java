package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo11 {

	public static void main(String[] args) {
		System.out.println("main method staretd ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter category !");
		String catg = sc.next();// veg fruits

		switch (catg) {

		case "veg" -> {
			System.out.println("Enter Vegetable name !");
			String veg = sc.next();
			switch (veg) {
			case "tmt" -> System.out.println("Tomato Per kg = 100rs");
			case "ptt" -> System.out.println("POtato per kg = 80rs");
			case "bnd" -> System.out.println("Bendi per KG = 60rs ");
			default -> System.out.println("Item is not available !");
			}
		}
		case "fruits" -> {
			System.out.println("Enter Fruit name !");
			String fruit = sc.next();
			switch (fruit) {
			case "orn" -> System.out.println("Orange 1 - 10rs ");
			case "mng" -> System.out.println("mango 1 - 50rs ");
			case "bnn" -> System.out.println("Banana 1 - 5rs ");
			case "apl" -> System.out.println("Apple 1 - 30rs ");
			default -> System.out.println("Item is not available !");
			}
		}
		default -> System.out.println("category unknown !");

		}
	}
}
