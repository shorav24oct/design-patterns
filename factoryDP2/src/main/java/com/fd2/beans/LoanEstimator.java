package com.fd2.beans;

import com.fd2.pattern.LoanManagerFactory;

public class LoanEstimator {
	LoanManager loanManager = null;
	LoanManagerFactory loanManagerFactory = null;
	
	public void estimateInterestAmountForHomeLoan(String propertyType, String city, double principle, long tenure) {
		double applicableInterestRate = 0;
		double interestAmountToBePaid = 0;
		
		loanManagerFactory = new LoanManagerFactory();
		loanManagerFactory.setPropertyType(propertyType);
		loanManagerFactory.setCity(city);
		
		loanManager = loanManagerFactory.createLoanManager("home");
		
		applicableInterestRate = loanManager.applicableInterestRate(principle, tenure);
		
		interestAmountToBePaid = (applicableInterestRate * principle * tenure) / 100;
		
		System.out.println("Interest Amount To Be Paid for home loan : " + interestAmountToBePaid);
		
	}

	public void estimateInterestAmountForPersonalLoan(String occupation, double grossAnnualIncome, double principle, long tenure) {
		double applicableInterestRate = 0;
		double interestAmountToBePaid = 0;
		
		loanManagerFactory = new LoanManagerFactory();
		loanManagerFactory.setOccupation(occupation);
		loanManagerFactory.setGrossAnnualIncome(grossAnnualIncome);
		loanManager = loanManagerFactory.createLoanManager("personal");
		
		applicableInterestRate = loanManager.applicableInterestRate(principle, tenure);
		
		interestAmountToBePaid = (applicableInterestRate * principle * tenure) / 100;
		
		System.out.println("Interest Amount To Be Paid for personal loan : " + interestAmountToBePaid);
		
	}

}
