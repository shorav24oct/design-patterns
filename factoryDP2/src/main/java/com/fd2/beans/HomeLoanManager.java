package com.fd2.beans;

public class HomeLoanManager implements LoanManager {
	private String propertyType;
	private String city;

	public HomeLoanManager(String propertyType, String city) {
		this.propertyType = propertyType;
		this.city = city;
	}

	@Override
	public double applicableInterestRate(double principle, long tenure) {
		if ("Independent House".equals(propertyType))
			return 7.5;
		else
			return 8.5;
	}

}
