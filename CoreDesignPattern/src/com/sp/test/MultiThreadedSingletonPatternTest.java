package com.sp.test;

import com.sp.runnable.Caller;
import com.sp.runnable.Messenger;

public class MultiThreadedSingletonPatternTest {

	public static void main(String[] args) {
		Messenger messenger = new Messenger();
		Caller caller = new Caller();

		

		for (int i = 0; i < 100; i++) {
			Thread thread1 = new Thread(messenger);
			Thread thread2 = new Thread(caller);
			
			thread1.start();
			thread2.start();
		}

	}

}
