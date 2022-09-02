package com.sp.test;

import com.sp.beans.Caller;
import com.sp.beans.Messenger;

public class SingletonTest {

	public static void main(String[] args) {
		Messenger messenger = new Messenger();
		messenger.readMessage();
		
		Caller caller = new Caller();
		caller.listen();
	}

}
