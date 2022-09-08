package com.fm.store;

import com.fm.beans.Pizza;
import com.fm.pattern.PizzaFactory;
import com.fm.pattern.PunePizzaFactory;

public class PunePizzaStore {

	public Pizza orderPizza(String pizzaType) {
		Pizza pizza = null;

		PizzaFactory pizzaFactory = new PunePizzaFactory();
		pizza = pizzaFactory.newPizza(pizzaType);

		return pizza;
	}

}
