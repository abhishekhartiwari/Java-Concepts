package com.abhi.lambda.expression;

interface Name {
	void yourName2(); // Functional Interface, interface method is by default public
}

//class ABC implements Drawable
//{
//	public void yourName() {
//		System.out.println("My Name is Abhishek!!");
//	
//	}
//}

//In this case we are not implementing interface but will use it anonymosly by Anonymous class
public class WithoutLE_Exp_2 {
	public static void main(String[] args) {

		Name obj = new Name() { //Anonymous class
			public void yourName2() {
				System.out.println("My Name is Tiwari !!");
			}
		};
		obj.yourName2();
	}
}
