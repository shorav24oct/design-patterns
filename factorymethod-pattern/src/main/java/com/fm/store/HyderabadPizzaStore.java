package com.fm.store;

import com.fm.beans.Pizza;
import com.fm.pattern.HyderabadPizzaFactory;
import com.fm.pattern.PizzaFactory;

public class HyderabadPizzaStore {

	public Pizza orderPizza(String pizzaType) {
		Pizza pizza = null;

		PizzaFactory pizzaFactory = new HyderabadPizzaFactory();
		pizza = pizzaFactory.newPizza(pizzaType);

		return pizza;
	}

}
