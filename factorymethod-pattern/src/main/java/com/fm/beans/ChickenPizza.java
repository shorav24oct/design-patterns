package com.fm.beans;

public class ChickenPizza implements Pizza {

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
