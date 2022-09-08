package com.fm.pattern;

import com.fm.beans.Pizza;

public abstract class PizzaFactory {

	public Pizza newPizza(String pizzaType) {
		Pizza pizza = null;
		
		pizza = createPizza(pizzaType);

		System.out.println("Applying standard procedure for making pizza");
		
		pizza.prepareDough();
		pizza.bake();
		pizza.box();

		return pizza;
	}

	protected abstract Pizza createPizza(String pizzaType);

}
