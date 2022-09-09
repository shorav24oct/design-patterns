package com.bdp.builder;

import com.bdp.beans.User;

public class UserBuilder {

	private String firstName; // required
	private String lastName; // required
	private int age; // optional
	private String phone; // optional
	private String address; // optional

	public UserBuilder(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public UserBuilder age(int age) {
		this.age = age;
		return this;
	}

	public UserBuilder phone(String phone) {
		this.phone = phone;
		return this;
	}

	public UserBuilder address(String address) {
		this.address = address;
		return this;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public User build() {
		return new User(this);
	}

}
