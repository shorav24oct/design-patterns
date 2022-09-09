package com.bdp.test;

import com.bdp.beans.User;
import com.bdp.builder.UserBuilder;

public class BuilderTest {

	public static void main(String[] args) {
		User user1 = new UserBuilder("Saurav", "Gupta").age(28).phone("8897496432").address("Mathura").build();
		System.out.println(user1);
		
		User user2 = new UserBuilder("Anu", "Radha").address("Mathura").build();
		System.out.println(user2);

	}

}
