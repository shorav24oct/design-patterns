package com.fd2.test;

import com.fd2.beans.LoanEstimator;

public class FactoryDPTest {

	public static void main(String[] args) {
		LoanEstimator loanEstimator = new LoanEstimator();
		loanEstimator.estimateInterestAmountForHomeLoan("Independent House", "pune", 100000, 5);
		loanEstimator.estimateInterestAmountForPersonalLoan("salaried", 10000, 5000, 10);
	}

}
