package com.fd2.beans;

public class PersonalLoanManager implements LoanManager {

	private String occupation;
	private double grossAnnualIncome;

	public PersonalLoanManager(String occupation, double grossAnnualIncome) {
		this.occupation = occupation;
		this.grossAnnualIncome = grossAnnualIncome;
	}

	@Override
	public double applicableInterestRate(double principle, long tenure) {
		if ("salaried".equals(occupation) && 100000 > grossAnnualIncome)
			return 14.5;
		else
			return 15.5;
	}

}
