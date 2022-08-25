package com.singleton.test;

import com.singleton.beans.Caller;
import com.singleton.beans.Messenger;

public class EagerInstantiationTest {

	public static void main(String[] args) {
		Messenger messenger = new Messenger();
		messenger.readMessage();
		
		Caller caller = new Caller();
		caller.listen();
	}

}
