package com.fm.pattern;

import com.fm.beans.CornPizza;
import com.fm.beans.Pizza;
import com.fm.beans.VegPizza;

public class PunePizzaFactory extends PizzaFactory {

	@Override
	protected Pizza createPizza(String pizzaType) {

		Pizza pizza = null;

		System.out.println("Pune Pizza Factory");

		if (pizzaType.equals("veg"))
			pizza = new VegPizza();
		else if (pizzaType.equals("corn"))
			pizza = new CornPizza();

		return pizza;
	}

}
