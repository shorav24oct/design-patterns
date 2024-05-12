package com.sp.test;

import com.sp.beans.Caller;
import com.sp.beans.Messenger;

public class SingletonTest {
	
	static int i;
	
	public static void main(String[] args) {
		Messenger messenger = new Messenger();
		Caller caller = new Caller();
		
		messenger.readMessage();
		caller.listen();

		
		System.out.println(i);
	}

}
