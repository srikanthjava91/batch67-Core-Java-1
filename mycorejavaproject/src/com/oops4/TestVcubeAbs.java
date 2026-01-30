package com.oops4;

public abstract class TestVcubeAbs implements Vcube {
	
//	public void  method1() {
//		System.out.println("Hello methods from Abstract class ");
//	}
	
	TestVcubeAbs(){
		System.out.println("TestVcubeAbs constructor called ");
	}
	
	public abstract void placements();
	
	void welcome(){
		System.out.println("Welcome to Vcube !!");
	}

	@Override
	public void technical() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dailyAssignments() {
		// TODO Auto-generated method stub

	}

	@Override
	public void weeklyTest() {
		// TODO Auto-generated method stub

	}

	@Override
	public void mockInterviews() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void softskills() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resumePreparation() {
		// TODO Auto-generated method stub

	}

}
