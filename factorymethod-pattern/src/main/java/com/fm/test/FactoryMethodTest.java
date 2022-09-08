package com.fm.test;

import com.fm.beans.Pizza;
import com.fm.store.HyderabadPizzaStore;

public class FactoryMethodTest {

	public static void main(String[] args) {
		HyderabadPizzaStore hyderabadPizzaStore = new HyderabadPizzaStore();
		Pizza pizza = hyderabadPizzaStore.orderPizza("chicken");
		System.out.println(pizza.getClass().getName());
	}

}
