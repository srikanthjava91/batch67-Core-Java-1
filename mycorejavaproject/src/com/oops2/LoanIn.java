package com.oops2;

public interface LoanIn {

	public abstract String getAddressInfo();

	public abstract boolean validateAadhaar();

	public abstract boolean validatePAN();

	public abstract boolean validateMobile();

	public abstract int getCustomerAge();

	public abstract Number getLoanROI();

	public abstract int getCibilScore();

	public abstract double getSalaryInfo();

}
