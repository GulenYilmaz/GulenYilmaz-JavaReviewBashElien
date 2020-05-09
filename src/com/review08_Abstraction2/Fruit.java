package com.review08_Abstraction2;

public abstract class Fruit {
	String color;
	
	public Fruit(String color) {
		this.color = color;
	}

	public abstract void eat();
}
