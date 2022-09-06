package com.ser.beans;

import java.io.Serializable;

public class LoanAccount extends Account implements Serializable {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = -4475591819838407764L;
	
	public LoanAccount() {
		System.out.println("LoanAccount.LoanAccount()");
	}
	
	private String loanType;
	private int tenure;

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	@Override
	public String toString() {
		return "LoanAccount [loanType=" + loanType + ", tenure=" + tenure + "]";
	}

}
