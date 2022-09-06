package com.ser.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.ser.beans.LoanAccount;

public class SerializationConstructorTest {

	private static final String file = "d://loan.ser";

	public static void main(String[] args) {
		/*
		 * LoanAccount loanAccount = new LoanAccount();
		 * 
		 * loanAccount.setAccountNo(420); loanAccount.setAccountType("loan");
		 * loanAccount.setAddress("delhi"); loanAccount.setLoanType("car loan");
		 * loanAccount.setName("rinki"); loanAccount.setTenure(10);
		 * 
		 * serialize(loanAccount, file);
		 */
		System.out.println(deSerialize(file));
	}

	public static void serialize(LoanAccount loanAccount, String file) {
		try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(new File(file)))) {
			outputStream.writeObject(loanAccount);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static LoanAccount deSerialize(String file) {
		LoanAccount loanAccount = null;
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File(file)))) {
			loanAccount = (LoanAccount) inputStream.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return loanAccount;
	}

}
