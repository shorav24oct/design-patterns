package com.fm.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChickenPizza implements Pizza {

	private static Logger logger = LoggerFactory.getLogger(ChickenPizza.class);

	public ChickenPizza() {
		logger.info("ChickenPizza.ChickenPizza()");
	}

	@Override
	public void prepareDough() {
		System.out.println("ChickenPizza.prepareDough()");
	}

	@Override
	public void bake() {
		System.out.println("ChickenPizza.bake()");
	}

	@Override
	public void box() {
		System.out.println("ChickenPizza.box()");
	}

}
