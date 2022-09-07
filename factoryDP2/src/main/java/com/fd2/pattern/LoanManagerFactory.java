package com.fd2.pattern;

import com.fd2.beans.HomeLoanManager;
import com.fd2.beans.LoanManager;
import com.fd2.beans.PersonalLoanManager;

public class LoanManagerFactory {

	private String propertyType;
	private String city;
	private String occupation;
	private double grossAnnualIncome;

	public LoanManager createLoanManager(String loanType) {
		LoanManager loanManager = null;
		
		if ("home".equals(loanType))
			loanManager = new HomeLoanManager(propertyType, city);
		
		else if ("personal".equals(loanType))
			loanManager = new PersonalLoanManager(occupation, grossAnnualIncome);
		
		return loanManager;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public double getGrossAnnualIncome() {
		return grossAnnualIncome;
	}

	public void setGrossAnnualIncome(double grossAnnualIncome) {
		this.grossAnnualIncome = grossAnnualIncome;
	}

}
