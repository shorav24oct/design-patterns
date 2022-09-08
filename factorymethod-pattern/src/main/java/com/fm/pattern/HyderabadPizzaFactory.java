package com.fm.pattern;

import com.fm.beans.ChickenPizza;
import com.fm.beans.Pizza;
import com.fm.beans.VegPizza;

public class HyderabadPizzaFactory extends PizzaFactory {

	@Override
	protected Pizza createPizza(String pizzaType) {
		Pizza pizza = null;

		System.out.println("Hyderabad Pizza Factory");

		if (pizzaType.equals("veg"))
			pizza = new VegPizza();
		else if (pizzaType.equals("chicken"))
			pizza = new ChickenPizza();

		return pizza;
	}

}
