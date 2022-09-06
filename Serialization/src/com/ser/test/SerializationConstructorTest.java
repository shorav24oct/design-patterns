package com.ser.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.ser.beans.LoanAccount;

public class SerializationConstructorTest {

	public static void main(String[] args) {
		
	}
	
	public static void serialize(LoanAccount loanAccount, String file) {
		try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(new File(file)))) {
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
