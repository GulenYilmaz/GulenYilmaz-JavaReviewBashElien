package com.review08_Abstraction1;


public class Belarusian extends Human{
	
	public Belarusian(String name) {
		super(name);
	}
	
	public void pickMushrooms() {
		System.out.println(name + " is picking mushrooms!");
	}

	@Override
	public void talk() {
		System.out.println(name + " vitaju!");
	}
}