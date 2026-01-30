package com.oops4;

public class TestVcube {

	public static void main(String[] args) {

		System.out.println("main method strated ");
//		sTestVcubeAbs: Cannot instantiate the type TestVcubeAbs
//		TestVcubeAbs t1 = new TestVcubeAbs();
		TestVcubeAbs j1 = new JavaVcube();
		j1.mockInterviews();
		j1.technical();
		j1.placements();
		j1.dailyAssignments();
		j1.weeklyTest();
		j1.welcome();
		j1.method1();

	}
}
