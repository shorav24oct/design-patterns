package com.sp.test;

import com.sp.runnable.Caller;
import com.sp.runnable.Messenger;

public class SingletonTest {

	public static void main(String[] args) {
		Messenger messenger = new Messenger();
		Caller caller = new Caller();

		Thread thread1 = new Thread(messenger);
		Thread thread2 = new Thread(caller);

		thread1.start();
		thread2.start();
	}

}
