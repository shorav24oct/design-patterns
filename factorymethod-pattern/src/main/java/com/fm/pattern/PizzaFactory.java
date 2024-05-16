package com.fm.pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fm.beans.Pizza;

public abstract class PizzaFactory {
	
	private static Logger logger = LoggerFactory.getLogger(PizzaFactory.class);

	public Pizza newPizza(String pizzaType) {
		logger.info("PizzaFactory.newPizza()");
		
		Pizza pizza = null;
		
		pizza = createPizza(pizzaType);

		System.out.println(pizza.getClass().getName());
		System.out.println("Applying standard procedure for making pizza");
		
		pizza.prepareDough();
		pizza.bake();
		pizza.box();

		return pizza;
	}

	protected abstract Pizza createPizza(String pizzaType);

}
