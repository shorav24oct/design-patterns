package com.fm.beans;

public class VegPizza implements Pizza {

	@Override
	public void prepareDough() {
		System.out.println("VegPizza.prepareDough()");
	}

	@Override
	public void bake() {
		System.out.println("VegPizza.bake()");
	}

	@Override
	public void box() {
		System.out.println("VegPizza.box()");
	}

}
