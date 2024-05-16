package com.fm.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fm.store.HyderabadPizzaStore;

public class FactoryMethodTest {

	private static Logger logger = LoggerFactory.getLogger(FactoryMethodTest.class);

	public static void main(String[] args) {
		logger.info("FactoryMethodTest.main()");
		HyderabadPizzaStore hyderabadPizzaStore = new HyderabadPizzaStore();
		hyderabadPizzaStore.orderPizza("chicken");
	}

}
