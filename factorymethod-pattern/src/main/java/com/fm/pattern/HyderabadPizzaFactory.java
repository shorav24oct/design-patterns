package com.fm.pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fm.beans.ChickenPizza;
import com.fm.beans.Pizza;
import com.fm.beans.VegPizza;

public class HyderabadPizzaFactory extends PizzaFactory {

	private static Logger logger = LoggerFactory.getLogger(HyderabadPizzaFactory.class);

	@Override
	protected Pizza createPizza(String pizzaType) {
		logger.info("HyderabadPizzaFactory.createPizza()");

		Pizza pizza = null;

		System.out.println("Hyderabad Pizza Factory");

		if (pizzaType.equals("veg"))
			pizza = new VegPizza();
		else if (pizzaType.equals("chicken"))
			pizza = new ChickenPizza();

		return pizza;
	}

}
