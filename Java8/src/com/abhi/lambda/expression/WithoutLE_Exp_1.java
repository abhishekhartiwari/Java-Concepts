package com.abhi.lambda.expression;

interface Drawable {
	void yourName(); //Functional Interface, interface method is by default public
}

class ABC implements Drawable
{
	public void yourName() {
		System.out.println("My Name is Abhishek!!");
	
	}
}

//For creating object of interface it is require to implement
public class WithoutLE_Exp_1 {
	public static void main(String[] args) {
		
		ABC obj = new ABC();
		obj.yourName();
		
	}

}
