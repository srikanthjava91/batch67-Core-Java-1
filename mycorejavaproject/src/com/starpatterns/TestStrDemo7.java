package com.starpatterns;

public class TestStrDemo7 {

	public static void main(String[] args) {

		String[] heros = { "Ramcharan", "Jr NTR", "Power Star", "Prabash", "Mahesh", "Bunny", "Sampurnesh", "Ram P",
				"Vijay D" };

		for (String hero : heros) {
			if ((hero.endsWith("h") && hero.contains("p") || hero.startsWith("R"))) {
				System.out.println(hero);
			}
		}
	}
}
