package com.fm.store;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fm.beans.Pizza;
import com.fm.pattern.HyderabadPizzaFactory;
import com.fm.pattern.PizzaFactory;

public class HyderabadPizzaStore {

	private static Logger logger = LoggerFactory.getLogger(HyderabadPizzaStore.class);

	public Pizza orderPizza(String pizzaType) {
		logger.info("HyderabadPizzaStore.orderPizza()");
		
		Pizza pizza = null;
		PizzaFactory pizzaFactory = new HyderabadPizzaFactory();
		pizza = pizzaFactory.newPizza(pizzaType);

		return pizza;
	}

}
