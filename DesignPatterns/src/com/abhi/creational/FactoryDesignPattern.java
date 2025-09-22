package com.abhi.creational;


public class FactoryDesignPattern {
	
	public static void main(String[] args) {
		Shape sf = new ShapeFactory().getShape("CIR");
		sf.draw();
	}
}

interface Shape{
	void draw();
} 

class Circle implements Shape{

	public void draw() {
		System.out.println("draw circle");
	}
}

class Rectengular implements Shape{

	public void draw() {
		System.out.println("I am rectengular");
	}
}

class ShapeFactory{
	public Shape getShape(String object) {
		
		if(object.equals("CIR")) {
			return new Circle();
		}
		if(object.equals("REC")) {
			return new Rectengular();
		}
		return null;
	}
}
