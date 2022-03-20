package com.learn.factory_parttern;

public class Factory {
	public Shape createShape(String type) {
		if (type == null)
			return null;
		if (type.equalsIgnoreCase("circle"))
			return new Circle();
		if (type.equalsIgnoreCase("triangle"))
			return new Triangle();
		if (type.equalsIgnoreCase("square"))
			return new Square();
		else
			return null;
	}
}
