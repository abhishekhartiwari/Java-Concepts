package com.abhi.hasarelationship;

public class Car {
	
    private Engine engine = new Engine(); // Has-a relationship

    void startCar() {
        engine.start();
        System.out.println("Car is moving");
    }
}

class Engine{
	
    void start() {
        System.out.println("Engine starting...");
    }
}
