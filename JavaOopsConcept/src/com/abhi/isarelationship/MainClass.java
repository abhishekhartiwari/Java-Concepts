package com.abhi.isarelationship;

class Animal {
	
	public void sound() {
		System.out.println("Make sound");
	}

}


class Dog extends Animal{
	
	public void bark() {
		System.out.println("Barking");
	}
}

public class MainClass{
	
	public static void main(String[] args) {
		
		
		Dog d = new Dog();
		d.bark();
		d.sound();
	}
}
