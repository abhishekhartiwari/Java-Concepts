package com.abhi.lambda.expression;

interface Drawable1 {
	public void name();
}

public class WithLE_Expression {
	public static void main(String[] args) {
		// with lambda expression, way of implementing an interface
		//Drawable1 d2 = () -> {System.out.println("My Name is baba !!");};
		Drawable1 d2 = () -> System.out.println("My Name is baba !!");
		d2.name();
	}

}
