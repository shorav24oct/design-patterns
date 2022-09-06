package com.ser.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.ser.beans.Account;

public class SerializationTest {

	private static final String file = "d://account.ser";

	public static void main(String[] args) {
		Account account = new Account();
		account.setAccountNo(420);
		account.setName("anu");
		account.setAccountType("savings");
		account.setAddress("hyd");

		//serialize(account, file);
		System.out.println(deSerialize(file));
	}

	public static void serialize(Account account, String file) {
		try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(new File(file)))) {
			stream.writeObject(account);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Account deSerialize(String file) {
		Account account = null;
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File(file)))) {
			account = (Account) inputStream.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return account;
	}

}
