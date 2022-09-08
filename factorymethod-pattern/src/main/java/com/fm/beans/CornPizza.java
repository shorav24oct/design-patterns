package com.fm.beans;

public class CornPizza implements Pizza {

	@Override
	public void prepareDough() {
		System.out.println("CornPizza.prepareDough()");
	}

	@Override
	public void bake() {
		System.out.println("CornPizza.bake()");
	}

	@Override
	public void box() {
		System.out.println("CornPizza.box()");
	}

}
